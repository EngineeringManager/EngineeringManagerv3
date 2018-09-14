package com.dexterlabs.khand.engineeringmanager.firstYear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dexterlabs.khand.engineeringmanager.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaperFirstYear extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterQuestionPapersFirstYear adapter;
    List<QuestionPaperItemsFirstYear> QuestionPaperItemsFirstYear;



    //For Banner Ads
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year_qp);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 2;

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));


        QuestionPaperItemsFirstYear = new ArrayList<>();

        QuestionPaperItemsFirstYear list = new QuestionPaperItemsFirstYear("Engineering Physics ",1);
        QuestionPaperItemsFirstYear.add(list);
        QuestionPaperItemsFirstYear list1 = new QuestionPaperItemsFirstYear("Engineering Mechanics ",2);
        QuestionPaperItemsFirstYear.add(list1);
        QuestionPaperItemsFirstYear list2 = new QuestionPaperItemsFirstYear("Engineering Mathematics ",3);
        QuestionPaperItemsFirstYear.add(list2);
        QuestionPaperItemsFirstYear list3 = new QuestionPaperItemsFirstYear("Engineering Mathematics-II ",4);
        QuestionPaperItemsFirstYear.add(list3);
        QuestionPaperItemsFirstYear list4 = new QuestionPaperItemsFirstYear("Engineering Graphics ",5);
        QuestionPaperItemsFirstYear.add(list4);
        QuestionPaperItemsFirstYear list5 = new QuestionPaperItemsFirstYear("Engineering Chemistry ",6);
        QuestionPaperItemsFirstYear.add(list5);
        QuestionPaperItemsFirstYear list6 = new QuestionPaperItemsFirstYear("Basic Mechanical Engineering ",7);
        QuestionPaperItemsFirstYear.add(list6);
        QuestionPaperItemsFirstYear list7 = new QuestionPaperItemsFirstYear("Basic Electronics Engineering",8);
        QuestionPaperItemsFirstYear.add(list7);
        QuestionPaperItemsFirstYear list8 = new QuestionPaperItemsFirstYear("Basic Electrical Engineering ",9);
        QuestionPaperItemsFirstYear.add(list8);
        QuestionPaperItemsFirstYear list9 = new QuestionPaperItemsFirstYear("Basic Civil And Environment Engineering ",10);
        QuestionPaperItemsFirstYear.add(list9);




        adapter = new AdapterQuestionPapersFirstYear(QuestionPaperItemsFirstYear,this);
        recyclerView.setAdapter(adapter);


//        // Banner Ads
//        mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

    }
}
