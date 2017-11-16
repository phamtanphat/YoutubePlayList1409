package com.ptp.phamtanphat.youtubeplaylist1409.Service;

import com.ptp.phamtanphat.youtubeplaylist1409.Model.YoutubeAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by KhoaPhamPC on 14/11/2017.
 */

public interface DataAPI {

    @GET("playlistItems")
    Call<YoutubeAPI> getdata(@Query("part") String part
            , @Query("maxResults") String maxresult
            , @Query("playlistId") String playlistId
            , @Query("key") String key);
}
