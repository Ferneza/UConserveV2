package com.example.nfern.uconserve;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddLocationForm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_location_form);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GoogleMaps.class));
                finish();
            }
        });


        Button cancelBtn = (Button)findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), GoogleMaps.class);
                startActivity(startIntent);
            }
        });

        Button submitBtn = (Button)findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Sucessfully added!", Toast.LENGTH_LONG).show();
                Intent startIntent = new Intent(getApplicationContext(), GoogleMaps.class);
                startActivity(startIntent);
            }
        });
    }
}
