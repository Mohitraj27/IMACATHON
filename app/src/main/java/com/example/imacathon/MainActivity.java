package com.example.imacathon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    private Button GetStarted;

    //For automatic image flipping/movement this widget is used
    ViewFlipper v_flippper;
//about the app
    ImageView About_the_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetStarted = findViewById(R.id.Get_started);
        GetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home_Page=new Intent(MainActivity.this, Home_Page.class);
                startActivity(Home_Page);
            }
        });

About_the_app =findViewById(R.id.About_the_app);
About_the_app.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent About=new Intent(MainActivity.this, About_the_app.class);
        startActivity(About);
    }
});




        int images[]={R.drawable.app_icon1,R.drawable.skills,R.drawable.sms_4_show_my_skills_1,R.drawable.professers_teaching,R.drawable.data_science};


        v_flippper=findViewById(R.id.v_flipper);
//for loop
     /*   for(int i=0;i<image.length;i++){
            flipperImages(image(i));
        }*/
//but I prefer Forreach
        for(int image: images)
        {
            flipperImages(image);
        }
    }
    public  void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);



        v_flippper.addView(imageView);
        v_flippper.setFlipInterval(1500);//2sec
        v_flippper.setAutoStart(true);



        //animation
        v_flippper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flippper.setOutAnimation(this, android.R.anim.slide_out_right);
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
                        MainActivity.super.onBackPressed();
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






}

