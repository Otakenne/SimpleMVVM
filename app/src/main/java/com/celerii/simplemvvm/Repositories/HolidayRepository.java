package com.celerii.simplemvvm.Repositories;

import androidx.lifecycle.MutableLiveData;

import com.celerii.simplemvvm.Models.Holiday;
import com.celerii.simplemvvm.Utility.ApiInterface;
import com.celerii.simplemvvm.Utility.MyApplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Responsible for collecting data from local or remote database
 */
public class HolidayRepository {
    public MutableLiveData<List<Holiday>> requestHoliday() {
        MutableLiveData<List<Holiday>> mutableLiveData = new MutableLiveData<>();

        ApiInterface apiService = MyApplication.getRetrofitClient().create(ApiInterface.class);

        apiService.getHoliday().enqueue(new Callback<List<Holiday>>() {
            @Override
            public void onResponse(Call<List<Holiday>> call, Response<List<Holiday>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Holiday>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
