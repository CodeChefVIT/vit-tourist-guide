package com.example.vittouristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    EditText et,et1;
    Button b,Register,ev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et=findViewById(R.id.et);
        et1=findViewById(R.id.et1);
        b=findViewById(R.id.b);
        ev=findViewById(R.id.ev);
        Register=findViewById(R.id.Register);

    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });


    Register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(Signup.this,com.example.vittouristguide.firebase.class);
            startActivity(intent);


        }
    });
    ev.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            intent=new Intent(Signup.this,com.example.vittouristguide.newevents.class);
            startActivity(intent);
        }
    });





    }
}
