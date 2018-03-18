package com.example.khand.engineeringmanager.ThirdYear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.khand.engineeringmanager.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaperTE extends AppCompatActivity {

    private RecyclerView recyclerView;
    private QuestionPaperTEAdapter adapter;
    List<QuestionPaperTEList> QuestionPaperTEList;

    //For Banner Ads
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper_te);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 2;

        // Banner Ads
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));


        QuestionPaperTEList = new ArrayList<>();
        QuestionPaperTEList list = new QuestionPaperTEList("Computer Engineering (TE)",1);
        QuestionPaperTEList.add(list);
        QuestionPaperTEList list1 = new QuestionPaperTEList("IT Engineering (TE ",2);
        QuestionPaperTEList.add(list1);
        QuestionPaperTEList list2 = new QuestionPaperTEList("Mechanical Engineering (TE ",3);
        QuestionPaperTEList.add(list2);
        QuestionPaperTEList list3 = new QuestionPaperTEList("Civil Engineering (TE",4);
        QuestionPaperTEList.add(list3);
        QuestionPaperTEList list4 = new QuestionPaperTEList("Electrical Engineering (TE",5);
        QuestionPaperTEList.add(list4);
        QuestionPaperTEList list5 = new QuestionPaperTEList("E&Tc Engineering (TE",6);
        QuestionPaperTEList.add(list5);




        adapter = new QuestionPaperTEAdapter(QuestionPaperTEList,this);
        recyclerView.setAdapter(adapter);
    }
}
