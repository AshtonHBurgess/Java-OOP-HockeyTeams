package com.company;

public class Team {

    private String teamName;
    private String rating;
    private int totalGoals;
    private int totalAssists;
    private int totalAndGoal;
    private double teamBudget;
    private Player[] plList = new Player[4];

    public Team(String rating, String teamName, int totalAndGoal, int totalAssists, int totalGoals, double teamBudget, Player[] plList){
        this.setRating(rating);
        this.setTeamName(teamName); // this.fName = fName;
        this.setTotalAndGoal(totalAndGoal);
        this.setTotalGoals(totalGoals);
        this.setTotalAssists(totalAssists);
        this.setTeamBudget(teamBudget);
        this.setPlList(plList);
    }





    public void teamReport() {
        String print =String.format("%s :\tG - %d \tA - %d \tTotal - %d \tBudget - $%.2f \tRating: CLASS %s", this.getTeamName() , this.getTotalGoals(),this.getTotalAssists() ,this.getTotalAndGoal() , this.getTeamBudget()  ,this.getRating());
        System.out.println(print);
    }



    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(int totalAssists) {
        this.totalAssists = totalAssists;
    }

    public int getTotalAndGoal() {
        return totalAndGoal;
    }

    public void setTotalAndGoal(int totalAndGoal) {
        this.totalAndGoal = totalAndGoal;
    }

    public double getTeamBudget() {
        return teamBudget;
    }

    public void setTeamBudget(double teamBudget) {
        this.teamBudget = teamBudget;
    }

    public Player[] getPlList() {
        return plList;
    }

    public void setPlList(Player[] plList) {
        this.plList = plList;
    }
}


