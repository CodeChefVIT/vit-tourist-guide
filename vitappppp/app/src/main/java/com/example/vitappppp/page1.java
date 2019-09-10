package com.example.vitappppp;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class page1 extends AppCompatActivity {
    RecyclerView recyclerView;
    discriptionadapter da;
    List<discription> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        list =new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list.add(new discription("alan", R.drawable.vithostelmen));
        list.add(new discription("alan", R.drawable.vithostelgirl));
        list.add(new discription("alan", R.drawable.sjt2));
        list.add(new discription("alan", R.drawable.events));



        da=new discriptionadapter(this,list);
        recyclerView.setAdapter(da);

    }
}
