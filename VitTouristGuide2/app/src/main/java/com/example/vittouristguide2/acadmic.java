package com.example.vittouristguide2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class acadmic extends AppCompatActivity {

    Button mb;
    Button sjt;
    Button tt;
    Button smv;
    Button cbmr;
    Button gdn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acadmic);
        mb=findViewById(R.id.mb);
        sjt=findViewById(R.id.sjt);
        tt=findViewById(R.id.tt);
        smv=findViewById(R.id.smv);
        cbmr=findViewById(R.id.cbmr);
        gdn=findViewById(R.id.gdn);



        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Dr.M.G.R Block,Vellore institute of Technology,Vellore"));

                startActivity(intent);


            }
        });
        sjt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Silver Jubllie Tower,Vellore Institute of Technology,Vellore"));

                startActivity(intent);


            }
        });


        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Technology Tower,Vellore Institute of Technology,Vellore"));

                startActivity(intent);


            }
        });


        smv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=S.M.V,Vellore Institute of Technology,Vellore"));

                startActivity(intent);


            }
        });



        cbmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=C.B.M.R.,Vellore Institute of Technology,Vellore"));


                startActivity(intent);


            }
        });


        gdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=G.D. Nayudu, Vellore Institute of Technology,Vellore"));

                startActivity(intent);


            }
        });





    }
}
