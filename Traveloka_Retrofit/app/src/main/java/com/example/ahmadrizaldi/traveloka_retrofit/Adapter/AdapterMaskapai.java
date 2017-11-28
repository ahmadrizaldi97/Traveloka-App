package com.example.ahmadrizaldi.traveloka_retrofit.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ahmadrizaldi.traveloka_retrofit.Maskapai;
import com.example.ahmadrizaldi.traveloka_retrofit.R;

import java.util.ArrayList;

/**
 * Created by ahmadrizaldi on 11/28/17.
 */

public class AdapterMaskapai extends RecyclerView.Adapter<AdapterMaskapai.ViewHolder> {

    private Context context;
    private ArrayList<Maskapai> rvData;

    public AdapterMaskapai(Context context, ArrayList<Maskapai> rvData) {
        this.context = context;
        this.rvData = rvData;
    }

    @Override
    public AdapterMaskapai.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.maskapai_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterMaskapai.ViewHolder holder, int position) {
        holder.namaMaskapai.setText(rvData.get(position).getNama_maskapai());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView namaMaskapai;
        public ViewHolder(View itemView) {
            super(itemView);

            namaMaskapai = (TextView)itemView.findViewById(R.id.maskapai_text);
        }
    }
}
