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

                //DA
                String[] dafinalTopics = new String[] {"Big data Overview","BI vs Data Science","BI Vs Data Science video 2","BI Vs Data Science video 3","Drivers of Big Data","Emerging Big Data Ecosystem and new approach","Emerging Big Data Ecosystem and new approach (hindi)","Data Analytic Life Cycle",
                        "Hypothesis Testing","Intro to HypoThesis Testing","One Sample T-Test","Independent Samples t-Test","Dependent Sample t-Test","Wilcoxon Rank–Sum Test","Type 1 Type 2 errors, Power and Sample Size","ANNOVA","Clustering-Intro","Clustering Overview","K means- Use cases","K means Solved Numerical",
                        "Association Rules- Overview","Association Rules","Market Basket Analysis, Support and Confidence","A-priori Algorithm","Regression","Linear regression","Logistics",
                        "Decision Tree ID3 Algorithm","Decision Tree Solved Example","Decision Tree Solved Example 1","Decision Tree Solved Example 2","Naive Bayes Algorithm Introduction","Naive Bayes Algorithm","Naive Bayes Algorithm Solved Example","Naive Bayes Algorithm with Solved Example 1","Naive Bayes Algorithm Solved Example 2",
                        "Big Data Visualization","Big Data Visualization Techniques","Various Types of Graphs","Big Data Visualization Types in short","Analytical Methods used in Big Data",
                        "Map Reduce Concept","Map Reduce Architecture","What is Hadoop","Hadoop Basics with Architecture","Hadoop Basics with Architecture Part-2","Hadoop Ecosystem","Basics of NOSQL"};


                String[] daFinalvl = new String[] {"GZ5eTtzpIhI","3_ymFyT103I","xHCT4IShYHc","ed2m8gleNbA","KhPW2EypKXQ","1WY63n2XRLM","DfDlNOtb41s","L9uRq8CT5N4",
                        "VK-rnA3-41c","USH2cFhweBo","VPd8DOL13Iw","jyoO4i8yUag","zD3VIBkwc-0","TqCg2tb4wJ0","OhDZIO8vtGw","q48uKU_KWas","2QTeuO0C-fY","UiTermj_Sw0",
                        "YWgcKSa_2ag","P2KZisgs4A4","RiFrbyiYpRs","QN3_wxqnSlw","1D2um4u-BeM","l7n4K12EjY0","GK9XdZaQMpI","CtKeHnfK5uA","7qJ7GksOXoA",
                        "gkse-G7Uvzg","cKl7WV_EKDU","NsmAEmoSRjk","JsbaJp6VaaU","CPqOCI0ahss","jgCl590VwT0","73OO5ze7ETU","zdkma7Lfbbw","uMKu2swUMwI",
                        "1_c18g_Lpu8","NOIfMY0KajE","2RCy5hTxuYA","-3WLwg2V1Ys","qYdNFqWHKQA","PhdRyrmbRYQ","LGTXg8IynlM","9s-vSeWej1U","jijK6GiU528","UVtaxRGjeiE",
                        "1WY63n2XRLM","BgQFJ_UNIgw"};



                for (int i=0;i<dafinalTopics.length;i++) {
                    if (text.equals(dafinalTopics[i])) {
                       // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",daFinalvl[i]);
                        context.startActivity(intent);
                    }
                }


                //AIR
                String[] airfinal = new String[] {"Artificial Intelligence","State Space Search","Search Strategies","Heuristic Search and Strategies","8 puzzle problem","DFS and DFID","Best First Search","Hill Climb","Hill Climb (hindi)","A*","Tabu Search","Pruning",
                        "Backward and Forward chaining","STRIPS","Goal Stack Planning Concept","Block World Problem","State Space Search (Water Jug Problem)","N Queens","Cryptarithmatic Problem (SEND + MORE =MONEY)","Graph Coloring Problem",
                        "Agents and PEAS","WUMPUS","Propositional Logic","FOL","PL vs FOL","Horn Clause","Unification","Unification Algorithm","Convert to FOL Part 1","Rules FOL to CNF","Resolution Graph","Forward Chaining","Backward Chaining","Conceptual Dependency","Knowledge Representation",
                        "NLP and Components of NLP","Steps and Stages in NLP","Statistical Processing Of NLP","Information Retrieval Challenges in Big Data","N-Grams and Stop Words","Learning Agent Architecture","Supervised vs Unsupervised Learning","Supervised Learning","Unsupervised Learning","Reinforced Learning","Artificial Neural Network","Activation Function in ANN","Feed Forward in Neural Network","Feed Back Network","Back Propagation and Error","Agent and PEAS",
                        "Robotics Introduction","Robotic Locomotion","Path Planning for Robots Bug 1","Path Planning for Robots Bug 2","Contact Sensors","Inertial Sensor","Infrared Sensor","Rangefinder Working","Biological Sensors","Human Robot Interface",
                        "Space Robotics","Autonomous Aircraft","Domestic Robots","Mining Automation"};

                String[] finalairvl = new String[] {"2ePf9rue1Ao","gUIiE7gI0Co","xFIKfowHK8E","japhjrVxJdg","9JyBz8-WNO8","W2FFDygadgc","i9NvNJgIlHo","FU6ZzRs6szE","50Z_HdSYjoI","vP5TkF0xJgI","wrkMM6a4S-U","7X_2vRO7YAM",
                        "aVwcNDKXcHU","No9obxdXn6w","PaKRt05Zk50","-NrzPWUnYIE","u9KMMudAQ6M","xFv_Hl4B83A","-UGzrsVFneo","uLD7eKLaJr4",
                        "Aytf8DxatvM","bDu9iNJ8h58","tpDU9UXqsUo","pcV2lL6yNZ8","GS3HKR6CV8E","xLyL7RcPaVQ","k_vRMh82gzU","9hE1CLCzjLM","eaCVH8XWaPc","TR7iWaN_nHQ","-LT96Et6b0A","PBTSdx_C9WM","W5O8QAWu-OM","oL8ApH82s6s","y2HQmvqXON4",
                        "IpBZ01g0pGE","pHiIwQk57dc","o93Qk9uqMD0","znZdfvfarpE","wo9OHUDsP-Y","yfsaJJLNBXk","_2vLGpjxWjY",
                        "WtmL_MRwtMM","qbCC4B5YsbU","3yJTInvfQvw","8eaORgKmmh4","K3c2QytXqwU","svZBH0_qSt0","krAQIFzSIFQ","QZ8ieXZVjuE","Aytf8DxatvM",
                        "C8FX-p6UjsU","l4AMhrXlsaM","MqI60rtctOw","G8oPY9njTXc","4sfzCdJKSiw","MYxvmkgleGY","zq51oZMzyP0","bfld6HKrQLI","Dh6uovuDc80","ewH5A_wtqig",
                        "lJ3wsQjtk1U","-6Yd99dzjpk","bg7-3A2zeyw","POqw0rIJe78"};


                for (int i=0;i<airfinal.length;i++) {
                    if (text.equals(airfinal[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",finalairvl[i]);
                        context.startActivity(intent);
                    }
                }


                //STQA

                String[] stqaFinalTopics = new String[] {"QMS","Software Quality","Software Testing and its Importance","Quality and Productivity","Quality process",
                        "Test Planning","SDLC and STLC","Mutation Testing",
                        "Test Automation","Automation for XP/Agile Model","Selecting Test Tool",
                        "Selenium Tool","Introduction to Selenium RC","Introduction to Selenium Webdriver","Introduction to Selenium Grid","Selenium Tutorial",
                        "ISO 9001","What is Six Sigma","What is Software Quality","Software Quality Assurance","Software Quality Assurance activities","Six Sigma for Software Development",
                        "Isikawa's 7 basic tools","Total Quality Management","Software Quality Metrics"};


                String[] stqaFinalvl = new String[] {"RzpZJzUZo5Y","fhKwJbmaCEg","TDynSmrzpXw","LvCBYQC-3m4",
                        "bN3TqOu0iEg","BTdJP9y8M9o","An7HC1LolDM","cLh3yMKEqHc","RbSlW8jZFe8","t6GgTWlkhXw","n6iGoqMl8Ao","BL4-_tVx2rE","Xspcn2anUcU","QJ2DvvJ9QLc","jcsyJdLbkys","gsHyDIyA3dg",
                        "FDyIcM-AFzU","Kz_7njsDUMQ","fhKwJbmaCEg","M7ZVcQOSVF4","yFa4qIzLFp0","leIlhaUtjm8","NWkFfjJT7ME","YKwcxjUnots","Jj7dLM8cLuE"};


                for (int i=0;i<stqaFinalTopics.length;i++) {
                    if (text.equals(stqaFinalTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",stqaFinalvl[i]);
                        context.startActivity(intent);
                    }
                }



                //DMW

                String[] dmwFinal = new String[] {"Data Mining Introduction","KDD Process and Data Preprocessing","Attribute Types","Data Cleansing Steps","Dealing with Missing Values","Noisy Data and Binning Technique","Data Integration","Data Normalization Min Max","Data Normalisation Z-Score","Data Normalization Decimal Scaling",
                        "Data Warehouse: Introduction and Features","OLTP vs OLAP","Star,Snowflake Schemas","OLAP Operations","Datamarts","Dataware House Architecture","OLAP Servers:ROLAP, MOLAP, HOLAP",
                        "Attributes","Proximity measure of Nominal Attributes","Proximity measure of Binary Attributes",
                        "Proximity measure of Numerical Attributes","Proximity measure of Ordinal Attributes","Euclidean Distance","Cosine Distance",
                        "Apriori Algorithm with Solved Example","FP Tree Algorithm","FP Growth Algorithm","Mining Multilevel Associations","Constraint Based Association",
                        "Classification and Regression","Data Mining and Classification","Decision Tree Algorithm Solved Algorithm","Rule Based Classifier IF THEN Rules","Bayesian Belief Network","KNN Classifier","KNN Solved Example",
                        "Multi classification One vs All","Semi Supervised Classification","Reinforcement Learning","Reinforcement Learning and Elements","Influence Diagram","Cross Validation"};

                String[] finaldmwvl = new String[] {"dvRZ1VYXMJ0","zfF10xcb3uE","ss3mDm3mjsc","p8pdxLU1zMI","LfS2lVLuW6g","DvsGNtqQj08","ZsW6r2zkOYU","peyFnD33uXc","18Rrri7XrIk","OLaotS4mY50",
                        "KgjUsie50WQ","5nGDhp_LrA4","TujtzphdVe0","y-kgrMISYHA","rrIBsKOoj3Q","vKh0JVGvlJk","OjvYMe5ZfaU",
                        "ss3mDm3mjsc","QTOBwmwLNkM","6BMZ-dzwnyM","EDvRw1zA8g4","wVM4SC5IQPs","yM2JbjM2-kU","LbBOvH8Xafo",
                        "l7n4K12EjY0","y8iHL6vKgIo","z3RahyYk68A","fxUFmPfhD6M","C9u-rR1pgOI",
                        "i04Pfrb71vk","AcRNpG37Q8E","cKl7WV_EKDU","_-FC_rJFoaQ","FcN0ZSgXfEQ","MDniRwXizWo","3EQw8awLQJ4",
                        "Jt5wEb_9NFc","tVsVmy6w7FE","e3Jy2vShroE","3yJTInvfQvw","ExVhiEaKD1o","TIgfjmp-4BA"};

                for (int i=0;i<dmwFinal.length;i++) {
                    if (text.equals(dmwFinal[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",finaldmwvl[i]);
                        context.startActivity(intent);
                    }
                }


                //HPC

                String[] finalhpcvl = new String[] {"tWRL2VJL-FA","q7sgzDH1cR8","D7UK46gXhcA",
                        "SUBTVBzCqOw","0_TN845dxUU","Xou32Th2Eos",
                        "fsllCdhWQYc","_HQPf7MoYDg","AcULfKtWfoA","a2hTxkp8mcY","nLipVoZTDCc","w9RpEYDo7Hw",
                        "vmiXjUQ4bZE","h0XY7xEpA7s","dKdUjxv1hGI","gOv7t5yYvmo","0-uajl0skxA","4py-tfXTld8","kpQheszFaEI","YmugJ2SLA5g",
                        "LRm72qmCBRA","P0wOgYasp6w"};

                String[] finalhpctopics = new String[] {"Parallel Computing and types of Architecture","Parallel Computing Basics","Dichotomy of Parallel Computing Platforms",
                        "Data Decomposition Techniques","GPU and its Working","Characteristics of Task",
                        "One to All Broadcast and All to One Reduction","All to All Broadcast and Reduction","Scatter and Gather Definition","Scatter and Gather","All Reduce","Improving Communication Speed in Operations",
                        "Sources of  Overheads in Parallel Programs","Performance metrics for Parallel Systems","Speed Up in Performance","Effect of Granularity on Performance","Matrix Vector Multiplication","Row wise 1D Partitioning","2D Partitioning","Matrix Matrix Multiplication",
                        "Issues in Parallel Sorting Algorithm","One Element per Process"};

                for (int i=0;i<finalhpctopics.length;i++) {
                    if (text.equals(finalhpctopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",finalhpcvl[i]);
                        context.startActivity(intent);

                    }
                }




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
                        ,"zJhncZ5XUSU","ItOuvM2KmD4","-w2z3MVTcQA","rrfFTdO2Z7I","Hf7MHFEegI0","-0DEQmp7B9o",
                        "fSuqTgnCVRg","YJvbxAvxkDc","KUskbAasVCY","VWQIpwLmhGk","nLmhmB6NzcM",
                        "vUMGvpsb8dc","gBmP5rZCFfs","WrAf6zdteXI","U7kXfNnAjcE","M8POtpPtQZc","c-xCQau5hP8","dd8yfvw_Va8","L3mmO7RlQ3M",
                        "7Qd4QIaz-kc","77kYJ9liOSw","uf7mlrEMcXc","8-HJh3jHvA8"};

                String [] orfinalTopics = new String[]{"Graphical LPP with two Constraints","Graphical LPP with three Constraints","LPP Simplex Method","Infeasibility and Unbounded Solutions",
                        "Duality in LPP","Primal to Dual Conversion","LPP Dual Simplex","Two phase Simplex Method",
                        "The Transportation Problem (All 3 Methods)","Transportation Problem MODI method - U V method","Assignment Problem Hungarian Method 1","Assignment Problem Unbalanced Matrix","Assignment Problem Hungarian Method Diagonal Rule",
                        "Game Theory Pure and Mixed Strategy","Game Theory Dominance Property","Game Theory Graphical Method 2 X N","Game Theory Graphical Method N X N","Dynamic Programming Knapsack 0/1",
                        "Critical Path Method","Calculating TF,IF,FF","PERT","Crashing of Project Network","Revisiting Simplex Method","Gomory's Cut Method","Branch and Bound LPP","Monte Carlo Simulation Technique",
                        "Decision Theory Under Uncertainty","Decision Theory Under Risk","Decision Theory : EMV and EVPI","Decision Tree in Decision Theory"};

                // Toast.makeText(context, "login", Toast.LENGTH_SHORT).show();

                for (int i=0;i<orfinalTopics.length;i++) {
                    if (text.equals(orfinalTopics[i])) {
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
