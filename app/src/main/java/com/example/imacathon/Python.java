package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Python extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);


    }


    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://1lib.in/book/3641986/812370"));
        startActivity(browserIntent);
    }

    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLjVLYmrlmjGcQfNj_SLlLV4Ytf39f8BF7"));
        startActivity(browserIntent);
    }

    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vLqTf2b6GZw"));
        startActivity(browserIntent);
    }

    public void Full_playlist(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=K22hmfeUx2w"));
        startActivity(browserIntent);
    }
}
