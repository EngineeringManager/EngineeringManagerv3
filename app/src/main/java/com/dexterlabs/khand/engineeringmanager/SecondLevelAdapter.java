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
                //int i=0;
//                for (int i=0,i<100;i++)
//                {
//
//                }
                String[] civiltopics = new String[] {"Surveying","Fluid Mechanics","Structural Engineering",
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

                for (int i=0;i<civiltopics.length;i++) {
                    if (text.equals(civiltopics[i])) {
                        Toast.makeText(context, "Video ", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",civilvl[i]);
                        context.startActivity(intent);
                    }
                }

//                if(text.equals("1")) {
//                    Toast.makeText(context, "login", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(context,YoutubePlayer.class);
//                    intent.putExtra("videoLink","");
//                    context.startActivity(intent);
//                }
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