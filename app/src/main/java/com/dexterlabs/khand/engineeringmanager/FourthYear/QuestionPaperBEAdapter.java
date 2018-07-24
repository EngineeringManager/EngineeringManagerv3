package com.dexterlabs.khand.engineeringmanager.FourthYear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;
import com.dexterlabs.khand.engineeringmanager.SecondYear.SeVidMain;
import com.dexterlabs.khand.engineeringmanager.webview;

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
                intent.putExtra("url", "https://drive.google.com/open?id=1EdBawcp3YKVkGVXUf6dyQyjyg8u4g5AB");
                context.startActivity(intent);
            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1HRzq3w0fC7fAhWbAByaVb_mMlwuWVHox");
                context.startActivity(intent);
            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1eHphohQ1jdeetZWxYA8tmrx3OlOMa5Jk");
                context.startActivity(intent);

            } else if(se.getPosition()==4)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1Jp-DNwCMzZyGErlAiGTkflK28InCeK8_");
                context.startActivity(intent);

            } else if(se.getPosition()==5)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=12CNnOoVpu2t-w70DDH9y4QX1DmN_-WUf");
                context.startActivity(intent);

            } else if(se.getPosition()==6)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=15CIjiYcequEYIbH41syLdRLfyCxF2Z8R");
                context.startActivity(intent);

            }
            else if(se.getPosition()==11)
            {
                Intent intent=new Intent(context,BeVidMain.class);
                intent.putExtra("dept", "comp");
                context.startActivity(intent);

            }
            else if(se.getPosition()==22)
            {/*
                Intent intent=new Intent(context,BeVidMain.class);
                intent.putExtra("dept", "it");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();

            }
            else if(se.getPosition()==33)
            {
               /* Intent intent=new Intent(context,BeVidMain.class);
                intent.putExtra("dept", "mech");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==44)
            {
               /* Intent intent=new Intent(context,BeVidMain.class);
                intent.putExtra("dept", "civil");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==55)
            {
                /*Intent intent=new Intent(context,BeVidMain.class);
                intent.putExtra("dept", "ele");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==66)
            {
                /*Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "entc");
                context.startActivity(intent);

*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();

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
