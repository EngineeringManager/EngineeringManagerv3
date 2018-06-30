package com.dexterlabs.khand.engineeringmanager;

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

public class vidTutSelAdapter extends RecyclerView.Adapter<vidTutSelAdapter.ViewHolder> {
    List<HomeAdapterList> HomeAdapterList;
    Context context;
    int currentPosition=-1;

    public vidTutSelAdapter(List<HomeAdapterList> HomeAdapterList, Context context) {
        this.HomeAdapterList = HomeAdapterList;
        this.context = context;
    }

    @Override
    public vidTutSelAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        vidTutSelAdapter.ViewHolder holder= new vidTutSelAdapter.ViewHolder(v);



        return holder;
    }


    @Override
    public void onBindViewHolder(vidTutSelAdapter.ViewHolder holder, final int position) {
        HomeAdapterList se= HomeAdapterList.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {

            if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);

            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);

            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);


            }
            else if(se.getPosition()==4)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);


            }
            else if(se.getPosition()==5)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);


            }
            else if(se.getPosition()==6)
            {
                Intent intent=new Intent(context,videoTuts.class);

                context.startActivity(intent);


            }
            else if(se.getPosition()==7)
            {
                Intent intent=new Intent(context,videoTuts.class);

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



