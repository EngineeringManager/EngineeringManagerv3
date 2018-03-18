package com.dexterlabs.khand.engineeringmanager.firstYear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.AdapterQuestionPaperMain;
import com.dexterlabs.khand.engineeringmanager.QuestionPaperItems;
import com.dexterlabs.khand.engineeringmanager.R;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaperPicker extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterPicker adapter;
    List<generalPickerList> generalPickerLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper_picker);

        String s = getIntent().getStringExtra("subject");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();


if(s.equals("physics")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
                int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","physics nov13","physics nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","physics nov13","physics nov14","physics nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","physics nov13","physics nov14","physics nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","physics nov13","physics nov14","physics nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }

        if(s.equals("mechanics")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","mechanics nov13","mechanics nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","mechanics nov13","mechanics nov14","mechanics nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","mechanics nov13","mechanics nov14","mechanics nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","mechanics nov13","mechanics nov14","mechanics nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("m1")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","m1 nov13","m1 nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","m1 nov13","m1 nov14","m1 nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","m1 nov13","m1 nov14","m1 nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","m1 nov13","m1 nov14","m1 nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("m2")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","m2 nov13","m2 nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","m2 nov13","m2 nov14","m2 nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","m2 nov13","m2 nov14","m2 nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","m2 nov13","m2 nov14","m2 nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("graphics")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","graphics nov13","graphics nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","graphics nov13","graphics nov14","graphics nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","graphics nov13","graphics nov14","graphics nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","graphics nov13","graphics nov14","graphics nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("chemistry")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","chemistry nov13","chemistry nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","chemistry nov13","chemistry nov14","chemistry nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","chemistry nov13","chemistry nov14","chemistry nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","chemistry nov13","chemistry nov14","chemistry nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("bme")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","bme nov13","bme nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","bme nov13","bme nov14","bme nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","bme nov13","bme nov14","bme nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","bme nov13","bme nov14","bme nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("electronics")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","electronics nov13","electronics nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","electronics nov13","electronics nov14","electronics nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","electronics nov13","electronics nov14","electronics nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","electronics nov13","electronics nov14","electronics nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("electrical")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","electrical nov13","electrical nov14", null,1);
            generalPickerLists.add(list1);

            generalPickerList list2 = new generalPickerList("2013","electrical nov13","electrical nov14","electrical nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","electrical nov13","electrical nov14","electrical nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","electrical nov13","electrical nov14","electrical nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }
        if(s.equals("civil")){
            recyclerView = (RecyclerView) findViewById(R.id.recyclerViewfe);
            recyclerView.setHasFixedSize(true);
            int numberOfColumns = 1;

            recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));


            generalPickerLists = new ArrayList<>();

            generalPickerList list1 = new generalPickerList("2012","civil nov13","civil nov14", null,1);
            generalPickerLists.add(list1);
            generalPickerList list2 = new generalPickerList("2013","civil nov13","civil nov14","civil nov15",1);
            generalPickerLists.add(list2);
            generalPickerList list3 = new generalPickerList("2014","civil nov13","civil nov14","civil nov15",1);
            generalPickerLists.add(list3);
            generalPickerList list4 = new generalPickerList("2015","civil nov13","civil nov14","civil nov15",1);
            generalPickerLists.add(list4);



            adapter = new AdapterPicker(generalPickerLists,this);
            recyclerView.setAdapter(adapter);


        }}




}

