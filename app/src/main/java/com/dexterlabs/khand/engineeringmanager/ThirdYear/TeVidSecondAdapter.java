package com.dexterlabs.khand.engineeringmanager.ThirdYear;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;
import com.dexterlabs.khand.engineeringmanager.YoutubePlayer;

import java.util.List;

public class TeVidSecondAdapter extends BaseExpandableListAdapter {

    private Context context;

    ExpandableListView expandableListView;
    List<String[]> data;

    String[] headers;

    ImageView ivGroupIndicator;


    public TeVidSecondAdapter(Context context, String[] headers, List<String[]> data) {
        this.context = context;
        this.data = data;
        this.headers = headers;

    }

    @Override
    public Object getGroup(int groupPosition) {

        return headers[groupPosition];
    }

    @Override
    public int getGroupCount() {

        return headers.length;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_second, null);
        TextView text = (TextView) convertView.findViewById(R.id.rowSecondText);
        String groupText = getGroup(groupPosition).toString();
        text.setText(groupText);
        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        String[] childData;

        childData = data.get(groupPosition);


        return childData[childPosition];
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_third, null);

        TextView textView = (TextView) convertView.findViewById(R.id.rowThirdText);


        String[] childArray = data.get(groupPosition);

        final String text = childArray[childPosition];

        textView.setText(text);

        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                    //Toast.makeText(context, "login", Toast.LENGTH_SHORT).show();

//put logic here
                String[] dbmsTopics = new String[] {"ER Diagram Introduction","ER Diagram Notation",
                        "DDL,DCL and DML","DDL,DCL,DML and TCL","Table operations","View operations","SELECT Query and wHERE Clause","Joins","Implicit and Explicit Cursor PL/SQL","Functions PL/SQL","Procedures PL/SQL","Trigger PL/SQL",
                        "Relational Model","CODD'S Rule","First Normal Form","Second Normal Form","Third Normal Form","BCNF","Functional Dependencies","Keys",
                        "Transaction Management and ACID Properties","Concept of Schedule and its Types","Concept of Serializability","Recoverable and Non-Recoverable Schedule","Concurrency Control Locking Methods","Deadlock Detection","Deadlock Prevention","Deadlock Recovery","Time Stamping","Shadow Paging","Log Based Database Recovery",
                        "Distributed Database","Architecture of Distributed Databases","Distributed Database Storage and its types","Distributed Database Transaction","Concurrency control in Distributed Database","Two Phase Protocol","Three Phase Protocol",
                        "Introduction to Nosql Database","CAP Theorem","Difference between SQL and NoSQL","Data Models with NoSQL Basics","Introduction to Hadoop and Big-Data"};


                String[] dbmsvl = new String[] {"ZWl0Xow304I","kbuOqm_YMZM","bxVVoifbPsc","kx6m8ABU4ZE","R8EeH46xuOg","yWdKlHVFxeo","W3ZwDBSQ3eQ",
                        "7JRFdHP6s9A","Oj7344m_fy0","U95WZXvnwXw","l9ZNfrnP9NI","KD0t843oQIw","XXGgYiXo8dI","Kex-Tv49wro","CedOasDoe-w","80CcB9_HSxU","9qWpfTW_c5Y"
                        ,"cm1DYCQhFZw","wez3fXrjBAE","zS2SmH8AlKM","nRdlkQp4Pf4","RypPiXHTM6A","WVyBhmcIcn8","24k2CZ8CKU8","jEqnfpaEO6M","i7LNUio7kvw",
                        "VVWCHBqsqXo","Kl5xkSI8aGI","lWM--DKscnU","BWfNjIrDcdc","495q-pDJ9zE","EuqQeJfJbgA","yCokw7VSbZw","E7kKC7Rkvs8","9GtoDxCQGvk",
                        "n88BxVm-AG4","8wwfZk2ix8Q","of2Gk-shBqo","5vG0du-0xwg","pHAItWE7QMU","7XXwbul6GxA","DRo0w9E_sKU","l-ttkbDcZU4","GZ5eTtzpIhI"};


                for (int i=0;i<dbmsTopics.length;i++) {
                    if (text.equals(dbmsTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",dbmsvl[i]);
                        context.startActivity(intent);
                    }
                }


                String[] cnTopics = new String[] {"Introduction to PAN,LAN,MAN and WAN","Ad-Hoc Network","Peer to peer and Client-Server architecture","Network Topologies","OSI and TCP/IP Model","Design issues","Transmission Media","Networking Device","Manchester Encoding","Differential Encoding","FHSS and DSSS",
                        "Data Link Layer Introduction","Services provided by Data Link layer","Framing Character count","Flag byte with byte Stuffing","Bit stuffing","Cyclic Redundancy Check","Hamming Code introduction and rules","Hamming code example","Parity check","Stop and Wait","Stop and Wait ARQ","Sliding Window Protocol","PPP and HDLC",
                        "Pure and Slotted Aloha","CSMA","IEEE 802.3 standard and frame format","CSMA/CD","Binary Back-Off Algorithm","802.11 architecture","802.15 Bluetooth",
                        "Switching Techniques","IPV4 addressing mode with solved example","IPV6 addressing mode","Subnetting","Routing protocol Basics","Distance Vector Routing algorithm","Link State Routing","Path Vector","Routing Information Protocol (RIP)","Open Short Path First (OSPF)","Border Gateway Protocol","Congestion Control","QOS","DSR in MANET",
                        "Transport Layer Basics","Flow control","Multiplexing and Demultiplexing","TCP Basic Part-1","TCP Basic Part-2","TCP Congestion Control","Real Time Transport Protocol","UDP basics and TCP VS UDP",
                        "Application Layer Basics","Domain Name System (DNS)","Email Working System","SMTP","POP 3 and IMAP4","File Transfer Protocol (FTP)","Dynamic Host Control Protocol (DHCP)","Simple Network Management Protocol"};


                String[] cnvl = new String[] {"mYG3R2e1w5M","OF6euEloZdA","K1KFh3Z5uBM","lZvILl4rY2o","mTHIFvnI_a4","IJV1fBcmaao","2wXOHPxhUgc",
                        "eMamgWllRFY","XKtxxZ327UM","du_boiwX1yU","33Cqp6Lduj8","DfNBrV7pw7k","JRgmPco0KWI","EwyPY_TSRcs","dClI7RJn4c0","u8xsvAGhwGs",
                        "6gbkoFciryA","eQgRDdBD5Os","nUwGf5ZgqsA","nTPIC6JOscE","gOGhflliiKg","ov81vjPAlxE","wTnCCt5xYtE","6x5WqEJCfIw",
                        "509AmnKtx-c","0CCqMEF64YE","yDb_kIshpdA","Xb3l1N0Rc10","ajh1eZUVuCk","-TfYiluYNMo","PSewQdOs8T8","1-8RZ8pPWF8","F-oZBmvCFis","7GnSWC7ClNs","x6PxoGospDg","3eO29WBKg2E","pUrSWHCU_8o",
                        "VEdKQqhn-OE","UYB_qia_73g","PQaetHWUdUE","Zsf9f26rH8U","ttKZP6lS1Xc","8a0sh9N3LII","q_VyvV7AtDE","GSEvRI6Bptg","kAty4mKczEg","A7Umo3KkUmo",
                        "Iekom9sJZWw","wQ4_N73duO0","IYR08ae_MOc","vsx5XoGI-xE","9dRY2_NmAuc","4AaB-pWTiHY","8_dAkVyVjCo","5fvb-nGG3Zs",
                        "wJBqiwS2cGw","S3Qo6Xet_yU","LHozFBGdvCg","aIX-GHAB53Q","S43CFcpOZSI","PLjzgYyTQOs"};

                for (int i=0;i<cnTopics.length;i++) {
                    if (text.equals(cnTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",cnvl[i]);
                        context.startActivity(intent);
                    }
                }



                String[] sepmvl = new String[] {"i-QyW8D3ei0","zNRlDF_gaOs","MuoUH6aQHY8","c6B1LaL6UEs","21of7xtUR1s","Yzuj6w-ClAs","FCKOCjUcpdw",
                        "7G4uN4S0jD4","2jHAx4egBdM","jf0tlbt9lx0","QhJSlFWFICM","4fYy4l3sSKU","A8qEg1rokV8","42_J-W7RumE",
                        "DrBF3uKkNlo","K4rqH9DENaA","WJ1GfOqh0LQ","KIyj_ANryxo","M8VIkjtKCZk",
                        "0RmBrKxwCz8","8rWybGpQy4s","l-WcAQCiin8","mgxIOuhve_s","F2Uai0Y1G14","Tkwg5YuPeXw","KL1gK-H3Qvk","icDo3o-kJpA","b1_xCt6V-Bw",
                        "Cp_XEhexcDw","LD9WpiggFAs","AaHaLjuzUm8","hPi6P-wTr90","AwEisCD4DV0","zIYTKClLDwM","J5GoZI8_isU","G23QwIEW52c",
                        "f8o046V4d_k","uKkBgElf5DI","RUJa1JPeCgI","3lOjtmsA2Kk","qpJ3MACye2k","qJdbqE7sWOw","InhS58ptNhU","EZGDyFPHFMw","1R3vsu_7n0E"};


                String[] sepmTopics = new String[] {"Software Development Process","Software development Myths","Waterfall Model","Iterative Model","Rapid Application Development","Prototyping","Agile Software Development","Extreme Programming","Introduction to JIRA","Introduction to Kanban",
                        "Requirement Engineering","SRS Document","SRS Document characteristics","Requirement elicitation and analysis",
                        "Design Concepts","Architectural Design","Component Level Design","User Interface Design","Golden Rules",
                        "Project Management Spectrum","Process and Project Metric","Project Metric","Estimation Techniques for Software Development","Estimation Techniques for Software Development","COCOMO Model","COCOMO II Model","Project Scheduling","Project Scheduling",
                        "Risk Management","Risk Mitigation Monitoring Management","Concept of Software Configuration management","Software Configuration Management","Maintenance and Re-engineering","Reverse Engineering",
                        "Software Testing Life Cycle and its phases","Types of Testing","Unit Testing","Integration Testing","Functional Testing","System Testing","Performance Testing","Regression Testing","Verification Testing","Defect Life Cycle","GUI Testing"};

                for (int i=0;i<sepmTopics.length;i++) {
                    if (text.equals(sepmTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",sepmvl[i]);
                        context.startActivity(intent);
                    }
                }



                //TOC

                String[] tocTopics = new String[] {"Finite State Machine","Deterministic Finite Automata","Non-Deterministic Finite automata","Moore to Mealy","Mealy to Moore",
                        "Identity Rules","NFA to DFA","State/Loop Elimination Method","Ardens Theorem","Pumping Lemma","RE to Finite Automata","Context Free Grammar and Language","Simplification of CFG(reduction of cfg)","Simplification of CFG(removal of unit productions)","Simplification of CFG(removal of null productions)","Chomsky Normal Form","Greibach Normal Form",
                        "Turing Machine Introduction",
                        "Turing Machine Numerical a^n b^n",
                        "Turing Machine Numerical a^n b^n c^n",
                        "Turing Machine 2's Complement",
                        "Turing Machine Numerical Palindrome",
                        "Turing Machine Subtraction",
                        "Turing Machine Multiplication",
                        "PDA Introduction",
                        "PDA Operation Research POP PUSH SKIP",
                        "PDA Numerical a^n b^n",
                        "PDA Numerical a^n b^2n",
                        "PDA Numerical WCWr",
                        "PDA Numerical WWr",
                        "PDA to CFG part 1",
                        "PDA to CFG part 2",
                        "PDA to CFG part 3",
                        "CFG to PDA",
                        "Recursively Enumerable Language"
                        ,"Turing Machine Halting Problem"
                        ,"Class P and NP Problems, Polynomial Time"
                        ,"NP Complete"
                        ,"Decidable and Undecidable"
                        ,"3-SAT to Vertex Cover"
                        ,"Post Correspondence Problem"
                        ,"Post Correspondence Problem Undecidable"
                        ,"Vertex Cover Problem is NP Complete"
                        ,"Clique Problem is NP Complete"};

                String[] tocvl = new String[] {"Qa6csfkK7_I","40i4PKpM0cI","egXhe55dAIk","HEVWx4irOx4","-etILQcfgTg",
                        "yp4pYgXfYD8","--CSVsFIDng","fyJumUElTGY","Idl_0mPzZjE","dikEDuepOtI","RxfXyvfTsgQ",
                        "5_tfVe7ED3g","EF09zxzpVbk","B2o75KpzfU4","mlXYQ8ug2v4","Mh-UQVmAxnw","ZCbJan6CGNM",
                        "sX5_9xjr-9Q",
                        "fbwhlg6x3nA",
                        "ihfoceT49dw",
                        "qaofSujkZzw",
                        "3WlqEKHjTJo",
                        "X7bxtpNktAE",
                        "4GS6eBkPyCg",

                        "oEYyTtF3nDo",
                        "XARzkAycrYU",
                        "JZ4LFQ-dnOg",
                        "SZoRVBgwDwk",
                        "wSBAfoJIsrk",
                        "MC2T58DHRT4",
                        "QP8BWC14hOI",
                        "NxvryaYHCeg",
                        "d1Z4Esz6yaU",
                        "8V5yg9XFi_w",

                        "fORA88qhOLY",
                        "2PaOjhnyQ9o",
                        "ZSyZozw6JMQ",
                        "2cyryXRmN5Q",
                        "RiDzt22KUd8",
                        "nWLeW-emzsA",
                        "B5D3x3zz9D4",
                        "oBBMDNBsohg",
                        "sGA3jDX-7_4",
                        "49gTggjb3Uc"};


                for (int i=0;i<tocTopics.length;i++) {
                    if (text.equals(tocTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",tocvl[i]);
                        context.startActivity(intent);
                    }
                }

                String[] iseeTopics = new String[] {"Role of Information Systems in Organizations","Strategic Planning","Information System in E-Commerce",
                        "Management Information System","Management Information System Part-2","IT Infrastructure Evolution","IT Infrastructure Technology","Information System Security","Information Technology Infrastructure in a Bank",
                        "Information communication Technology","Basics of Enterprise System","Business Process and ERP","Cloud based ERP implementation","Challenges in Cloud based ERP Software","ICT for Development and E-Governance","UIDAI Unique Identification Authority of India",
                        "Engineering Economic Decisions","Time value of Money","Future Value","Future Value Annuity","Economic decisions done in Multi-national companies",
                        "Cash Flow Diagrams","Basics of Present Worth","Present Value with example","Annual Equivalent Analysis","Annual Equivalent Worth",
                        "Accounting for Depreciation and Income Taxes","Cash flow","Basics of Financial Statements","Financial Statements with Example","Cash Flow Analysis done in Start-up Companies"};

                String[] iseevl = new String[] {"Ff-L9eMa2i4","UbaoJZbDW-I","aveTzkgSVOQ","jKaxXcs6AC8","yFQ4ASLXc6A","seavKppAOoY","RhSfQqmp-9Q","8caqok3ah8o",
                        "LFBY4oU9DZo","tpR3JMnsOWo","77tCyFZNGr4","gcsO20DgzY0","RAVlnXXXPco","ajisUzL-yv0","Xotukf9P_Y0","cgq4HuZbvRs",
                        "1q8mZwytm0M","Pazp1b2LhAQ","BFRGWenwulc","f6a7E3326QQ","FCojpFwWuG0","62wSuWUWI_0","VaZLXTULXqE","h57sbSzwCQQ","Sff-Y06iGhg","tTk1-zI_nuM",
                        "x9MXrhHF1Jo","hISdzmjNO5w","oD9AchmOTF4","r_t3zjRx4cU","FVP1tF0P3BI"};



                for (int i=0;i<iseeTopics.length;i++) {
                    if (text.equals(iseeTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",iseevl[i]);
                        context.startActivity(intent);
                    }
                }











                // MECH DME


                String[] dme1Topics = new String[] {"Machine Design Part-1","Machine Design Part-2","Design Considerations","Factor of Safety","Design of Cotter Joint","Design of Knuckle Joint","Design of Levers","Design of Bell Crank Lever","Problem on C-Clamp",
                        "Shaft Design  on the basis of Strength","Design of Shaft and ASME Codes","Design of Shaft using Torsional Rig","Keys,types of Keys and Functions","Problem on Key","Couplings and it's Functions","Design of Flange Coupling",
                        "Design against Fluctuating Load","Goodman,Soderberg,Gerber Equation",
                        "Design of Power Screws and types of Threads","Derivation of Torque Required to Raise the Load ","Formulas for Power Screws Problems","Design of Screw Jack","Types of Fasteners and Screws","Design of bolted Joints","Metric Callout","Eccentric Loading on Bolts","Eccentric Load Perpendicular and Parallel to Axis","Welding Symbols","Strength of Transverse Fillet Weld","Welded joints","Welded joint : Eccentric Load","Welded Joint Examples","Design of Turnbuckle",
                        "Definition of Springs","Materials used for Springs","Materials used for Springs part-2","Design of Helical Compression Spring","Helical Compression Spring  For Range of Load","Nipping of Leaf Spring"};


                String[] dme1vl = new String[] {"nqhyCzrFp1s","7CMBV8OIHso","deAIYwPns6w","JMCmM65ZiNI",
                        "CLeLFUrvO2g","Ih6h_c2zkh0","XSK4iupjbwY","r04WynzyK-U","E0hrPYAr8pA","3Hjmile-cNU","QdBWwu5jsEE","ynzA2nzaEgE",
                        "M1Sq6Jui_sI","2EwU-Edsl8Y","ndNXXccntYg","iSR9wgob6pk","0_gpDSjaHh4","KvFwqwSQvXU","70hESLwUhME","-LsH5OaorXE",
                        "6l4O17UxPuE","GfbcxJmjn9s","R3w2XWOwYS8","Dyf5NXGT7uo","66HUDL40EHk","OTr8G2ITxII","pnnBTB6RgNk",
                        "5ZNR-psc_y8","-hLwyhDRcJM","AjFvtOuXVLQ","XtSgFjysSRc","E_W1yWjvc2U","mjgQO3b4xso","pgYkkSE7hs8","X3yeXWJHuPo",
                        "RV75FMw3EPs","bAh1yRzrYJs","mWQBGPQJ6lA","YxKTtpRyMCk"};


                for (int i=0;i<dme1Topics.length;i++) {
                    if (text.equals(dme1Topics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",dme1vl[i]);
                        context.startActivity(intent);
                    }
                }




                //HT

                
                String[] htvl = new String[] {"XrD1V4vEs3o","GXwZ3LMb-ik","sCa9wkaZ_yE",
                        "VYYhQRUUTmw","i2cT6qu2s8Q","SNnd0f3xXlg",
                        "baOb21X0Tps","cExrdNBhCYI",
                        "lnFjt30goiY","oE3rjzOOx_M",
                        "4JysJvU_ZC8","dYyyFnT3Vic",
                        "GgFSBuf3AIE","QaQhtSlKBUM","NaSMTsscEao","fVq0Of8uhbw","6nniv-RUdtA"};


                String[] htTopics = new String[] {"Basics and Introduction - 1","Basics and Introduction - 2","1D steady State Heat Conduction",
                        "Uniform Heat for Cylinder,Plate and Sphere","1D steady State Heat Conduction and Generation","Heat Transfer through Extended Surface",
                        "Critical Radius","Transient heat Conduction",
                        "Introduction to Convection","Free and Forced Convection,Dimensionless Numbers",
                        "Emissive Power,Emissivity","Shape Factor,Kirchoff's Law,Plank's Law",
                        "Condensation and Boiling","Condensation and Boiling 2","Condensation and Boiling 3","Heat Exchangers","LTMD,NTU,Effectiveness"};


                for (int i=0;i<htTopics.length;i++) {
                    if (text.equals(htTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",htvl[i]);
                        context.startActivity(intent);
                    }
                }

                //TOM
                String[] tomTopics = new String[] {"Nomenclature","Force Analysis","Calculations",
                        "Nomenclature","Helical Gear Force Analysis",
                        "Types of Gear Trains and Numericals",
                        "Cam, Classification and Dynamics of Cam","Cam Terminology","Cams and Followers","Cam profile for Knife Edge follower with Uniform Velocity Motion","Cam Profile for knife Edge follower with Simple Harmonic Motion","Cam profile for Roller follower with simple Harmonic motion and Uniform Retardation Motion",
                        "Freudenstein's Synthesis","Chebyshev's Synthesis",
                        "CVT","Gyroscopic Effect","Gyroscopic Effect on 4W"};


                String[] tomvl = new String[] {"I1Xbkgw5l1g","efLRsQIpO3Y","2sbJYPyTAN8",
                        "maa0LhRK9d4","wlSWGVU59jA","or-86fHCdWE","V4prxhA3BTQ","86PV-37Frfg","outh87jHrl8","RKuvskL0HWo",
                        "ocDyi68FOlM","jB46U9Zl7K4","NX5eUWIOhJU","H18yiSY_6QM","dp8lHBDFhpo","T1Zc0gJw9fU","AXvmcu2FmXI"};



                for (int i=0;i<tomTopics.length;i++) {
                    if (text.equals(tomTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",tomvl[i]);
                        context.startActivity(intent);
                    }
                }


                //Turbo Machines
                String[] turmTopics = new String[] {"Definition and Classification","Energy Transfer in Fluid Machines","Impact of Jet-Flat Vertical Plate","Stationary Flat Inclined Plate","Force Exerted on a Hinged plate","Force on Inclined Plate Moving In the Direction of Jet","Force on Flat Vertical Plate Moving In the Direction of Jet","Force Exerted by a Jet of Water on a Series of Vanes","Condition for Maximum Efficiency",
                        "Hydraulic Turbines - Introduction","Efficiencies of Turbines","Classification of Turbines","Pelton Wheel","Hydraulic Efficiency for Pelton Wheel",
                        "Francis Turbine","Francis Turbine - 2","Francis Turbine Problem Example 1","Comparison of Pelton, Francis & Kaplan Turbine","Axial Reaction Turbine","Kaplan Turbine Work and Design","Kaplan Turbine Problem Example","Draft Tube","Draft Tube Problem Example 1","Draft Tube Problem Example 2","Governing of Francis Turbine","Governing of Kaplan Turbine","Governing of Pelton Turbine",
                        "Steam Turbine","Compounding of Steam Turbine","Impulse Steam Turbine","How does a Steam Turbine Work?","Impulse Reaction Steam Turbine","Energy Losses in Steam Turbine",
                        "How does a Centrifugal pump work ?","Centrifugal Pumps - Introduction","Work Done by The Centrifugal Pump","Centrifugal Pumps Problem Example 1","Centrifugal Pumps Problem Example 2","Centrifugal Pumps Problem Example 3","CAVITATION,NET POSITIVE SUCTION HEAD (NPSH)","Specific Speed of a Centrifugal Pump","Minimum Speed for Starting A Centrifugal Pump","PUMP IN SERIES ~ PUMP IN PARALLEL ~ PUMP CONNECTION & IT`S OUTPUT",
                        "Centrifugal Compressor","Centrifugal Compressor-introduction","Construction of Centrifugal Compressor","Velocity Diagram","Centrifugal Compressor Example 1","Centrifugal Compressor Example 2","How does a Centrifugal pump work ?",
                "Axial Compressor-Introduction"};


                String[] turmvl = new String[] {"TiJZp-KB6h8","Dqqjn55X9p4","ImXwx1XdNJE","b7oBHRGr9eY","gA7kDBVgD-c","p-hHg0YCc6M",
                        "P5Osescxcm0","6msfWq-ZUfY","F9HbijeOjo8","cTNynj_o6og","Vy1fEWubnnw","YX_hX5zxoc0",
                        "8tROcNSgT04","oBLQVk4DSrA","3BCiFeykRzo","Sin1YD9P7m0","R2_Gmyd3lwY","k0BLOKEZ3KU","tYZf6nUMlLY","0p03UTgpnDU","H9W8Ekc_neM",
                        "X3aypwGhMME","l9LkMoE8GGo","Xecesg0Md5A","h8FmFJYxWaM","8Qb58cv08SU","RaEqKPm5sV4","6ThiShJ7LXg","DFDyzREVK-Y",
                        "qRTT_Hr_520","SPg7hOxFItI","osrGQvmSWcw","MQWHr3Of4VM","BaEHVpKc-1Q","41Wg1-UKyR8","ZuqaEN4IJ5w","BL8guF_3KWQ",
                        "ZMGOBRmIVnA","iUEsfE1YsCE","Gf6L5Shrk7o","U3j-mYRa1kk","l461u3mlqjY","D6H-5iI265E","B5bfyPQgYZY","UYMDm4yB1QA",
                        "cjmDWKwNiG4","u8Q8-quiNNw","7SoDlf-q12U","tF17OWW4_o4","BaEHVpKc-1Q","CMFRJ4rGXsc","CMFRJ4rGXsc"};


                for (int i=0;i<turmTopics.length;i++) {
                    if (text.equals(turmTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",turmvl[i]);
                        context.startActivity(intent);
                    }
                }





                //MCQC

                String[] mqcvl = new String[] {"vC-ZB4UVZow","CtGXjmqZqWc","zmxjlFEcCUM",
                        "ZxvyyNQzHTA","gXmgeqUcbZM","yQom0JmlvHk","wxQuYUZoFGM","XslQSh0Pt1U","mr55qmU-LSo","qRIZPazHZak","qeVbzWig0rU",
                        "WOSGkIMafYM","fb278VlHlCU","hz5rX4QxbNQ",
                        "F25ux_12TF0","_kESh9174lc","qq6--4jtj7s","VjcJnCkoWUM","aq4EHRHVOdc","3MlZGkPv1nY","ApQHOewRsUo",
                        "e4gOPeHSRo8","j48ES0Q59gw","qKM0Jhl6ino","LdhC4ziAhgY","fCgwmi9IVj8",
                        "CfCztL5DkTE","4QzEWM2pVFY","R08tz3tKBHE","iOFoLUizL_k","6Y6o7_KpW0E","yWlAOFs04go","4ZfLPitoaSE","DFsFODnb-Iw",
                        "kqJsiAS5Q5Q","jf0tlbt9lx0","w1xzLXOFSfU","wEBPVQ7W2wg","nG3BoGRZjOc","kKTUqlAV9rE","oX3TS4kotx4"};

                String[] mqcTopics = new String[] {"LIMIT,FIT&TOLERANCE,INTERCHANGEABILITY,ALLOWANCE","Measurement of Straightness, Flatness and Squareness","Design of Limit Gauges",
                        "LEVER TYPE COMPARATOR","ELECTRICAL COMPARATOR - 2","PNEUMATIC COMPARATOR - 3","MECHANICAL OPTICAL COMPARATOR","SIGMA COMPARATOR","REED COMPARATOR","JOHNSSON MIKROKATOR (COMPARATOR)","OPTICAL COMPARATOR","THREAD TERMS AND NOMENCLATURE","Gear Metrology","SURFACE ROUGHNESS,MEASUREMENT OF SURFACE ROUGHNESS,SURFACE ROUGHNESS SYMBOLS",
                        "Working and Principle of CMM","Types Of CMM","Introduction to Machine Vision Part 1, Definition & Application","Why Use Machine Vision?","Key Parts of a Vision System","INTERFEROMETER(PRINCIPLE AND WORKING)","Laser Metrology",
                        "Deming PDCA Cycle","Deming's 14 Principles","Juran's Trilogy","Old Quality Tools","Quality Circle",
                        "Statistical Quality Control","Acceptance Sampling","Operating Characteristic Curve","Design of Sampling Plans","Determining Probability of Acceptance in Sampling",
                        "TQM","QFD","5S and KAIZEN","Poke Yoke","Kanban","JIT","Six Sigma","DMAIC","QMS","Quality Audit"};




                for (int i=0;i<mqcTopics.length;i++) {
                    if (text.equals(mqcTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",mqcvl[i]);
                        context.startActivity(intent);
                    }
                }



            }


        });


        return convertView;


    }


    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);

//        if (getGroup(groupPosition).toString().equals("Unit 4") || getGroup(groupPosition).toString().equals("Unit 5") || getGroup(groupPosition).toString().equals("Unit 6")) {
//            Toast.makeText(context,"Working for providing best videos for you. Stay tuned",Toast.LENGTH_SHORT).show();
//        }
        //Toast.makeText(context, "open zala.click zala"+ getGroup(groupPosition).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        String[] children = data.get(groupPosition);


        return children.length;
    }



    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


}
