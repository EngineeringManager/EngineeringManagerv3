package com.dexterlabs.khand.engineeringmanager.SecondYear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;
import com.dexterlabs.khand.engineeringmanager.webview;

import java.util.List;

/**
 * Created by khand on 19-02-2018.
 */

public class QuestionPaperSEAdapter extends RecyclerView.Adapter<QuestionPaperSEAdapter.ViewHolder> {
    List<QuestionPaperSEList> firstYearItem;
    Context context;
    int currentPosition=-1;

    public QuestionPaperSEAdapter(List<QuestionPaperSEList> QuestionPaperSEList, Context context) {
        this.firstYearItem = QuestionPaperSEList;
        this.context = context;
    }

    @Override
    public QuestionPaperSEAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.gridview,null);
        QuestionPaperSEAdapter.ViewHolder holder= new QuestionPaperSEAdapter.ViewHolder(v);



        return holder;
    }

    @Override
    public void onBindViewHolder(QuestionPaperSEAdapter.ViewHolder holder,final int position) {
        QuestionPaperSEList se= firstYearItem.get(position);
        holder.subject.setText(se.getSubject());

        if(currentPosition==position)
        {
            if(se.getPosition()==1)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1aiIRLPxGTU5uxM8slmSWdyslC0w7P9g-");
                context.startActivity(intent);


            }
            else if(se.getPosition()==2)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1PW6BuqfAhYIf97JW8vr-9oBjQUmmRtES");
                context.startActivity(intent);

            }
            else if(se.getPosition()==3)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1UjxVsWlDn6H7FHtz6kxC1pC-TCdvp5P5");
                context.startActivity(intent);

            } else if(se.getPosition()==4)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1WLMIRgPBz3M1xBhAMv76ORDvGR14Dc-H");
                context.startActivity(intent);

            } else if(se.getPosition()==5)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1Bx3KDfuBqiuNs0n0ofGjvbpCe1eGwax4");
                context.startActivity(intent);

            } else if(se.getPosition()==6)
            {
                Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "https://drive.google.com/open?id=1ZZIQHXoo0h-OFPwpjguCIiW_3iwoEopX");
                context.startActivity(intent);

            }
            else if(se.getPosition()==11)
            {
                Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "comp");
                context.startActivity(intent);
//                Toast.makeText(context, "Still searching for the best videos for you :) Please wait for our next update.", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==22)
            {
               /* Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "it");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==33)
            {
                Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "mech");
                context.startActivity(intent);
//                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();

/*
                Toast.makeText(context, "Still searching fot the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();
*/

            }
            else if(se.getPosition()==44)
            {
                /*Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "civil");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==55)
            {
               /* Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "ele");
                context.startActivity(intent);*/
                Toast.makeText(context, "Still searching for the best videos for you :) please wait for our next update", Toast.LENGTH_LONG).show();


            }
            else if(se.getPosition()==66)
            {
               /* Intent intent=new Intent(context,SeVidMain.class);
                intent.putExtra("dept", "entc");
                context.startActivity(intent);*/
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
        return firstYearItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView subject;
        public ViewHolder(View itemView) {
            super(itemView);
            subject= (TextView) itemView.findViewById(R.id.recycler_text);

        }
    }
}
