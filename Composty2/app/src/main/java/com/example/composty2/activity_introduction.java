package com.example.composty2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }

    /** Called when the user taps the button*/
    public void TransferFromIntro(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_infodump.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }
}
