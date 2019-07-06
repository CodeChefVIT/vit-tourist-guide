package com.example.vittouristguide2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.DataQueryBuilder;

import java.util.List;

public class events extends AppCompatActivity implements eventsadapter.ItemClicked {

    RecyclerView rvlist;
    RecyclerView.Adapter myadapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.Signin:
                Intent intent1 = new Intent(this, Signin.class);
                this.startActivity(intent1);
                break;
            case R.id.register:
                Intent intent = new Intent(this, Register.class);
                this.startActivity(intent);
                break;

            default:
                return Boolean.parseBoolean(null);


        }
        return Boolean.parseBoolean(null);


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        rvlist=findViewById(R.id.rvlist);
        rvlist.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        rvlist.setLayoutManager(layoutManager);

        DataQueryBuilder queryBuilder = DataQueryBuilder.create();
        queryBuilder.setGroupBy("name_of_the_event");
        Backendless.Persistence.of(clubs_event.class).find(queryBuilder, new AsyncCallback<List<clubs_event>>() {
            @Override
            public void handleResponse(List<clubs_event> response) {
                myadapter= new eventsadapter(events.this,response);
                rvlist.setAdapter(myadapter);
            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });
    }

    @Override
    public void onItemClicked(int index) {

    }
}
