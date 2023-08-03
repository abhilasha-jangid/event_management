//package com.example.event_managment.event_managment.bean;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Session {
//    @Id
//    private String sessionId;
//    @Column
//    private String language;
//    @Column
//    private String description;
//
//    @Column
//    private String date;
//    @Column
//    private String videoUrl;
//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    private Event event;
//
//    @Override
//    public String toString() {
//        return "{ Session: " + sessionId + ", Language: " + language + ", description: " + description + ", date: " + date + ", videoUrl: " + videoUrl +" } ";
//    }
//}
