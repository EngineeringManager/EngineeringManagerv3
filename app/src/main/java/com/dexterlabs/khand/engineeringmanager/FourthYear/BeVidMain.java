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
                String[] parent = new String[]{"Data Analytics",
                        "High Performance Computing",
                        "Artificial Intelligence and Robotics",
                        "Operation Research",
                        "Mobile Communication","Data Mining and Warehouse",
                        "Software Testing and Quality Assurance"};

                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q6 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q7 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
//                String[] q8 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};


                //Each subject Topics Array to be added here


                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq6 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq7 = new LinkedHashMap<>();
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
                secondLevel.add(q6);
                secondLevel.add(q7);


                //Add topics to each units
                //DA

                String[] dau1Topics = new String[] {"Big data Overview","BI vs Data Science",
                        "BI Vs Data Science video 2","BI Vs Data Science video 3",
                        "Drivers of Big Data","Emerging Big Data Ecosystem and new approach",
                        "Emerging Big Data Ecosystem and new approach (hindi)",
                        "Data Analytic Life Cycle"};

                String[] dau2Topics = new String[] {"Hypothesis Testing",
                        "Intro to HypoThesis Testing","One Sample T-Test",
                        "Independent Samples t-Test","Dependent Sample t-Test",
                        "Wilcoxon Rank–Sum Test",
                        "Type 1 Type 2 errors, Power and Sample Size",
                        "ANNOVA","Clustering-Intro","Clustering Overview",
                        "K means- Use cases","K means Solved Numerical"};

                String[] dau3Topics = new String[] {"Association Rules- Overview",
                        "Association Rules","Market Basket Analysis, Support and Confidence",
                        "A-priori Algorithm","Regression","Linear regression","Logistics"};

                String[] dau4Topics = new String[] {"Decision Tree ID3 Algorithm",
                        "Decision Tree Solved Example","Decision Tree Solved Example 1",
                        "Decision Tree Solved Example 2","Naive Bayes Algorithm Introduction",
                        "Naive Bayes Algorithm","Naive Bayes Algorithm Solved Example",
                        "Naive Bayes Algorithm with Solved Example 1",
                        "Naive Bayes Algorithm Solved Example 2"};

                String[] dau5Topics = new String[] {"Big Data Visualization",
                        "Big Data Visualization Techniques","Various Types of Graphs",
                        "Big Data Visualization Types in short",
                        "Analytical Methods used in Big Data"};

                String[] dau6Topics = new String[] {"Map Reduce Concept",
                        "Map Reduce Architecture","What is Hadoop",
                        "Hadoop Basics with Architecture",
                        "Hadoop Basics with Architecture Part-2","Hadoop Ecosystem",
                        "Basics of NOSQL"};

                thirdLevelq1.put(q1[0], dau1Topics);
                thirdLevelq1.put(q1[1], dau2Topics);
                thirdLevelq1.put(q1[2], dau3Topics);
                thirdLevelq1.put(q1[3], dau4Topics);
                thirdLevelq1.put(q1[4], dau5Topics);
                thirdLevelq1.put(q1[5], dau6Topics);


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



                String[] airu1 = new String[] {"Artificial Intelligence","State Space Search","Search Strategies","Heuristic Search and Strategies","8 puzzle problem","DFS and DFID","Best First Search","Hill Climb","Hill Climb (hindi)","A*","Tabu Search","Pruning"};

                String[] airu2 = new String[] {"Backward and Forward chaining","STRIPS","Goal Stack Planning Concept","Block World Problem","State Space Search (Water Jug Problem)","N Queens","Cryptarithmatic Problem (SEND + MORE =MONEY)","Graph Coloring Problem"};

                String[] airu3 = new String[] {"Agents and PEAS","WUMPUS","Propositional Logic","FOL","PL vs FOL","Horn Clause","Unification","Unification Algorithm","Convert to FOL Part 1","Rules FOL to CNF","Resolution Graph","Forward Chaining","Backward Chaining","Conceptual Dependency","Knowledge Representation"};

                String[] airu4 = new String[] {"NLP and Components of NLP","Steps and Stages in NLP","Statistical Processing Of NLP","Information Retrieval Challenges in Big Data","N-Grams and Stop Words","Learning Agent Architecture","Supervised vs Unsupervised Learning","Supervised Learning","Unsupervised Learning","Reinforced Learning","Artificial Neural Network","Activation Function in ANN","Feed Forward in Neural Network","Feed Back Network","Back Propagation and Error","Agent and PEAS"};

                String[] airu5 = new String[] {"Robotics Introduction","Robotic Locomotion","Path Planning for Robots Bug 1","Path Planning for Robots Bug 2","Contact Sensors","Inertial Sensor","Infrared Sensor","Rangefinder Working","Biological Sensors","Human Robot Interface"};

                String[] airu6 = new String[] {"Space Robotics","Autonomous Aircraft","Domestic Robots","Mining Automation"};

                thirdLevelq3.put(q3[0], airu1);
                thirdLevelq3.put(q3[1], airu2);
                thirdLevelq3.put(q3[2], airu3);

                thirdLevelq3.put(q3[3], airu4);
                thirdLevelq3.put(q3[4], airu5);
                thirdLevelq3.put(q3[5], airu6);




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


                //DMW
                String[] dmwu1 = new String[] {"Data Mining Introduction","KDD Process and Data Preprocessing","Attribute Types","Data Cleansing Steps","Dealing with Missing Values","Noisy Data and Binning Technique","Data Integration","Data Normalization Min Max","Data Normalisation Z-Score","Data Normalization Decimal Scaling"};

                String[] dmwu2 = new String[] {"Data Warehouse: Introduction and Features","OLTP vs OLAP","Star,Snowflake Schemas","OLAP Operations","Datamarts","Dataware House Architecture","OLAP Servers:ROLAP, MOLAP, HOLAP"};

                String[] dmwu3 = new String[] {"Attributes","Proximity measure of Nominal Attributes","Proximity measure of Binary Attributes","Proximity measure of Ordinal Attributes","Euclidean Distance","Cosine Distance"};

                String[] dmwu4 = new String[] {"Apriori Algorithm with Solved Example","FP Tree Algorithm","FP Growth Algorithm","Mining Multilevel Associations","Constraint Based Association"};

                String[] dmwu5 = new String[] {"Classification and Regression","Data Mining and Classification","Decision Tree Algorithm Solved Algorithm","Rule Based Classifier IF THEN Rules","Bayesian Belief Network","KNN Classifier","KNN Solved Example"};

                String[] dmwu6 = new String[] {"Multi classification One vs All","Semi Supervised Classification","Reinforcement Learning","Reinforcement Learning and Elements","Influence Diagram","Cross Validation"};


                thirdLevelq6.put(q6[0], dmwu1);
                thirdLevelq6.put(q6[1], dmwu2);
                thirdLevelq6.put(q6[2], dmwu3);
                thirdLevelq6.put(q6[3], dmwu4);
                thirdLevelq6.put(q6[4], dmwu5);
                thirdLevelq6.put(q6[5], dmwu6);

                //STQA

                String[] stqau1Topic = new String[] {"QMS","Software Quality","Software Testing and its Importance","Quality and Productivity","Quality process"};

                String[] stqau2Topic = new String[] {"Test Planning","SDLC and STLC","Mutation Testing"};

                String[] stqau3Topic = new String[] {"Test Automation","Automation for XP/Agile Model","Selecting Test Tool"};


                String[] stqau4Topic = new String[] {"Selenium Tool","Introduction to Selenium RC","Introduction to Selenium Webdriver","Introduction to Selenium Grid",
                        "Selenium Tutorial"};

                String[] stqau5Topic = new String[] {"ISO 9001","What is Six Sigma","What is Software Quality","Software Quality Assurance",
                        "Software Quality Assurance activities","Six Sigma for Software Development"};

                String[] stqau6Topic = new String[] {"Isikawa's 7 basic tools","Total Quality Management","Software Quality Metrics"};

                thirdLevelq7.put(q7[0], stqau1Topic);
                thirdLevelq7.put(q7[1], stqau2Topic);
                thirdLevelq7.put(q7[2], stqau3Topic);
                thirdLevelq7.put(q7[3], stqau4Topic);
                thirdLevelq7.put(q7[4], stqau5Topic);
                thirdLevelq7.put(q7[5], stqau6Topic);

                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                data.add(thirdLevelq4);
                data.add(thirdLevelq5);
                data.add(thirdLevelq6);
                data.add(thirdLevelq7);

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
                String[] des5 = new String[]{"blah blah h blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

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

                    }


                });
            }



        }



    }
}
