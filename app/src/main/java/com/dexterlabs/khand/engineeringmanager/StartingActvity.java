package com.dexterlabs.khand.engineeringmanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StartingActvity extends AppCompatActivity {

    EditText phoneNumber,email;
    Button send;
    boolean exit = false;
    DatabaseReference databaseReference;
    private PrefManager prefManager;

    private AdView mAdView;



//    private void launchHomeScreen() {
//        prefManager.setFirstTimeLaunch(false);
//        startActivity(new Intent(StartingActvity.this, Home.class));
//        finish();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_actvity);



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //



        // Checking for first time launch - before calling setContentView()
//        prefManager = new PrefManager(this);
//        if (!prefManager.isFirstTimeLaunch()) {
//            launchHomeScreen();
//            finish();
//        }


        databaseReference = FirebaseDatabase.getInstance().getReference("User");

        phoneNumber = (EditText) findViewById(R.id.phone_number);
        email = (EditText) findViewById(R.id.email_address);
        send = (Button) findViewById(R.id.sendToDatabase);

//        Boolean isFirstTime = getSharedPreferences("PREFERENCE",MODE_PRIVATE).getBoolean("isfirstsun",true);
//
//        if (isFirstTime) {
//            Toast.makeText(getApplicationContext(),"First Time",Toast.LENGTH_SHORT).show();
//            getSharedPreferences("PREFERENCE",MODE_PRIVATE).edit().putBoolean("isfirstrun",false).apply();
//        }

//        else {
//            Toast.makeText(getApplicationContext(),"Not first Time",Toast.LENGTH_SHORT).show();
//        }


        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart) {
            Toast.makeText(StartingActvity.this,"",Toast.LENGTH_SHORT).show();
            addUser();
//            Intent launchNextActivity;
//            launchNextActivity = new Intent(StartingActvity.class, Home.class);
//            launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//            launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//            startActivity(launchNextActivity);
        }

        else {
            Intent intent = new Intent(StartingActvity.this, Home.class);
            startActivity(intent);
        }

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });

    }

    private void addUser() {
        String phone = phoneNumber.getText().toString();
        String emailAdd = email.getText().toString();

        if (!(phone.length()==10)) {
            phoneNumber.setError("Please enter a valid  phone number");
            phoneNumber.requestFocus();
            return;
        }

        if (emailAdd.isEmpty()) {
            email.setError("Please enter email Address");
            email.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(emailAdd).matches()){
            email.setError("Please enter valid email address");
            email.requestFocus();
            return;
        }


        String id = databaseReference.push().getKey();
        UserModelClass userModelClass = new UserModelClass(id,phone,emailAdd);
        databaseReference.child(id).setValue(userModelClass);

        Toast.makeText(getApplicationContext(),"Welcome Aboard",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(StartingActvity.this, Home.class);
        startActivity(intent);

       // Intent launchNextActivity;
//        Intent launchNextActivity = new Intent(StartingActvity.class, Home.class);
//        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//        startActivity(launchNextActivity);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();

    }

    @Override

    public void onBackPressed() {
//        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
//                .setMessage("Are you sure?")
//                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        Intent intent = new Intent(Intent.ACTION_MAIN);
//                        intent.addCategory(Intent.CATEGORY_HOME);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent);
//                        finish();
//                    }
//                }).setNegativeButton("no", null).show();


        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}
