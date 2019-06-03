package com.example.vittouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ab;
    Button mh;
    Button gh;
    Button event;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ab=findViewById(R.id.ab);
        mh=findViewById(R.id.mh);
        gh=findViewById(R.id.gh);
        event=findViewById(R.id.event);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,com.example.vittouristguide.acadmeicblocks.class);
                startActivity(intent);


            }
        });
        mh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,com.example.vittouristguide.MensHostel.class);
                startActivity(intent);

            }
        });
        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,com.example.vittouristguide.WomensHostel.class);
                startActivity(intent);

            }
        });
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,com.example.vittouristguide.events.class);
                startActivity(intent);

            }
        });

    }
}
