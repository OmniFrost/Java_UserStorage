package com.izdeveloper.userstorageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<User> allusers;
    public ListAdapter(Context context, ArrayList<User> allusers) {
        this.context = context;
        this.allusers = allusers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.display_user, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        String fullName = allusers.get(position).getName() + " " + allusers.get(position).getSurname();
        holder.txtDefaultName.setText(fullName);

        holder.txtDefaultDegree.setText(allusers.get(position).getDegree());
        holder.txtDefaultEmail.setText(allusers.get(position).getEmail());

        switch (allusers.get(position).getAvatar()) {
            case 1:
                holder.DefaultImg.setImageResource(R.drawable.baseline_person_outline_24);
                break;
            case 2:
                holder.DefaultImg.setImageResource(R.drawable.baseline_woman_2_24);
                break;
            case 3:
                holder.DefaultImg.setImageResource(R.drawable.avatar2);
                break;
            case 4:
                holder.DefaultImg.setImageResource(R.drawable.avatar3);
                break;
            default:
                holder.DefaultImg.setImageResource(R.drawable.defaultavtr);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return allusers.size();
    }
}
