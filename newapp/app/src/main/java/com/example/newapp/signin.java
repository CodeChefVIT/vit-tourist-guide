package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class signin extends AppCompatActivity {
    EditText userid,passwordid;
    public void register(View view)
    {
        Intent intent=new Intent(signin.this,com.example.newapp.register.class);
        startActivity(intent);
    }
    public void signin(View view)
    {
        ParseUser.logInInBackground(userid.getText().toString().trim(), passwordid.getText().toString().trim(), new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (user!=null)
                {
                    Toast.makeText(signin.this, "Signed in!", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(signin.this,com.example.newapp.eventadder.class);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        userid=findViewById(R.id.usernameid);
        passwordid=findViewById(R.id.passwordid);
    }
}
