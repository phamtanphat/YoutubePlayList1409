package com.ptp.phamtanphat.youtubeplaylist1409.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.ptp.phamtanphat.youtubeplaylist1409.Adapter.YoutubeAPIAdapter;
import com.ptp.phamtanphat.youtubeplaylist1409.Model.Item;
import com.ptp.phamtanphat.youtubeplaylist1409.Model.YoutubeAPI;
import com.ptp.phamtanphat.youtubeplaylist1409.R;
import com.ptp.phamtanphat.youtubeplaylist1409.Service.APIService;
import com.ptp.phamtanphat.youtubeplaylist1409.Service.DataAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String API_KEY ="AIzaSyBGGktHD0BJXnFJuGXe7oLR7DBj9hBbY3A";
    ListView lv;
    ArrayList<Item> mangitem;
    YoutubeAPIAdapter youtubeAPIAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        mangitem = new ArrayList<>();
        youtubeAPIAdapter = new YoutubeAPIAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangitem);
        lv.setAdapter(youtubeAPIAdapter);
        GetDataFromJson();
    }

    private void GetDataFromJson() {
        DataAPI dataAPI = APIService.getData();
        Call<YoutubeAPI> callback = dataAPI.getdata("snippet","50","PLVn0x_fJ3ZS9ivo9iv0Y9uvlV20EFKy8I",API_KEY);
        callback.enqueue(new Callback<YoutubeAPI>() {
            @Override
            public void onResponse(Call<YoutubeAPI> call, Response<YoutubeAPI> response) {
                YoutubeAPI youtubeAPI = response.body();
                for (int i = 0 ; i <youtubeAPI.getItems().size() ; i++){
                    mangitem.add(youtubeAPI.getItems().get(i));
                }
                youtubeAPIAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<YoutubeAPI> call, Throwable t) {

            }
        });
    }
}
