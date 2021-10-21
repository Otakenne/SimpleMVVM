package com.celerii.simplemvvm.Utility;

import com.celerii.simplemvvm.Models.Holiday;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("PublicHolidays/2019/us")
    Call<List<Holiday>> getHoliday();
}
