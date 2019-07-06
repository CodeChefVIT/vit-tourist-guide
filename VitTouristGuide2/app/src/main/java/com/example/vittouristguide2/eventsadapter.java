package com.example.vittouristguide2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

public class eventsadapter extends RecyclerView.Adapter<eventsadapter.ViewHolder>{
    private List<clubs_event> C_e;
    ItemClicked activity;
    public interface ItemClicked
    {
        void onItemClicked(int index);
    }

    public eventsadapter(Context context,List<clubs_event> list)
    {
        C_e=list;
        activity=(ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        EditText nameofevent,dateofevent,timeofevent;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameofevent = itemView.findViewById(R.id.nameofevent);
            dateofevent=itemView.findViewById(R.id.dateofevent);
            timeofevent=itemView.findViewById(R.id.timeofevent);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(C_e.indexOf((clubs_event)v.getTag()));

                }
            });
        }
    }

    @NonNull
    @Override
    public eventsadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull eventsadapter.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(C_e.get(i));
        viewHolder.nameofevent.setText(C_e.get(i).getName_of_the_event());
        viewHolder.dateofevent.setText(C_e.get(i).getEventDate());
        viewHolder.timeofevent.setText((CharSequence) C_e.get(i).getStarting_Time());

    }

    @Override
    public int getItemCount() {
        return C_e.size();
    }
}
