package com.dexterlabs.khand.engineeringmanager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StartingActvity extends AppCompatActivity {

    EditText phoneNumber,email;
    Button send;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_actvity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        databaseReference = FirebaseDatabase.getInstance().getReference("User");

        phoneNumber = (EditText) findViewById(R.id.phone_number);
        email = (EditText) findViewById(R.id.email_address);
        send = (Button) findViewById(R.id.sendToDatabase);

        Boolean isFirstTime = getSharedPreferences("PREFERENCE",MODE_PRIVATE).getBoolean("isfirstsun",true);

        if (isFirstTime) {
            Toast.makeText(getApplicationContext(),"First Time",Toast.LENGTH_SHORT).show();
            getSharedPreferences("PREFERENCE",MODE_PRIVATE).edit().putBoolean("isfirstrun",false).apply();
        }

//        else {
//            Toast.makeText(getApplicationContext(),"Not first Time",Toast.LENGTH_SHORT).show();
//        }

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
            phoneNumber.setError("Please enter a valid 10 digit phone number");
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

        Toast.makeText(getApplicationContext(),"Successfully added",Toast.LENGTH_SHORT).show();
    }
}
