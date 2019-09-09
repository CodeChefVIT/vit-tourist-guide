package com.example.vitappppp;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.ParseInstallation;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    public void nextpage(View view)
    {
        Intent intent=new Intent(MainActivity.this,com.example.vitappppp.page1.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton=findViewById(R.id.imageButton);
        imageButton.animate().alpha(1).scaleY((float) 1.5).scaleY((float) 1.5).setDuration(2000);
        Parse.initialize(this);

    }
}
