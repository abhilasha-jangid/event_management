package com.example.event_managment.event_managment.services;

import com.example.event_managment.event_managment.bean.Event;
//import com.example.event_managment.event_managment.bean.Session;
import com.example.event_managment.event_managment.bean.Session;
import com.example.event_managment.event_managment.repository.EventDao;
//import com.example.event_managment.event_managment.repository.SessionDao;
import com.example.event_managment.event_managment.repository.SessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    private List<Event> events = new ArrayList<>();
    @Autowired
    private EventDao eventDao;
    @Autowired
    private SessionDao sessionDao;
    @Override
    public Event addEvent(Event event) {
        eventDao.save(event);
        return event;
    }
    public List<Event> getEvent(){
        List<Event> events = new ArrayList<>();
        try {
             return this.eventDao.findAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return events;
    }

    public Event updateEvent(Event event){
        try {
            eventDao.save(event);
            return event;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new Event();
        }
    }

    public void deleteEvent(long eventId){
        try {
            eventDao.deleteById(eventId);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Session addSession(Session session){
        try {
            sessionDao.save(session);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return session;
    }

    public void deleteSession(Session session){
        try {
            sessionDao.delete(session);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
