package com.example.event_managment.event_managment.services;

import com.example.event_managment.event_managment.bean.Event;
//import com.example.event_managment.event_managment.bean.Session;
import com.example.event_managment.event_managment.repository.EventDao;
//import com.example.event_managment.event_managment.repository.SessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    private List<Event> events = new ArrayList<>();
    @Autowired
    private EventDao eventDao;
//    @Autowired
//    private SessionDao sessionDao;
    @Override
    public Event addEvent(Event event) {

//        Session session = new Session();
//        session.setSessionId("Session 03");
//        session.setLanguage("English");
//        session.setDate("3/5/2022");
//        session.setDescription("mumbai mahosav sept 2022 happen");
//        session.setVideoUrl("https://mahosav/mumbai");
//        session.setEvent(event);
//
//        Session session1 = new Session();
//        session1.setSessionId("Session 02");
//        session1.setLanguage("Hindi");
//        session1.setDate("3/6/2022");
//        session1.setDescription("palej mahosav sept 2022 happen");
//        session1.setVideoUrl("https://mahosav/palej");
//        session1.setEvent(event);
//
//        List<Session> sessions = new ArrayList<>();
//        sessions.add(session);
//        sessions.add(session1);
//
//        event.setSession(sessions);
//        eventDao.save(event);

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
}
