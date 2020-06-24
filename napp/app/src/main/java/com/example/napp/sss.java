package com.example.napp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

public class sss extends AppCompatActivity {
    RecyclerView recyclerview;
    eventlistadapter ea;
    List<event_list> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sss);
        list=new ArrayList<event_list>();
        recyclerview=findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        Parse.initialize(this);





        BottomNavigationView navigationView= findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.direction:
                        Intent b = new Intent(sss.this,MapsActivity.class);
                        startActivity(b);

                        break;
                    case R.id.events:

                        break;
                    case R.id.SignIn:
                        Intent c = new Intent(sss.this,signin.class);

                        startActivity(c);

                        break;
                }

                return false;
            }
        });



        ParseQuery<ParseObject> query= ParseQuery.getQuery("Events");




        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e==null)
                {
                    if(objects.size()>0)
                    {
                        for(ParseObject object:objects)
                        {
                            list.add(new event_list(object.getString("eventname"),object.getString("startingtime"),object.getString("startingdate"),object.getString("eventvenue"),object.getString("eventdiscription"),R.drawable.cookoff));

                            Log.i("yes","yes");



                        }
                        ea=new eventlistadapter(getApplicationContext(),list);
                        recyclerview.setAdapter(ea);


                    }
                }

            }
        });











    }
}
