package com.example.composty2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the button*/
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_introduction.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }

}
