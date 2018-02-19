package com.example.khand.engineeringmanager.ThirdYear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.khand.engineeringmanager.R;
import com.example.khand.engineeringmanager.webview;

import java.util.List;

/**
 * Created by khand on 19-02-2018.
 */


public class QuestionPaperTEAdapter extends RecyclerView.Adapter<QuestionPaperTEAdapter.ViewHolder> {
    List<QuestionPaperTEList> QuestionPaperTEList;
    Context context;
    int currentPosition=-1;

    public QuestionPaperTEAdapter(List<QuestionPaperTEList> QuestionPaperTEList, Context context) {
        this.QuestionPaperTEList = QuestionPaperTEList;
        this.context = context;
    }

    @Override
    public QuestionPaperTEAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        QuestionPaperTEAdapter.ViewHolder holder= new QuestionPaperTEAdapter.ViewHolder(v);



        return holder;
    }


    @Override
    public void onBindViewHolder(QuestionPaperTEAdapter.ViewHolder holder, final int position) {
        QuestionPaperTEList se= QuestionPaperTEList.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {
            if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJx");
                context.startActivity(intent);
            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJm\n");
                context.startActivity(intent);
            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJT");
                context.startActivity(intent);

            } else if(se.getPosition()==4)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJP");
                context.startActivity(intent);

            } else if(se.getPosition()==5)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJG");
                context.startActivity(intent);

            } else if(se.getPosition()==6)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcClJZ");
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
        return QuestionPaperTEList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView subject;
        public ViewHolder(View itemView) {
            super(itemView);
            subject= (TextView) itemView.findViewById(R.id.recycler_text);

        }
    }
}