package com.example.myproject1.service;

import com.example.myproject1.dto.EventDto;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);
}
