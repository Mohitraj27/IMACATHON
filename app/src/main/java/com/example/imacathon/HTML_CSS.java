package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HTML_CSS extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_css);
    }
    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://wtf.tw/ref/duckett.pdf"));
        startActivity(browserIntent);
    }
    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HcOc7P5BMi4"));
        startActivity(browserIntent);
    }
    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLwgFb6VsUj_mtXvKDupqdWB2JBiek8YPB"));
        startActivity(browserIntent);
    }
    public void Book_4(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OFAY5QgjeNQ"));
        startActivity(browserIntent);
    }


}
