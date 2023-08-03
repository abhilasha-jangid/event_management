package com.example.event_managment.event_managment;

import com.example.event_managment.event_managment.bean.Event;
//import com.example.event_managment.event_managment.bean.Session;
import com.example.event_managment.event_managment.repository.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EventManagmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManagmentApplication.class, args);


    }

}
