package com.example.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = getIntent().getData();
        String uriString = uri.toString();
        String extraData = getIntent().getStringExtra("extra_data");
        Toast.makeText(this, extraData + uriString, Toast.LENGTH_SHORT).show();
    }
}