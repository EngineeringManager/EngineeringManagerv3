package com.dexterlabs.khand.engineeringmanager.FourthYear;

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

public class BeVidSecondAdapter extends BaseExpandableListAdapter {

    private Context context;

    ExpandableListView expandableListView;
    List<String[]> data;

    String[] headers;

    ImageView ivGroupIndicator;


    public BeVidSecondAdapter(Context context, String[] headers, List<String[]> data) {
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

                String[] daTopics = new String[] {"Big data overview","BI Vs Data Science","BI Vs Data Science Part-2","BI Vs Data Science Part-3",
                        "Drivers of Big Data","Emerging Big Data Ecosystem and new approach","Emerging Big Data Ecosystem and new approach (hindi)","Data Analytic Life Cycle",
                        "Hypothesis testing","Intro to Hypo thesis testing","Wilcoxon rank–sum test","Type 1 type 2 errors, Power and Sample Size",
                        "ANNOVA","Clustering-Intro","Clustering Overview","K means- Use cases",
                        "Association Rules- Overview Basic Concepts","Association Rules- Analysis","Market Basket Analysis , Support and Confidence",
                        "A-priori algorithm","Regression","Linear Regression","linear Regression Solved example","Logistics"};

                String[] davl = new String[] {"GZ5eTtzpIhI","3_ymFyT103I","xHCT4IShYHc","ed2m8gleNbA","KhPW2EypKXQ","1WY63n2XRLM","DfDlNOtb41s","L9uRq8CT5N4",
                        "VK-rnA3-41c","USH2cFhweBo","TqCg2tb4wJ0","OhDZIO8vtGw","q48uKU_KWas","2QTeuO0C-fY","UiTermj_Sw0","YWgcKSa_2ag",
                        "RiFrbyiYpRs","QN3_wxqnSlw","1D2um4u-BeM","l7n4K12EjY0","GK9XdZaQMpI","c5GOOYa1xQM","Z-PXfIJMVN4","7E7Nu_Ky-WQ"};


                for (int i=0;i<daTopics.length;i++) {
                    if (text.equals(daTopics[i])) {
                       // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",davl[i]);
                        context.startActivity(intent);
                    }
                }


                //AIR
                String[] airTopics = new String[] {"Artificial Intelligence",
                        "State Space search","Search Strategies","8 Puzzle Problem",
                        "Hill Climb","Hill Climb (hindi)","A*","Tabu Search",
                        "Goal Stack Planning","STRIPS","N Queens",
                        "Forward and Backward Chaining","PL vs FOL","Conceptual Dependency","Knowledge Representation"};

                String[] airvl = new String[] {"2ePf9rue1Ao","gUIiE7gI0Co","xFIKfowHK8E",
                        "9JyBz8-WNO8","FU6ZzRs6szE","50Z_HdSYjoI","vP5TkF0xJgI","wrkMM6a4S-U",
                        "PaKRt05Zk50","No9obxdXn6w","xFv_Hl4B83A","aVwcNDKXcHU"
                        ,"GS3HKR6CV8E","oL8ApH82s6s","y2HQmvqXON4"};


                for (int i=0;i<airTopics.length;i++) {
                    if (text.equals(airTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",airvl[i]);
                        context.startActivity(intent);
                    }
                }



                //HPC

                String[] hpcTopics = new String[] {"Parallel Computing and types of Architecture","Parallel Computing Basics","Dichotomy of Parallel Computing Platforms",
                        "GPU and its working","Decomposition technique,Scatter and gather"};


                String[] hpcvl = new String[] {"tWRL2VJL-FA","q7sgzDH1cR8","D7UK46gXhcA","0_TN845dxUU","B4yLUYm6lVc","AcULfKtWfoA"};






                //MC
                String [] mcTopics = new String[]{"1G, 2G, 3G, 4G, 5G of Cellular Mobile Communications","GSM,IMSI,SIM,IMEI,The GSM Architecture,HLR, VLR and EIR","Mobile Switching Center","Mobile Phones and Base Stations","Personal Communication Services (PCS)","(PCS Architecture)","multipath fading","Long and Short Term Fading","Line of sight","Signal-to-Noise Ratio -1","Signal-to-Noise Ratio -2 ","Free Space Path Loss","Path Loss","Radio Spectrum Animation",
                        "GSM architecture","Mobility management","Cell splitting & cell sectoring","Cell splitting & Cell Site ,Mobile Computing , Wireless Communication ","CO-CHANNEL INTERFERENCE","Frequency Reuse and Co-Channel Interference","Frequency Reuse Concept ","Handover in GSM ,Hard Handoff vs Soft Handoff","Hard hand off and Soft Hand off",
                        "SDMA","FDMA, TDMA and CDMA","FHSS ","Spread Spectrum Technique and Direct Sequence Spread Spectrum"," DSSS]","FHSS and DSSS","MSK, GMSK, FSK, GFSK Modulator","GMSK","8PSK","Modulation & QAM Basics","OFDM/ OFDMA  - Fundamentals of 4G (LTE)","Orthogonal Frequency Division Multiplexing","MAC,Near and far terminals,Hidden and Exposed Terminals,SDMA,FDMA,TDMA,CDMA","SDMA-1",

                        "GSM Call Flow","GPRS Architecture-1","GPRS Architecture -2","2G GSM Location Update","GSM Architecture,Call Routing,GSM Architecture in Mobile computing","IMSI, TMSI and MSISDN ","Traffic Channels","Logical channels","BURST TRANSMISSION","SPEECH CODING",

                        "EDGE ","Working Principle Of EDGE","3G WCDMA (UMTS) ","CDMA","CDMA 2000 Architecure","3G Architecture,UTRAN Architecture,UMTS call flow",
                        "Mpirical - UMTS Architecture","HSPA","HSDPA Part-1","HSDPA Tutorial Artitecture ",
                        "HSDPA Part-2","3.5G-HSDPA-HSUPA","4G LTE Fundamentals",

                        "What Is a Millimeter Wave","LTE-A :super fast mobile internet","What is LTE-A?"
};


                String [] mcvl = new String[]{"CI9No9Ci9Ro","kFyGLMbcEUE","rcOOV91u0Ec","qNSaaRRkEnQ","e7nJeSwB4a0","lmg2ac5ulzM","1rcCLfdR5qs","Y3iHxIs1U3g","b7ey2upDhRw","MSKYeWfsNO0","goaKvjma-JU","3d_SZ-kE7o0","s83CsDGy93o","iPpf_IUClV8",

                        "-yxvoC9eF_s","oLRS-T2dRxQ","MEb4o6BTWds","rQ4ctUmLroU",
                        "QwysfvdOjPg","YakX_VDWBbs","CJSztdNjZ_M","GfcRJPkzKBE","0xz6blleW-0",

                        "OugelY2TWEs","EfuK92TEwQY","CEOpQUDamQM","33Cqp6Lduj8","rcrBweP_jRE","omEJygDEizU","Su0--12TfFE","tCe8PTl0Yf8","rc6yAf9o5Dg","d7l5NbFfBiU","rKy5dOl3Et4","SKTVtzqIJ7Y","hDHN7ZJP83Q","fgWXs5r79k0",

                        "HEFufDM9bX8","cunY_lzkg2c","tqILv_RYVGw","S2HYOvh2kww","21I3PK0Ps4U","SI4O8PGTW-U","wQtIGVTj1RQ","xAaxx8alU3c","tfmJ7tY9Sxo","CPUGp79x70Q",


                        "FjfnUc318P8","pnqYKG50g1g","5BkyVJDOWuo","LOHDXiSIUZc","sFzeeP1CHUE","kNVoFasRuho","qNddSi0wugw","_PdwMmsyAro","H77W-gKQFGU","9YS7YXVTXmo","xMN-zkArD-I","zOC53GC4XQY","oLLdAHXiAGA",

                        "pRtyQWhXZzA","VtFayPTMQDQ","817S22-d16k"
                };


                for (int i=0;i<mcTopics.length;i++) {
                    if (text.equals(mcTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",mcvl[i]);
                        context.startActivity(intent);
                    }
                }


                //OR

                String [] orvl = new String[]{"8IRrgDoV8Eo","O6QO3J_85as","M8POtpPtQZc","_eMA0LWsRQQ","tlyrxudvEa0","HPoCW06WE2w","Dq1b_N4q5go"
                        ,"zJhncZ5XUSU","ItOuvM2KmD4","-w2z3MVTcQA","rrfFTdO2Z7I","Hf7MHFEegI0","-0DEQmp7B9o"};

                String [] orTopics = new String[]{"Graphical LPP with two Constraints","Graphical LPP with three Constraints","LPP Simplex Method",
                        "Infeasibility and Unbounded Solutions",

                        "Duality in LPP","Primal to Dual Conversion","LPP Dual Simplex","Two phase Simplex Method",

                        "The Transportation Problem (All 3 Methods)","Transportation Problem MODI method - U V method",
                        "Assignment Problem Hungarian Method 1","Assignment Problem Unbalanced Matrix","Assignment Problem Hungarian Method Diagonal Rule"};

                // Toast.makeText(context, "login", Toast.LENGTH_SHORT).show();

                for (int i=0;i<orTopics.length;i++) {
                    if (text.equals(orTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",orvl[i]);
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
