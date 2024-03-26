class TwoDto {
    public static void main(String[] args) {

        Team team=new Team();
        team.playGame();
        team.hireCoach();
    }
}
class Team {
    private String name;
    private String city;
    private String division;

   // Player player=new Player();
    
    public void playGame() {
        System.out.println("play game");
    }
    public void hireCoach() {
        System.out.println("hire coach");
    }
}
class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    private Team team;
    public void playGame() {
        System.out.println("play game");
    }
    public void train() {
        System.out.println("Train player");
    }
}