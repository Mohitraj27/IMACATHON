package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Bluej  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluej);
    }
    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://media.oiipdf.com/pdf/b5e303eb-c116-4635-9b7d-ec2a26ce403d.pdf"));
        startActivity(browserIntent);
    }

    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pdfdrive.com/download.pdf?id=158254356&h=3adc91bcbd2fd7adb1324b7a67680674&u=cache&ext=pdf"));
        startActivity(browserIntent);
    }

    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://1lib.in/dl/5531614/d5cafe?dsource=recommend"));
        startActivity(browserIntent);
    }

    public void Full_playlist(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop"));
        startActivity(browserIntent);
    }
}
