package com.example.vittouristguide2;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView vit;
    public void newactivity(View view)
    {

        Intent intent=new Intent(MainActivity.this,com.example.vittouristguide2.page1.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        vit=findViewById(R.id.vit);
        vit.animate().alpha(1).scaleX((float) 1.5).scaleY((float) 1.5).setDuration(3000);






    }
}
