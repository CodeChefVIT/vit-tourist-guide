package com.example.vittouristguide2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class page1 extends AppCompatActivity {
    TextView et1;
    ImageView ac,men,women,events;




    public void acadmey(View view)
    {
        Intent intent = new Intent(page1.this,com.example.vittouristguide2.acadmic.class);
        startActivity(intent);

    }

    public void mens(View view)
    {
        Intent intent = new Intent(page1.this,com.example.vittouristguide2.menshospital.class);
        startActivity(intent);
    }


    public void Womens(View view)
    {
        Intent intent = new Intent(page1.this,com.example.vittouristguide2.womenhospital.class);
        startActivity(intent);
    }




    public void events(View view)
    {
        Intent intent = new Intent(page1.this,com.example.vittouristguide2.events.class);
        startActivity(intent);
    }@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        et1=findViewById(R.id.et1);
        ac=findViewById(R.id.ac);
        men=findViewById(R.id.men);
        women=findViewById(R.id.women);
        events=findViewById(R.id.events);

        et1.animate().alpha(0).setDuration(4000);
        ac.animate().alpha(1).setDuration(4000);
        men.animate().alpha(1).setDuration(4000);
        women.animate().alpha(1).setDuration(4000);
        events.animate().alpha(1).setDuration(4000);






    }
}
