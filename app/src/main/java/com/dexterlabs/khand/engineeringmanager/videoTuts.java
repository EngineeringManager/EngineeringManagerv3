


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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class videoTuts  extends AppCompatActivity {


    private ExpandableListView expandableListView;


//    Start adding subject names comma seperated

    String[] parent = new String[]{"Basic Civil Engineering","Basic Electrical Engineering",
            "Basic Electronics Engineering","Basic Mechanical Engineering",
            "Engineering Chemistry","Engineering Graphics",
            "Engineering Mathematics-I","Engineering Mathematics-II",
            "Engineering Mechanics","Engineering Physics"};

    String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
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


    String[] chemu5topics = new String [] {"Steam reforming","Lab preparation of Hydrogen","Electrolysis of water","Water splitting",
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


    //Electronics

    String[] bxeu1topics = new String[] {"Half Wave Rectifier","Full Wave Bridge Rectifier","Capacitor Filter","Introduction to Clippers","Voltage Multiplier Circuits",
            "Voltage Multiplier Circuits Part-2","Voltage Multiplier Circuits Part-3","Zener Diodes","LED - PhotoDiode"};




    String[] bxeu2topics = new String[] {"Working of Transistors","DC Biasing, Load Line & Operating Point of Transistors","TRANSISTOR CHARATERISTICS",
            "TRANSISTOR CHARATERISTICS Part-2","Transistor as an amplifier","Transistor as a switch","Enhancement-Type MOSFET"};




    String[] bxeu3topics = new String[] {"Operational Amplifier","OPAMP INPUT MODES AND PARAMETERS","Negative Feedback in OP-AMP",
            "Comparator","Summing Amplifier","DIFFERENTIATOR & INTEGRATOR","555 TIMER as Oscillator","Voltage Regulator IC"};





    String[] bxeu4topics = new String[] {"Introduction to Digital Electronics","Digital Signal","Introduction to Boolean Algebra","Introduction to Boolean Algebra Part-2",
            "Logic Gates and Circuit Simplification","Half Adder","Full Adder","Multiplexers","Demultiplexers","FLIP FLOP","D flip flop",
            "Shift Register (SISO Mode)","Shift Register (PISO Mode)","Bidirectional Shift Register","Universal Shift Register","COUNTERS","Block Diagram & Architecture Of 8085 Microprocessor"};





    String[] bxeu5topics = new String[] {"SCR characteristics and its working","DIAC working","TRIAC working","Introduction to Transducers",
            "Thermal - Resistive & Inductive Transducer - PhotoTransistor","LVDT (LINEAR VARIABLE DIFFERENTIAL TRANSDUCER)"};




    String[] bxeu6topics = new String[] {"INTRODUCTION TO COMMUNICATION SYSTEM","Elements of a Common Communication System","Bandwidth of Signals",
            "Ieee frequency spectrum","Transmission Media","NEED OF MODULATION","Modulation Techniques","Cellular Mobile Communications",
            "GSM architecture"};


    //BME

    String[] bmeu1topics = new String[] {
            "SHAFTS-AXLE , SPINDLE , COUNTER & INLINE SHAFTS-KEYS & COUPLING",
            "Single Plate Clutch","Disc Brakes",
            "Disc brakes working Part-2","Belts and Belt-Drives",
            "Chain Drive","TYPES OF GEAR"};


    String[] bmeu2topics = new String[] {"Mechanical properties of material","Mechanical properties of material Part-2","Mechanical properties of material Part-3",
            "Four bar linkage Mechanism","Slider Crank Mechanism"};

    String[] bmeu3topics = new String[] {"Casting and its special types",
            "Forging process",
            "SHEET METAL OPERATIONS","SHEET METAL OPERATIONS part-2",
            "Metal Joining Processes","Sand Casting",
            "ELECTRIC ARC WELDING"};


    String[] bmeu4topics = new String[] {"MACHINE TOOL",
            "CONSTRUCTION DETAILS OF LATHE MACHINE","DRILLING MACHINE","GRINDING MACHINE"};


    String[] bmeu5topics = new String[] {"Thermodynamic Systems","Properties of Thermodynamics","Law of thermodynamics","Heatsink","HEAT ENGINE,HEAT PUMP AND REFRIGERATOR",
            "How to Measure Temperature with a Thermocouple","Barometer","PRESSURE GAUGE (BOURDON GAUGE)","U-tube Manometer"};


    String[] bmeu6topics = new String[] {"Energy Resources - Conventional and Non-Conventional","HYDRO-ELECTRIC POWER PLANT",
            "STEAM POWER PLANT","Nuclear Power Plants","Wind Power Plant","Solar Photovoltaic Power","COCHRAN BOILER","2 Stroke Engine",
            "FOUR STROKE PETROL ENGINE","Reciprocating pump","Centrifugal pump","Compressor","Refrigerator","Air Conditioner"};


    //Physics
    String[] phyu1topics = new String[] {"INTRODUCTION","CONCEPT OF THIN FILM, INTERFERENCE DUE TO THIN FRAME OF UNIFORM THICKNESS",
            "CONCEPT OF THIN FILM, INTERFERENCE DUE TO THIN FRAME OF UNIFORM THICKNESS Part-2","INTERFERENCE DUE TO WEDGE SHAPED THIN FRAME",
            "Formation of colours in thin films","NEWTON'S RING, ITS APPLICATION","OPTICAL FLATNESS OF FRAME","ANTI REFLECTION COATING",
            "DIFFRACTION OF WAVES","CLASSES OF DIFFRACTION","Fraunhofer diffraction due to single slits","Conditions of Maxima and Minima",
            "DIFFRACTION AT CIRCULAR APERTURE Part-1","DIFFRACTION AT CIRCULAR APERTURE Part-2","PLANE DIFFRACTION GRATING"};

    String[] phyu2topics = new String[]{"Velocity,frequency,wavelength,Intensity and loudness,timbre of sound,reveration, reveration time, sabine's formaula",
            "Velocity,frequency,wavelength,Intensity and loudness,timbre of sound,reveration, reveration time, sabine's formaula Part-2",
            "Absorbtion of sound","Absorbent materials","Conditons for acoustics","Ultro sonics","Piezoelectric effect","Magnetostriction effect",
            "Detection of Ultrasonic","Applications of ultrasonics"};

    String[] phyu3topics = new String[] {"Polarization","Laser -1 Introduction,Properties,Absorption,Spontaneous Emission,Stimulated Emission",
            "CHARACTERSTICS OF LASER LIGHT","LASERS (3 LEVEL AND 4 LEVEL)","APPLICATIONS OF LASER"};

    String[] phyu4topics = new String[]{"Electron Band Theory of Solids","Free Electron Theory","Conductivity of a Semiconductor",
            "Fermi level of intrinsic and extrinsic semiconductors","Fermi level variations in semiconductors","The Energy Band Diagram of the pn-junction",
            "Working of Transistors","Hall Effect","Solar photovoltaics"};

    String[] phyu5topics = new String[] {"Dual nature of radiation & Matter","De Broglie wavelength and Heisenberg's Uncertainty Principle",
            "ELECTRON DIFFRATION BY SINGLE SLIT","Schrodinger Equation"};

    String[] phyu6topics = new String[]{"Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS",
            "Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS Part-2","Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS Part-3",
            "INTRODUCTION AND PROPERTIES OF NANOPARTICLES","Biological Nanoparticles: Synthesis & Applications",
            "Synthesis of Silver Nanoparticles by Leaf Extract","Synthesis of Colloidal Nanoparticles",
            "Application of Nano materials and its Technology"};


    //Engineering Mechanics
    String[] emu1topics = new String[] {"PRINCIPLES OF STATIC FORCES","Parallel Force System",
            "Concurrent Force System","Resolution of Forces","Composition of Forces","Resultant of Concurrent Forces","Moment & Varignon's Theorem",
            "Resultant of parallel force system","Couples","Equivalent force couple systems","Resultant of General system of Forces","Distributed Forces",
            "Centroid of Some Plane Figure"};

    String[] emu2topics = new String[] {"Kinematics","Equations of motion","Motion with Variable Acceleration",
            "Curves and Motion Maps","Relative Motion, Dependent Motion","Newton's second law of motion"};

    String[] emu3topics = new String[] {"Kinematics","Equations of motion","Polar Coordinates","Projectile Motion","Newton's Second Law and Circular Motion"};

    String[] emu4topics = new String[] {"Work Energy Principle","Conservative & Nonconservative Forces","Law of conservation of energy",
            "Impulse and Momentum","Direct Central Impact - Coefficient of Restitution","Conservation of Momentum","Impulse Momentum Principle"};

    String[] emu5topics = new String[] {"FREE BODY DIAGRAM","Equilibrium of Coplanar Forces","Equilibrium parallel forces",
            "Three forces in equilibrium","Types of Beams","Equilibrium of space force system"};

    String[] emu6topics = new String[] {"Method of Joints in Truss","Method of Sections","Forces on Cables",
            "Multi Force members","Friction","Laws of friction","Friction on Inclined Plane","The Wedge","Ladder Friction","Belt Drive"};

    //Engineering M1

    String[] m1u1topics= new String[]{"RANK OF MATRIX","EIGEN VALUES,EIGEN VECTORS","Normal form of a matrix","System of Linear Equations"
            ,"System of Linear Equations Part-2","Linear Independence and Linear Dependence","Linear transformations","Orthogonal Transformation","Cayley Hamilton Theorem","Rotation and Transformation Matrices"};
    String[] m1u2topics=  new String[]{"The Argand Diagram","DeMoivre's Theorem","Hyperbolic functions","Inverse hyperbolic functions","Logarithm of Complex Number","Find Real and Imaginary parts"};

    String[] m1u3topics= new String[]{"Infinite Series","Infinite Sequence","Alternating Series","Absolute Convergence, Conditional Convergence"
            ,"Successive Differentiation and Leibnitz Theorem"};

    String[] m1u4topics= new String[]{"Taylor and Maclaurin Series","Taylor and Maclaurin Series - Example 2","L'Hospital's Rule and Indeterminate Quotients"};

    String[] m1u5topics= new String[]{"Partial derivatives","Euler's Theorem on Homogeneous Function"
            ,"Implicit Function","Total Derivative","Change of Independent Variable"};

    String[] m1u6topics= new String[]{"The Jacobian","Errors and Approximations",
            "MAXIMA AND MINIMA","Lagrange's theorem"};



    // ENG M2
    String[] m2u1topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
    String[] m2u2topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
    String[] m2u3topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
    String[] m2u4topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
    String[] m2u5topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};
    String[] m2u6topics = new String[]{"Still searching best videos for you. Stay tuned for our next update."};









    //Eng Drawing
    String[]eg=new String[]{"Engineering Drawing  - Ekeeda Please follow all the videos from this channel."};




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

        //Banner Ads
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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


        thirdLevelq3.put(q3[0],bxeu1topics);
        thirdLevelq3.put(q3[1],bxeu2topics);
        thirdLevelq3.put(q3[2],bxeu3topics);
        thirdLevelq3.put(q3[3],bxeu4topics);
        thirdLevelq3.put(q3[4],bxeu5topics);
        thirdLevelq3.put(q3[5],bxeu6topics);


        thirdLevelq4.put(q4[0],bmeu1topics);
        thirdLevelq4.put(q4[1],bmeu2topics);
        thirdLevelq4.put(q4[2],bmeu3topics);
        thirdLevelq4.put(q4[3],bmeu4topics);
        thirdLevelq4.put(q4[4],bmeu5topics);
        thirdLevelq4.put(q4[5],bmeu6topics);



        thirdLevelq5.put(q5[0],chemu1topics);
        thirdLevelq5.put(q5[1],chemu2topics);
        thirdLevelq5.put(q5[2],chemu3topics);
        thirdLevelq5.put(q5[3],chemu4topics);
        thirdLevelq5.put(q5[4],chemu5topics);
        thirdLevelq5.put(q5[5],chemu6topics);


        thirdLevelq6.put(q6[0],eg);
        thirdLevelq6.put(q6[1],eg);
        thirdLevelq6.put(q6[2],eg);
        thirdLevelq6.put(q6[3],eg);
        thirdLevelq6.put(q6[4],eg);
        thirdLevelq6.put(q6[5],eg);

        thirdLevelq7.put(q7[0],m1u1topics);
        thirdLevelq7.put(q7[1],m1u2topics);
        thirdLevelq7.put(q7[2],m1u3topics);
        thirdLevelq7.put(q7[3],m1u4topics);
        thirdLevelq7.put(q7[4],m1u5topics);
        thirdLevelq7.put(q7[5],m1u6topics);

        thirdLevelq8.put(q8[0], m2u1topics);
        thirdLevelq8.put(q8[1], m2u2topics);
        thirdLevelq8.put(q8[2], m2u3topics);
        thirdLevelq8.put(q8[3], m2u4topics);
        thirdLevelq8.put(q8[4], m2u5topics);
        thirdLevelq8.put(q8[5], m2u6topics);



        thirdLevelq9.put(q9[0],emu1topics);
        thirdLevelq9.put(q9[1],emu2topics);
        thirdLevelq9.put(q9[2],emu3topics);
        thirdLevelq9.put(q9[3],emu4topics);
        thirdLevelq9.put(q9[4],emu5topics);
        thirdLevelq9.put(q9[5],emu6topics);

        thirdLevelq10.put(q10[0],phyu1topics);
        thirdLevelq10.put(q10[1],phyu2topics);
        thirdLevelq10.put(q10[2],phyu3topics);
        thirdLevelq10.put(q10[3],phyu4topics);
        thirdLevelq10.put(q10[4],phyu5topics);
        thirdLevelq10.put(q10[5],phyu6topics);

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
                //Toast.makeText(videoTuts.this, "asd", Toast.LENGTH_SHORT).show();
            }

        });

    }
}