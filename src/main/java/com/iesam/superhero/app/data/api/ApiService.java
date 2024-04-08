package com.iesam.superhero.app.data.api;

import com.iesam.superhero.feature.feed.data.remote.SuperHero;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ApiService {

    @GET("all.json")
    public Call<List<SuperHero>> getSuperHeroes();

    @GET("id/{superHeroId}.json")
    public Call<SuperHero> getSuperHero(@Path("superHeroId") int superHeroId);
}
