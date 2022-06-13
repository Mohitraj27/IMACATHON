package com.example.imacathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DSA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa);
    }

    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://edutechlearners.com/download/Introduction_to_algorithms-3rd%20Edition.pdf"));
        startActivity(browserIntent);
    }

    public void Full_playlist(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.docdroid.net/ZPfHmS5/data-structures-and-algorithms-narasimha-karumanchi-pdf"));
        startActivity(browserIntent);
    }

    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/course/data-structures-and-algorithms-in-python--ud513"));
        startActivity(browserIntent);
    }
}