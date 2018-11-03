package com.dexterlabs.khand.engineeringmanager.SecondYear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SeVidMain extends AppCompatActivity{


    private ExpandableListView expandableListView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_tuts);

        // Banner Ads
     AdView  mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        if (getIntent() != null) {

            String info = getIntent().getStringExtra("dept");

            if (info.equals("comp"))
            {
                String[] parent = new String[]{"Data Structures and Algorithms",
                        "Object Oriented Programming",
                        "DELD", "Discrete Mathematics",
                        "Computer Organization and Architecture"};

                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};


                //Each subject Topics Array to be added here


                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();

                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                secondLevel.add(q4);
                secondLevel.add(q5);



                //Add topics to each units

                //DSA

                String[] dsau1topics = new String[] {"What is Algorithm","Characteristics of algorithm","Algorithm design tools: Pseudo code and flowchart","Analysis of algorithm, Complexity of algorithm: Space and Time complexity",
                        "Best Average and worst Case","Big Oh,Omega,Theta Notation","Data Structure ADT",
                        "Concept of Linear and Non Linear","Static and Dynamic Data Structure","Persistent and Ephemeral data structures","Divide and Conquer",
                        "Merge Sort","Quick Sort","Tower of Hanoi","Binary Search","Greedy Algorithm","Job Sequencing","Graph Color Problem","KnapSack Problem"};

                String[] dsau2topics =new String[]{"Array as an ADT",
                        "Inserting elements in an Array",
                        "Deleting elements in an Array",
                        "Row Major and Column Major Arrays",
                        "Multi Dimensional Arrays",
                        "Representation of Sparse Matrix"};



                String[] dsau3topics = new String[] {"Linked List Basics","Insertion at start,middle and last position of singly linked list",
                        "Deletion at start,middle and last position of singly linked list","Concatenation of two linked list",
                        "Inversion of link List","Merging of two sorted linked list","Removing duplicate elements from Linked List",
                        "Searching element in linked list","Count number of nodes in linked List","Circular Linked List","Doubly Linked List",
                        "Addition of two polynomial Linked List","Concept of Skip List","Sets operation implemented by Linked List","Memory Allocation"};

                String[] dsau4topics =new String[]{"Stack ADT",
                        "Representation of Stack",
                        "Stack Operations",
                        "Multiple Stacks",
                        "Polish Notation","Infix to Postfix Conversion",
                "Infix to Prefix Conversion","Linked Stacks and Operations"};


                String[] dsau5topics = new String[] {"Queue as Abstract data type","Realization of queue using Arrays",
                        "Realization of queue using Linked List","Circular queue and its Advantages","Implementation of Circular Queue using Array",
                        "Dequeue","Priority Queue"};

                String[] dsau6topics = new String[] {"Sorting","Insertion Sorting","Bubble Sort","Selection Sort","Quick Sort","Quick Sort Analysis",
                        "Merge Sort","Merge Sort Analysis","Bucket Sort","Radix Sort","Shell Sort","Heap Sort"};


                thirdLevelq1.put(q1[0], dsau1topics);
                thirdLevelq1.put(q1[1], dsau2topics);
                thirdLevelq1.put(q1[2], dsau3topics);
                thirdLevelq1.put(q1[3], dsau4topics);
                thirdLevelq1.put(q1[4], dsau5topics);
                thirdLevelq1.put(q1[5], dsau6topics);




                //OOP

                String[] oopu1topics = new String[] {"Basics of OOPS","Data Types","Functions","Call by value & Call by Reference",
                        "Inheritance and Polymorphism","Class, access Specifiers and difference between Structure and Class","Object and Encapsulation","Constructors"};


                String[] oopu2topics = new String[] {"Polymorphism","Implicit and explicit","Operator overloading","Inheritance"};

                String[] oopu3topics = new String[] {"Virtual functions","Linked List","Program on Linked List","new and delete operators","Pointers",
                        "This Pointers","Virtual Destructor","Smart Pointers"};

                String[] oopu4topics = new String[] {"Templates Part-1","Templates Part-2","Templates Part-3","Exception handling Part-1","Exception handling Part-2",
                        "Exception handling Part-3","Exception handling Part-4","Exception handling Part-5","Exception handling Part-6","Exception handling Part-7"};

                String[] oopu5topics = new String[] {"Files Part-1","Files Part-2","Files Part-3","Files Part-4","Early binding vs late binding"};

                String[] oopu6topics = new String[] {"Introduction of STL","Sequence Container","Associative Container","Iterators","Heap sort","Set Operation"};

                thirdLevelq2.put(q2[0], oopu1topics);
                thirdLevelq2.put(q2[1], oopu2topics);
                thirdLevelq2.put(q2[2], oopu3topics);
                thirdLevelq2.put(q2[3], oopu4topics);
                thirdLevelq2.put(q2[4], oopu5topics);
                thirdLevelq2.put(q2[5], oopu6topics);


                //DELD

                String[] deldu1topics = new String[]{"SOP Form","POS Form","SOP and POS examples","Quine-Mccusky Technique","Gray Code to Binary Code",
                        "Excess to BCD","BCD to Excess","Excess 3 to binary","Binary to excess 3","Combinational and sequential Circuits",
                        "Half Adder","Full Adder","Half Subtractor","Full Subtractor","BCD Adder","Carry Look ahead Adder Generator","Carry Lookahead Adder Generator Part-2",
                        "Introduction to multiplexer","MUX Tree","Demultiplexer","Demux Tree","Introduction to Encoder and decoder","Demultiplexer Decoder",
                        "SOP and POS using Multiplexer","SOP and POS using Demultiplexer","Comparators","Parity generators and checker","Priority Encoder"};

                String[] deldu2topics = new String[]{"SR Flip-Flop","Realization,truth table,excitation table of SR FF","D Flip-Flop","Realization,truth table,excitation table of D Flip-Flop",
                        "JK Flip-Flop","Realization,truth table,excitation table of JK Flip-Flop","Race condition in JK FF","T Flip-Flop","Realization,truth table,excitation table of T Flip-Flop",
                        "Preset and Clear","Master and slave FF","Conversion of flip flops","Registers","Introduction to counter","State diagram of counter",
                        "Ring Counter","Johnson Counter","Synchronous Counter","Asynchronous Counter","BCD Counter","Modulus of the counter","Construction of Moore Machine","Construction of Mealy Machine"};

                String[] deldu3topics = new String[]{"ASM Chart","Sequence Generator","Types of Counters","VHDL Basics","VHDL attribute","VHDL architecture"};

                String[] deldu4topics = new String[]{"Programmable Logic Devices","PLA","PAL"};

                String[] deldu5topics = new String[]{"Logic families: Characteristics and types","Introduction to TTL","Sinking and sourcing","TTL with open collector output"};

                String[] deldu6topics = new String[]{"Microcontroller 8051 Introduction","Microcontroller 8051 Architecture","8051 Special Function Register","8051 Serial Communication","8051 Interrupts",
                        "DAC ADC Interfacing with 8051"};




                thirdLevelq3.put(q3[0], deldu1topics);
                thirdLevelq3.put(q3[1], deldu2topics);
                thirdLevelq3.put(q3[2], deldu3topics);
                thirdLevelq3.put(q3[3], deldu4topics);
                thirdLevelq3.put(q3[4], deldu5topics);
                thirdLevelq3.put(q3[5], deldu6topics);


                //COA

                String[] coau1topics = new String[]{"Floating point representation and operations","Addition and subtraction Part-1","Addition and subtraction Part-2",
                        "Multiplication","Multiplication Part-2","Booth's Algorithm","Carry Look ahead Adder"};

                String[] coau2topics = new String[]{"Cache Memory Introduction","Cache Memory Mapping-Direct Mapping","Cache Memory Mapping-Associative Mapping",
                        "Cache Memory Mapping-Set Associative Mapping","Cache Replacement Techniques","Level 1 and level 2 cache","Internal memory","RAID levels"};

                String[] coau3topics = new String[]{"I/O Interface","Programmed I/O","Memory Mapped I/O Part-1","Memory Mapped I/O Part-2","Interrupt Controlled I/O",
                        "DMA Part-1","DMA Part-2","DMA Controller"};

                String[] coau4topics = new String[]{"Addressing Modes","Addressing Modes Part-2","Data transfer Instruction","Arithmetic Instruction","Logical Instruction",
                        "I/O Instructions","Information format"};

                String[] coau5topics = new String[]{"Processor Organizaton","Register Organization","Instruction Cycle","Instruction Pipelining",
                        "Instruction Level Parallelism","SuperScalar Processor"};

                String[] coau6topics = new String[]{"Register Transfer","Arithmetic an logical operations","Micro Instructions"};

                thirdLevelq5.put(q5[0], coau1topics);
                thirdLevelq5.put(q5[1], coau2topics);
                thirdLevelq5.put(q5[2], coau3topics);
                thirdLevelq5.put(q5[3], coau4topics);
                thirdLevelq5.put(q5[4], coau5topics);
                thirdLevelq5.put(q5[5], coau6topics);


                //DM

                String[] dmu1topics = new String[]{"Naive Set Theory","Representation of sets","Set Operations Part-1","Set Operations Part-2","Inclusion and Exclusion Principle",
                        "Cardinality of Sets","Types of Sets","Propositional Equivalence","Propositional Logic","Mathematical Induction","Strong Mathematical Induction"};

                String[] dmu2topics = new String[]{"Relation Introduction","Relation Properties","Relation Closure","Equivalence Relation",
                        "Partial Ordering","Hasse Diagram","Lattice","Transitive Closure using Warshal Algorithm","Surjective, Injective and Bijective functions",
                        "Functions","Pigeon Hole Principle"};

                String[] dmu3topics = new String[]{"Rule of sum and product","Permutations and Combinations","Generalized Permutation","Generalized Combination",
                        "Binomial Theorem and Pascal's Triangle","Binomial Coefficients and Identities"};

                String[] dmu4topics = new String[]{"Introduction to Graph Theory","Euler paths and circuits","Hamiltonian paths and circuits",
                        "Shortest path in weighted graph(Dijkstra’s algorithm)","Graph coloring"};

                String[] dmu5topics = new String[]{"Introduction to Trees","Binary Search tree","Decision Tree","Huffman Coding",
                        "Spanning and Minimum spanning Tree","Prim's Algorithm","Kruskal's Algorithm","Max-flow Min-cut Problem"};

                String[] dmu6topics = new String[]{"Introduction to Algebraic Structure","Homomorphism and Isolation","Rings","Polynomial Rings"};

                thirdLevelq4.put(q4[0], dmu1topics);
                thirdLevelq4.put(q4[1], dmu2topics);
                thirdLevelq4.put(q4[2], dmu3topics);
                thirdLevelq4.put(q4[3], dmu4topics);
                thirdLevelq4.put(q4[4], dmu5topics);
                thirdLevelq4.put(q4[5], dmu6topics);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                data.add(thirdLevelq4);
                data.add(thirdLevelq5);


                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                      //  Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });


            }
            else if(info.equals("it"))
            {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
                String[] des3 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des4 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des5 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


                thirdLevelq2.put(q2[0], des3);
                thirdLevelq2.put(q2[1], des4);
                thirdLevelq2.put(q2[2], des2);
                thirdLevelq2.put(q2[3], des1);
                thirdLevelq3.put(q3[0], des5);

                thirdLevelq3.put(q3[1], des4);
                thirdLevelq3.put(q3[2], des2);
                thirdLevelq3.put(q3[3], des1);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                      //  Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });


            }
            else if(info.equals("mech")) {
                String[] parent = new String[]{" Manufacturing Process- I ",
                        "Thermodynamics", "Material Science",
                        "Strength of Materials"};


                String[] q1 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q2 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q3 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q4 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};
                String[] q5 = new String[]{"Unit 1", "Unit 2", "Unit 3", "Unit 4","Unit 5", "Unit 6"};


               //
                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq4 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq5 = new LinkedHashMap<>();

                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                secondLevel.add(q4);
                secondLevel.add(q5);


                //mpro1
                String[] mpro1u1topics = new String[] {"Casting Process",
                        "Manufacturing and Production Casting"};

                String[] mpro1u2topics= new String[]{"FORMING PROCESSES",
                        "Hot & Cold Working Processes"};

                String[] mpro1u3topics= new String[]{"Plastic Manufacturing Processes",
                        "Injection Molding Animation"};

                String[] mpro1u4topics= new String[]{"Classification of Welding processes",
                        "Types of Welding Processes"};

                String[] mpro1u5topics= new String[]{"Sheet metal operations part-1",
                        "Sheet metal operations part-2"};

                String[] mpro1u6topics= new String[]{"Introduction","Construction of centre lathe",
                        "Types of  lathe operations"};

                thirdLevelq1.put(q1[0], mpro1u1topics);
                thirdLevelq1.put(q1[1], mpro1u2topics);
                thirdLevelq1.put(q1[2], mpro1u3topics);
                thirdLevelq1.put(q1[3], mpro1u4topics);
                thirdLevelq1.put(q1[4], mpro1u5topics);
                thirdLevelq1.put(q1[5], mpro1u6topics);



                //thermo

                String[] thermou1topics= new String[]{"Laws","Basic Thermo-dynamics",
                        "Fundamentals of thermodynamics"};
                String[] thermou2topics=  new String[]{"Entropy","Ideal gas","Ideal Gas Laws"};

                String[] thermou3topics= new String[]{"Gas Power Cycles",
                        "Refrigeration Cycles-Reversed Carnot Cycle",
                        "Bell Coleman Air Refrigeration Cycle","Availability"};
                String[] thermou4topics= new String[]{"Properties of pure substances,steam table",
                        "Properties of Pure Substances-I","Properties of Pure Substances-II",
                        "Thermodynamic Vapour Cycle","Vapor Power Cycle-II",
                        "Vapour Power Cycle-III"};
                String[] thermou5topics=  new String[]{"Steam Genarator"};

                String[] thermou6topics= new String[]{"Psychrometric Processes-1",
                        "Psychrometric Processes-2"};


                thirdLevelq2.put(q2[0], thermou1topics);
                thirdLevelq2.put(q2[1], thermou2topics);
                thirdLevelq2.put(q2[2], thermou3topics);
                thirdLevelq2.put(q2[3], thermou4topics);
                thirdLevelq2.put(q2[4], thermou5topics);
                thirdLevelq2.put(q2[5], thermou6topics);





                //Material Science

                String[] msu1topics= new String[]{"Structure of Materials Part-I",
                        "Structure of Materials Part-II"};

                String[] msu2topics= new String[]{"Mechanical behaviour of metals"};

                String[] msu3topics= new String[]{"Destructive and Non destructive Testing",
                        "DT & NDT"};

                String[] msu4topics= new String[]{"Types of corrosion","Prevention of corrosion",
                        "Corrosion Protection Mechanisms",
                        "Corrosion protection (Inhibitors and coatings)","Cavitation"};

                String[] msu5topics= new String[]{"Electroplating","Pvd","Cvd"};

                String[] msu6topics= new String[]{"Metal powder and powder metallurgy technology",
                        "Self lubricating bearings"};


                thirdLevelq3.put(q3[0], thermou1topics);
                thirdLevelq3.put(q3[1], thermou2topics);
                thirdLevelq3.put(q3[2], thermou3topics);
                thirdLevelq3.put(q3[3], thermou4topics);
                thirdLevelq3.put(q3[4], thermou5topics);
                thirdLevelq3.put(q3[5], thermou6topics);


                //SOM

                String[] somu1topics= new String[]{"Types of Stresses - Stress and Strain","Hooke's Law"};


                String[] somu2topics=  new String[]{"Concept of Shear Force and Bending Moment Diagram",
                        "Types of Beams and Loading - Shear Force and Bending Moment Diagram"};



                String[] somu3topics= new String[]{"Bending stresses","Shear stresses"};


                String[] somu4topics= new String[]{"Slope and Deflection in Beams"};


                String[] somu5topics=  new String[]{"Torsion","Buckling"};


                String[] somu6topics= new String[]{"Concept- Principal stresses and strains","Principal Stresses and Planes"};


                thirdLevelq4.put(q4[0], somu1topics);
                thirdLevelq4.put(q4[1], somu2topics);
                thirdLevelq4.put(q2[2], somu3topics);
                thirdLevelq4.put(q4[3], somu4topics);
                thirdLevelq4.put(q4[4], somu5topics);
                thirdLevelq4.put(q4[5], somu6topics);

                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                data.add(thirdLevelq4);
              //  data.add(thirdLevelq5);



                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });

            }
                else if(info.equals("civil")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
                String[] des3 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des4 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des5 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


                thirdLevelq2.put(q2[0], des3);
                thirdLevelq2.put(q2[1], des4);
                thirdLevelq2.put(q2[2], des2);
                thirdLevelq2.put(q2[3], des1);
                thirdLevelq3.put(q3[0], des5);

                thirdLevelq3.put(q3[1], des4);
                thirdLevelq3.put(q3[2], des2);
                thirdLevelq3.put(q3[3], des1);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                       // Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });
            }


else if(info.equals("ele")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
                String[] des3 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des4 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des5 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


                thirdLevelq2.put(q2[0], des3);
                thirdLevelq2.put(q2[1], des4);
                thirdLevelq2.put(q2[2], des2);
                thirdLevelq2.put(q2[3], des1);
                thirdLevelq3.put(q3[0], des5);

                thirdLevelq3.put(q3[1], des4);
                thirdLevelq3.put(q3[2], des2);
                thirdLevelq3.put(q3[3], des1);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                      //  Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });

            }
else if(info.equals("entc")) {
                String[] parent = new String[]{"Subject name daalo 1", "Subject name daalo 2", "Subject name daalo 3"};

                String[] q1 = new String[]{"u 1", "u 2", "u 3", "u 4"};

                String[] q2 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] q3 = new String[]{"u 1", "u 2", "u 3", "u 4"};
                String[] des1 = new String[]{"blah blah blah"};
                String[] des2 = new String[]{"blah blah blah links dhundo re blah blah blah", "asdfasdfasdfasdfasdf asfdsadfasfadsf", "login", "123", "123", "login", "123", "123", "123"};
                String[] des3 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des4 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};
                String[] des5 = new String[]{"blah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blahblah blah blah"};

                LinkedHashMap<String, String[]> thirdLevelq1 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq2 = new LinkedHashMap<>();
                LinkedHashMap<String, String[]> thirdLevelq3 = new LinkedHashMap<>();
                /**
                 * Second level array list
                 */
                List<String[]> secondLevel = new ArrayList<>();
                /**
                 * Inner level data
                 */
                List<LinkedHashMap<String, String[]>> data = new ArrayList<>();


                secondLevel.add(q1);
                secondLevel.add(q2);
                secondLevel.add(q3);
                thirdLevelq1.put(q1[0], des1);
                thirdLevelq1.put(q1[1], des2);
                thirdLevelq1.put(q1[2], des2);
                thirdLevelq1.put(q1[3], des1);


                thirdLevelq2.put(q2[0], des3);
                thirdLevelq2.put(q2[1], des4);
                thirdLevelq2.put(q2[2], des2);
                thirdLevelq2.put(q2[3], des1);
                thirdLevelq3.put(q3[0], des5);

                thirdLevelq3.put(q3[1], des4);
                thirdLevelq3.put(q3[2], des2);
                thirdLevelq3.put(q3[3], des1);


                data.add(thirdLevelq1);
                data.add(thirdLevelq2);
                data.add(thirdLevelq3);
                expandableListView = (ExpandableListView) findViewById(R.id.expandible_listview);
                //passing three level of information to constructor


                SeVidThirdAdapter seVidThirdAdapter = new SeVidThirdAdapter(this, parent, secondLevel, data);

                expandableListView.setAdapter(seVidThirdAdapter);
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                        //Toast.makeText(SeVidMain.this, "abra ka dabra", Toast.LENGTH_SHORT).show();
                    }


                });
            }



            }

    }
    }