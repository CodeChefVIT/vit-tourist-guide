package com.example.napp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import java.util.Calendar;
import java.util.Date;

public class eventadder extends AppCompatActivity {

    EditText eventname,venuename,ed;
    TextView sdate,stime,etime;
    DatePickerDialog.OnDateSetListener dateSetListener;
    String Date;

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
        sdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int year =calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                 DatePickerDialog dialog=new DatePickerDialog(eventadder.this,android.R.style.Theme_Holo_Dialog_MinWidth,dateSetListener,year,month,day);
                 dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                 dialog.show();

            }
        });

        stime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(eventadder.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        stime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        etime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(eventadder.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        etime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        dateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                sdate.setText(""+dayOfMonth+"/"+month+"/"+year);

            }
        };



        Parse.initialize(this);



    }
}
