package com.lesson.interfacetask;

public class Player implements Information{
    @Override
    public void getInfo() {
        System.out.println("nameofPlayer -> Messi");
        System.out.println("sportType -> football");
        System.out.println("numberPosition -> 11");

    }

    @Override
    public void getTeamName() {
        System.out.println("teamName -> Argentina");


    }

    public static void main(String[] args) {
        Information player = new Player();
        FootballPlayer footballPlayer = new FootballPlayer();
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer();
        BasketballPlayer basketballPlayer = new BasketballPlayer();

        player.getInfo();
        player.getTeamName();
        footballPlayer.countOfRedCard();
        footballPlayer.countOfYellowCard();
        footballPlayer.countOfGoals();
        footballPlayer.countOfSaves();
        volleyballPlayer.numberOfPoints();
        volleyballPlayer.countOfSets();
        basketballPlayer.numberOfGoals();
        basketballPlayer.countOfGuard();

    }

    }

