package com.example.myproject1.service.impl;

import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Event;
import com.example.myproject1.repository.ClubRepository;
import com.example.myproject1.repository.EventRepository;
import com.example.myproject1.service.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImp implements EventService {

    private EventRepository eventRepository;
    private ClubRepository clubRepository;

    public EventServiceImp(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Long clubId, EventDto eventDto) {

        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);

    }

    private Event mapToEvent(EventDto eventDto) {

        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
    }
}
