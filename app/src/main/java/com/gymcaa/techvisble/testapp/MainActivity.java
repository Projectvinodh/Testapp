package com.gymcaa.techvisble.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "MMMM", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "adasdasd", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Third Commit", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Fourth Commit", Toast.LENGTH_SHORT).show();
    }
}
