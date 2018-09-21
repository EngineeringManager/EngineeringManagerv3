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
                //SE Comp OOP
                String[] oopTopics = new String[] {"Basics of OOPS","Data Types","Functions","Call by value & Call by Reference","Inheritance and Polymorphism","Class, access Specifiers and differnece between Structure and Class","Object and Encapsulation","Constructors",
                        "Polymorphism","Implicit and explicit","Operator overloading","Inheritance",
                        "Virtual functions","Linked List","Program on Linked List","new and delete operators","Pointers","This Pointers","Virtual Destructor","Smart Pointers",
                        "Templates Part-1","Templates Part-2","Templates Part-3","Exception handling Part-1","Exception handling Part-2","Exception handling Part-3","Exception handling Part-4","Exception handling Part-5","Exception handling Part-6","Exception handling Part-7",
                        "Files Part-1","Files Part-2","Files Part-3","Files Part-4","Early binding vs late binding",
                        "Introduction of STL","Sequence Container","Associative Container","Iterators","Heap sort","Set Operation"};


                String[] oopvl = new String[] {"xoL6WvCARJY","eyB2Ikcc5oI","7BVt6OGfVfQ","Xs22zOBfaoM","nmq3PkD1gEU","_cbfR690u74","mgU_ZAX7Gbs","TrX3T2sdxO4",
                        "AbsNVnEh9Mc","Rr1NX1lH3oE","vx-zQv6t8UY","gyog4lPniJY",
                        "84yOn9_rLy4","xiIoa2rfAaQ","VmWvpwxa-rM","sRBB_qX4lKY","SVTLTK5gbDc","wA8LriKDBAI","6mV5kJvQiPM","UOB7-B2MfwA",
                        "8XTMa3GhZwg","6ehVekmFXGw","xJJnycYjZIE","p-yMXd7q8p8","08lp4Kjl-ZE","I3Nh-lU-mjg","Q0mH6CpjXaI","JdQiOgaVn50","t6eW5_nCSi0","YAcvYwScL0E",
                        "CXxggQQez6k","3LLGDvKAEwI","QOWilc0P124","go4R0hEeOJs","gOSGWJccu_8",
                        "ltBdTiRgSaw","gxZJ5JNuWMY","6iyzPed7FrM","vO2AlrBf5rQ","MtQL_ll5KhQ","PKE_Y9_gHMo"};


                for (int i=0;i<oopTopics.length;i++) {
                    if (text.equals(oopTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",oopvl[i]);
                        context.startActivity(intent);
                    }
                }



                //COA

                String[] coatopics = new String[] {"Floating point representation and operations","Addition and subtraction Part-1","Addition and subtraction Part-2","Multiplication","Multiplication Part-2","Booth's Algorithm","Carry Look ahead Adder",
                        "Cache Memory Introduction","Cache Memory Mapping-Direct Mapping","Cache Memory Mapping-Associative Mapping","Cache Memory Mapping-Set Associative Mapping","Cache Replacement Techniques","Level 1 and level 2 cache","Internal memory","RAID levels",
                        "I/O Interface","Programmed I/O","Memory Mapped I/O Part-1","Memory Mapped I/O Part-2","Interrupt Controlled I/O","DMA Part-1","DMA Part-2","DMA Controller",
                        "Addressing Modes","Addressing Modes Part-2","Data transfer Instruction","Arithmetic Instruction","Logical Instruction","I/O Instructions","Information format",
                        "Processor Organization","Register Organization","Instruction Cycle","Instruction Pipelining","Instruction Level Parallelism","SuperScalar Processor",
                        "Register Transfer","Arithmetic an logical operations","Micro Instructions"};


                String[] coavl = new String[] {"MjtGxiUVYoc","R_tsDVubQPo","bQOOsrE11gc","B2bKdGf1Qoc","b_azyJ4ZgVo","DIp4GqSCZho","_bJ53XErKY8",
                        "Zr8WKIOIKsk","4i_UQ2j2ynQ","fyO65HAevmM","jLwButRLEvI","4oipqcYHWOI","yEzsllt1MBQ","6MdYFeR4gEY","KmbEjYVtByQ",
                        "b9frb09L2kU","wEUosksGZAs","1cqdt5RJGWo","mQRjyWkswv4","vEXX5DJT7vk","NrvlS_gEOKw","ekDTXGtQfBk","ltvpkuQRZao",
                        "quIaPfpTq70","wQ_25VnF01s","uyMrdBAskPc","uyMrdBAskPc","fZKGqRB4SjE","LNxGnzd1MlQ","U5zFuIw3Dik",
                        "i76ectZZ3_8","vjqnWn5PdD0","SFsnysyVhzA","th2wcy0zJ-o","BWmljynuhYo","ZUhJu84LMQo",
                        "d3y7wx-tHTE","q9oRTnE0HK4","U1QGlyfmACM"};

                for (int i=0;i<coatopics.length;i++) {
                    if (text.equals(coatopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",coavl[i]);
                        context.startActivity(intent);
                    }
                }


                //DELD

                String[] deldtopics = new String[] {"SOP Form","POS Form","SOP and POS examples","Quine-Mccusky Technique","Gray Code to Binary Code","Excess to BCD","BCD to Excess","Excess 3 to binary","Binary to excess 3","Combinational and sequential Circuits","Half Adder","Full Adder","Half Subtracter","Full Subtracter","BCD Adder","Carry Lookahead Adder Generator","Carry Lookahead Adder Generator Part-2","Introduction to multiplexer","MUX Tree","Demultiplexer","Demux Tree","Introduction to Encoder and decoder","Demultiplexer Decoder","SOP and POS using Multiplexer","SOP and POS using Demultiplexer","Comparators","Parity generators and checker","Priority Encoder",
                        "SR Flip-Flop","Reaization,truth table,excitation table of SR FF","D Flip-Flop","Reaization,truth table,excitation table of D Flip-Flop","JK Flip-Flop","Reaization,truth table,excitation table of JK Flip-Flop","Race condition in JK FF","T Flip-Flop","Reaization,truth table,excitation table of T Flip-Flop","Preset and Clear","Master and slave FF","Conversion of flip flops","Registers","Introduction to counter","State diagram of counter","Ring Counter","Johnson Counter","Synchronous Counter","Asynchronous Counter","BCD Counter","Modulus of the counter","Construction of Moore Machine","Construction of Mealy Machine",
                        "ASM Chart","Sequence Generator","Types of Counters","VHDL Basics","VHDL attribute","VHDL architecture",
                        "Programmable Logic Devices","PLA","PAL","Microcontroller 8051 Introduction","Microcontroller 8051 Architecture","8051 Special Function Register","8051 Serial Communication","8051 Interrupts",
                        "DAC ADC Interfacing with 8051"
                };


                String[] deldvl = new String[] {"xnLBbOYYnHM","nXsiLPJfDZ4","K2cpJex0o_A","l1jgq0R5EwQ","gycwsaUbzMI","MSQzgNnS-DI","tfA_9ejSJhc","OLnHaOxXqUc","tfA_9ejSJhc","SzV4I0_1MCQ","aLUY-s7LSns","RK3P9L2ZXk4","SV4VTYWxKV4","dBXGGWbtt6U","9O7OJi7RCLQ","6Z1WikEWxH0","9lyqSVKbyz8","FKvnmxte98A","_nd77x1ooGQ","t3Ed13z9uz8","4kgPMT9k3bg","feBvhLFQEDk","vMvvggyriCc","vOFeSu6Zr94","rAxf5gQlfuY","BhUUmbz76P0","DdMcAUlxh1M","kEj-m3YuGa4",
                        "HZg7fNu-l24","uiKKRPZbuXA","dnfXXpW7tIw","4c6z9RKrC8Q","j6krFp511HA","lnQD2_M9uDI","trPGhO7MPnw","wcfnEla_Y78","9mh-2QwxmF4","mXoQ4WAQ0qk","t2LZtaNck_g","ApJ972OYyXQ","wu6q_D_xqhQ","iaIu5SYmWVM","mq0rLKpkjAQ","yOW-JsJL1Ks","X4mx7J1ckyU","5vkWccb7uO4","s1DSZEaCX_g","fKVZpupyP_o","l20xHDJPHBM","MFnRF07SoFo","LioitkXDfmA",
                        "HjD5mVbbBK4","Wz7hF4DZz6Q","yqg1sqhZG3M","BDq8-QDXmek","S230ViKmXQc","xYo92g3gEoI",
                        "-d6nLpiLmls","jrQ1YYgiOTo","qlq4NHk5Y_w",   "GPz_mR7Flas","O-UALuVyyLY","zzr0zLLeCQw","J_7yRXOXoso","rUSkQ0Bc6ms",
                        "N8IlGfClDEo"};

                for (int i=0;i<deldtopics.length;i++) {
                    if (text.equals(deldtopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",deldvl[i]);
                        context.startActivity(intent);
                    }
                }




                //DM

                String[] dmtopics = new String[] {"Naive Set Theory","Representation of sets","Set Operations Part-1","Set Operations Part-2","Inclusion and Exclusion Principle","Cardinality of Sets","Types of Sets","Propositional Equivalence","Propositional Logic","Mathematical Induction","Strong Mathematical Induction",
                        "Relation Introduction","Relation Properties","Relation Closure","Equivalence Relation","Partial Ordering","Hasse Diagram","Lattice","Transitive Closure using Warshal Algorithm","Surjective, Injective and Bijective functions","Functions","Pigeon Hole Principle",
                        "Rule of sum and product","Permutations and Combinations","Generalized Permutation","Generalized Combination","Binomial Theorm and Pascal's Triangle","Binomial Coefficients and Identities",
                        "Introduction to Graph Theory","Euler paths and circuits","Hamiltonian paths and circuits","Shortest path in weighted graph(Dijkstra’s algorithm)","Graph coloring",
                        "Introduction to Trees","Binary Search tree","Decision Tree","Huffman Coding","Spanning and Minimum spanning Tree","Prim's Algorithm","Kruskal's Algorithm","Max-flow Min-cut Problem",
                        "Introduction to Algebraic Structure","Homomorphism and Isolation","Rings","Polynomial Rings"};

                String[] dmvl = new String[] {"TWgSVuLHzLA","HNk293pQTHo","4TlCToZZ5gA","6RsudHXe6ZM","GS7dIWA6Hpo","r1bgHFpfNWg","au75IJZtLDk","NHXRUURXazQ","itrXYg41-V0","1r0VyAOrHlI","rfA0h9udl7E",
                        "6WFRBUv4hqI","T7uSfImqFNs","IM2NNqwN99s","F31g1VwtvZ4","LUjb0tgE_uo","KVdzsIjLTQk","BSWIgyPApqs","Hu4pEt-TGJo","bZred_Ksz2k","OixshZzH8t0","2-mxYrCNX60",
                        "t0us-MXrFZg","zJx6Drzvdi4","rB_0gYwumxc","Z1Lk7rTLzs0","stfqYC13bSY","suj6XYC7Z-I",
                        "HkNdNpKUByM","a3MlerhXntw","pUOMcQ2mRKY","qx9sJ3O3JM0","4FE79y_JkCE",
                        "zEQZpTizgLo","7EYf2XhxB4s","jzoDKtnTPpg","hOabRMHzpo8","fXvQFE5siAI","xENj6Ns3CfU","fAuF0EuZVCk","7jFoyLk2VjM",
                        "g7bxPnwj_N4","dqrZO8bY_eI","CerTQa_ksh0","mhtr51hbXT4"};

                for (int i=0;i<dmtopics.length;i++) {
                    if (text.equals(dmtopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",dmvl[i]);
                        context.startActivity(intent);
                    }
                }


                String[] dsaTopics = new String[] {"What is Algorithm","Characteristics of algorithm","Algorithm design tools: Pseudo code and flowchart","Analysis of algorithm, Complexity of algorithm: Space and Time complexity","Best Average and worst Case","Big Oh,Omega,Theta Notation","Data Structure ADT","Concept of Linear and Non Linear","Static and Dynamic Data Structure","Persistent and Ephemeral data structures","Divide and Conquer","Merge Sort","Quick Sort","Tower of Hanoi","Binary Search","Greedy Algorithm","Job Sequencing","Graph Color Problem","KnapSack Problem",
                        "Array as an ADT",
                        "Inserting elements in an Array",
                        "Deleting elements in an Array",
                        "Row Major and Column Major Arrays",
                        "Multi Dimensional Arrays",
                        "Representation of Sparse Matrix",
                        "Linked List Basics","Insertion at start,middle and last position of singly linked list",
                        "Deletion at start,middle and last position of singly linked list","Concatenation of two linked list",
                        "Inversion of link List","Merging of two sorted linked list","Removing duplicate elements from Linked List",
                        "Searching element in linked list","Count number of nodes in linked List","Circular Linked List","Doubly Linked List",
                        "Addition of two polynomial Linked List","Concept of Skip List","Sets operation implemented by Linked List","Memory Allocation",
                        "Stack ADT",
                        "Representation of Stack",
                        "Stack Operations",
                        "Multiple Stacks",
                        "Polish Notation","Infix to Postfix Conversion",
                        "Infix to Prefix Conversion","Linked Stacks and Operations",
                        "Queue as Abstract data type","Realization of queue using Arrays",
                        "Realization of queue using Linked List","Circular queue and its Advantages","Implementation of Circular Queue using Array",
                        "Dequeue","Priority Queue",
                        "Sorting","Insertion Sorting","Bubble Sort","Selection Sort","Quick Sort","Quick Sort Analysis",
                        "Merge Sort","Merge Sort Analysis","Bucket Sort","Radix Sort","Shell Sort","Heap Sort"
                };

                String[] dsavl = new String[] {"6hfOvs8pY1k","FbYzBWdhMb0","-TSOy_-8h3k","9TlHvipP5yA","A_Y4bMFp3bo","6Ol2JbwoJp0","5uTQz43k4gg",
                        "3QBx18dUWjY","hzMH_SFqlms","dSu1BKWnk_E","2Rr2tW9zvRg","7h1s2SojIRw","mB5HXBb_HY8","q6RicK1FCUs","P3YID7liBug","ARvQcqJ_-NY","R6Skj4bT1HE",
                        "_sdVx_dWnlk","m1p-eWxrt6g","M4Ql9DbKO6k","VGRRpT-1CQM","x-Xm8OgRHrw","LwvZQ3zWkPo","OOG25Tu51TM","iqZKBptJV2U",
                        "njTh_OwMljA","hAzTqg8jmWA","4ax5wcsTtmQ","O-VliI7J85U","t0BATPjjP7w","odUJXFJR6Q4","j3Kd06VfJhw","F-mDei8Cnok","abzshwqUamY","8pLwfW9Gov8",
                        "JdQeNxWCguQ","3tDBX4-0Jt4","ypod5jeYzAU","hCPOeTZUvt4","sJOZ3lvJnRI","JmNwR1i8xZo","Zo6ykuemNLc","t35b-8w4Yrg","cJgVdvWz4iU","RE67IIootS4",
                        "vXPL6UavUeA","UK16ttNfGSk","wKHQ0UC5Anw","XuCbpw6Bj1U","okr-XE8yTO8","A5_XdiK4J8A","xQdoA_7k4I4","ArVoZ1KrHDY","kLBuJ1Hle8g","OxhYCLWMdHs",
                        "pkkFqlG0Hds","i-SKeOcBwko","Jdtq5uKz-w4","GUDLRan2DWM","COk73cpQbFQ","3Bbm3Prd5Fo","TzeBrDU-JaY","0nlPxaC2lTw","geVyIsFpxUs",
                        "87ZOHb9NuWM","4fO6PnW1WSs","EuUBxM_E03E"};


                for (int i=0;i<dsaTopics.length;i++) {
                    if (text.equals(dsaTopics[i])) {
                        // Toast.makeText(context, "Child Position:"+getGroupCount(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, YoutubePlayer.class);
                        intent.putExtra("videoLink",dsavl[i]);
                        context.startActivity(intent);
                    }
                }

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
