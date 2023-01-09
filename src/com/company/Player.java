package com.company;

import java.util.Scanner;

public class Player {
    public Scanner sc = new Scanner(System.in);
    private String plName;
    private int numOfGoals;
    private int numOfAssists;
    //private int totalAndGoal;

    //o	For players, gather the player’s name, number of goals and number of assists
    //2. Constructors
    public Player(String plName, int numOfGoals, int numOfAssits){
        this.setplName(plName); // this.fName = fName;
        this.numOfGoals(numOfGoals);
        this.numOfAssists(numOfAssits);
       //this.totalAndGoal(totalAndGoal);
    }

    //private void totalAndGoal(int totalAndGoal) {this.totalAndGoal = totalAndGoal;}
    //public int getTotalAndGoal() {return totalAndGoal; }
    private void numOfAssists(int numOfAssits) {this.numOfAssists=numOfAssits;}
    public int getNumOfAssists() {
//        System.out.println("Enter players number of assists: ");
//        numOfAssists = sc.nextInt();
        return numOfAssists; }
    private void numOfGoals(int numOfGoals) { this.numOfGoals=numOfGoals;}
    public int getNumOfGoals() {
//        System.out.println("Enter players number of goals: ");
//        numOfGoals = sc.nextInt();
        return numOfGoals; }
    private void setplName(String plName) { this.plName =plName;}
    public String getPlName() {
//        System.out.println("Enter Student's first name");
//        plName = sc.nextLine();
        return plName;}



    public void playerReport(){
        System.out.println(this.plName+":\tG - "+this.numOfGoals+"\tA - " +this.numOfAssists+"\tTotal - "
                + (this.numOfAssists + this.numOfGoals));
        System.out.println();
    }




}//END OF PLAYER





