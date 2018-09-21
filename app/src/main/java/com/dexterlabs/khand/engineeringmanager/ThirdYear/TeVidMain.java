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


                String[] cnu1 = new String[] {"Introduction to PAN,LAN,MAN and WAN","Ad-Hoc Network","Peer to peer and Client-Server architecture",
                        "Network Topologies","OSI and TCP/IP Model","Design issues","Transmission Media","Networking Device","Manchester Encoding",
                        "Differential Encoding","FHSS and DSSS"};

                String[] cnu2 = new String[] {"Data Link Layer Introduction","Services provided by Data Link layer",
                        "Framing Character count","Flag byte with byte Stuffing","Bit stuffing","Cyclic Redundancy Check",
                        "Hamming Code introduction and rules","Hamming code example","Parity check","Stop and Wait","Stop and Wait ARQ","Sliding Window Protocol","PPP and HDLC"};

                String[] cnu3 = new String[] {"Pure and Slotted Aloha","CSMA","IEEE 802.3 standard and frame format","CSMA/CD","Binary Back-Off Algorithm",
                        "802.11 architecture","802.15 Bluetooth"};


                String[] cnu4 = new String[] {"Switching Techniques","IPV4 addressing mode with solved example","IPV6 addressing mode",
                        "Subnetting","Routing protocol Basics","Distance Vector Routing algorithm","Link State Routing",
                        "Path Vector","Routing Information Protocol (RIP)",
                        "Open Short Path First (OSPF)","Border Gateway Protocol",
                        "Congestion Control","QOS","DSR in MANET"};

                String[] cnu5 = new String[] {"Transport Layer Basics","Flow control",
                        "Multiplexing and Demultiplexing","TCP Basic Part-1","TCP Basic Part-2","TCP Congestion Control","Real Time Transport Protocol",
                        "UDP basics and TCP VS UDP"};

                String[] cnu6 = new String[] {"Application Layer Basics","Domain Name System (DNS)","Email Working System","SMTP",
                        "POP 3 and IMAP4","File Transfer Protocol (FTP)","Dynamic Host Control Protocol (DHCP)","Simple Network Management Protocol"};




                thirdLevelq1.put(q1[0], cnu1);
                thirdLevelq1.put(q1[1], cnu2);
                thirdLevelq1.put(q1[2], cnu3);
                thirdLevelq1.put(q1[3], cnu4);
                thirdLevelq1.put(q1[4], cnu5);
                thirdLevelq1.put(q1[5], cnu6);




                //SEPM

                String[] sepmu1 = new String[] {"Software Development Process","Software development Myths","Waterfall Model","Iterative Model","Rapid Application Development","Prototyping","Agile Software Development","Extreme Programming","Introduction to JIRA","Introduction to Kanban"};

                String[] sepmu2 = new String[] {"Requirement Engineering","SRS Document","SRS Document characteristics","Requirement elicitation and analysis"};


                String[] sepmu3 = new String[] {"Design Concepts","Architectural Design","Component Level Design","User Interface Design","Golden Rules"};


                String[] sepmu4 = new String[] {"Project Management Spectrum","Process and Project Metric","Project Metric","Estimation Techniques for Software Development","Estimation Techniques for Software Development","COCOMO Model","COCOMO II Model","Project Scheduling","Project Scheduling"};


                String[] sepmu5 = new String[] {"Risk Management","Risk Mitigation Monitoring Management","Concept of Software Configuration management","Software Configuration Management","Maintenance and Re-engineering","Reverse Engineering"};


                String[] sepmu6 = new String[] {"Software Testing Life Cycle and its phases","Types of Testing","Unit Testing","Integration Testing","Functional Testing","System Testing","Performance Testing","Regression Testing","Verification Testing","Defect Life Cycle","GUI Testing"};


                thirdLevelq2.put(q2[0], sepmu1);
                thirdLevelq2.put(q2[1], sepmu2);
                thirdLevelq2.put(q2[2], sepmu3);
                thirdLevelq2.put(q2[3], sepmu4);
                thirdLevelq2.put(q2[4], sepmu5);
                thirdLevelq2.put(q2[5], sepmu6);


                //DBMS

                String[] dbmsu1 = new String[] {"ER Diagram Introduction","ER Diagram Notation"};

                String[] dbmsu2 = new String[] {"DDL,DCL and DML","DDL,DCL,DML and TCL","Table operations","View operations","SELECT Query and wHERE Clause","Joins","Implicit and Explicit Cursor PL/SQL","Functions PL/SQL","Procedures PL/SQL","Trigger PL/SQL"};

                String[] dbmsu3 = new String[] {"Relational Model","CODD'S Rule","First Normal Form",
                        "Second Normal Form","Third Normal Form","BCNF","Functional Dependencies","Keys"};

                String[] dbmsu4 = new String[] {"Transaction Management and ACID Properties","Concept of Schedule and its Types","Concept of Serializability","Recoverable and Non-Recoverable Schedule","Concurrency Control Locking Methods","Deadlock Detection","Deadlock Prevention","Deadlock Recovery","Time Stamping","Shadow Paging","Log Based Database Recovery"};

                String[] dbmsu5 = new String[] {"Distributed Database","Architecture of Distributed Databases","Distributed Database Storage and its types","Distributed Database Transaction","Concurrency control in Distributed Database","Two Phase Protocol","Three Phase Protocol"};

                String[] dbmsu6 = new String[] {"Introduction to Nosql Database","CAP Theorem","Difference between SQL and NoSQL","Data Models with NoSQL Basics","Introduction to Hadoop and Big-Data"};



                thirdLevelq3.put(q3[0], dbmsu1);
                thirdLevelq3.put(q3[1], dbmsu2);
                thirdLevelq3.put(q3[2], dbmsu3);
                thirdLevelq3.put(q3[3], dbmsu4);
                thirdLevelq3.put(q3[4], dbmsu5);
                thirdLevelq3.put(q3[5], dbmsu6);


                //TOC


                String[] tocu1topics = new String[] {"Finite State Machine","Deterministic Finite Automata","Non-Deterministic Finite automata","Moore to Mealy","Mealy to Moore"};




                String[] tocu2topics = new String[] {"Identity Rules","NFA to DFA","State/Loop Elimination Method","Ardens Theorem","Pumping Lemma","RE to Finite Automata"};





                String[] tocu3topics = new String[] {"Context Free Grammar and Language","Simplification of CFG(reduction of cfg)","Simplification of CFG(removal of unit productions)"
                        ,"Simplification of CFG(removal of null productions)","Chomsky Normal Form","Greibach Normal Form"};

                String[]tocu4topics=new String[]{"Turing Machine Introduction",
                    "Turing Machine Numerical a^n b^n",
                    "Turing Machine Numerical a^n b^n c^n",
                    "Turing Machine 2's Complement",
                    "Turing Machine Numerical Palindrome",
                    "Turing Machine Subtraction",
                    "Turing Machine Multiplication"};

                String[]tocu5topics= new String[]{"PDA Introduction",
                    "PDA Operation Research POP PUSH SKIP",
                    "PDA Numerical a^n b^n",
                    "PDA Numerical a^n b^2n",
                    "PDA Numerical WCWr",
                    "PDA Numerical WWr",
                    "PDA to CFG part 1",
                    "PDA to CFG part 2",
                    "PDA to CFG part 3",
                    "CFG to PDA"};


                String[] tocu6topics = new String[]{"Recursively Enumerable Language"
                    ,"Turing Machine Halting Problem"
                    ,"Class P and NP Problems, Polynomial Time"
                    ,"NP Complete"
                    ,"Decidable and Undecidable"
                    ,"3-SAT to Vertex Cover"
                    ,"Post Correspondence Problem"
                    ,"Post Correspondence Problem Undecidable"
                    ,"Vertex Cover Problem is NP Complete"
                    ,"Clique Problem is NP Complete"};


                thirdLevelq4.put(q4[0], tocu1topics);
                thirdLevelq4.put(q4[1], tocu2topics);
                thirdLevelq4.put(q4[2], tocu3topics);
                thirdLevelq4.put(q4[3], tocu4topics);
                thirdLevelq4.put(q4[4], tocu5topics);
                thirdLevelq4.put(q4[5], tocu6topics);


                //ISEE
                String[] iseeu1 = new String[] {"Role of Information Systems in Organizations","Strategic Planning","Information System in E-Commerce"};

                String[] iseeu2 = new String[] {"Management Information System","Management Information System Part-2","IT Infrastructure Evolution","IT Infrastructure Technology","Information System Security","Information Technology Infrastructure in a Bank"};

                String[] iseeu3 = new String[] {"Information communication Technology","Basics of Enterprise System","Business Process and ERP","Cloud based ERP implementation","Challenges in Cloud based ERP Software","ICT for Development and E-Governance","UIDAI Unique Identification Authority of India"};

                String[] iseeu4 = new String[] {"Engineering Economic Decisions","Time value of Money","Future Value","Future Value Annuity","Economic decisions done in Multi-national companies"};

                String[] iseeu5 = new String[] {"Cash Flow Diagrams","Basics of Present Worth","Present Value with example","Annual Equivalent Analysis","Annual Equivalent Worth"};

                String[] iseeu6 = new String[] {"Accounting for Depreciation and Income Taxes","Cash flow","Basics of Financial Statements","Financial Statements with Example","Cash Flow Analysis done in Start-up Companies"};

                thirdLevelq5.put(q5[0], iseeu1);
                thirdLevelq5.put(q5[1], iseeu2);
                thirdLevelq5.put(q5[2], iseeu3);
                thirdLevelq5.put(q5[3], iseeu4);
                thirdLevelq5.put(q5[4], iseeu5);
                thirdLevelq5.put(q5[5], iseeu6);








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
