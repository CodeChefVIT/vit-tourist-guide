package com.example.vittouristguide2;

import java.sql.Time;
import java.util.Date;

public class clubs_event {
    private String name_of_the_event;
    private Time Starting_Time;
    private String EventDate;
    private String Faculty;
    private Date created;
    private String object_id;
    private String Event_type;

    public String getName_of_the_event() {
        return name_of_the_event;
    }

    public void setName_of_the_event(String name_of_the_event) {
        this.name_of_the_event = name_of_the_event;
    }

    public Time getStarting_Time() {
        return Starting_Time;
    }

    public void setStarting_Time(Time starting_Time) {
        Starting_Time = starting_Time;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getEvent_type() {
        return Event_type;
    }

    public void setEvent_type(String event_type) {
        Event_type = event_type;
    }
}
