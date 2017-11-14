package com.ptp.phamtanphat.youtubeplaylist1409.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ptp.phamtanphat.youtubeplaylist1409.R;

public class MainActivity extends AppCompatActivity {

    String API_KEY ="AIzaSyBGGktHD0BJXnFJuGXe7oLR7DBj9hBbY3A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&maxResults=2&playlistId=PLzrVYRai0riSRJ3M3bifVWWRq5eJMu6tv&key=AIzaSyBGGktHD0BJXnFJuGXe7oLR7DBj9hBbY3A
    }
}
