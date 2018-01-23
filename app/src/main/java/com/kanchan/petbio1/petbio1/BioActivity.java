package com.kanchan.petbio1.petbio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petimage;
    private TextView nametext;
    private TextView desctext;
    private  Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petimage = (ImageView ) findViewById(R.id.petimageID);
        nametext = (TextView) findViewById(R.id.petnameID);
        desctext = (TextView) findViewById(R.id.petdescriptionID);
        extras = getIntent().getExtras();

        if (extras != null){
            String  name = extras.getString("name");
            String  bio = extras.getString("bio");
            setUp(name, bio);
        }
    }

     public void setUp(String name, String bio){

         nametext.setText(name);
         desctext.setText(bio);

        if (name.equals("Jarvis")) {
        petimage.setImageDrawable(getResources().getDrawable(R.drawable.cat3));
         }
         if (name.equals("Tuffy")) {
             petimage.setImageDrawable(getResources().getDrawable(R.drawable.dog3));

         }
     }
}
