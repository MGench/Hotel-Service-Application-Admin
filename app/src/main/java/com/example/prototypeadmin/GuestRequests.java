package com.example.prototypeadmin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class GuestRequests extends AppCompatActivity {

//    private ImageButton requestbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_requests);

        getSupportActionBar().setTitle("Guest Requests");
//
//        requestbutton = (ImageButton) findViewById(R.id.requestbutton);
//        requestbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openTabOne(); // creates main menu method name
//            }
//        });

    }
//    public void openTabOne() {
//        Intent intent = new Intent(this, TabOne.class);
//        startActivity(intent);
//    }
}
