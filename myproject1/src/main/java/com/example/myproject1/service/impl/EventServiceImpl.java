package com.example.myproject1.service.impl;

import com.example.myproject1.dto.EventDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.Event;
import com.example.myproject1.repository.ClubRepository;
import com.example.myproject1.repository.EventRepository;
import com.example.myproject1.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.myproject1.mapper.EventMapper.mapToEvent;
import static com.example.myproject1.mapper.EventMapper.mapToEventDto;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private ClubRepository clubRepository;


    @Autowired
    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
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

    @Override
    public List<EventDto> findAllEvents() {

        List<Event> events = eventRepository.findAll();

        return events.stream().map(event -> mapToEventDto(event)).collect(Collectors.toList());
    }

    @Override
    public EventDto findByEventId(Long id) {

        Event event = eventRepository.findById(id).get();

        return mapToEventDto(event);
    }

    @Override
    public void deleteEvent(Long id) {

        eventRepository.deleteById(id);
    }

    @Override
    public void updateEvent(EventDto eventDto) {

        Event event = mapToEvent(eventDto);

        eventRepository.save(event);
    }


}
