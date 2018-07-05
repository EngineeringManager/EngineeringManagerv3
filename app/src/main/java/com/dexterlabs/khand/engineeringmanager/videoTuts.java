package com.dexterlabs.khand.engineeringmanager;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class videoTuts  extends AppCompatActivity {


    private ExpandableListView expandableListView;

//    Start adding subject names comma seperated

    String[] parent = new String[]{"Basic Civil Engineering","Basic Electrical Engineering","Basic Electronics Engineering","Basic Mechanical Engineering","Engineering Chemistry","Engineering Graphics","Engineering Mathematics","Engineering Mathematics-II","Engineering Mechanics","Engineering Physics"};

    String[] q1 = new String[]{"Civil unit 1"};

    String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
    String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
    String[] des1 = new String[]{"in civil unit 1 link 1","in civil unit 1 link 2","in civil unit 1 link 3"};
    String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah","asdfasdfasdfasdfasdf asfdsadfasfadsf"};
    String[] des3 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blah"};
    String[] des4 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};
    String[] des5 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

    LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
    /**
     * Second level array list
     */
    List<String[]> secondLevel = new ArrayList<>();
    /**
     * Inner level data
     */
    List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_tuts);
        setUpAdapter();
    }

    private void setUpAdapter() {
        secondLevel.add(q1);
        secondLevel.add(q2);
        secondLevel.add(q3);
        thirdLevelq1.put(q1[0], des1);



        thirdLevelq2.put(q2[0], des3);
        thirdLevelq2.put(q2[1], des4);
        thirdLevelq2.put(q2[2], des2);
        thirdLevelq2.put(q2[3], des1);
        thirdLevelq3.put(q3[0], des5);

        thirdLevelq3.put(q3[1], des4);
        thirdLevelq3.put(q3[2], des2);
        thirdLevelq3.put(q3[3], des1);

        data.add(thirdLevelq1);
        data.add(thirdLevelq2);
        data.add(thirdLevelq3);
        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
        //passing three level of information to constructor
        ThreeLevelListAdapter threeLevelListAdapterAdapter = new ThreeLevelListAdapter(this, parent, secondLevel, data);

        expandableListView.setAdapter(threeLevelListAdapterAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if (groupPosition != previousGroup)
                    expandableListView.collapseGroup(previousGroup);
                previousGroup = groupPosition;
                Toast.makeText(videoTuts.this, "asd", Toast.LENGTH_SHORT).show();            }

        });






    }




}