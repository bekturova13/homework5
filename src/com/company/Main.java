package com.company;

public class Main {

    public static void main(String[] args) {
        Boss greatBoss = new Boss();
        greatBoss.setBossDamage(50);
        greatBoss.setBossHealth(850);
        greatBoss.setBossDefenceType("Magical");
        System.out.println(greatBoss.getBossDamage() + " " + greatBoss.getBossHealth() + " " + greatBoss.getBossDefenceType());
    }

}
