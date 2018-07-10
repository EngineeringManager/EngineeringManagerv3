


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

    String[] q1 = new String[]{"Unit 1","Unit 2","Unit 3","Unit 4","Unit 5","Unit 6"};
    String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q6 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q7 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q8 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q9 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
    String[] q10= new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};

    String[] civilu1topics = new String[] {"Surveying","Fluid Mechanics","Structural Engineering",
            "Construction Engineering","Transport Engineering","Irrigation Engineering","Geotechnical Engineering","Foundation","Responsibilities and Interdisciplinary Approach"};

    String[] civilu2topics = new String[] {"Brick","Cement","Concrete","PCC RCC","Sand","Artificial Sand","Reinforcement Steel","Substructure to Automation","Introduction to Automation"};

    String[] civilu3topics = new String[] {"Types of Maps","Principles of Surveying","EDM","Theodolite","GPS Total Station","Planimeter","Simple Levelling","Differential levelling","GIS","Contour Line Preparation"};

    String[] civilu4topics = new String[] {"EIA","Engineers Role in Sustainable Development","Need For Conserving Natural Resources And Preserving Enviornment","Impacts of Human","Impact of Technology","Solid Waste Management","Electronic waste"};

    String[] civilu5topics = new String[] {"Principles of Planning","Built and Natural Environment","Eco Friendly Building Material","Green Building","FSI","Carpet Built-up Plinth areas"};

    String[] civilu6topics = new String[] {"Types of energy","Methods of Harnessing Energy","Air Pollution","Soil Pollution","Noise Pollution","Noise Pollution Control","Water Pollution"};


    //Chem Topics
    String[] chemu1topics = new String[]{"Impurities in water","Determination of hardness of water by EDTA method",
            "Alkalinity of water problem solving","Alkalinity of water","Boiler feed water","Internal treatment","External treatment",
            "Zeolite process","Zeolite problems","Ion exchange","Reverse osmosis","Electrodialysis",
            "Green Chemistry","Synthesis of Indigo Dye","Synthesis of Adipic Acid"};

    String[] chemu2topics = new String[]{"Conductometry-Introduction","Conductometry-Titration curves","Kohlrauch's Law","Kohlrauch's Law Problems"
            ,"Types of electrodes 1","Types of electrodes 2","Electrode Potentials","Standard Hydrogen Electrode (Potentiometry)"
            ,"Saturated Calomel Reference Electrode (Potentiometry)","Glass Membrane Electrode - Indicator Electrodes -Potentiometry","Potentiometry - Instrumentation"
            ,"Types of Potentiometric Titrations","Cell Notation Practice Problems, Voltaic Cells - Electrochemistry","UV Spectroscopy","Applications of UV Spectroscopy"};

    String[] chemu3topics = new String[] {"LDPE and HDPE","Polymer Chemistry","Thermoplastics and Thermosetting polymers","Elastomers",
            "Tg","Avg molecular weight","Free radical mechanism","Cationic","Anionic","Emulsion Polymerization","Bulk Polymerization",
            "Solution Polymerization","Suspension Polymerization","Speciality Polymers"};

    String[] chemu4topics = new String[]{"Fuel cells","Fuels","Calorific value","Bomb calorimeter","Octane no","Cetane no","Power alcohol",
            "Combustion 1","Combustion 2"};


    String[] chemu5topics = new String [] {"Steam reforming","Lab preparation","Electrolysis of water","Water splitting",
            "Hydrogen storage","Molecular hydrides","Saline hydrides","Hydrogen","Carbon","Allotropes"};


    String[] chemu6topics = new String[] {"Corrosion and its types","Factors","Pourbiax Diagram","Cathodic Protection",
            "Anodic Protection","Metallic Coating"};


    //  Electrical
    String[] electricalu1topics = new String[] {"Elemntary Concepts","Conversion of Energy","Effect of temp on Resistance"};

    String[] electricalu2topics = new String[] {"Right hand thumb rule and cork screw rule with dot and Cross Conventions","Magnetic Field due to Straight Current Carrying Conductor","Toroid",
            "Solenoid","Basic definitions","Difference betwwen Electrical and Magnetic Circuits","Series Circuit","Parallel Circuit","Faradays laws",
            "Flemings right hand rule","Static and Dynamic Induced EMF","Self Inductance and Mutual Inductance","Energy stored in Magnetic Field"};

    String[] electricalu3topics = new String[]{"Autotransformers","Single phase transformer 2",
            "Single phase transformer 1","Permittivity","Dielectrics","Energy of Capacitor","Capacitors in Parallel",
            "Capacitors in Series","Charging and Discharging"};

    String[] electricalu4topics = new String[] {"AC fundamentals",
            "RMS and avg value, form and peak factor","Lead lag","Phasor Diagram","AC through pure resistance","AC through pure inductance","AC through pure capacitance"};

    String[] electricalu5topics = new String[] {"Series RL, RC, RLC","Impedance and Admittance",
            "Active, Reactive and Apparent Ppower","Power Factor","Resonance in Series RLC","Polyphase and Star Delta"};

    String[] electricalu6topics = new String[] {"Classification of Electrical Network","Kirchoffs rules",
            "Star delta conversions","Ideal vs Practical Voltage","Ideal vs Practical Current","Superposition Theorem","Thevenins Theorem"};


    //


    LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();

    LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq6 = new LinkedHashMap<>();


    LinkedHashMap<String, String[]> thirdLevelq7 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq8 = new LinkedHashMap<>();
    LinkedHashMap<String, String[]> thirdLevelq9 = new LinkedHashMap<>();


    LinkedHashMap<String, String[]> thirdLevelq10 = new LinkedHashMap<>();

//    LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
//    LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
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
        //Add units in each subject


        secondLevel.add(q1);
        secondLevel.add(q2);
        secondLevel.add(q3);
        secondLevel.add(q4);
        secondLevel.add(q5);
        secondLevel.add(q6);
        secondLevel.add(q7);
        secondLevel.add(q8);
        secondLevel.add(q9);
        secondLevel.add(q10);


        //Add topics to each units

        thirdLevelq1.put(q1[0], civilu1topics);
        thirdLevelq1.put(q1[1], civilu2topics);
        thirdLevelq1.put(q1[2], civilu3topics);
        thirdLevelq1.put(q1[3], civilu4topics);
        thirdLevelq1.put(q1[4], civilu5topics);
        thirdLevelq1.put(q1[5], civilu6topics);

        thirdLevelq2.put(q2[0],electricalu1topics);
        thirdLevelq2.put(q2[1],electricalu2topics);
        thirdLevelq2.put(q2[2],electricalu3topics);
        thirdLevelq2.put(q2[3],electricalu4topics);
        thirdLevelq2.put(q2[4],electricalu5topics);
        thirdLevelq2.put(q2[5],electricalu6topics);




        thirdLevelq5.put(q5[0],chemu1topics);
        thirdLevelq5.put(q5[1],chemu2topics);
        thirdLevelq5.put(q5[2],chemu3topics);
        thirdLevelq5.put(q5[3],chemu4topics);
        thirdLevelq5.put(q5[4],chemu5topics);
        thirdLevelq5.put(q5[5],chemu6topics);
//        thirdLevelq1.put(q1[0], civilu1t2);
        //thirdLevelq1.put(q1[0], civilu1t3);
//        thirdLevelq1.put(q1[0], des1[1]);
//        thirdLevelq1.put(q1[0], des1[2]);
        /*
        for
        Strng temp[]=des1.split(",")        */

//        thirdLevelq1.put(q1[0], des1[3]);
//        thirdLevelq1.put(q1[0], des1[4]);
//        thirdLevelq1.put(q1[0], des1[5]);
//        thirdLevelq1.put(q1[0], des1[6]);
//        thirdLevelq1.put(q1[0], des1[7]);
//        thirdLevelq1.put(q1[0], des1[8]);

//        thirdLevelq2.put(q2[0], des3);
//        thirdLevelq2.put(q2[1], des4);
//        thirdLevelq2.put(q2[2], des2);
//        thirdLevelq2.put(q2[3], des1);
//
//        thirdLevelq3.put(q3[0], des5);
//        thirdLevelq3.put(q3[1], des4);
//        thirdLevelq3.put(q3[2], des2);
//        thirdLevelq3.put(q3[3], des1);
//
//        thirdLevelq4.put(q4[0],des1);
//        thirdLevelq4.put(q4[1],des2);
//        thirdLevelq4.put(q4[2],des3);
//        thirdLevelq4.put(q4[3],des4);
//
//        thirdLevelq5.put(q5[0], des5);
//        thirdLevelq5.put(q5[1], des4);
//        thirdLevelq5.put(q5[2], des2);
//        thirdLevelq5.put(q5[3], des1);
//

        data.add(thirdLevelq1);
        data.add(thirdLevelq2);
        data.add(thirdLevelq3);
        data.add(thirdLevelq4);


        data.add(thirdLevelq5);
        data.add(thirdLevelq6);
        data.add(thirdLevelq7);
        data.add(thirdLevelq8);


        data.add(thirdLevelq9);
        data.add(thirdLevelq10);


        expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
        //passing three level of information to constructor
        ThreeLevelListAdapter threeLevelListAdapterAdapter = new ThreeLevelListAdapter(this, parent, secondLevel,data);

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