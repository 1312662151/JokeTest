package com.example.joketest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.text_view);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request();
            }
        });
    }

    public void request(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/joke/content/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetService request=retrofit.create(GetService.class);

        Map<String,String> queryMap=new HashMap<>();
        queryMap.put("sort","1516153686");
        queryMap.put("page","2");
        queryMap.put("pagesize","10");
        queryMap.put("time","1516153686");
        queryMap.put("key","34bd49b57aaff702e4f3e62d1d9efe4f");

        retrofit2.Call<Joke> call=request.getCall(queryMap);
        call.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(retrofit2.Call<Joke> call, Response<Joke> response) {
                    Joke joke=response.body();
                Joke.ResultBean resultBean=new Joke.ResultBean();
            }

            @Override
            public void onFailure(retrofit2.Call<Joke> call, Throwable t) {
                System.out.println("連接失敗");
            }
        });

    }
}
