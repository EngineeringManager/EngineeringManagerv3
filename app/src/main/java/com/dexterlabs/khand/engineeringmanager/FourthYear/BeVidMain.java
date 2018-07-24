package com.dexterlabs.khand.engineeringmanager.FourthYear;

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

public class BeVidMain extends AppCompatActivity{


    private ExpandableListView expandableListView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_tuts);


        if (getIntent() != null) {

            String info = getIntent().getStringExtra("dept");

            if (info.equals("comp"))
            {
                String[] parent = new String[]{"Data Analytics", "High Performance Computing",
                        "Artificial Intelligence and Robotics",
                        "Operation Research","Mobile Communication"};

                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q6 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
//                String[] q7 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
//                String[] q8 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};


                //Each subject Topics Array to be added here


                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();
                //LinkedHashMap<String, String[]> thirdLevelq6 = new LinkedHashMap<>();
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
                //secondLevel.add(q6);


                //Add topics to each units
                //DA

                String[] dau1topics = new String[] {"Big data overview","BI Vs Data Science",
                        "BI Vs Data Science Part-2","BI Vs Data Science Part-3",
                        "Drivers of Big Data","Emerging Big Data Ecosystem and new approach",
                        "Emerging Big Data Ecosystem and new approach (hindi)",
                        "Data Analytic Life Cycle"};


                String[] dau2topics = new String[] {"Hypothesis testing","Intro to Hypo thesis testing",
                        "Wilcoxon rank–sum test","Type 1 type 2 errors, Power and Sample Size",
                        "ANNOVA","Clustering-Intro","Clustering Overview","K means- Use cases"};


                String[] dau3topics = new String[] {"Association Rules- Overview Basic Concepts",
                        "Association Rules- Analysis","Market Basket Analysis , Support and Confidence",
                        "A-priori algorithm","Regression","Linear Regression",
                        "linear Regression Solved example","Logistics"};

                String[] dau4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};

                String[] dau5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};

                String[] dau6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};

                thirdLevelq1.put(q1[0], dau1topics);
                thirdLevelq1.put(q1[1], dau2topics);
                thirdLevelq1.put(q1[2], dau3topics);
                thirdLevelq1.put(q1[3], dau4topics);
                thirdLevelq1.put(q1[4], dau5topics);
                thirdLevelq1.put(q1[5], dau6topics);
               // thirdLevelq1.put(q1[3], des1);

                //HPC




                String[] hpcu1topics = new String[] {"Parallel Computing and types of Architecture","Parallel Computing Basics","Dichotomy of Parallel Computing Platforms"};


                String[] hpcu2topics = new String[] {"GPU and its working","Decomposition technique"};


                String[] hpcu3topics = new String[] {"Scatter and gather"};

                String[] hpcu4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] hpcu5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] hpcu6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};

                thirdLevelq2.put(q2[0], hpcu1topics);
                thirdLevelq2.put(q2[1], hpcu2topics);
                thirdLevelq2.put(q2[2], hpcu3topics);
                thirdLevelq2.put(q2[3], hpcu4topics);
                thirdLevelq2.put(q2[4], hpcu5topics);
                thirdLevelq2.put(q2[5], hpcu6topics);

//                thirdLevelq2.put(q2[3], des1);
//                thirdLevelq3.put(q3[0], des5);

                //AIR



                String[] airu1topics = new String[] {"Artificial Intelligence","State Space search",
                        "Search Strategies","8 Puzzle Problem","Hill Climb","Hill Climb (hindi)",
                        "A*","Tabu Search"};

                String[] airu2topics = new String[] {"Goal Stack Planning","STRIPS","N Queens"};

                String[] airu3topics = new String[] {"Forward and Backward Chaining","PL vs FOL",
                        "Conceptual Dependency","Knowledge Representation"};

                String[] airu4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] airu5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] airu6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};

                thirdLevelq3.put(q3[0], airu1topics);
                thirdLevelq3.put(q3[1], airu2topics);
                thirdLevelq3.put(q3[2], airu3topics);

                thirdLevelq3.put(q3[3], airu4topics);
                thirdLevelq3.put(q3[4], airu5topics);
                thirdLevelq3.put(q3[5], airu6topics);




                //OR

                String [] oru1topics = new String[]{"Graphical LPP with two Constraints","Graphical LPP with three Constraints","LPP Simplex Method",
                        "Infeasibility and Unbounded Solutions"};

                String [] oru2topics = new String[]{"Duality in LPP","Primal to Dual Conversion","LPP Dual Simplex","Two phase Simplex Method"};


                String [] oru3topics = new String[]{"The Transportation Problem (All 3 Methods)","Transportation Problem MODI method - U V method",
                        "Assignment Problem Hungarian Method 1","Assignment Problem Unbalanced Matrix","Assignment Problem Hungarian Method Diagonal Rule"};


                String[] oru4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] oru5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] oru6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};


                thirdLevelq4.put(q4[0], oru1topics);
                thirdLevelq4.put(q4[1], oru2topics);
                thirdLevelq4.put(q4[2], oru3topics);

                thirdLevelq4.put(q4[3], oru4topics);
                thirdLevelq4.put(q4[4], oru5topics);
                thirdLevelq4.put(q4[5], oru6topics);





                //MC

                String[] mcu1topics = new String[]  {"1G, 2G, 3G, 4G, 5G of Cellular Mobile Communications",
                        "GSM,IMSI,SIM,IMEI,The GSM Architecture,HLR, VLR and EIR",
                        "Mobile Switching Center","Mobile Phones and Base Stations",
                        "Personal Communication Services (PCS)","(PCS Architecture)",
                        "multipath fading","Long and Short Term Fading","Line of sight",
                        "Signal-to-Noise Ratio -1","Signal-to-Noise Ratio -2 ",
                        "Free Space Path Loss","Path Loss","Radio Spectrum Animation"};

                String[] mcu2topics = new String[] {"GSM architecture","Mobility management",
                        "Cell splitting & cell sectoring",
                        "Cell splitting & Cell Site ,Mobile Computing , Wireless Communication ",
                        "CO-CHANNEL INTERFERENCE","Frequency Reuse and Co-Channel Interference",
                        "Frequency Reuse Concept ","Handover in GSM ,Hard Handoff vs Soft Handoff",
                        "Hard hand off and Soft Hand off"};




                String[] mcu3topics = new String[] {"SDMA","FDMA, TDMA and CDMA","FHSS ",
                        "Spread Spectrum Technique and Direct Sequence Spread Spectrum"," DSSS",
                        "FHSS and DSSS","MSK, GMSK, FSK, GFSK Modulator","GMSK","8PSK",
                        "Modulation & QAM Basics","OFDM/ OFDMA  - Fundamentals of 4G (LTE)",
                        "Orthogonal Frequency Division Multiplexing",
                        "MAC,Near and far terminals,Hidden and Exposed Terminals,SDMA,FDMA,TDMA,CDMA",
                        "SDMA-1"};


                String[] mcu4topics = new String[] {"GSM Call Flow","GPRS Architecture-1",
                        "GPRS Architecture -2","2G GSM Location Update",
                        "GSM Architecture,Call Routing,GSM Architecture in Mobile computing",
                        "IMSI, TMSI and MSISDN ","Traffic Channels","Logical channels",
                        "BURST TRANSMISSION","SPEECH CODING"};


                String[] mcu5topics = new String[] {"EDGE ","Working Principle Of EDGE",
                        "3G WCDMA (UMTS) ","CDMA","CDMA 2000 Architecure",
                        "3G Architecture,UTRAN Architecture,UMTS call flow",
                        "Mpirical - UMTS Architecture","HSPA","HSDPA Part-1",
                        "HSDPA Tutorial Artitecture ","HSDPA Part-2","3.5G-HSDPA-HSUPA",
                        "4G LTE Fundamentals"};



                String[] mcu6topics = new String[] {"What Is a Millimeter Wave","LTE-A :super fast mobile internet","What is LTE-A?"};



                thirdLevelq5.put(q5[0], mcu1topics);
                thirdLevelq5.put(q5[1], mcu2topics);
                thirdLevelq5.put(q5[2], mcu3topics);
                thirdLevelq5.put(q5[3], mcu4topics);
                thirdLevelq5.put(q5[4], mcu5topics);
                thirdLevelq5.put(q5[5], mcu6topics);



                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                data.add(thirdLevelq4);
                data.add(thirdLevelq5);
                //data.add(thirdLevelq6);

                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
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


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        //Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
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


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
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


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
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


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
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


                BeVidThirdAdapter beVidThirdAdapter = new BeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(beVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        //Toast.makeText(BeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });
            }



        }



    }
}
