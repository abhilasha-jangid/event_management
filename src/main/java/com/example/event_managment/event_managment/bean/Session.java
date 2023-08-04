package com.example.event_managment.event_managment.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(SessionId.class)
public class Session {
    @Id
    private String sessionId;
    @Column
    private String language;
    @Column
    private String description;

    @Column
    private String date;
    @Column
    private String videoUrl;

    @Id
    private long eventId;

    @Override
    public String toString() {
        return "{ Session: " + sessionId + ", Language: " + language + ", description: " + description + ", date: " + date + ", videoUrl: " + videoUrl +" } ";
    }
}
