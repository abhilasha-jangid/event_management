package com.example.event_managment.event_managment.services;

import com.example.event_managment.event_managment.bean.Event;

import java.util.List;

public interface EventService {

    public List<Event> getEvent();

    Event addEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(long eventId);
}
