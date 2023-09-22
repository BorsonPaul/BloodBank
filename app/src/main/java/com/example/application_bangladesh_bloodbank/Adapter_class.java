package com.example.application_bangladesh_bloodbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_class extends RecyclerView.Adapter<Adapter_class.viewHolder> {

    List<notice_data> list;
    Context context;


    public Adapter_class(List<notice_data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.inputview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        notice_data data=list.get(position);
        holder.name.setText(data.getName());
        holder.phone.setText(data.getPhone());
        holder.district.setText(data.getDistrict());
        holder.location.setText(data.getLocation());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
         TextView name,phone,district,location;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.textName);
            phone=(TextView) itemView.findViewById(R.id.textPhone);
            district=(TextView) itemView.findViewById(R.id.textzela);
            location=(TextView) itemView.findViewById(R.id.textLocation);
        }
    }
}
