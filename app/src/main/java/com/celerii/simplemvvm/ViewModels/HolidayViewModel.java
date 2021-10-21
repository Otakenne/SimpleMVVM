package com.celerii.simplemvvm.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.celerii.simplemvvm.Models.Holiday;
import com.celerii.simplemvvm.Repositories.HolidayRepository;

import java.util.List;

public class HolidayViewModel extends ViewModel {
    private final HolidayRepository holidayRepository;
    private MutableLiveData<List<Holiday>> mutableLiveData;

    public HolidayViewModel() {
        holidayRepository = new HolidayRepository();
    }

    public LiveData<List<Holiday>> getHolidays() {
        if (mutableLiveData == null) {
            mutableLiveData = holidayRepository.requestHoliday();
        }
        
        return mutableLiveData;
    }
}
