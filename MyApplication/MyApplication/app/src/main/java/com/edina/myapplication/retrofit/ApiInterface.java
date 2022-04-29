package com.edina.myapplication.retrofit;

import com.edina.myapplication.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts")
    Call<List<Posts>> getPosts();
}
