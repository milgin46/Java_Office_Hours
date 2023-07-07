package week07.evening.task5;

public class SportsTeam {
    String name;
    int numberOfPlayers;
    String coach;
    String winLoss;
    String country;
    int numberOfFans;


    public void setInfo(String name, int numberOfPlayers, String coach, String winLoss, String country,
                      int numberOfFans) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
        this.winLoss = winLoss;
        this.country = country;
        this.numberOfFans = numberOfFans;
    }

    public  void joinFanClub(){
        numberOfFans++;
    }


    public String toString() {
        return "The "+name+" sports team is based out of "+country+". A total of "+numberOfPlayers+" players are led " +
                "by "+coach+ "and currently hold a "+winLoss+" record of wins and losses. They have "+numberOfFans+" " +
                "fans.";
    }
}
