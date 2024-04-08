package com.iesam.superhero.feature.feed.data.remote;

import java.util.List;

public class Appearance {
    public final String gender;
    public final String race;
    public final List<String> height;
    public final List<String> weight;
    public final String eyeColor;
    public final String hairColor;

    public Appearance(String gender, String race, List<String> height, List<String> weight, String eyeColor, String hairColor) {
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }
}
