package com.example.prototypeadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminMenu extends AppCompatActivity {

    private ImageButton alerts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        getSupportActionBar().setTitle("Admins Panel");

        alerts = (ImageButton) findViewById(R.id.alerts);
        alerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuestTab(); // creates main menu method name
            }
        });

    }

    public void openGuestTab() {
        Intent intent = new Intent(this, GuestTab.class);
        startActivity(intent);
    }
}
