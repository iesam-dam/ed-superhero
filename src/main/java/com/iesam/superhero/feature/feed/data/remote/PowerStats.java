package com.iesam.superhero.feature.feed.data.remote;

public class PowerStats {
    public final String intelligence;
    public final Integer strength;
    public final Integer speed;
    public final Integer durability;
    public final Integer power;
    public final Integer combat;


    public PowerStats(String intelligence, Integer strength, Integer speed, Integer durability, Integer power, Integer combat) {
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }
}
