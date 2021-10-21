package com.celerii.simplemvvm.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.celerii.simplemvvm.Models.Holiday;
import com.celerii.simplemvvm.R;
import com.celerii.simplemvvm.databinding.ItemHolidayBinding;

import java.util.ArrayList;
import java.util.List;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.MyViewHolder> {
    private List<Holiday> holidayList;

    public HolidayAdapter() {
        holidayList = new ArrayList<>();
    }

    public void addHolidayList(List<Holiday> currencyList) {
        this.holidayList = currencyList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ItemHolidayBinding binding;

        public MyViewHolder(@NonNull ItemHolidayBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHolidayBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_holiday, parent, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.setModel(holidayList.get(position));
    }

    @Override
    public int getItemCount() {
        return holidayList != null ? holidayList.size() : 0;
    }
}
