package com.dexterlabs.khand.engineeringmanager.ThirdYear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;
import com.dexterlabs.khand.engineeringmanager.SecondYear.SeVidMain;
import com.dexterlabs.khand.engineeringmanager.SecondYear.SeVidThirdAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TeVidMain extends AppCompatActivity {


    private ExpandableListView expandableListView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_tuts);


        if (getIntent() != null) {

            String info = getIntent().getStringExtra("dept");

            if (info.equals("comp"))
            {


                String[] parent = new String[]{"Computer Networks",
                        "SEPM",
                        "DBMS", "Theory of Computation",
                        "ISEE"};

                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3","Unit 4", "Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3","Unit 4", "Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3","Unit 4", "Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3","Unit 4", "Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3","Unit 4", "Unit 5", "Unit 6"};


                //Each subject Topics Array to be added here


                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();

                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                secondLevel.add(q4);
                secondLevel.add(q5);



                //Add topics to each units

                //CN

                String[] cnu1topics = new String[] {"Introducton to PAN,LAN,MAN and WAN","Ad-Hoc Network","Peer to peer and Client-Server architecture","Network Topologies","OSI and TCP/IP Model","Design issues","Transmission Media",
                        "Networking Device","Manchester Encoding","Diferential Encoding","FHSS and DSSS"};


                String[] cnu2topics = new String[] {"Data Link Layer Inroduction","Services provided by Data Link layer","Framing Character count","Flag byte with byte Stuffing","Bit stuffing","Cyclic Redundency Check","Hamming Code introduction and rules","Hamming code example","Parity check","Stop and Wait","Stop and Wait ARQ","Sliding Window Protocol","PPP and HDLC"};

                String[] cnu3topics = new String[] {"Pure and Slotted Aloha","CSMA","IEEE 802.3 standard and frame format","CSMA/CD","Binary Back-Off Algorithm","802.11 architecture","802.15 Bluetooth"};

                String[] cnu4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] cnu5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] cnu6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};


                thirdLevelq1.put(q1[0], cnu1topics);
                thirdLevelq1.put(q1[1], cnu2topics);
                thirdLevelq1.put(q1[2], cnu3topics);
                thirdLevelq1.put(q1[3], cnu4topics);
                thirdLevelq1.put(q1[4], cnu5topics);
                thirdLevelq1.put(q1[5], cnu6topics);




                //SEPM

                String[] sepmu1topics=new String[]{"sample topic"};
                String[] sepmu2topics=new String[]{"st"};
                String[] sepmu3topics=new String[]{"st"};
                thirdLevelq2.put(q2[1], sepmu1topics);
                thirdLevelq2.put(q2[2], sepmu2topics);
                thirdLevelq2.put(q2[3], sepmu3topics);


                //DBMS

                String[] dbmsu1topics = new String[] {"ER Diagram Introduction","ER Diagram Notation"};

                String[] dbmsu2topics = new String[] {"DDL,DCL and DML","DDL,DCL,DML and TCL","Table operations","View operations","SELECT Query and WHERE Clause",
                        "Joins","Implicit and Explicit Cursor PL/SQL","Functions PL/SQL","Procedures PL/SQL","Trigger PL/SQL"};

                String[] dbmsu3topics = new String[] {"Relational Model","CODD'S Rule","First Normal Form","Second Normal Form","Third Normal Form",
                        "BCNF","Functional Dependencies","Keys"};

                String[] dbmsu4topics = new String[] {"Still searching best videos for you. Stay tuned for our next update."};
                String[] dbmsu5topics = new String[] {"Still searching best videos for you. Stay tuned for our next update."};
                String[] dbmsu6topics = new String[] {"Still searching best videos for you. Stay tuned for our next update."};


                thirdLevelq3.put(q3[0], dbmsu1topics);
                thirdLevelq3.put(q3[1], dbmsu2topics);
                thirdLevelq3.put(q3[2], dbmsu3topics);
                thirdLevelq3.put(q3[3], dbmsu4topics);
                thirdLevelq3.put(q3[4], dbmsu5topics);
                thirdLevelq3.put(q3[5], dbmsu6topics);


                //TOC

                String[] tocu1topics = new String[] {"Finite State Machine","Deterministic Finite Automata","Non-Deterministic Finite automata","Moore to Mealy","Mealy to Moore"};

                String[] tocu2topics = new String[] {"Identity Rules","NFA to DFA","State/Loop Elimination Method","Ardens Theorm","Pumping Lemma","RE to Finite Automata"};


                String[] tocu3topics = new String[] {"Context Free Grammar and Language","Simplification of CFG(reduction of cfg)","Simplification of CFG(removal of unit productions)"
                        ,"Simplification of CFG(removal of null productions)","Chomsky Normal Form","Greibach Normal Form"};

                String[] tocu4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] tocu5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] tocu6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};


                thirdLevelq4.put(q4[0], tocu1topics);
                thirdLevelq4.put(q4[1], tocu2topics);
                thirdLevelq4.put(q4[2], tocu3topics);
                thirdLevelq4.put(q4[3], tocu4topics);
                thirdLevelq4.put(q4[4], tocu5topics);
                thirdLevelq4.put(q4[5], tocu6topics);


                //ISEE

                String[] iseeu1topics=new String[]{"sample topic"};
                String[] iseeu2topics=new String[]{"st"};
                String[] iseeu3topics=new String[]{"st"};
                thirdLevelq5.put(q5[0], iseeu1topics);
                thirdLevelq5.put(q5[1], iseeu2topics);
                thirdLevelq5.put(q5[2], iseeu3topics);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                data.add(thirdLevelq4);
                data.add(thirdLevelq5);



                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });


            }
            else if(info.equals("it"))
            {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
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


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


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


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }
                });


            }
            else if(info.equals("mech")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
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


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


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


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }

                });

            }
            else if(info.equals("civil")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
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


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


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


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }

                });
            }


            else if(info.equals("ele")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
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


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


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


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });

            }
            else if(info.equals("entc")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
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


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


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


                TeVidThirdAdapter teVidThirdAdapter = new TeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(teVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(TeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }

                });
            }



        }




    }
}
