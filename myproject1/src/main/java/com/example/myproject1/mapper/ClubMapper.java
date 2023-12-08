package com.example.myproject1.mapper;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;

import java.util.stream.Collectors;

import static com.example.myproject1.mapper.EventMapper.mapToEventDto;

public class ClubMapper {

    public static Club mapToClub(ClubDto club) {

        return Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdBy(club.getCreatedBy())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
    }

    public static ClubDto mapToClubDto(Club club) {

        return ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdBy(club.getCreatedBy())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .events(club.getEvents().stream()
                .map(EventMapper::mapToEventDto)
                .collect(Collectors.toList()))
                .build();
    }
}
