package com.ptp.phamtanphat.youtubeplaylist1409.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by KhoaPhamPC on 14/11/2017.
 */

public interface DataAPI {
//  playlistItems?part=snippet&maxResults=2&playlistId=PLzrVYRai0riSRJ3M3bifVWWRq5eJMu6tv&key=AIzaSyBGGktHD0BJXnFJuGXe7oLR7DBj9hBbY3A
    @GET("playlistItems")
    Call<List<Item>> getdata(@Query("part") String part ,@Query("maxResults") String maxresult);
}
