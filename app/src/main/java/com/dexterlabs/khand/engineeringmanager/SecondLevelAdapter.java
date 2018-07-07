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
    String[]videoLinks={"oXowkdgJPO4","yWkga94iBzU","EeJwn42EEqc","mQrlhwvlIQw","rEhWTt8Mibk","SmP75gIHSow","IjsK8ItrffA","eW5VGGJuWtQ"};

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
                        "Steam reforming","Lab preparation","Electrolysis of water","Water splitting",
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