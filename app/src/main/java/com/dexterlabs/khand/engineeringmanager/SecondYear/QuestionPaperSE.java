package com.dexterlabs.khand.engineeringmanager.SecondYear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dexterlabs.khand.engineeringmanager.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaperSE extends AppCompatActivity {

    private RecyclerView recyclerView;
    private QuestionPaperSEAdapter adapter;
    List<QuestionPaperSEList> QuestionPaperSEList;

    //For Banner Ads
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper_se);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 2;

        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

//        // Banner Ads
//        mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        QuestionPaperSEList = new ArrayList<>();

        if (getIntent() != null) {


            String info = getIntent().getStringExtra("type");
            if(info.equals("qp")) {
                QuestionPaperSEList list = new QuestionPaperSEList("Computer Engineering", 1);
                QuestionPaperSEList.add(list);
                QuestionPaperSEList list1 = new QuestionPaperSEList("IT Engineering", 2);
                QuestionPaperSEList.add(list1);
                QuestionPaperSEList list2 = new QuestionPaperSEList("Mechanical Engineering", 3);
                QuestionPaperSEList.add(list2);
                QuestionPaperSEList list3 = new QuestionPaperSEList("Civil Engineering", 4);
                QuestionPaperSEList.add(list3);
                QuestionPaperSEList list4 = new QuestionPaperSEList("Electrical Engineering", 5);
                QuestionPaperSEList.add(list4);
                QuestionPaperSEList list5 = new QuestionPaperSEList("E&Tc Engineering", 6);
                QuestionPaperSEList.add(list5);

            }
            else if(info.equals("vid")){

                QuestionPaperSEList list = new QuestionPaperSEList("Computer Engineering", 11);
                QuestionPaperSEList.add(list);
                QuestionPaperSEList list1 = new QuestionPaperSEList("IT Engineering", 22);
                QuestionPaperSEList.add(list1);
                QuestionPaperSEList list2 = new QuestionPaperSEList("Mechanical Engineering", 33);
                QuestionPaperSEList.add(list2);
                QuestionPaperSEList list3 = new QuestionPaperSEList("Civil Engineering", 44);
                QuestionPaperSEList.add(list3);
                QuestionPaperSEList list4 = new QuestionPaperSEList("Electrical Engineering", 55);
                QuestionPaperSEList.add(list4);
                QuestionPaperSEList list5 = new QuestionPaperSEList("E&Tc Engineering", 66);
                QuestionPaperSEList.add(list5);




            }
        }


        adapter = new QuestionPaperSEAdapter(QuestionPaperSEList,this);
        recyclerView.setAdapter(adapter);
    }
}
