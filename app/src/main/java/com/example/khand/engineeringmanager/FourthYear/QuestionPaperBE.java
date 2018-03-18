package com.example.khand.engineeringmanager.FourthYear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.khand.engineeringmanager.R;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaperBE extends AppCompatActivity {

    private RecyclerView recyclerView;
    private QuestionPaperBEAdapter adapter;
    List<QuestionPaperBEList> QuestionPaperBEList;

    //For Banner Ads
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper_be);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 2;

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

        // Banner Ads
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        QuestionPaperBEList = new ArrayList<>();

        QuestionPaperBEList list = new QuestionPaperBEList("Computer Engineering (BE)",1);
        QuestionPaperBEList.add(list);
        QuestionPaperBEList list1 = new QuestionPaperBEList("IT Engineering (BE) ",2);
        QuestionPaperBEList.add(list1);
        QuestionPaperBEList list2 = new QuestionPaperBEList("Mechanical Engineering (BE) ",3);
        QuestionPaperBEList.add(list2);
        QuestionPaperBEList list3 = new QuestionPaperBEList("Civil Engineering (BE)",4);
        QuestionPaperBEList.add(list3);
        QuestionPaperBEList list4 = new QuestionPaperBEList("Electrical Engineering (BE)",5);
        QuestionPaperBEList.add(list4);
        QuestionPaperBEList list5 = new QuestionPaperBEList("E&Tc Engineering (BE)",6);
        QuestionPaperBEList.add(list5);




        adapter = new QuestionPaperBEAdapter(QuestionPaperBEList,this);
        recyclerView.setAdapter(adapter);
    }
}
