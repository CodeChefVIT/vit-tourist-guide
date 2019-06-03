package com.example.vittouristguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MensHostel extends AppCompatActivity {
    Button a,b,c,d,e,f,g,h,j,k,l,m,n,p,q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_hostel);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        f=findViewById(R.id.f);
        g=findViewById(R.id.g);
        h=findViewById(R.id.h);
        j=findViewById(R.id.j);
        k=findViewById(R.id.k);
        l=findViewById(R.id.l);
        m=findViewById(R.id.m);
        n=findViewById(R.id.n);
        p=findViewById(R.id.p);
        q=findViewById(R.id.q);


       a.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT A Block Mens Hostel,Vellore"));
                       startActivity(intent);


           }
       });
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=B-Block,Vellore Institute of Technology,Vellore"));
               startActivity(intent);

           }
       });
       c.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=C Block Rabindranath Tagore Block,Vellore Institute of Technology,Vellore"));
               startActivity(intent);
           }
       });
       d.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT D Block Mens Hostel,Vellore"));
               startActivity(intent);

           }
       });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=E Block VIT Mens Hostel,Vellore"));
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT F Block Men's Hostel,Vellore"));
                startActivity(intent);

            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT G Block Mens Hostel,Vellore"));
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=H Block VIT Mens Hostel,Vellore"));
                startActivity(intent);
            }
        });
       j.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT J Block Mens Hostel,Vellore"));
               startActivity(intent);
           }
       });
       k.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=K Block,Vellore Institute Of Technology,Vellore"));
               startActivity(intent);
           }
       });
       l.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=L Block Mens Hostel,Vellore"));
               startActivity(intent);
           }
       });
       m.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=M-Block,Vellore Institute of Technology,Vellore"));
               startActivity(intent);
           }
       });
       n.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Charles Darwin (N) Block-MH,Vellore"));
               startActivity(intent);
           }
       });
       p.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=VIT P Block Mens Hostel,Vellore"));
               startActivity(intent);
           }
       });
       q.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q= Q Block Men's Hostel,Vellore"));
               startActivity(intent);
           }
       });




    }
}
