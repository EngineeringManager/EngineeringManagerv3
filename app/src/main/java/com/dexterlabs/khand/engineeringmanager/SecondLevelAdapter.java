


package com.dexterlabs.khand.engineeringmanager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class SecondLevelAdapter extends BaseExpandableListAdapter {
    private Context context;

    ExpandableListView expandableListView;
    List<String[]> data;

    String[] headers;

    ImageView ivGroupIndicator;
  //  String[]videoLinks={"oXowkdgJPO4","yWkga94iBzU","EeJwn42EEqc","mQrlhwvlIQw","rEhWTt8Mibk","SmP75gIHSow","IjsK8ItrffA","eW5VGGJuWtQ"};

    public SecondLevelAdapter(Context context, String[] headers, List<String[]> data) {
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
    public View getChildView(final int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_third, null);

        TextView textView = (TextView) convertView.findViewById(R.id.rowThirdText);

        String[] childArray = data.get(groupPosition);

        final String text = childArray[childPosition];

        textView.setText(text);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int i=0;
//                for (int i=0,i<100;i++)
//                {
//
//                }
                String[] civilTopics = new String[] {"Surveying","Fluid Mechanics","Structural Engineering",
                        "Construction Engineering","Transport Engineering","Irrigation Engineering","Geotechnical Engineering","Foundation","Responsibilities and Interdisciplinary Approach","Brick","Cement",
                        "Concrete","PCC RCC","Sand","Artificial Sand","Reinforcement Steel","Substructure to Automation","Introduction to Automation","Types of Maps","Principles of Surveying",
                        "EDM","Theodolite","GPS Total Station","Planimeter","Simple Levelling","Differential levelling","GIS","Contour Line Preparation","EIA",
                        "Engineers Role in Sustainable Development",
                        "Need For Conserving Natural Resources And Preserving Enviornment","Impacts of Human","Impact of Technology","Solid Waste Management","Electronic waste","Principles of Planning","Built and Natural Environment","Eco Friendly Building Material","Green Building","FSI","Carpet Built-up Plinth areas","Types of energy",
                        "Methods of Harnessing Energy","Air Pollution","Soil Pollution","Noise Pollution","Noise Pollution Control","Water Pollution"};

                String[] civilvl = new String[] {"oL4cmwgXEok","ZGiaOceb6Fc","oqpp8L4J4ek",
                        "u8lEDf5oOGY","GkZlxsQZ398","mmt-tLsqwow","wg_N4sNvZeY","7sl4KuM4UIE","vsLPqsumh4Q",
                        "Uq_FDgJ6HAc","uMzRJD635gE","RVEHQ7eBgXY","J9xtuEreB28","f66YCdyKm2w","MA21g1yHSEY","bVBPcWM0A6s",
                        "yb0cDuy_Ui0","hEhXRcMpmF0","ugtR59IfOxs","urmUILx1qtc","oX6fbZbzMGY","DSWJFT-XgeA","aatV8_60rX8",
                        "zh9Gu_mFn9w","v0oFRqnI0GY","Fj2PGT9sVo4",
                        "-ZFmAAHBfOU","qtwgHYPtPmI",
                        "H07CjSGsl94","3WBKA8xG9IU","42lxgPflEKM","5eTCZ9L834s","1B6D7j3E6oI","nL354fxAfBk",
                        "2REsMF3PfvA","HkSVkfSFEYM","pkL4PnSMaxQ","VsahyCrZ9sk","MyIOtsx3wDs","ZNoT7J48A88","2rNLYnfGVA8","EmTMSOqvinw",
                        "WsFP5HDO9Fw","t7Q7y_xjR5E","UaVuLlwYEvA","DdImG-jphkM","0zGy7KxHT4Q","KqZihghcMJA"};

                for (int i=0;i<civilTopics.length;i++) {
                    if (text.equals(civilTopics[i])) {
                        Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",civilvl[i]);
                        context.startActivity(intent);
                    }
                }


                String[] electricalTopics = new String[] {"Elemntary Concepts","Conversion of Energy","Effect of temp on Resistance",
                        "Right hand thumb rule and cork screw rule with dot and Cross Conventions","Magnetic Field due to Straight Current Carrying Conductor","Toroid",
                        "Solenoid","Basic definitions","Difference betwwen Electrical and Magnetic Circuits","Series Circuit","Parallel Circuit","Faradays laws",
                        "Flemings right hand rule","Static and Dynamic Induced EMF","Self Inductance and Mutual Inductance","Energy stored in Magnetic Field",
                        "Autotransformers","Single phase transformer 2","Single phase transformer 1","Permittivity","Dielectrics","Energy of Capacitor","Capacitors in Parallel",
                        "Capacitors in Series","Charging and Discharging","AC fundamentals",
                        "RMS and avg value, form and peak factor","Lead lag","Phasor Diagram",
                        "AC through pure resistance","AC through pure inductance","AC through pure capacitance","Series RL, RC, RLC","Impedance and Admittance",
                        "Active, Reactive and Apparent Power","Power Factor","Resonance in Series RLC","Polyphase and Star Delta","Classification of Electrical Network","Kirchoffs rules",
                        "Star delta conversions","Ideal vs Practical Voltage",
                        "Ideal vs Practical Current","Superposition Theorem","Thevenins Theorem"
                };


                String[] electricalvl = new String[]{"bT1Ko-1_1nY","jkqcfswRXy8","SaXggeH-dEo",
                        "nNv2iDlboXw","zv4t_4fHvn4","roJO_T0eKDM",
                        "ISg_9Wmi5J8","NS42a9UbKwA","n7JpT_f3SSg","6-locnbFY-M","ItyhLr19pGg","3HyORmBip-w","3vc2YEyHvJc","dbtp6bOn4WQ","hoTInTKij0o","5Du2n2nlaFI",
                        "czCUJZv0Sew","eBE71L07uMA","ai3eriqcSYc","RTKr0qGYask","rkntp3_cZl4",
                        "SIU_9SMd5q0","P-1mWGeJjmg","-MaD9Ycy3a4","Ag2RujOHqJ8","DFHLUzfbcdY","Syo9a3xdVck","G0h9Sa_s18A",
                        "Hd1NDqmKWgU","hrM21Pi3ByY","_UTegajMHpw","GOK4IJXzJqE",
                        "HaFrY0qQ-NU","gtx-_DDKkwU","xndhKc6-9PE","WfzPvVdmUho","tGMH4fCpplA","FPt-1R7NmP8","4LgSLToLSCU","0gRtVz4XrZM","9Mhqtd_Oumg","TRzpqHwb-5Y","dTf1h_xhHng","H-8G5bqcRtk","E-SUpObhohE"
                };


                for (int i=0;i<electricalTopics.length;i++) {
                    if (text.equals(electricalTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",electricalvl[i]);
                        context.startActivity(intent);
                    }
                }



                String[] chemTopics = new String[]{"Impurities in water","Determination of hardness of water by EDTA method",
                        "Alkalinity of water problem solving","Alkalinity of water","Boiler feed water","Internal treatment","External treatment",
                        "Zeolite process","Zeolite problems","Ion exchange","Reverse osmosis","Electrodialysis",
                        "Green Chemistry","Synthesis of Indigo Dye","Synthesis of Adipic Acid",
                        "Conductometry-Introduction","Conductometry-Titration curves","Kohlrauch's Law","Kohlrauch's Law Problems"
                        ,"Types of electrodes 1","Types of electrodes 2","Electrode Potentials","Standard Hydrogen Electrode (Potentiometry)"
                        ,"Saturated Calomel Reference Electrode (Potentiometry)","Glass Membrane Electrode - Indicator Electrodes -Potentiometry","Potentiometry - Instrumentation"
                        ,"Types of Potentiometric Titrations","Cell Notation Practice Problems, Voltaic Cells - Electrochemistry","UV Spectroscopy","Applications of UV Spectroscopy",
                        "LDPE and HDPE","Polymer Chemistry","Thermoplastics and Thermosetting polymers","Elastomers",
                        "Tg","Avg molecular weight","Free radical mechanism","Cationic","Anionic","Emulsion Polymerization","Bulk Polymerization",
                        "Solution Polymerization","Suspension Polymerization","Speciality Polymers",
                        "Fuel cells","Fuels","Calorific value","Bomb calorimeter","Octane no","Cetane no","Power alcohol",
                        "Combustion 1","Combustion 2",
                        "Steam reforming","Lab preparation of Hydrogen","Electrolysis of water","Water splitting",
                        "Hydrogen storage","Molecular hydrides","Saline hydrides","Hydrogen","Carbon","Allotropes",
                        "Corrosion and its types","Factors","Pourbiax Diagram","Cathodic Protection",
                        "Anodic Protection","Metallic Coating"


                };

                String[] chemvl = new String[]{"NEuBunNhTgY","qXM4eK6cTSM","hz8gHxBU0CQ","OyGBEBayqW0",
                        "is5wdVgPOkI","ujSOhXQt2vk","64FhpimVJAo","EnKDEECa7Z4","Y-3woxxoba8","7he0Z1snrHg","4RDA_B_dRQ0","wvS7jsIhGBQ","d0daTBJmPus",
                        "4KqKFwIG1VI","OK1WxtqgPEQ","E0oYzyJrKGg","5Q9rJvPyMjg","vewIM-xBc0Q","zjtoLt0D9ck","LQ6T9PVg4qQ","ZWw6DB3boDg","dmdMLSkKm4c","O0mQzBA5pOI",
                        "umN4EOfqWw0","Q30qDhicF44","O6zI3aDAgqc","oPsPMDWK94g","iWqUWwyPkSs","BST5GRsAnPk","ftZY8sVPoMk","WidWYhoOmcg","MXSnKYxXC2o","-TIkJYVwssA","d1nQJ8PhCi0","G5c6hrbpilw","YywmrDheOno","Z8vpTLl1Jkg","d25e9y2z8X4"
                        ,"mGcTMIPsQZ0","e_TgUSioQFE","KuygD0ZY_KI",
                        "nlPgiRhuYGg","X4rDrNLd18M","gsFOw54csdk","xDBNJpcoGrk","zGVNy69Fz8c","OgaO_4aE_fM","c1wCObJwzmg",
                        "HoboFGutz4Y","ajvi5Zz2Rfs","Uh0DtA5jqLo","uvR7zNJ1KoI","LSlNb0WIyVM","Mi0iTEh8e6k","fq7gFxw_5ZQ","IxANIkNjUv0","38ULHoKWZag","9NxGwxGumGE",
                        "ToAusg1LjvQ","uSKchk8AId8","U-MNKK20Z_g","vHJeH7rcK9Y","w_3fvq4EYpE",
                        "A_rI9rNVgR8","ZWr6iVwNAv8","0P61i7jBitE","RAlC75xG4qU","uxdzxoyY6VM","M2OYAMqXkQk"};

                for (int i=0;i<chemTopics.length;i++) {
                    if (text.equals(chemTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",chemvl[i]);
                        context.startActivity(intent);
                    }
                }



                //BXE
                String[] bxeTopics = new String[] {"Half Wave Rectifier","Full Wave Bridge Rectifier","Capacitor Filter","Introduction to Clippers","Voltage Multiplier Circuits",
                        "Voltage Multiplier Circuits Part-2","Voltage Multiplier Circuits Part-3"
                        ,"Zener Diodes","LED - PhotoDiode",
                        "Working of Transistors","DC Biasing, Load Line & Operating Point of Transistors","TRANSISTOR CHARATERISTICS",
                        "TRANSISTOR CHARATERISTICS Part-2","Transistor as an amplifier","Transistor as a switch","Enhancement-Type MOSFET",
                        "Operational Amplifier","OPAMP INPUT MODES AND PARAMETERS","Negative Feedback in OP-AMP",
                        "Comparator","Summing Amplifier","DIFFERENTIATOR & INTEGRATOR","555 TIMER as Oscillator","Voltage Regulator IC",
                        "Introduction to Digital Electronics","Digital Signal","Introduction to Boolean Algebra","Introduction to Boolean Algebra Part-2",
                        "Logic Gates and Circuit Simplification","Half Adder","Full Adder","Multiplexers","Demultiplexers",
                        "FLIP FLOP","D flip flop","Shift Register (SISO Mode)","Shift Register (PISO Mode)","Bidirectional Shift Register",
                        "Universal Shift Register","COUNTERS","Block Diagram & Architecture Of 8085 Microprocessor",
                        "SCR characteristics and its working","DIAC working","TRIAC working","Introduction to Transducers",
                        "Thermal - Resistive & Inductive Transducer - PhotoTransistor","LVDT (LINEAR VARIABLE DIFFERENTIAL TRANSDUCER)",
                        "INTRODUCTION TO COMMUNICATION SYSTEM","Elements of a Common Communication System","Bandwidth of Signals",
                        "Ieee frequency spectrum","Transmission Media","NEED OF MODULATION","Modulation Techniques","Cellular Mobile Communications",
                        "GSM architecture"};

                String[] bxevl = new String[]{"AspBbh_jOuk","Kl8IOESVWlM","FfUsngOek_M","ttSxAdPM5XU","r-295fIw0mI","u9UlkmEPgqA","JTJXdTTM8iU","JdL3DnnFHXw","lxwcTbfWAEQ"
                ,"yOmPCjPlaEg","jQb199oIY5U","jk5CZ_rRAcE","kfdhNwf7MBA","Thhw8LNAmGg","MO0ceXEsCJA","4_nGFY7zgDM",
                        "lJDjWZqhpVc","nQJEIw7bovU","PT1J0dpe8j4","BhUUmbz76P0","jsKSfaFQ4d4","RX6QelNH9m0","BHBdpnuswIQ","rgia8rI1soI",
                        "2xXErGeeb_Q","jRL9ag3riJY","WW-NPtIzHwk","OjWmVCG8PLA","q2OBYz3K6PM","aLUY-s7LSns","RK3P9L2ZXk4",
                        "FKvnmxte98A","t3Ed13z9uz8","AaN72s5WfOM","dnfXXpW7tIw","unorn9n-UpE","7LmBcGiiYwk","zoEeQgQkPLA","AEGzpMlOsvc","iaIu5SYmWVM","zAXAb_ttazY"
                ,"9h7_vDUE908","R3C69On9RVI","rIMexAWE6Cc","FYggY7LLDrw","fv-p1xJo1D0","O2oQRbSDG68","F_IxjY-3ib0","X8msNUTospE","EDaFCkRS8ZA","90HQcJaz5fQ","UBIAW4u93l0","V_3A7ZiYb2U",
                        "beFoCZ7oMyY","CI9No9Ci9Ro","1POzl9tZXuQ"
                };



                for (int i=0;i<bxeTopics.length;i++) {
                    if (text.equals(bxeTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",bxevl[i]);
                        context.startActivity(intent);
                    }
                }



                //BME


                String []  bmeTopics= new String[]{"SHAFTS-AXLE , SPINDLE , COUNTER & INLINE SHAFTS-KEYS & COUPLING",
                        "Single Plate Clutch","Disc Brakes","Disc brakes working Part-2","Belts and Belt-Drives",
                        "Chain Drive","TYPES OF GEAR"
                ,"Mechanical properties of material","Mechanical properties of material Part-2","Mechanical properties of material Part-3",
                        "Four bar linkage Mechanism","Slider Crank Mechanism","Casting and its special types","Casting and its special types","Forging process",
                        "SHEET METAL OPERATIONS","SHEET METAL OPERATIONS part-2","Metal Joining Processes",
                        "Sand Casting","ELECTRIC ARC WELDING","MACHINE TOOL","CONSTRUCTION DETAILS OF LATHE MACHINE","DRILLING MACHINE","GRINDING MACHINE",
                        "Thermodynamic Systems","Properties of Thermodynamics","Law of thermodynamics","Heatsink","HEAT ENGINE,HEAT PUMP AND REFRIGERATOR",
                        "How to Measure Temperature with a Thermocouple","Barometer","PRESSURE GAUGE (BOURDON GAUGE)","U-tube Manometer"
               ,"Energy Resources - Conventional and Non-Conventional","HYDRO-ELECTRIC POWER PLANT",
                        "STEAM POWER PLANT","Nuclear Power Plants","Wind Power Plant","Solar Photovoltaic Power","COCHRAN BOILER","2 Stroke Engine",
                        "FOUR STROKE PETROL ENGINE","Reciprocating pump","Centrifugal pump","Compressor","Refrigerator","Air Conditioner" };


                String []  bmevl= new String[]{"TCwgrh4SW6Q","ADpvN0o3I-E","MAuVDB-G-HQ","bGKJOICWmFQ","0mb_XMGja_c","4PsJkXO70Xc","jTfUFQ-sbas"
                        ,"Ztjra5pl4eY","l6ilvFL5Zys","S45d1Gq79kg","KBFFwgCCP0U","ZO8QEG4x0wY",
                        "Ox6M3UdyLWU","dFnN1YtomNc","L0YgSmfwzWY","c-G98EJvxoE",
                        "alW67rAe5Bk","LmjAQGvSrF0","_2cdc_QtsYo"
                , "0aauFmBaz38","p_LgK0Ffg20","DvfmRV84Jus","QMEiPdtES58", "ONByTmN8j_g","k8Xoz7oq5YU","1nECy2s_qEo","tX2VKEesUiE","4skt_FJVgpQ","19aGHGMOx1w",
                        "EkDhlzA-lwI","CSL2B91bjHk","JHCS7Idf4aU"
                , "Zgp86PVXXuQ","i-2JxkQF-HE","A0q2JGDnWBk","_UwexvaCMWA","45Xh7FKS9nM","ZLgOoMSlS3Y",
                        "AMBbxlAXd2A","tvlOVGWWAMg","9NJULr70MMo","oQqMrtc6kJQ","BaEHVpKc-1Q","VoUtTjtA5vE","h5wQoA15OnQ","6OU7WHgJ_cY"
                };


                for (int i=0;i<bmeTopics.length;i++) {
                    if (text.equals(bmeTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",bmevl[i]);
                        context.startActivity(intent);
                    }
                }



                //physics
                String[] phyTopics = new String[] {"INTRODUCTION","CONCEPT OF THIN FILM, INTERFERENCE DUE TO THIN FRAME OF UNIFORM THICKNESS",
                        "CONCEPT OF THIN FILM, INTERFERENCE DUE TO THIN FRAME OF UNIFORM THICKNESS Part-2","INTERFERENCE DUE TO WEDGE SHAPED THIN FRAME",
                        "Formation of colours in thin films","NEWTON'S RING, ITS APPLICATION","OPTICAL FLATNESS OF FRAME","ANTI REFLECTION COATING",
                        "DIFFRACTION OF WAVES","CLASSES OF DIFFRACTION","Fraunhofer diffraction due to single slits","Conditions of Maxima and Minima",
                        "DIFFRACTION AT CIRCULAR APERTURE Part-1","DIFFRACTION AT CIRCULAR APERTURE Part-2","PLANE DIFFRACTION GRATING",
                        "Velocity,frequency,wavelength,Intensity and loudness,timbre of sound,reveration, reveration time, sabine's formaula",
                        "Velocity,frequency,wavelength,Intensity and loudness,timbre of sound,reveration, reveration time, sabine's formaula Part-2",
                        "Absorbtion of sound","Absorbent materials","Conditons for acoustics","Ultro sonics","Piezoelectric effect","Magnetostriction effect",
                        "Detection of Ultrasonic","Applications of ultrasonics","Polarization","Laser -1 Introduction,Properties,Absorption,Spontaneous Emission,Stimulated Emission",
                        "CHARACTERSTICS OF LASER LIGHT","LASERS (3 LEVEL AND 4 LEVEL)","APPLICATIONS OF LASER","Electron Band Theory of Solids","Free Electron Theory","Conductivity of a Semiconductor",
                        "Fermi level of intrinsic and extrinsic semiconductors","Fermi level variations in semiconductors","The Energy Band Diagram of the pn-junction",
                        "Working of Transistors","Hall Effect","Solar photovoltaics","Dual nature of radiation & Matter","De Broglie wavelength and Heisenberg's Uncertainty Principle",
                        "ELECTRON DIFFRATION BY SINGLE SLIT","Schrodinger Equation","Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS",
                        "Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS Part-2","Super conductivity, PROPERTIES,ISOTOPE EFFECT,BCS THEORY, TYPE 1 TYPE 2 SUPERCONDUCTORS Part-3",
                        "INTRODUCTION AND PROPERTIES OF NANOPARTICLES","Biological Nanoparticles: Synthesis & Applications",
                        "Synthesis of Silver Nanoparticles by Leaf Extract","Synthesis of Colloidal Nanoparticles","Application of Nano materials and its Technology"



                };


                String[] phyvl = new String[] {"oYFEWoxuB1I","oXowkdgJPO4","yWkga94iBzU","EeJwn42EEqc",
                        "mQrlhwvlIQw","rEhWTt8Mibk",
                        "SmP75gIHSow","IjsK8ItrffA","eW5VGGJuWtQ","Q-oQKSLhLKw","ypFkphJ8gNQ",
                        "A3Hc-iuK8bc","QJ0jOFoGfO4","Fv-SlEIsyRc","EUA8KYv-je4","QDC0tJmNzb0",
                        "gzuooI4zhxI","59Rs135rzHk","DtQkMpHsMro","VWnVfGicz7A",
                        "rD12f-s7Yf4","cttsO5Sbaao","mc8LVPKotzo","hivv2hgqDvk","dYyrtmq6Z2c",
                        "ObZfZGHUYbc","eoOM0Gx6GJc","5YALFqoK-N8","02XeiP6u8aw","_8LNjaWAv9o",
                        "ots5zxbrlUk","xojEukHJaAQ","qy6oOGNy8Vc","kCN-7wA8HUE","T_S9Huq-v5c","KqE5JIPIhlU","yOmPCjPlaEg",
                        "Hnnl9vefZmA","1gta2ICarDw","A1kG4q8d97w","5tjl85y4gtA","xt_tzD-NcfY","O6g-7rUgrdg",
                        "mNoNirSYSLg","tq5bUX6cLoU","ySC0WjpEBS4","LNufQH813IY",
                        "foQ2-XZGeo4","VkA4wvNuAZA","CIqLZF9DfsA","dJQK4v32uoc"


                };





                for (int i=0;i<phyTopics.length;i++) {
                    if (text.equals(phyTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",phyvl[i]);
                        context.startActivity(intent);
                    }
                }




                String[] emTopics = new String[] {"PRINCIPLES OF STATIC FORCES","Parallel Force System",
                        "Concurrent Force System","Resolution of Forces","Composition of Forces","Resultant of Concurrent Forces","Moment & Varignon's Theorem",
                        "Resultant of parallel force system","Couples","Equivalent force couple systems","Resultant of General system of Forces","Distributed Forces",
                        "Centroid of Some Plane Figure","Kinematics","Equations of motion","Motion with Variable Acceleration",
                        "Curves and Motion Maps","Relative Motion, Dependent Motion","Newton's second law of motion",
                        "Kinematics","Equations of motion","Polar Coordinates","Projectile Motion","Newton's Second Law and Circular Motion",
                        "Work Energy Principle","Conservative & Nonconservative Forces"
                        ,"Law of conservation of energy",
                        "Impulse and Momentum","Direct Central Impact - Coefficient of Restitution",
                        "Conservation of Momentum","Impulse Momentum Principle","FREE BODY DIAGRAM","Equilibrium of Coplanar Forces","Equilibrium parallel forces",
                        "Three forces in equilibrium","Types of Beams",
                        "Equilibrium of space force system","Method of Joints in Truss","Method of Sections"
                        ,"Forces on Cables",
                        "Multi Force members","Friction","Laws of friction",
                        "Friction on Inclined Plane","The Wedge","Ladder Friction","Belt Drive"

                };

                String [] emvl= new String[]{"fO2Cdx89O_o","knRu1z5PxIQ","si_6vjDRVQc","4bV8jXbKyLw","XLSCg-lkxC0","r26BBb2ScPM",
                        "ThRrY9zt-dw","jx257Bj2FDo","XNGi73GZ_YA","jM-R7Rk7Wuk",
                        "B7TLvJlbY24","95BE6vcf--Y","umXye72SkMY","027ns4voOWw","WJN_F3PYp58","4FEC2FhHUhY","cfmz9qhANWI","WvwlffB0LmM","ou9YMWlJgkE",
                        "027ns4voOWw","WJN_F3PYp58","r0fv9V9GHdo","ZcOh7792DIo","4edkm5HLuNA","7yw3985pF8A","N7DAqKuSCsk","HR5iEX3Sy1k","OsdYPP92D2s","-lhh_sldnio","pEqMEyP7RL8","dlWUwKO9UD4",
                        "aCrHpnvZp1E","7kt9AoxZlLo","SbqnqKS9QlA","KzywuMU-8s4","euil01zaLm4","9L7ROZGYpak",
                        "TgRlVhs0JPs","rVbpUHjYJ48","0Kr0_p9bOg0","gcPP8DCa2sw","71Dha7tepZc","tz34tDQ2t6A","S54We3NRi9Y",
                        "mzYn7etsVy0","dBVpjm9jMqo","cfAK1bbdtp8"
                };






                for (int i=0;i<emTopics.length;i++) {
                    if (text.equals(emTopics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",emvl[i]);
                        context.startActivity(intent);
                    }
                }



                //Eng Drawing
                String[]eg=new String[]{"Engineering Drawing  - Ekeeda Please follow all the videos from this channel."};
                String egvl="https://www.youtube.com";///playlist?list=PLm_MSClsnwm_guTpKrkYk_gQ6rrynbI5d";

                if (text.equals(eg)) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, webview.class);
                        intent.putExtra("url",egvl);
                        context.startActivity(intent);
                    }



                    //Eng M1

                String[] m1Topics= new String[]{"RANK OF MATRIX","EIGEN VALUES,EIGEN VECTORS","Normal form of a matrix","System of Linear Equations"
                        ,"System of Linear Equations Part-2","Linear Independence and Linear Dependence","Linear transformations","Orthogonal Transformation","Cayley Hamilton Theorem","Rotation and Transformation Matrices"
                        ,"The Argand Diagram","DeMoivre's Theorem","Hyperbolic functions","Inverse hyperbolic functions","Logarithm of Complex Number","Find Real and Imaginary parts",
                        "Infinite Series","Infinite Sequence","Alternating Series","Absolute Convergence, Conditional Convergence"
                        ,"Successive Differentiation and Leibnitz Theorem",
                        "Taylor and Maclaurin Series","Taylor and Maclaurin Series - Example 2","L'Hospital's Rule and Indeterminate Quotients",
                        "Partial derivatives","Euler's Theorem on Homogeneous Function","Implicit Function","Total Derivative","Change of Independent Variable",
                        "The Jacobian","Errors and Approximations","MAXIMA AND MINIMA","Lagrange's theorem"};


                String[] m1vl= new String[]{"Yzvjelfwm3A","WTQ_Dwwmqlo","liAqh2WbC1g","NNmiOoWt86M","a2z7sZ4MSqo","yLi8RxqfowA","4PCktDZJH8E","dHOuzlI7Jxk","kb0598ItKdg","NsiJNvsuO3s",
                        "Pdmg4V3eXZU","MO6qU3SCLbM","Wfpb-fniSSk","QEL-UbvA93k","ve7CmEIEv_U","nBZsQeXJUPY",
                        "XC-M-oTVR_0","-0eCaT4cIhM","-K9Qt6YUIrI","6hOeqjoQvNw","01LzAU__J-0","2VpyJXiMkRw",
                        "cjPoEZ0I5wQ","Os8OtXFBLkY","Sp0G-VggAoU",
                        "AXqhWeUEtQU","palSdK9P-ns","78NIJFMAX30","M-OZWTc5fN4","yl2NLqflIRQ",
                        "Bw5yEqwMjQU","KmHiVDrvhD8","gLWUrF_cOwQ","L7P2JZRE9bE"};



                for (int i=0;i<m1Topics.length;i++) {
                    if (text.equals(m1Topics[i])) {
                        Toast.makeText(context, "Child Position:", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",m1vl[i]);
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

        Toast.makeText(context, "open zala.click zala"+ getGroup(groupPosition).toString(), Toast.LENGTH_SHORT).show();


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