package com.example.khand.engineeringmanager.firstYear;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khand.engineeringmanager.R;

import java.util.List;

/**
 * Created by khand on 11-02-2018.
 */

public class AdapterPicker extends RecyclerView.Adapter<AdapterPicker.ViewHolder> {

    List<generalPickerList> generalPickerLists;
    Context context;
    int currentPosition=-1;


    public AdapterPicker(List<generalPickerList> generalPickerLists, Context context) {
        this.generalPickerLists = generalPickerLists;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.piceker_list,null);
        AdapterPicker.ViewHolder holder= new AdapterPicker.ViewHolder(v);



        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {

        generalPickerList fe= generalPickerLists.get(position);
        holder.pattern.setText(fe.getYear());
        holder.item1.setText(fe.getItem1());
        holder.item2.setText(fe.getItem2());
        holder.item3.setText(fe.getItem3());
        holder.item1.setVisibility(View.GONE);
        holder.item2.setVisibility(View.GONE);
        holder.item3.setVisibility(View.GONE);

        if(currentPosition==position)
        {
            if (holder.item3.getText() != null) {

                holder.item3.setVisibility(View.VISIBLE);
            }
            if (holder.item1.getText() != null) {

                holder.item1.setVisibility(View.VISIBLE);
            }
            if (holder.item2.getText() != null) {

                holder.item2.setVisibility(View.VISIBLE);
            }


        }

        holder.pattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition=position;
                notifyDataSetChanged();


            }
        });








    }

    @Override
    public int getItemCount() {
        return generalPickerLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView pattern;
        TextView item1;
        TextView item2;
        TextView item3;


        public ViewHolder(View itemView) {
            super(itemView);
            pattern= itemView.findViewById(R.id.pattern);
            item1=itemView.findViewById(R.id.item1);
            item2=itemView.findViewById(R.id.item2);
            item3=itemView.findViewById(R.id.item3);



        }
    }
}
