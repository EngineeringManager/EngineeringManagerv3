package com.dexterlabs.khand.engineeringmanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class vidTutSel extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private vidTutSelAdapter adapter;
    List<HomeAdapterList> HomeAdapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidsel);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        // Banner Ads
//        AdView mAdView = (AdView) findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //       this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //drawer.addDrawerListener(toggle);
        //toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 2;



        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));


        HomeAdapterList = new ArrayList<>();

        HomeAdapterList list = new HomeAdapterList("FIRST YEAR",1);
        HomeAdapterList.add(list);
        HomeAdapterList list1 = new HomeAdapterList("Computer Engineering",2);
        HomeAdapterList.add(list1);
        HomeAdapterList list2 = new HomeAdapterList("IT Engineering",3);
        HomeAdapterList.add(list2);
        HomeAdapterList list3 = new HomeAdapterList("Mechanical Engineering",4);
        HomeAdapterList.add(list3);
        HomeAdapterList list4 = new HomeAdapterList("Civil Engineering",5);
        HomeAdapterList.add(list4);
        HomeAdapterList list5 = new HomeAdapterList("Electrical Engineering",6);
        HomeAdapterList.add(list5);
        HomeAdapterList list6 = new HomeAdapterList("E&Tc Engineering",7);
        HomeAdapterList.add(list6);





        adapter = new vidTutSelAdapter(HomeAdapterList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.syllabus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.QuestionPapers) {

            Intent intent= new Intent(vidTutSel.this,QuestionPaper.class);
            startActivity(intent);

        } else if (id == R.id.Practicals) {
            Intent intent= new Intent(vidTutSel.this,Practicals.class);
            startActivity(intent);

        } else if (id == R.id.Syllabus) {
//            Intent intent= new Intent(Syllabus.this,Syllabus.class);
//            startActivity(intent);

        } else if (id == R.id.nav_share) {

            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBodyText = "https://play.google.com/store/apps/details?id=com.dexterlabs.khand.engineeringmanager  \n Download Engineering Manager app from playstore and get access to a variety of SPPU question papers, Practicals and lot more!";
            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject/Title");
            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(intent, "Choose sharing method"));

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:engineeringmanagerinc@gmail.com")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, "engineeringmanagerinc@gmail.com");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
