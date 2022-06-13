package com.example.imacathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Php extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
    }

    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OK_JCtrrv-c"));
        startActivity(browserIntent);
    }

    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EJWw1bd0-C0"));
        startActivity(browserIntent);
    }
}