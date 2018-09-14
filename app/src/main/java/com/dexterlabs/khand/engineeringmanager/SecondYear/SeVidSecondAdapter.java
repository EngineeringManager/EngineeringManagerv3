package com.dexterlabs.khand.engineeringmanager.SecondYear;

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

public class SeVidSecondAdapter extends BaseExpandableListAdapter {

    private Context context;

    ExpandableListView expandableListView;
    List<String[]> data;

    String[] headers;

    ImageView ivGroupIndicator;


    public SeVidSecondAdapter(Context context, String[] headers, List<String[]> data) {
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



//put logic here

                String[] mpro1Topics = new String[] {"Casting Process","Manufacturing and Production Casting",
                        "FORMING PROCESSES","Hot & Cold Working Processes","Plastic Manufacturing Processes",
                        "Injection Molding Animation","Classification of Welding processes","Types of Welding Processes",
                        "Sheet metal operations part-1","Sheet metal operations part-2",
                        "Introduction","Construction of centre lathe","Types of  lathe operations"};


                String[] mpro1vl = new String[] {"cjebklLgrf8","BkYfrs6KxpU","BppmXtGeKvs","0M9DBnKPx78",
                        "jYkKBUFORco","b1U9W4iNDiQ","CCzhT81GrBo","4iPF0pMjKjA","L0YgSmfwzWY","c-G98EJvxoE",
                        "k-ddj8vWYZQ","p_LgK0Ffg20","cWcRKLd6ZI4"};

                for (int i=0;i<mpro1Topics.length;i++) {
                    if (text.equals(mpro1Topics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",mpro1vl[i]);
                        context.startActivity(intent);
                    }
                }




                //thermo
                String[] thermoTopics= new String[]{"Laws","Basic Thermo-dynamics",
                        "Fundamentals of thermodynamics","Entropy","Ideal gas","Ideal Gas Laws","Gas Power Cycles",
                        "Refrigeration Cycles-Reversed Carnot Cycle","Bell Coleman Air Refrigeration Cycle","Availability",
                        "Properties of pure substances,steam table","Properties of Pure Substances-I",
                        "Properties of Pure Substances-II","Thermodynamic Vapour Cycle","Vapor Power Cycle-II",
                        "Vapour Power Cycle-III","Steam Genarator","Psychrometric Processes-1","Psychrometric Processes-2"};

                String thermovl[]=new String []{"8N1BxHgsoOw","6QXtnmB1vqk","9GMBpZZtjXM","PFcGiMLwjeY",
                        "Abi8oJjLhPo","3dyxjBwqF-8","1Vn1PDuPHsY","2zagp5NLdyw","b6200_9EuC8","WYgVDEgz1_c","LUZrZJJ7zNQ",
                        "pJM9Fh9Fp-I","5HuZt0VJKB0","4-BI22Wx4Pc","vt1_7f5l3hI","NtoTpeWAAWc","VdmIoVCKHYY","l_3K5Hr6bB8",
                        "XPj2U4yYWDw"};


                for (int i=0;i<thermoTopics.length;i++) {
                    if (text.equals(thermoTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",thermovl[i]);
                        context.startActivity(intent);
                    }
                }




                //Material Science

                String[] msTopics= new String[]{"Structure of Materials Part-I","Structure of Materials Part-II",
                        "Mechanical behaviour of metals","Mechanical behaviour of metals",
                        "Destructive and Non Destructive Testing","DT & NDT","Types of corrosion",
                        "Prevention of corrosion","Corrosion Protection Mechanisms",
                        "Corrosion protection (Inhibitors and coatings)","Cavitation","Electroplating",
                        "Pvd","Cvd","Metal powder and powder metallurgy technology","Self lubricating bearings"};

                String[] msvl= new String[]{"v1qw-ttBOdA","jrK89TcSQ_Q","2vOZtqRRJiY","jAM7Tg7Dq1c"
                        ,"DK1dItnI8mM","A_rI9rNVgR8","gvoQdRScZWY","q3c-ig5G3bA","i9fYN6w82IA","8vRJIvGPA7w",
                        "OxhCU_jBiOA","yzwc9zINhl4"
                        ,"9XKGVHPXXho","O7U4HWjYcqo","xG_jw7qXjh8"};



                for (int i=0;i<msTopics.length;i++) {
                    if (text.equals(msTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",msvl[i]);
                        context.startActivity(intent);
                    }
                }


                //SOM
                String[] somTopics= new String[]{"Types of Stresses - Stress and Strain","Hooke's Law",
                        "Concept of Shear Force and Bending Moment Diagram",
                        "Types of Beams and Loading - Shear Force and Bending Moment Diagram",
                        "Bending stresses","Shear stresses","Slope and Deflection in Beams","Torsion",
                        "Buckling","Concept- Principal stresses and strains","Principal Stresses and Planes"};


                String[] somvl= new String[]{"26pvB8YpTIE","mDs9crZ_vMw","UahfUvcS24o","LWuEdZPGbI4"
                        ,"xGPGrS-k6eo","WrTgnLoKfxo","K8yvy3cB9aM","awrGg2P5a5c","F692spiIyHU","GlwlTSp3lkM","au1aweTRkJE"};


                for (int i=0;i<somTopics.length;i++) {
                    if (text.equals(somTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",somvl[i]);
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
