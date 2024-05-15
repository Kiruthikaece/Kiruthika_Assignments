import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class MusicPlayerList {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MusicPlayerMethod musicPlayerMethod=new MusicPlayerMethod();
        while(true) {
            System.out.println("\n1-Add song \n2-Remove Song \n3-Show current song \n4-PlayList \n5-Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1: System.out.println("Enter song title:");
                        musicPlayerMethod.addSong(new Song(sc.nextLine()));
                        break;
                case 2: System.out.println("Enter song id:");
                        musicPlayerMethod.removeSong(sc.nextInt());
                        break;
                case 3:musicPlayerMethod.CurrentSong();
                        break;
                case 4:musicPlayerMethod.printSong();
                        break;
                case 5:return;
                

                default:System.out.println("Enter u r correct choice:");
                        return;
            }
        }
        
    }

   
}

class MusicPlayerMethod {

    Queue<Song> queue=new LinkedList<>();

    public void addSong(Song song) {
        queue.add(song);  
        System.out.println("Song added successfully");  
    }

    public void removeSong(int id) {
        Iterator<Song> iterator= queue.iterator();
        boolean isPresent=false;
        while(iterator.hasNext()) {
            Song song=iterator.next();
            if(song.getId()==id) {
                iterator.remove();
                isPresent=true;
            } 
        }
        if(isPresent)
        System.out.println("Song removed successfully");
        else
        System.out.println("Song not found");
    }

    public void CurrentSong() {
        if(!queue.isEmpty()) 
        System.out.println(queue.peek().getName()+" "+"song is currently playing");
        else
        System.out.println("Empty playList");
    }


    public void printSong() {
        if(!queue.isEmpty()) {
            System.out.println("My PlayList:");
            for(Song x:queue)
            System.out.println(x.getId()+" "+x.getName());
        }
        else
        System.out.println("Empty playList");

     }
}


class Song {
       private String name;
       private int id=0;
       private static int idCounter = 1;

       public Song(String name) {
        this.id=Song.idCounter++;
        this.name=name;
       }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
