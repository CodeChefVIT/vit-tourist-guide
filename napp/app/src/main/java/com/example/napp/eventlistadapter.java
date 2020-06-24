package com.example.napp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.parse.FindCallback;
import com.parse.ParseObject;

import java.util.List;




    public class eventlistadapter extends RecyclerView.Adapter<eventlistadapter.eventlistviewholder> {

        private Context mct;
        private List<event_list> list;

        public eventlistadapter(Context mct, List<event_list> list) {
            this.mct = mct;
            this.list = list;
        }

        @Override
        public eventlistviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(mct);
            View view = inflater.inflate(R.layout.eventlist,null);
            return new eventlistviewholder(view);
        }

        @Override
        public void onBindViewHolder(eventlistviewholder holder,  int position) {
            event_list d= list.get(position);
            holder.eventname.setText(d.getEventname());
            holder.starttime.setText(d.getStarttime());
            holder.endtime.setText(d.getEndtime());
            holder.venue.setText(d.getVenue());
            holder.ed.setText(d.getEd());

            holder.image.setImageDrawable(mct.getResources().getDrawable(d.getImage(),null));




        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class eventlistviewholder extends RecyclerView.ViewHolder{


            TextView eventname,starttime,endtime,venue,ed;
            ImageView image;



            public eventlistviewholder(View itemView) {
                super(itemView);

                eventname=itemView.findViewById(R.id.eventname);
                starttime=itemView.findViewById(R.id.starttime);
                endtime=itemView.findViewById(R.id.endtime);
                venue=itemView.findViewById(R.id.venue);
                ed=itemView.findViewById(R.id.ed);
                image=itemView.findViewById(R.id.image);






            }



        }


    }






