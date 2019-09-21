package com.example.napp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;

public class signin extends AppCompatActivity {
    EditText userid,passwordid;

    public void reg(View view)
    {
        Intent intent = new Intent(signin.this,com.example.napp.register.class);
        startActivity(intent);


    }

    public void signin1(View view)
    {
        ParseUser.logInInBackground(userid.getText().toString().trim(), passwordid.getText().toString().trim(), new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (user!=null)
                {
                    Toast.makeText(signin.this, "Signed in!", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(signin.this,com.example.napp.eventadder.class);
                    startActivity(intent);
                }
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        userid=findViewById(R.id.userid);
        passwordid=findViewById(R.id.passwordid);
        Parse.initialize(this);



        BottomNavigationView navigationView= findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.direction:
                        Intent c = new Intent(signin.this,MapsActivity.class);
                        startActivity(c);

                        break;
                    case R.id.events:
                        Intent b = new Intent(signin.this,sss.class);
                        startActivity(b);
                        break;
                    case R.id.SignIn:


                        break;
                }

                return false;
            }
        });

    }
}
