package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kotlin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
    }

    public void Kotlin_documentation(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlinlang.org/docs/kotlin-reference.pdf"));
        startActivity(browserIntent);
    }

    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pdfdrive.com/download.pdf?id=178205861&h=351217e7aed2625b1e321796d7cd8d0f&u=cache&ext=pdf"));
        startActivity(browserIntent);
    }

    public void Full_course(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mnkzx3TwbV8"));
        startActivity(browserIntent);
    }

    public void Kotlin_video(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Da7TOBCQErs"));
        startActivity(browserIntent);
    }
}
