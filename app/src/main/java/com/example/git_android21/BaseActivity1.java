package com.example.git_android21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class BaseActivity1 extends AppCompatActivity { // fix bug in BaseActivity1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base1);

        //Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
        Log.d("BaseActivity1", "fix some bug");
    }
}