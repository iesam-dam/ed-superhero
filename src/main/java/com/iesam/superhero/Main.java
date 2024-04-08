package com.iesam.superhero;

import com.iesam.superhero.app.data.api.ApiClient;
import com.iesam.superhero.app.data.api.ApiService;
import com.iesam.superhero.feature.feed.data.remote.SuperHero;

import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        getAllSuperHeroes();
        getSuperHero(1);
    }

    private static void getAllSuperHeroes(){
        new Thread(() -> {
            ApiClient apiClient = new ApiClient();
            List<SuperHero> superHeroList = null;
            try {
                superHeroList = apiClient
                        .apiService
                        .getSuperHeroes()
                        .execute()
                        .body();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            superHeroList.toString();
        }).start();
    }

    private static void getSuperHero(Integer superHeroId){
        new Thread(() -> {
            ApiClient apiClient = new ApiClient();
            try {
                SuperHero superHero = apiClient
                        .apiService
                        .getSuperHero(superHeroId)
                        .execute()
                        .body();
                superHero.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}