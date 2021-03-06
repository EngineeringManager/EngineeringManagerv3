package com.dexterlabs.khand.engineeringmanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexterlabs.khand.engineeringmanager.FourthYear.QuestionPaperBE;
import com.dexterlabs.khand.engineeringmanager.SecondYear.QuestionPaperSE;
import com.dexterlabs.khand.engineeringmanager.ThirdYear.QuestionPaperTE;


import java.util.List;

/**
 * Created by khand on 11-02-2018.
 */

public class AdapterQuestionPaperMain extends RecyclerView.Adapter<AdapterQuestionPaperMain.ViewHolder>{

    List<QuestionPaperItems> year;
    Context context;
    int currentPosition=-1;

    public AdapterQuestionPaperMain(List<QuestionPaperItems> year, Context context) {
        this.year = year;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View v= inflater.inflate(R.layout.gridview,null);
        ViewHolder holder=new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterQuestionPaperMain.ViewHolder holder, final int position) {

        QuestionPaperItems questionPaperItems=year.get(position);

        holder.year.setText(questionPaperItems.getYear());

        if(currentPosition==position)
        {

            if(questionPaperItems.position==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=10En-tP7-Aq7UQ6iWnRHE9zDTg_83FO4Q");

                context.startActivity(intent);

            }
            else if(questionPaperItems.position==2)
            {
                Intent intent=new Intent(context,QuestionPaperSE.class);
                intent.putExtra("type", "qp");

                context.startActivity(intent);

            }
            else if(questionPaperItems.position==3)
            {
                Intent intent=new Intent(context,QuestionPaperTE.class);
                intent.putExtra("type", "qp");

                context.startActivity(intent);

            }
            else if(questionPaperItems.position==4)
            {
                Intent intent=new Intent(context,QuestionPaperBE.class);
                intent.putExtra("type", "qp");

                context.startActivity(intent);
            }
        }

        holder.year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = position;
                notifyDataSetChanged();

            }
        });

    }

    @Override
    public int getItemCount() {
        return year.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView year;

        public ViewHolder(View itemView) {
            super(itemView);
            year = itemView.findViewById(R.id.recycler_text);
        }
    }
}
