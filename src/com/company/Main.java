package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {
//get String with validation for over 3 characters
    static String generateName(){
        Scanner sc = new Scanner(System.in);
        String tmp, name;
        tmp=sc.nextLine();
        //data validation, and re loop
        while(tmp.length() < 3){
            System.out.println("Your name is too short");
            System.out.println("Enter another name:\n");
            tmp=sc.nextLine();
        }
        name =tmp;
        return name;
    }

    // get a integer that above 0, with validation
    static int generateInt(){
        Scanner sc = new Scanner(System.in);
        int tmp, num;
        tmp=sc.nextInt();


        while(tmp < 0){
            System.out.println("invalid number");
            System.out.println("Enter another integer:\n");
            tmp=sc.nextInt();
        }
        num =tmp;
        return num;
    }

    static double generateRandom(){
        double i =0;
        double randomNum =  i + Math.random() * 100000;
        return randomNum;

    }




// take in a integer and return a letter grade
    static String rating(int total) {
        int t = total;
        String rating;
        //	CLASS A – the total goals and assists is greater than 30
        if (t > 30) {
            rating = "A";
        }
        //	CLASS B – the total goals and assists is greater than or equal to 20 AND less than 30
        else if (t >= 20 && t <= 30) {
            rating = "B";
        }
        //	CLASS C – the total goals and assists is greater than zero AND less than 20
        else if (t > 0 && t < 20) {
            rating = "C";
        }
        //	CLASS D – the total goals and assists is zero
        else if (t == 0) {
            rating = "D";
        } else {
            rating = "error";
        }

        return rating;}



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declaring variables
        Team[] tmList = new Team[3];
        String[] namesList = new String[3];
        Player[] plList1 = new Player[4];
        Player[] plList2 = new Player[4];
        Player[] plList3 = new Player[4];

        String playerName;
        int playerNumOfGoals;
        int playerNumOfAssists;

        String team1n, team2n, team3n;
        String r1,r2,r3;
        double c =1;
        int totalGoals1 = 0;
        int totalAssists1 = 0;
        int totalAndGoal1 = 0;
        double teamBudget1  = generateRandom();
        int totalGoals2 = 0;
        int totalAssists2 = 0;
        int totalAndGoal2 = 0;
        double teamBudget2  = generateRandom();
        int totalGoals3 = 0;
        int totalAssists3 = 0;
        int totalAndGoal3 = 0;
        double teamBudget3 = generateRandom();

        //Welcome
        System.out.println("FANTASY HOCKEY APPLICATION\n" +
                "TEAM ENTRY\n" +
                "================================\n");


        //team 1
            System.out.println("Enter team # " + 1 + ":");

//          team1n = sc.nextLine();
          team1n = generateName();
        //team2
        System.out.println("Enter team # " + 2 + ":");
        System.out.println("Enter team name");
//        team2n = sc.nextLine();
        team2n = generateName();

        //team3
        System.out.println("Enter team # " + 3 + ":");
        System.out.println("Enter team name");
//        team3n = sc.nextLine();
        team3n = generateName();
        // assign team names into list
         namesList[0]=team1n;
        namesList[1]=team2n;
        namesList[2]=team3n;


        System.out.println("PLAYER ENTRY\n" +
                "================================\n");
        // FOR EACH TEAM
        for (int i = 0; i < 3; i++) {
            //String  format for print out
            System.out.println(String.format("Enter players for %s:\n ", namesList[i]));

            //FOR EACH PLAYER
            for (int x = 0; x < 4; x++) {
                System.out.println("Enter player # " + (x + 1)+"\n");
                System.out.println("Enter players name");
//                playerName = sc.nextLine();
                playerName = generateName();

                System.out.println("Enter numbers of goals");
//                playerNumOfGoals = sc.nextInt();
                playerNumOfGoals = generateInt();
                System.out.println("Enter number of assists");

                //playerNumOfAssists = sc.nextInt();
                playerNumOfAssists = generateInt();

                // Is player a member of team 1 2 or 3
                if (i == 0) {
                    plList1[x] = new Player(playerName, playerNumOfGoals, playerNumOfAssists);
                    totalGoals1 += playerNumOfGoals;
                    totalAssists1 += playerNumOfAssists;
                    totalAndGoal1 += (playerNumOfGoals + playerNumOfAssists);
                }
                else if (i == 1) {
                    plList2[x] = new Player(playerName, playerNumOfGoals, playerNumOfAssists);
                    totalGoals2 += playerNumOfGoals;
                    totalAssists2 += playerNumOfAssists;
                    totalAndGoal2 += (playerNumOfGoals + playerNumOfAssists);
                }
                else if (i == 2) {
                    plList3[x] = new Player(playerName, playerNumOfGoals, playerNumOfAssists);
                    totalGoals3 += playerNumOfGoals;
                    totalAssists3 += playerNumOfAssists;
                    totalAndGoal3 += (playerNumOfGoals + playerNumOfAssists);
                }

            }// end of player



        }// end of team





        r1 = rating(totalAndGoal1);
        r2 = rating(totalAndGoal2);
        r3 = rating(totalAndGoal3);


        //Assign team data to Team construct
       Team team1 = new Team(r1,team1n,totalAndGoal1,totalAssists1,totalGoals1,teamBudget1,plList1);
     Team team2 = new Team(r2,team2n,totalAndGoal2,totalAssists2,totalGoals2,teamBudget2,plList2);
Team team3 = new Team(r3,team3n,totalAndGoal3,totalAssists3,totalGoals3,teamBudget3,plList3);





// print team stats
        System.out.println("REPORT: Stats per Team\n" +
                "================================\n");
        team1.teamReport();
        team2.teamReport();
        team3.teamReport();


        System.out.println("REPORT: Stats per Player\n" +
                "================================\n");
        for (int i = 0; i < 4; i++) {
            plList1[i].playerReport();
            System.out.println(team1.getTeamName() + "\n");
        }
        for (int i = 0; i < 4; i++) {
            plList2[i].playerReport();
            System.out.println(team2.getTeamName() + "\n");
        }
        for (int i = 0; i < 4; i++) {
            plList3[i].playerReport();
            System.out.println(team3.getTeamName() + "\n");
        }

    }
}//END


