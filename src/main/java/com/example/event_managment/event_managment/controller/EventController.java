package com.example.event_managment.event_managment.controller;

import com.example.event_managment.event_managment.bean.Event;
import com.example.event_managment.event_managment.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;
    @GetMapping("/events")
    public List<Event> getEvent(){
        return this.eventService.getEvent();
    }

    @PostMapping("/event")
    public ResponseEntity<String> addEvent(@RequestBody Event event){
        this.eventService.addEvent(event);
        return new ResponseEntity<>("{ message : " + event.getEventName() +" added succesfully }", HttpStatus.OK);
    }

    @PutMapping("/event")
    public ResponseEntity<String> updateEvent(@RequestBody Event event){
        this.eventService.updateEvent(event);
        return new ResponseEntity<>("{ message : " + event.getEventName() +" updated succesfully }", HttpStatus.OK);
    }

    @DeleteMapping("/event/{eventId}")
    public ResponseEntity<String> updateEvent(@PathVariable String eventId){
        this.eventService.deleteEvent(Long.parseLong(eventId));
        return new ResponseEntity<>("{message : " + eventId + " deleted succesfully }" , HttpStatus.OK);
    }

}
