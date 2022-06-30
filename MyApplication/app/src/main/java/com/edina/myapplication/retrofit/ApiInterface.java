package com.edina.myapplication.retrofit;

import com.edina.myapplication.model.Posts;
import com.edina.myapplication.model.Comments;
import com.edina.myapplication.model.Albums;
import com.edina.myapplication.model.Photos;
import com.edina.myapplication.model.Todos;
import com.edina.myapplication.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/posts")
    Call<List<Posts>> getPosts();

    @GET("/comments")
    Call<List<Comments>> getComments();

    @GET("/albums")
    Call<List<Albums>> getAlbums();

    @GET("/photos")
    Call<List<Photos>> getPhotos();

    @GET("/users")
    Call<List<Users>> getUsers();
}
