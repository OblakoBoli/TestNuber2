package com.example.student.myapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "i creating", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
super.onStart();
        Toast.makeText(this, "i creating", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
super.onStop();
        Toast.makeText(this, "i stop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
super.onPause();
        Toast.makeText(this, "i pause", Toast.LENGTH_SHORT).show();
    }
}
