package com.example.vitappppp;

import android.content.Context;
import android.content.Intent;
//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class discriptionadapter extends RecyclerView.Adapter<discriptionadapter.descriptionviewholder> {

    private Context mct;
    private List<discription> list;

    public discriptionadapter(Context mct, List<discription> list) {
        this.mct = mct;
        this.list = list;
    }

    @Override
    public descriptionviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mct);
        View view = inflater.inflate(R.layout.selectpage,null);
        return new descriptionviewholder(view);
    }

    @Override
    public void onBindViewHolder(descriptionviewholder holder,  int position) {
        discription d= list.get(position);
        holder.textView.setText(d.getDis());

        holder.imageView.setImageDrawable(mct.getResources().getDrawable(d.getImage(),null));




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class descriptionviewholder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView textView;


        public descriptionviewholder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);





        }



    }


    }









