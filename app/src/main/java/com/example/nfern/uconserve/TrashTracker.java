package com.example.nfern.uconserve;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrashTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trash_tracker);

        FloatingActionButton trackBtn = (FloatingActionButton)findViewById(R.id.trackBtn);
        trackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), TrashTrackerForm.class);
                startActivity(startIntent);
            }
        });
    }
}
