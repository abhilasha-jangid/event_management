package com.example.event_managment.event_managment.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    private long eventId;
    @Column
    private String eventName;
//    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
//    private List<Session> session = new ArrayList<>();

    @Override
    public String toString() {
        return "{ Event: " + eventId + ", Name: " + eventName + " }";
    }
}
