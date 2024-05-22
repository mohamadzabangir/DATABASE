package com.example.database;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterName extends RecyclerView.Adapter<NameViewHolder> {

    private List<Task> tasks;
    public void setTasks(List<Task> inputTasks){
        tasks = inputTasks;
        notifyDataSetChanged();
    }


    public AdapterName() {

    }
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_main, parent, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setItems(tasks.get(position).title.toString(),
                tasks.get(position).time.toString(),tasks.get(position).status);
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }


}