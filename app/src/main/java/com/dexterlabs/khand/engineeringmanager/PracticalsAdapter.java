package com.dexterlabs.khand.engineeringmanager;

/**
 * Created by khand on 16-03-2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by khand on 15-03-2018.
 */

public class PracticalsAdapter extends RecyclerView.Adapter<PracticalsAdapter.ViewHolder> {
    List<HomeAdapterList> HomeAdapterList;
    Context context;
    int currentPosition=-1;

    public PracticalsAdapter(List<HomeAdapterList> HomeAdapterList, Context context) {
        this.HomeAdapterList = HomeAdapterList;
        this.context = context;
    }

    @Override
    public PracticalsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        PracticalsAdapter.ViewHolder holder= new PracticalsAdapter.ViewHolder(v);



        return holder;
    }


    @Override
    public void onBindViewHolder(PracticalsAdapter.ViewHolder holder, final int position) {
        HomeAdapterList se= HomeAdapterList.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {

             if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1Tvu7aVkqQoaSYBGMDX4ns2Xzw5jRCczu");

                context.startActivity(intent);

            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1N7gh5H2TW8cJSQIyhbEW6mkK4-hiwXZj");

                context.startActivity(intent);

            }
             else if(se.getPosition()==3)
             {
                 Intent intent=new Intent(context,webview.class);
                 intent.putExtra("url", "https://drive.google.com/open?id=1xJXeabr19F1D8XKPfaVjYRXSGsTDGf6d");

                 context.startActivity(intent);

             }
             else if(se.getPosition()==4)
             {
                 Intent intent=new Intent(context,webview.class);
                 intent.putExtra("url", "https://drive.google.com/open?id=1VS963SCHfdHKsrzUVVwj30dzOg6t8yoF");

                 context.startActivity(intent);

             }
             else if(se.getPosition()==5)
             {
                 Intent intent=new Intent(context,webview.class);
                 intent.putExtra("url", "https://drive.google.com/open?id=1u0o8OKMk5eKHXCjL3oZ3DDTgdFHBRVMK");

                 context.startActivity(intent);

             }
             else if(se.getPosition()==6)
             {
                 Intent intent=new Intent(context,webview.class);
                 intent.putExtra("url", "https://drive.google.com/open?id=1B6tHjd2JeUOnh5IJGsUaFR7jfxaqQxMk");

                 context.startActivity(intent);

             }

        }

        holder.subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = position;
                notifyDataSetChanged();

            }
        });


    }

    @Override
    public int getItemCount() {
        return HomeAdapterList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView subject;
        public ViewHolder(View itemView) {
            super(itemView);
            subject= (TextView) itemView.findViewById(R.id.recycler_text);

        }
    }
}













