package com.example.khand.engineeringmanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by khand on 16-03-2018.
 */

public class SyllabusAdapter extends RecyclerView.Adapter<SyllabusAdapter.ViewHolder> {
    List<HomeAdapterList> HomeAdapterList;
    Context context;
    int currentPosition=-1;

    public SyllabusAdapter(List<HomeAdapterList> HomeAdapterList, Context context) {
        this.HomeAdapterList = HomeAdapterList;
        this.context = context;
    }

    @Override
    public SyllabusAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        SyllabusAdapter.ViewHolder holder= new SyllabusAdapter.ViewHolder(v);



        return holder;
    }


    @Override
    public void onBindViewHolder(SyllabusAdapter.ViewHolder holder, final int position) {
        HomeAdapterList se= HomeAdapterList.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {

            if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1TMP7aULGxO247Zs1_PFSwjwThMwCF6Ru");

                context.startActivity(intent);

            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1cxn4z2M6TYMgJU6tofIIaMXtO8Yqq-js");

                context.startActivity(intent);

            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1ILGo52ekaR0Jc9a74tz3LfR2_kfBxWJd");

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



