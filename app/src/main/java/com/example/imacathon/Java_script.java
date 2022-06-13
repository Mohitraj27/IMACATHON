package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Java_script extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script);


    }

    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://pepa.holla.cz/wp-content/uploads/2015/11/JavaScript-for-Absolute-Beginners.pdf"));
        startActivity(browserIntent);
    }
    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PL2U8BLk0YRjBxiZUmmAUkkB7bzZOJUG83"));
        startActivity(browserIntent);
    }
    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dtKciwk_si4"));
        startActivity(browserIntent);
    }
    public void Book_4(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLpwngcHZlPadhRwryAXw3mJWX5KH3T5L3"));
        startActivity(browserIntent);
    }





}
