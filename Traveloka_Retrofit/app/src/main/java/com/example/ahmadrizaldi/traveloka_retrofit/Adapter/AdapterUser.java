package com.example.ahmadrizaldi.traveloka_retrofit.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahmadrizaldi.traveloka_retrofit.Model.User;
import com.example.ahmadrizaldi.traveloka_retrofit.R;

import java.util.ArrayList;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.ViewHolder> {

    private Context context;
    private ArrayList<User> rvData;

    public AdapterUser(Context context, ArrayList<User> rvData) {
        this.context = context;
        this.rvData = rvData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.email.setText(rvData.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView email;
        public ViewHolder(View itemView) {
            super(itemView);

            email = (TextView)itemView.findViewById(R.id.email_text);

        }
    }
}
