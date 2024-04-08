package com.iesam.superhero.app.data.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static String URL_BASE = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/";

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ApiService apiService = retrofit.create(ApiService.class);


}
