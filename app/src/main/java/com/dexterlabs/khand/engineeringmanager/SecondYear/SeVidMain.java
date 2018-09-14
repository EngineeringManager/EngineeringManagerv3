package com.dexterlabs.khand.engineeringmanager.SecondYear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.dexterlabs.khand.engineeringmanager.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SeVidMain extends AppCompatActivity{


    private ExpandableListView expandableListView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_tuts);


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

                String[] dsau1topics=new String[]{"sample topic"};
                String[] dsau2topics=new String[]{"st"};
                String[] dsau3topics=new String[]{"st"};

                thirdLevelq1.put(q1[0], dsau1topics);
                thirdLevelq1.put(q1[1], dsau2topics);
                thirdLevelq1.put(q1[2], dsau3topics);




                //OOP

                String[] oopu1topics=new String[]{"sample topic"};
                String[] oopu2topics=new String[]{"st"};
                String[] oopu3topics=new String[]{"st"};
                thirdLevelq3.put(q2[1], oopu1topics);
                thirdLevelq3.put(q2[2], oopu2topics);
                thirdLevelq3.put(q2[3], oopu3topics);


                //DELD

                String[] deldu1topics=new String[]{"sample topic"};
                String[] deldu2topics=new String[]{"st"};
                String[] deldu3topics=new String[]{"st"};
                thirdLevelq2.put(q3[0], deldu1topics);
                thirdLevelq2.put(q3[1], deldu2topics);
                thirdLevelq2.put(q3[2], deldu3topics);


                //COA

                String[] coau1topics=new String[]{"sample topic"};
                String[] coau2topics=new String[]{"st"};
                String[] coau3topics=new String[]{"st"};
                thirdLevelq2.put(q4[0], coau1topics);
                thirdLevelq2.put(q4[1], coau2topics);
                thirdLevelq2.put(q4[2], coau3topics);


                //DM

                String[] dmu1topics=new String[]{"sample topic"};
                String[] dmu2topics=new String[]{"st"};
                String[] dmu3topics=new String[]{"st"};
                thirdLevelq2.put(q5[0], dmu1topics);
                thirdLevelq2.put(q5[1], dmu2topics);
                thirdLevelq2.put(q5[2], dmu3topics);


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