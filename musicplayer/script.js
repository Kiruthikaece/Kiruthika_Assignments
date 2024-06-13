const songs = [
    { id: "1", song: "Pesavey Pesatha", movie: "Maaveeran", src: "./images/maveeran-1.jpeg" },
    { id: "2", song: "Aasai Aasai", movie: "Maaveeran", src: "./images/maveeran-2.jpeg" },
    { id: "3", song: "Vandinathai Summa", movie: "Maaveeran", src: "./images/maveeran-3.jpeg" },
    { id: "4", song: "Pidichirukku", movie: "Maaveeran", src: "./images/maveeran-2.jpeg" },
    { id: "5", song: "Aagayam", movie: "Unnakum ennakum", src: "./images/Unakkum_Enakkum_poster.jpg" },
    { id: "6", song: "Pooparikka Neeyum", movie: "Unnakum ennakum", src: "./images/Unakkum_Enakkum_poster.jpg" },
    { id: "7", song: "Something Something", movie: "Unnakum ennakum", src: "./images/Unakkum_Enakkum_poster.jpg" },
    { id: "8", song: "Unn Paarvaiyil", movie: "Unnakum ennakum", src: "./images/Unakkum_Enakkum_poster.jpg" }
];

let favoriteSongs = [];

const songListElement = document.getElementById('song-list');
const favoriteListElement = document.getElementById('favorite-list');
const allSongsLink = document.getElementById('all-songs-link');
const favoritesLink = document.getElementById('favorites-link');
const songListContainer = document.querySelector('.song-list');
const favoriteListContainer = document.querySelector('.favorites');

function renderSongList() {
    songListElement.innerHTML = '';
    songs.forEach(song => {
        const li = document.createElement('li');
        li.className = 'song-card';
        li.innerHTML = `
            <img src="${song.src}" alt="${song.song}">
            <div class="song-info">
                <p>${song.song}</p>
                <p>${song.movie}</p>
            </div>
            <button onclick="toggleFavorite('${song.id}')">
                <span class="heart">${song.isFavorite ? '♥' : '♡'}</span>
            </button>
        `;
        songListElement.appendChild(li);
    });
}

function renderFavoriteList() {
    favoriteListElement.innerHTML = '';
    favoriteSongs.forEach(song => {
        const li = document.createElement('li');
        li.className = 'song-card';
        li.innerHTML = `
            <img src="${song.src}" alt="${song.song}">
            <div class="song-info">
                <p>${song.song}</p>
                <p>${song.movie}</p>
            </div>
            <button onclick="toggleFavorite('${song.id}')">
                <span class="heart">♥</span>
            </button>
        `;
        favoriteListElement.appendChild(li);
    });
}

function toggleFavorite(songId) {
    const song = songs.find(s => s.id === songId);
    if (song) {
        song.isFavorite = !song.isFavorite;
        if (song.isFavorite) {
            favoriteSongs.push(song);
        } else {
            favoriteSongs = favoriteSongs.filter(s => s.id !== songId);
        }
        renderSongList();
        renderFavoriteList();
    }
}

function showAllSongs() {
    songListContainer.style.display = 'block';
    favoriteListContainer.style.display = 'none';
}

function showFavorites() {
    songListContainer.style.display = 'none';
    favoriteListContainer.style.display = 'block';
}

allSongsLink.addEventListener('click', (e) => {
    e.preventDefault();
    showAllSongs();
});

favoritesLink.addEventListener('click', (e) => {
    e.preventDefault();
    showFavorites();
});

renderSongList();
renderFavoriteList();
