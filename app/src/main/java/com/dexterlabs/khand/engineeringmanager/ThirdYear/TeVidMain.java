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

                String[] cnu1topics = new String[] {"Introducton to PAN,LAN,MAN and WAN",
                        "Ad-Hoc Network","Peer to peer and Client-Server architecture",
                        "Network Topologies","OSI and TCP/IP Model","Design issues",
                        "Transmission Media",
                        "Networking Device","Manchester Encoding",
                        "Diferential Encoding","FHSS and DSSS"};


                String[] cnu2topics = new String[] {"Data Link Layer Inroduction",
                        "Services provided by Data Link layer","Framing Character count",
                        "Flag byte with byte Stuffing","Bit stuffing","Cyclic Redundency Check",
                        "Hamming Code introduction and rules","Hamming code example","Parity check",
                        "Stop and Wait","Stop and Wait ARQ","Sliding Window Protocol","PPP and HDLC"};

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

//                String[] sepmu1topics = new String[] {"Introduction to SEPM",
//                        "Process Model","Agile Development"};
//
//                String[] sepmu2topics = new String[] {"Understanding Requirements","Requirements Modelling","Flow,Behaviour,Pattern and Web Apps"};
//
//                String[] sepmu3topics = new String[] {"Design Concepts","Architectural Design",
//                        "Component Level Design","User Interface Design","Pattern Based Design"};
//
//                String[] sepmu4topics = new String[] {"Quality Concepts","Review Techniques","Software Quality Assurance","Project Management Concepts","Project Estimation",
//                "Project Scheduling"};
//
//                String[] sepmu5topics = new String[] {"Project Risk Management","Software Configuration Management",
//                        "Maintenance & Reengineering"};
//
//                String[] sepmu6topics = new String[] {"Software Testing","Testing","Testing Object Oriented Applications","Testing Web App","Veification vs Validation",
//                        "Defect Life Cycle","GUI Testing"};
//
                String[] sepmu1topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] sepmu2topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] sepmu3topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] sepmu4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] sepmu5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
                String[] sepmu6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};



                thirdLevelq2.put(q2[0], sepmu1topics);
                thirdLevelq2.put(q2[1], sepmu2topics);
                thirdLevelq2.put(q2[2], sepmu3topics);
                thirdLevelq2.put(q2[3], sepmu4topics);
                thirdLevelq2.put(q2[4], sepmu5topics);
                thirdLevelq2.put(q2[5], sepmu6topics);


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

                String[] iseeu1topics = new String[] {"Role of Information Systems in Organizations","Strategic planning"};
                String[] iseeu2topics = new String[] {"Management information system","Information system security"};


                String[] iseeu3topics = new String[] {"Information communication Technology","UIDAI"};

                String[] iseeu4topics = new String[] {"Time value of money","Depreciation "};

                String[] iseeu5topics = new String[] {"Present worth","Annual worth and capital recovery","Inflation"};

                String[] iseeu6topics = new String[] {"Cash flow","Financial statement","Accounting for Depreciation and Income Taxes"};


                thirdLevelq5.put(q5[0], iseeu1topics);
                thirdLevelq5.put(q5[1], iseeu2topics);
                thirdLevelq5.put(q5[2], iseeu3topics);
                thirdLevelq5.put(q5[3], iseeu4topics);
                thirdLevelq5.put(q5[4], iseeu5topics);
                thirdLevelq5.put(q5[5], iseeu6topics);


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
                String[] parent = new String[]{"Design of Machine Elements-1",
                        "Heat Transfer","Theory of Machines","Turbo Machines",
                        "Metrology and Quality Control"};


                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};


                //
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


                //DME1

                String[] dme1u1topics = new String[] {"Machine Design Part-1","Machine Design Part-2",
                        "Design Considerations","Factor of Safety","Design of Cotter Joint","Design of Knuckle Joint",
                        "Design of Levers","Design of Bell Crank Lever","Problem on C-Clamp"};

                String[] dme1u2topics = new String[] {"Shaft Design  on the basis of Strength","Design of Shaft and ASME Codes","Design of Shaft using Torsional Rig",
                        "Keys,types of Keys and Functions","Problem on Key","Couplings and it's Functions","Design of Flange Coupling"};

                String[] dme1u3topics = new String[] {"Design against Fluctuating Load","Goodman,Soderberg,Gerber Equation"};


                String[] dme1u4topics = new String[] {"Design of Power Screws and types of Threads","Derivation of Torque Required to Raise the Load ",
                        "Formulas for Power Screws Problems","Design of Screw Jack"};

                String[] dme1u5topics = new String[] {"Types of Fasteners and Screws","Design of bolted Joints","Metric Callout","Eccentric Loading on Bolts",
                        "Eccentric Load Perpendicular and Parallel to Axis","Welding Symbols",
                        "Strength of Transverse Fillet Weld","Welded joints","Welded joint : Eccentric Load","Welded Joint Examples","Design of Turnbuckle"};

                String[] dme1u6topics = new String[] {"Definition of Springs","Materials used for Springs","Materials used for Springs part-2","Design of Helical Compression Spring",
                        "Helical Compression Spring  For Range of Load","Nipping of Leaf Spring"};

                thirdLevelq1.put(q1[0], dme1u1topics);
                thirdLevelq1.put(q1[1], dme1u2topics);
                thirdLevelq1.put(q1[2], dme1u3topics);
                thirdLevelq1.put(q1[3], dme1u4topics);
                thirdLevelq1.put(q1[4], dme1u5topics);
                thirdLevelq1.put(q1[5], dme1u6topics);



                //ht

                String[] htu1topics = new String[] {"Basics and Introduction - 1","Basics and Introduction - 2","1D steady State Heat Conduction"};
                String[] htu2topics = new String[] {"Uniform Heat for Cylinder,Plate and Sphere","1D steady State Heat Conduction and Generation","Heat Transfer through Extended Surface"};
                String[] htu3topics = new String[] {"Critical Radius","Transient heat Conduction"};
                String[] htu4topics = new String[] {"Introduction to Convection","Free and Forced Convection,Dimensionless Numbers"};
                String[] htu5topics = new String[] {"Emissive Power,Emissivity","Shape Factor,Kirchoff's Law,Plank's Law"};
                String[] htu6topics = new String[] {"Condensation and Boiling","Condensation and Boiling 2","Condensation and Boiling 3","Heat Exchangers","LTMD,NTU,Effectiveness"};

                thirdLevelq2.put(q2[0], htu1topics);
                thirdLevelq2.put(q2[1], htu2topics);
                thirdLevelq2.put(q2[2], htu3topics);
                thirdLevelq2.put(q2[3], htu4topics);
                thirdLevelq2.put(q2[4], htu5topics);
                thirdLevelq2.put(q2[5], htu6topics);



                //Theory Of Machines


                String[] tomu1 = new String[] {"Nomenclature","Force Analysis","Calculations"};

                String[] tomu2 = new String[] {"Nomenclature","Helical Gear Force Analysis"};

                String[] tomu3 = new String[] {"Types of Gear Trains and Numericals"};

                String[] tomu4 = new String[] {"Cam, Classification and Dynamics of Cam","Cam Terminology",
                        "Cams and Followers","Cam profile for Knife Edge follower with Uniform Velocity Motion","Cam Profile for knife Edge follower with Simple Harmonic Motion",
                        "Cam profile for Roller follower with simple Harmonic motion and Uniform Retardation Motion"};

                String[] tomu5 = new String[] {"Freudenstein's Synthesis","Chebyshev's Synthesis"};

                String[] tomu6 = new String[] {"CVT","Gyroscopic Effect","Gyroscopic Effect on 4W"};


                thirdLevelq3.put(q3[0], tomu1);
                thirdLevelq3.put(q3[1], tomu2);
                thirdLevelq3.put(q3[2], tomu3);
                thirdLevelq3.put(q3[3], tomu4);
                thirdLevelq3.put(q3[4], tomu5);
                thirdLevelq3.put(q3[5], tomu6);


                //Turbo Machines

                String[] turmu1topics = new String[] {"Definition and Classification","Energy Transfer in Fluid Machines","Impact of Jet-Flat Vertical Plate","Stationary Flat Inclined Plate","Force Exerted on a Hinged plate","Force on Inclined Plate Moving In the Direction of Jet","Force on Flat Vertical Plate Moving In the Direction of Jet","Force Exerted by a Jet of Water on a Series of Vanes","Condition for Maximum Efficiency"};

                String[] turmu2topics = new String[] {"Hydraulic Turbines - Introduction","Efficiencies of Turbines","Classification of Turbines","Pelton Wheel","Hydraulic Efficiency for Pelton Wheel"};

                String[] turmu3topics = new String[] {"Francis Turbine","Francis Turbine - 2","Francis Turbine Problem Example 1","Comparison of Pelton, Francis & Kaplan Turbine","Axial Reaction Turbine","Kaplan Turbine Work and Design","Kaplan Turbine Problem Example","Draft Tube","Draft Tube Problem Example 1","Draft Tube Problem Example 2","Governing of Francis Turbine","Governing of Kaplan Turbine","Governing of Pelton Turbine"};

                String[] turmu4topics = new String[] {"Steam Turbine","Compounding of Steam Turbine","Impulse Steam Turbine","How does a Steam Turbine Work?","Impulse Reaction Steam Turbine","Energy Losses in Steam Turbine"};

                String[] turmu5topics = new String[] {"How does a Centrifugal pump work ?","Centrifugal Pumps - Introduction","Work Done by The Centrifugal Pump","Centrifugal Pumps Problem Example 1","Centrifugal Pumps Problem Example 2","Centrifugal Pumps Problem Example 3","CAVITATION,NET POSITIVE SUCTION HEAD (NPSH)","Specific Speed of a Centrifugal Pump","Minimum Speed for Starting A Centrifugal Pump","PUMP IN SERIES ~ PUMP IN PARALLEL ~ PUMP CONNECTION & IT`S OUTPUT"};

                String[] turmu6topics = new String[] {"Centrifugal Compressor","Centrifugal Compressor-introduction","Construction of Centrifugal Compressor","Velocity Diagram","Centrifugal Compressor Example 1","Centrifugal Compressor Example 2","How does a Centrifugal pump work ?"};



                thirdLevelq4.put(q4[0], turmu1topics);
                thirdLevelq4.put(q4[1], turmu2topics);
                thirdLevelq4.put(q4[2], turmu3topics);
                thirdLevelq4.put(q4[3], turmu4topics);
                thirdLevelq4.put(q4[4], turmu5topics);
                thirdLevelq4.put(q4[5], turmu6topics);



                // MQC
                String[] mqcu1topics = new String[] {"LIMIT,FIT&TOLERANCE,INTERCHANGEABILITY,ALLOWANCE","Measurement of Straightness, Flatness and Squareness","Design of Limit Gauges"};

                String[] mqcu2topics = new String[] {"LEVER TYPE COMPARATOR","ELECTRICAL COMPARATOR - 2","PNEUMATIC COMPARATOR - 3","MECHANICAL OPTICAL COMPARATOR","SIGMA COMPARATOR","REED COMPARATOR","JOHNSSON MIKROKATOR (COMPARATOR)","OPTICAL COMPARATOR","THREAD TERMS AND NOMENCLATURE","Gear Metrology","SURFACE ROUGHNESS,MEASUREMENT OF SURFACE ROUGHNESS,SURFACE ROUGHNESS SYMBOLS"};

                String[] mqcu3topics = new String[] {"Working and Principle of CMM","Types Of CMM","Introduction to Machine Vision Part 1, Definition & Application","Why Use Machine Vision?","Key Parts of a Vision System","INTERFEROMETER(PRINCIPLE AND WORKING)","Laser Metrology"};

                String[] mqcu4topics = new String[] {"Deming PDCA Cycle","Deming's 14 Principles","Juran's Trilogy","Old Quality Tools","Quality Circle"};

                String[] mqcu5topics = new String[] {"Statistical Quality Control","Acceptance Sampling","Operating Characteristic Curve","Design of Sampling Plans","Determining Probability of Acceptance in Sampling"};

                String[] mqcu6topics = new String[] {"TQM","QFD","5S and KAIZEN","Poke Yoke","Kanban","JIT","Six Sigma","DMAIC","QMS","Quality Audit"};


                thirdLevelq5.put(q5[0], mqcu1topics);
                thirdLevelq5.put(q5[1], mqcu2topics);
                thirdLevelq5.put(q5[2], mqcu3topics);
                thirdLevelq5.put(q5[3], mqcu4topics);
                thirdLevelq5.put(q5[4], mqcu5topics);
                thirdLevelq5.put(q5[5], mqcu6topics);

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
