package com.example.napp;

public class event_list {

    public String eventname;
    public String venue;
    public String starttime;
    public String endtime;
    public String ed;
    public int image;

    public event_list(String eventname, String venue, String starttime, String endtime, String ed, int image) {
        this.eventname = eventname;
        this.venue = venue;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ed = ed;
        this.image = image;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
