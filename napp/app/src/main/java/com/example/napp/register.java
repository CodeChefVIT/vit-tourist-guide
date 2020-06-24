package com.example.napp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class register extends AppCompatActivity {
    EditText cname,tname,sname,password,cpassword;
    public void register1(View view)
    {
        ParseUser user=new ParseUser();



        user.setUsername(cname.getText().toString());
        user.setPassword(password.getText().toString());
        user.put("TeacherCoordinator",tname.getText().toString());
        user.put("Presidentname",sname.getText().toString());
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null)
                {
                    Toast.makeText(register.this,"Registered",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(register.this,com.example.napp.signin.class);
                    startActivity(intent);
                    Log.i("yyyy","Registered");
                }
                else
                {
                    Log.i("ttt",e.toString());
                }

            }


        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        cname=findViewById(R.id.cname);
        tname=findViewById(R.id.tname);
        sname=findViewById(R.id.sname);
        password=findViewById(R.id.password);
        cpassword=findViewById(R.id.cpassword);





        Parse.initialize(this);

        ParseUser.getCurrentUser().logOut();


        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
