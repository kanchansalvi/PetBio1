package com.kanchan.petbio1.petbio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catImage;
    private ImageView dogImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImage = (ImageView) findViewById(R.id.catimageID);
        dogImage = (ImageView) findViewById(R.id.dogimageID);

        catImage.setOnClickListener(this);
        dogImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.catimageID):
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Lovely cat. Meows a lot !!");
                startActivity(catIntent);
                Toast.makeText(MainActivity.this, "You choose cat", Toast.LENGTH_LONG).show();
                break;

            case (R.id.dogimageID):
                Intent  dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Tuffy");
                dogIntent.putExtra("bio", "Lovely Dog. Barks a lot. Eats a lot!!");
                startActivity(dogIntent);
                Toast.makeText(MainActivity.this, "You choose dog", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
