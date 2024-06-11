let quizData = [];
let currentQuestionIndex = 0;
let score = 0;
let selectedOption = null;
let selectedOnce = false;

document.addEventListener('DOMContentLoaded', function() {
    fetch('quiz.json')
        .then(response => response.json())
        .then(data => {
            quizData = data;
            loadQuestion();
        })
        .catch(error => console.error('Error loading quiz data:', error));
});

function loadQuestion() {
    const questionContainer = document.getElementById('question-container');
    const optionsContainer = document.getElementById('options-container');
    
    if (currentQuestionIndex >= quizData.length) {
        displayScore();
        return;
    }

    const currentQuestion = quizData[currentQuestionIndex];
    questionContainer.innerHTML = `<h2>${currentQuestion.question}</h2>`;
    
    optionsContainer.innerHTML = "";
    selectedOption = null;
    selectedOnce = false; 

    currentQuestion.options.forEach(option => {
        const optionElement = document.createElement('button');
        optionElement.textContent = option;
        optionElement.classList.add('option-btn');
        optionElement.onclick = () => selectOption(optionElement, option);
        optionsContainer.appendChild(optionElement);
    });

    document.getElementById('next-btn').textContent = currentQuestionIndex === quizData.length - 1 ? 'Finish' : 'Next';
}

function selectOption(optionElement, selectedOptionText) {
    if (selectedOnce) return; 

    selectedOnce = true; 
    selectedOption = optionElement;
    const currentQuestion = quizData[currentQuestionIndex];

    if (selectedOptionText === currentQuestion.answer) {
        optionElement.classList.add('correct');
        score++;
    } else {
        optionElement.classList.add('incorrect');
    }

   
    document.querySelectorAll('.option-btn').forEach(button => {
        button.disabled = true;
    });
}

function nextQuestion() {
    if (currentQuestionIndex < quizData.length - 1) {
        currentQuestionIndex++;
        loadQuestion();
    } else {
        displayScore();
    }
}

function prevQuestion() {
    if (currentQuestionIndex > 0) {
        currentQuestionIndex--;
        loadQuestion();
    }
}

function displayScore() {
    const quizContainer = document.getElementById('quiz-container');
    let message = '';

    if (score >= 9) {
        message = '<h3>Great Score</h3>';
    } else if (score > 5) {
        message = '<h3>Good job</h3>';
    } else {
        message = '<h3>Do well next time</h3>';
    }

    quizContainer.innerHTML = `<h2>Score: ${score} out of ${quizData.length}</h2>${message}`;
}
