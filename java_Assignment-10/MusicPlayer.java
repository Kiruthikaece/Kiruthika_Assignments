public class MusicPlayer {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        StreamingPlayer streamingPlayer = new StreamingPlayer();
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}



interface playable {
    void play();
    void pause();
    void stop();
}


class Mp3Player implements playable{
  public void play() {
    System.out.println("Mp3 play....");
  }
  public void pause() {
    System.out.println("Mp3 pause....");
  }
  public void stop() {
    System.out.println("Mp3 stop....");
  }
}

class CDPlayer implements playable {
    public void play() {
      System.out.println("CDPlayer playing....");
    }
    public void pause() {
      System.out.println("CDPlayer pause....");
    }
    public void stop() {
      System.out.println("CDPlayer stop....");
    }
  }

class StreamingPlayer implements playable {
    public void play() {
      System.out.println("StreamingPlayer playing....");
    }
    public void pause() {
      System.out.println("StreamingPlayer pause....");
    }
    public void stop() {
      System.out.println("StreamingPlayer stop....");
    }
}