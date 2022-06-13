package com.example.imacathon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.system.Os;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Page extends AppCompatActivity {


    ViewFlipper v_flippper;


    ImageView Whatsapp_icon;

    ImageView java_language;
    ImageView c_language;
    ImageView Python_language;
    ImageView CPP_Langugae;
    ImageView React_language;
    ImageView HTML_CSS;
    ImageView Java_script;
    ImageView Firebase;
    ImageView Kotlin;
ImageView Swift;
ImageView Php;

//Core Fundamentals
    ImageView DSA;
    ImageView DBMS;
    ImageView OS;
    ImageView OOPS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);

//Core Fundamentals
        DSA =findViewById(R.id.DSA_icon);
        DSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DSA_Intent=new Intent(Home_Page.this, com.example.imacathon.DSA.class);
                startActivity(DSA_Intent);
            }
        });

        DBMS =findViewById(R.id.Dbms_icon);
        DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DBMs_Intent=new Intent(Home_Page.this, DBMS.class);
                startActivity(DBMs_Intent);
            }
        });

        OS =findViewById(R.id.operating_system);
        OS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os_Intent=new Intent(Home_Page.this, Operating_systems.class);
                startActivity(os_Intent);
            }
        });
        OOPS =findViewById(R.id.oops_icon);
        OOPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os_Intent=new Intent(Home_Page.this, OOPS.class);
                startActivity(os_Intent);
            }
        });


    Kotlin=findViewById(R.id.kotlin_icon);
        Kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Kotlin_intent=new Intent(Home_Page.this, Kotlin.class);
                startActivity(Kotlin_intent);
            }
        });


        Php = findViewById(R.id.php_icon);
        Php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent php_intent = new Intent(Home_Page.this, Php.class);
                startActivity(php_intent);
            }
        });

        Swift= findViewById(R.id.swift_icon);
        Swift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Swift_intent = new Intent(Home_Page.this, Swift.class);
                startActivity(Swift_intent);
            }
        });

        Firebase = findViewById(R.id.firebase_icon);
        Firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Firebase_intent = new Intent(Home_Page.this, firbase.class);
                startActivity(Firebase_intent);
            }
        });


//React intent
        React_language = findViewById(R.id.react_icon);
        React_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Reactintent = new Intent(Home_Page.this, React.class);
                startActivity(Reactintent);
            }
        });


        Java_script = findViewById(R.id.javascript_logo);
        Java_script.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent JS = new Intent(Home_Page.this, com.example.imacathon.Java_script.class);
                startActivity(JS);
            }
        });


        HTML_CSS = findViewById(R.id.html_css_icon);
        HTML_CSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HTML_CSS = new Intent(Home_Page.this, com.example.imacathon.HTML_CSS.class);
                startActivity(HTML_CSS);
            }
        });
//C++ Intent
        CPP_Langugae = findViewById(R.id.cpp_logo_icon);
        CPP_Langugae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CPP = new Intent(Home_Page.this, C_pp.class);
                startActivity(CPP);
            }
        });


//Python Intent
        Python_language = findViewById(R.id.python_icon);
        Python_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Python_Intent = new Intent(Home_Page.this, Python.class);
                startActivity(Python_Intent);
            }
        });

        c_language = findViewById(R.id.c_logo_icon);
        c_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent C_Page_intent = new Intent(Home_Page.this, C_langugage.class);
                startActivity(C_Page_intent);
            }
        });

        //Java Page Intent
        java_language = findViewById(R.id.Java_icon);
        java_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Java_Page_intent = new Intent(Home_Page.this, Bluej.class);
                startActivity(Java_Page_intent);
            }
        });

        //Whatsapp Icon in Home Page for Suggestion of the App.

        Whatsapp_icon = findViewById(R.id.my_whatsapp_icon);
        final String num = "+919097644568";
        final String text_to_me = "Hey! Mohit , I Liked Your Imacathon App :)";


        Whatsapp_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean installed = isAppInstalled("com.whatsapp");
                if (installed) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + num + "&text=" + text_to_me));
                    startActivity(intent);
                } else {
                    Toast.makeText(Home_Page.this, "Whatsapp is not installed!", Toast.LENGTH_SHORT);
                }

            }

            private boolean isAppInstalled(String s) {
                PackageManager packageManager = getPackageManager();
                boolean is_installed;
                try {
                    packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
                    is_installed = true;
                } catch (PackageManager.NameNotFoundException e) {
                    is_installed = false;
                    e.printStackTrace();
                }
                return is_installed;
            }
        });


//Flipper images in home page

        int images[] = {R.drawable.learning_image, R.drawable.dsa_1, R.drawable.ml, R.drawable.love_babbar_dsa_sheet_450_coding_questions_min};


        v_flippper = findViewById(R.id.v_flipper);
//for loop
     /*   for(int i=0;i<image.length;i++){
            flipperImages(image(i));
        }*/
//but I prefer Forreach
        for (int image : images) {
            flipperImages(image);
        }



    }



    //for movement of live images in front Page
    public void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);


        v_flippper.addView(imageView);
        v_flippper.setFlipInterval(2000);//2sec
        v_flippper.setAutoStart(true);


        //animation
        v_flippper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flippper.setOutAnimation(this, android.R.anim.slide_out_right);
    }









    //Video link Integration

    public void Video_1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8jlsCDwrGTU"));
        startActivity(browserIntent);
    }

    public void Video_2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KJ_o-JUgGo0"));
        startActivity(browserIntent);
    }

    public void video_3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLmnXSMW2x4mNHYnLrT3LI4oRqrqUuWJ0W"));
        startActivity(browserIntent);

    }

    public void video_4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fyy2Mr84vNM"));
        startActivity(browserIntent);
    }



    @Override
    public  void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        finish();
                        Home_Page.super.onBackPressed();
                    }
                })


                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });


        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }


    public void Love_Babar_DSA(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FMdN_OCfOI0iAeDlqswCiC2DZzD4nPsb/view"));
        startActivity(browserIntent);
    }

    public void Striver_DSA_sheet(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1JLKCaz4n4YtYdQ1bJF1X46BKbxldedb6N1OMiXh9Dmo/edit?usp=sharing"));
        startActivity(browserIntent);
    }
}

