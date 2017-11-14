package com.ptp.phamtanphat.youtubeplaylist1409.Service;

import retrofit2.Retrofit;

/**
 * Created by KhoaPhamPC on 14/11/2017.
 */

public class APIService {
    private static final String Base_url = "https://www.googleapis.com/youtube/v3/";

    public static DataAPI getData(){
        return RetrofitAPIClient.getClient(Base_url).create(DataAPI.class);
    }
}
