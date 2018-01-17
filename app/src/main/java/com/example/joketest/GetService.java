package com.example.joketest;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by 杰 on 2018/1/16.
 */

public interface GetService  {
    @GET("list.php")
    Call<Joke> getCall(@QueryMap Map<String,String> map);
}
