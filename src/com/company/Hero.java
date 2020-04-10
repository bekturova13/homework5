package com.company;

public class Hero {
    int heroHealth;
    int heroDamage;
    String heroSuperPower;

    public Hero (int heroDamage, int heroHealth, String heroSuperPower){
        this.heroDamage=heroDamage;
        this.heroHealth=heroHealth;
        this.heroSuperPower=heroSuperPower;
    }
    public Hero (int heroHealth, int heroDamage){
        this.heroHealth=heroHealth;
        this.heroDamage=heroDamage;

    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }
}

