package week07.evening.task5;

public class SomeSportTeams {

    public static void main(String[] args) {
        SportsTeam gs=new SportsTeam();
        gs.setInfo("Galatasaray",25,"Okan","18/5","TR",15_000_000);
        System.out.println(gs.numberOfFans);

        System.out.println(gs.coach);
    }
}
