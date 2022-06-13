package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class C_langugage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);
    }


    public void Let_US_C(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://bcebakhtiyarpur.org/wp-content/uploads/2020/03/file_5e747d69ab58e.pdf"));
        startActivity(browserIntent);
    }


    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://usermanual.wiki/Pdf/CProgrammingAbsoluteBeginnersGuide3rdEditio.424140197.pdf"));
        startActivity(browserIntent);
    }

    public void Full_course(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR"));
        startActivity(browserIntent);

    }

    public void Udemy_course(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/datastructurescncpp/?referralCode=BD2EF8E61A98AB5E011D"));
        startActivity(browserIntent);
    }


}
