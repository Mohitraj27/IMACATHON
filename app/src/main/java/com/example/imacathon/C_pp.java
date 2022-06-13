package com.example.imacathon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class C_pp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp);


    }
    public void Book_1(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lmpt.univ-tours.fr/~volkov/C++.pdf"));
        startActivity(browserIntent);
    }

    public void Book_2(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ"));
        startActivity(browserIntent);
    }

    public void Book_3(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLDRBFpL5wMT3k2RFSWk-kgCbtiKGHR5Hl"));
        startActivity(browserIntent);
    }

    public void Full_playlist(View view) {
        Intent browserIntent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://1lib.in/book/2315271/c157bc"));
        startActivity(browserIntent);
    }
}
