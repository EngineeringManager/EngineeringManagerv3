package com.example.khand.engineeringmanager.FourthYear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khand.engineeringmanager.R;
import com.example.khand.engineeringmanager.webview;

import java.util.List;


public class QuestionPaperBEAdapter extends RecyclerView.Adapter<QuestionPaperBEAdapter.ViewHolder> {
    List<QuestionPaperBEList> QuestionPaperBEList;
    Context context;
    int currentPosition=-1;

    public QuestionPaperBEAdapter(List<QuestionPaperBEList> QuestionPaperBEList, Context context) {
        this.QuestionPaperBEList = QuestionPaperBEList;
        this.context = context;
    }

    @Override
    public QuestionPaperBEAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        QuestionPaperBEAdapter.ViewHolder holder= new QuestionPaperBEAdapter.ViewHolder(v);



        return holder;
    }

    @Override
    public void onBindViewHolder(QuestionPaperBEAdapter.ViewHolder holder, final int position) {
        QuestionPaperBEList se= QuestionPaperBEList.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {
            if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVsC");
                context.startActivity(intent);
            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVs1");
                context.startActivity(intent);
            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVdq");
                context.startActivity(intent);

            } else if(se.getPosition()==4)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVdy");
                context.startActivity(intent);

            } else if(se.getPosition()==5)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVda");
                context.startActivity(intent);

            } else if(se.getPosition()==6)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://gestyy.com/wcCVdh");
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
        return QuestionPaperBEList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView subject;
        public ViewHolder(View itemView) {
            super(itemView);
            subject= (TextView) itemView.findViewById(R.id.recycler_text);

        }
    }
}
