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


            }
        });


        return convertView;


    }


    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);

        if (getGroup(groupPosition).toString().equals("Unit 4") || getGroup(groupPosition).toString().equals("Unit 5") || getGroup(groupPosition).toString().equals("Unit 6")) {
            Toast.makeText(context,"Working for providing best videos for you. Stay tuned",Toast.LENGTH_SHORT).show();
        }
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
