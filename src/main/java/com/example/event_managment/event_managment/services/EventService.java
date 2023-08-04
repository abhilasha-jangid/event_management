package com.example.event_managment.event_managment.services;

import com.example.event_managment.event_managment.bean.Event;
import com.example.event_managment.event_managment.bean.Session;
import com.example.event_managment.event_managment.bean.SessionId;

import java.util.List;

public interface EventService {

    public List<Event> getEvent();

    Event addEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(long eventId);
    Session addSession(Session session);

    void deleteSession(Session session);
}
