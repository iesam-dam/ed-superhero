package com.iesam.superhero.feature.feed.data.remote;

import com.google.gson.annotations.SerializedName;

public class SuperHero {

    @SerializedName("id")
    public final Integer id;

    @SerializedName("name")
    public final String name;

    @SerializedName("slug")
    public final String slug;

    @SerializedName("powerstats")
    public final PowerStats powerStats;

    @SerializedName("appearance")
    public final Appearance appearance;

    @SerializedName("biography")
    public final Biography biography;

    @SerializedName("work")
    public final Work work;

    @SerializedName("connections")
    public final Connections connections;

    @SerializedName("images")
    public final Images images;


    public SuperHero(Integer id, String name, String slug, PowerStats powerStats, Appearance appearance, Biography biography, Work work, Connections connections, Images images) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.powerStats = powerStats;
        this.appearance = appearance;
        this.biography = biography;
        this.work = work;
        this.connections = connections;
        this.images = images;
    }
}
