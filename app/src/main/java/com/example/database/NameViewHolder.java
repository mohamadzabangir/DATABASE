package com.example.database;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private ImageView check_task;
    private TextView title_task;
    private TextView time_task;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        check_task = itemView.findViewById(R.id.checked_task);
        title_task = itemView.findViewById(R.id.title_task);
        time_task = itemView.findViewById(R.id.time_task);

    }

    public void setItems(String title, String time, boolean checked) {
        title_task.setText(title);
        time_task.setText(time);
        if (checked) {
            check_task.setVisibility(View.VISIBLE);
        } else {
            check_task.setVisibility(View.GONE);
        }
    }


}