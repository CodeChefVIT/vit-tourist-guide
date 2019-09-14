package com.example.newapp;

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
    EditText name,venue,date,stime,etime,ed;
    public void addevent(View view)
    {
        final ParseObject events = new ParseObject("events");
        events.put("EventName",name.getText().toString());
        events.put("EventVenue",venue.getText().toString());
        events.put("Date",date.getText().toString());
        events.put("StartingTime",stime.getText().toString());
        events.put("EndingTime",etime.getText().toString());
        events.put("ed",ed.getText().toString());


        events.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null)
                {
                    Toast.makeText(eventadder.this,"Event is Added !",Toast.LENGTH_LONG).show();
                    name.setText("");
                    venue.setText("");
                    date.setText("");
                    stime.setText("");
                    etime.setText("");
                    ed.setText("");
                }
                else
                {
                    e.printStackTrace();

                }
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventadder);


        name = findViewById(R.id.name);
        venue = findViewById(R.id.venue);
        date = findViewById(R.id.date);
        stime=findViewById(R.id.stime);
        etime=findViewById(R.id.etime);
        ed=findViewById(R.id.ed);
    }
}
