package com.example.composty2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class activity_infodump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infodump);

    }

    /** Called when the user taps the button*/
    public void TranferFromInfoOne(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_introductiontwo.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }

}
