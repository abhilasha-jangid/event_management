package com.example.event_managment.event_managment.repository;

import com.example.event_managment.event_managment.bean.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository<Event, Long> {
}
