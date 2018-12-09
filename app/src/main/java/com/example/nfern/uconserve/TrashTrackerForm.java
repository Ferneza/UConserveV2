package com.example.nfern.uconserve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrashTrackerForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trash_tracker_form);

//        Button submitBtn = (Button)findViewById(R.id.submitBtn);
//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v){
//                Intent startIntent = new Intent(getApplicationContext(), TrashTracker.class);
//                startActivity(startIntent);
//            }
//        });

        Button cancelBtn = (Button)findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), TrashTracker.class);
                startActivity(startIntent);
            }
        });
    }

    public void successMessage(View view) {
        Toast.makeText(this, "Sucessfully tracked!", Toast.LENGTH_LONG).show();
    }
}
