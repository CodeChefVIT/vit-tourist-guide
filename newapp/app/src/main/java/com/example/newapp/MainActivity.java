package com.example.newapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void mens(View view)
    {
        Intent intent=new Intent(MainActivity.this,com.example.newapp.menshostel.class);
        startActivity(intent);
    }
    public void events(View view)
    {
        Intent intent=new Intent(MainActivity.this,com.example.newapp.events.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
