package com.izdeveloper.userstorageapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txtDefaultName, txtDefaultDegree, txtDefaultEmail;
    ImageView DefaultImg;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        DefaultImg = itemView.findViewById(R.id.DefaultImg);

        txtDefaultName = itemView.findViewById(R.id.txtDefaultName);
        txtDefaultDegree = itemView.findViewById(R.id.txtDefaultDegree);
        txtDefaultEmail = itemView.findViewById(R.id.txtDefaultEmail);
    }
}
