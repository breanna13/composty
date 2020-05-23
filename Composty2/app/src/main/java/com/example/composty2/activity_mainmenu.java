package com.example.composty2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    //  Row Two
    public void TransferToImageRec(View url) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_imagerec.class);

        // start the activity connect to the specified class
        startActivity(intent);
    }

    //  Row Three
    public void EnterUrl(View url) {
        // Do something in response to button
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://quiethut.com/composting-for-kids/"));

        // start the activity connect to the specified class
        startActivity(intent);
    }

}
