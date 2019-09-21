package com.example.napp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class eventadder extends AppCompatActivity {

    EditText eventname,venuename,stime,etime,sdate,ed;

    public void  add(View view)
    {

        ParseObject events = new ParseObject("Events");

        events.put("eventname",eventname.getText().toString());
        events.put("eventvenue",venuename.getText().toString());
        events.put("startingdate",sdate.getText().toString());
        events.put("startingtime",stime.getText().toString());
        events.put("startingdate",sdate.getText().toString());
        events.put("eventdiscription",ed.getText().toString());
        events.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null)
                {
                    Toast.makeText(getApplicationContext(),"Event is added ",Toast.LENGTH_LONG).show();
                }
                else{
                    e.printStackTrace();
                }
            }
        });




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventadder);

        eventname=findViewById(R.id.eventname);
        venuename=findViewById(R.id.venuename);
        stime=findViewById(R.id.stime);
        etime=findViewById(R.id.etime);
        sdate=findViewById(R.id.sdate);
        ed=findViewById(R.id.ed);
        Parse.initialize(this);



    }
}
