package com.example.vittouristguide2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

import java.sql.Time;

public class Club_Login extends AppCompatActivity {
    EditText etname,ettime,etdate;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club__login);
        etdate=findViewById(R.id.etdate);
        etname=findViewById(R.id.etname);
        ettime=findViewById(R.id.ettime);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etname.getText().toString().trim().isEmpty()||etdate.getText().toString().trim().isEmpty()||ettime.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(Club_Login.this,"Enter all the details",Toast.LENGTH_LONG).show();
                }
                else
                {
                    clubs_event event=new clubs_event();
                    event.setName_of_the_event(etname.getText().toString().trim());
                    event.setEventDate(etdate.getText().toString().trim());
                    event.setStarting_Time(Time.valueOf(ettime.getText().toString().trim()));
                    event.setFaculty((String) ContactsApplication.user.getProperty("Faculty"));
                    Backendless.Persistence.save(event, new AsyncCallback<clubs_event>() {
                        @Override
                        public void handleResponse(clubs_event response) {
                            Toast.makeText(Club_Login.this, "Event created", Toast.LENGTH_SHORT).show();
                            etdate.setText(null);
                            ettime.setText(null);
                            etname.setText(null);
                        }

                        @Override
                        public void handleFault(BackendlessFault fault) {

                        }
                    });
                }
            }
        });

    }
}
