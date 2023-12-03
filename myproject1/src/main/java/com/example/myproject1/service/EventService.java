package com.example.myproject1.service;

import com.example.myproject1.dto.EventDto;

import java.util.List;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long id);

    void deleteEvent(Long id);

    void updateEvent(EventDto eventDto);
}
