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
                        "DDL,DCL and DML","DDL,DCL,DML and TCL","Table operations","View operations","SELECT Query and WHERE Clause","Joins","Implicit and Explicit Cursor PL/SQL","Functions PL/SQL","Procedures PL/SQL","Trigger PL/SQL",
                        "Relational Model","CODD'S Rule","First Normal Form","Second Normal Form","Third Normal Form","BCNF","Functional Dependencies","Keys"};

                String[] dbmsvl = new String[] {"ZWl0Xow304I","kbuOqm_YMZM","bxVVoifbPsc","kx6m8ABU4ZE","R8EeH46xuOg","yWdKlHVFxeo",
                        "W3ZwDBSQ3eQ","7JRFdHP6s9A","Oj7344m_fy0","U95WZXvnwXw","l9ZNfrnP9NI","KD0t843oQIw","XXGgYiXo8dI","Kex-Tv49wro","CedOasDoe-w",
                        "80CcB9_HSxU","9qWpfTW_c5Y","cm1DYCQhFZw","wez3fXrjBAE","zS2SmH8AlKM"};

                for (int i=0;i<dbmsTopics.length;i++) {
                    if (text.equals(dbmsTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",dbmsvl[i]);
                        context.startActivity(intent);
                    }
                }


                String[] CNtopics = new String[] {"Introducton to PAN,LAN,MAN and WAN","Ad-Hoc Network","Peer to peer and Client-Server architecture","Network Topologies","OSI and TCP/IP Model","Design issues","Transmission Media","Networking Device","Manchester Encoding","Diferential Encoding","FHSS and DSSS",
                        "Data Link Layer Inroduction","Services provided by Data Link layer","Framing Character count","Flag byte with byte Stuffing","Bit stuffing","Cyclic Redundency Check","Hamming Code introduction and rules","Hamming code example","Parity check","Stop and Wait","Stop and Wait ARQ","Sliding Window Protocol","PPP and HDLC",
                        "Pure and Slotted Aloha","CSMA","IEEE 802.3 standard and frame format","CSMA/CD","Binary Back-Off Algorithm","802.11 architecture","802.15 Bluetooth"};


                String[] CNvl = new String[] {"mYG3R2e1w5M","OF6euEloZdA","K1KFh3Z5uBM","lZvILl4rY2o","mTHIFvnI_a4","IJV1fBcmaao","2wXOHPxhUgc","eMamgWllRFY","XKtxxZ327UM","du_boiwX1yU","33Cqp6Lduj8","DfNBrV7pw7k","JRgmPco0KWI","EwyPY_TSRcs","dClI7RJn4c0","u8xsvAGhwGs","6gbkoFciryA","eQgRDdBD5Os","nUwGf5ZgqsA","nTPIC6JOscE","gOGhflliiKg",
                        "ov81vjPAlxE","wTnCCt5xYtE","6x5WqEJCfIw","509AmnKtx-c","0CCqMEF64YE","yDb_kIshpdA","Xb3l1N0Rc10","ajh1eZUVuCk","-TfYiluYNMo","PSewQdOs8T8"};

                for (int i=0;i<CNtopics.length;i++) {
                    if (text.equals(CNtopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",CNvl[i]);
                        context.startActivity(intent);
                    }
                }



                String[] tocTopics = new String[] {"Finite State Machine","Deterministic Finite Automata","Non-Deterministic Finite automata","Moore to Mealy","Mealy to Moore",
                        "Identity Rules","NFA to DFA","State/Loop Elimination Method","Ardens Theorm","Pumping Lemma","RE to Finite Automata","Context Free Grammar and Language","Simplification of CFG(reduction of cfg)","Simplification of CFG(removal of unit productions)","Simplification of CFG(removal of null productions)","Chomsky Normal Form","Greibach Normal Form"};


                String[] tocvl = new String[] {"Qa6csfkK7_I","40i4PKpM0cI","egXhe55dAIk","HEVWx4irOx4","-etILQcfgTg",
                        "yp4pYgXfYD8","--CSVsFIDng","fyJumUElTGY","Idl_0mPzZjE","dikEDuepOtI","RxfXyvfTsgQ",
                        "5_tfVe7ED3g","EF09zxzpVbk","B2o75KpzfU4","mlXYQ8ug2v4","Mh-UQVmAxnw","ZCbJan6CGNM"};


                for (int i=0;i<tocTopics.length;i++) {
                    if (text.equals(tocTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",tocvl[i]);
                        context.startActivity(intent);
                    }
                }

//
//                String[] sepmTopics = new String[] {"Introduction to SEPM","Process Model","Agile Development","Understanding Requirements",
//                        "Requirements Modelling","Flow,Behaviour,Pattern and Web Apps",
//                        "Design Concepts","Architectural Design","Component Level Design",
//                        "User Interface Design","Pattern Based Design","Quality Concepts",
//                        "Review Techniques","Software Quality Assurance",
//                        "Project Management Concepts","Project Estimation","Project Scheduling",
//                        "Project Risk Management","Software Configuration Management","Maintenance & Reengineering",
//                        "Software Testing","Testing","Testing Object Oriented Applications","Testing Web App","Veification vs Validation","Defect Life Cycle",
//                "GUI Testing"};
//
//
//
//                String[] sepmvl = new String[] {"wrPP_rVX6jg","Ax7Qu_bxG4c","0cMA7P0p5GQ",
//                        "J8Z8ocxhiIw","RQaZ1GEg-iw","6sYP-pNmsK4",
//                        "DrBF3uKkNlo","K4rqH9DENaA","WJ1GfOqh0LQ","KIyj_ANryxo","Sw3pNELb-TU",
//                        "SSqjynbAATA","ymhLtlnREP8","nNAtGxJ9C4M","w86aNGUCX-k","3I-PH3VEqdI","icDo3o-kJpA",
//                        "TArKVhIuktc","2boT42lBg6A","ZxQdW8rrv4k",
//                        "YOwX6ROYED8","y0d-XHVM0BQ","YiwB5eHMD7Y","v-r3HqhAtk4","2L3L_h4_Dzo","EZGDyFPHFMw","73jn7iAVQdA"};
//
//                for (int i=0;i<sepmTopics.length;i++) {
//                    if (text.equals(sepmTopics[i])) {
//                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(context, YoutubePlayer.class);
//                        intent.putExtra("videoLink",sepmvl[i]);
//                        context.startActivity(intent);
//                    }
//                }


                String  [] iseeTopics= new String []{"Role of Information Systems in Organizations","Strategic planning",
                        "Management information system","Information system security",
                        "Information communication Technology","UIDAI",
                        "Time value of money","Depreciation ",
                        "Present worth","Annual worth and capital recovery","Inflation",
                "Cash flow","Financial statement","Accounting for Depreciation and Income Taxes",
           };

                String [] iseevl = new String[]{"Ff-L9eMa2i4","UbaoJZbDW-I",
                        "jKaxXcs6AC8","zBFB34YGK1U",
                        "tpR3JMnsOWo","2PWcQamcXkY",
                        "733mgqrzNKs","j2V9oxB9dM4",
                        "VaZLXTULXqE","DYHGgnqnshg","AaR1mPrdbTc",
                "hISdzmjNO5w","Fw14qE_9B-A","GkPgSg9Eft4"

            };

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
