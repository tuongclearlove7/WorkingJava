package com.example.myproject1.service.impl;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;
import com.example.myproject1.repository.ClubRepository;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {

        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {

        List<Club> clubs = clubRepository.findAll();

        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club){

        ClubDto clubDto = ClubDto.builder().id(club.getId()).title(club.getTitle()).photoUrl(club.getPhotoUrl()).content(club.getContent()).createdOn(club.getCreatedOn()).updatedOn(club.getUpdatedOn()).build();

        return clubDto;
    }

}
