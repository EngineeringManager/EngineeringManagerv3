package com.dexterlabs.khand.engineeringmanager.firstYear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;

import java.util.List;
import com.dexterlabs.khand.engineeringmanager.webview;

/**
 * Created by khand on 11-02-2018.
 */

public class AdapterQuestionPapersFirstYear extends RecyclerView.Adapter<AdapterQuestionPapersFirstYear.ViewHolder> {
    List<QuestionPaperItemsFirstYear> firstYearItem;
    Context context;
    int currentPosition=-1;

    public AdapterQuestionPapersFirstYear(List<QuestionPaperItemsFirstYear> QuestionPaperItemsFirstYear, Context context) {
        this.firstYearItem = QuestionPaperItemsFirstYear;
        this.context = context;
    }

    @Override
    public AdapterQuestionPapersFirstYear.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = LayoutInflater.from(context);
            View v = inflater.inflate(R.layout.first_year_qp,null);
            ViewHolder holder= new ViewHolder(v);



            return holder;
    }

    @Override
    public void onBindViewHolder(AdapterQuestionPapersFirstYear.ViewHolder holder,final int position) {
        QuestionPaperItemsFirstYear fe= firstYearItem.get(position);
        holder.subject.setText(fe.getSubject());

        if(currentPosition==position)
        {
            if(fe.getPosition()==1)
            {
               Intent intent=new Intent(context,webview.class);
                intent.putExtra("url", "http://shrtfly.com/physicsp2012nov15");
                context.startActivity(intent);


            }
            else if(fe.getPosition()==2)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "mechanics");
                context.startActivity(intent);

            }
            else if(fe.getPosition()==3)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "m1");
                context.startActivity(intent);

            } else if(fe.getPosition()==4)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "m2");
                context.startActivity(intent);

            } else if(fe.getPosition()==5)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "graphics");
                context.startActivity(intent);

            } else if(fe.getPosition()==6)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "chemistry");
                context.startActivity(intent);

            } else if(fe.getPosition()==7)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "bme");
                context.startActivity(intent);

            } else if(fe.getPosition()==8)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "electronics");
                context.startActivity(intent);

            } else if(fe.getPosition()==9)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "electrical");
                context.startActivity(intent);

            } else if(fe.getPosition()==10)
            {
                Intent intent=new Intent(context,QuestionPaperPicker.class);
                intent.putExtra("subject", "civil");
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
