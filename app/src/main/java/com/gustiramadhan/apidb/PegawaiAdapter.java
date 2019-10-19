package com.gustiramadhan.apidb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PegawaiAdapter extends  RecyclerView.Adapter<PegawaiAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Pegawai> daftarpegawai;

    public PegawaiAdapter(Context mContext) {
        this.mContext =mContext;
        daftarpegawai = new ArrayList<>();
    }

    public void setDaftarpegawai(ArrayList<Pegawai> daftarpegawai) {
        this.daftarpegawai = daftarpegawai;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PegawaiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_pegawai_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PegawaiAdapter.ViewHolder holder, int position) {
        Pegawai currentPlayer= daftarpegawai.get(position);
        holder.tvNama.setText(currentPlayer.getName());

    }

    @Override
    public int getItemCount() {
        return daftarpegawai.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            button = itemView.findViewById(R.id.button2);
        }
    }
}
