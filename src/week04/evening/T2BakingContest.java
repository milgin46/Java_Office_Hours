package week04.evening;

public class T2BakingContest {


    public static void main(String[] args) {

     //will define 3 scores for your cookies.
        double score1=8.5;
        double score2=7.9;
        double score3=8.3;

     //Calculate the average score you earned.
        double avg=(score1+score2+score3)/3;

     //define two other people's final score
        double firstPersonAvg=8.5;
        double secondPersonAvg=7.9;

    //you can earn either: First place, Second place, or Third place

        //if avg is greater than two of them my place is first
       if (avg>firstPersonAvg && avg>secondPersonAvg){
           System.out.println("Congratulations you earned First place with a score of: "+avg);
       } else if (avg<firstPersonAvg && avg <secondPersonAvg) {       //if avg is smaller than two of them my place
           // is third
           System.out.println("Congratulations you earned Third place with a score of: "+avg);
       } else {        //else second
           System.out.println("Congratulations you earned Second place with a score of: "+avg);
       }







    }


}
