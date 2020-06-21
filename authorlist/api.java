package com.example.authorlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface api {
    String BASE_URL = "http://192.168.1.101:3000/";
    @GET("authors")
    Call<List<obj>> getobj();
}
