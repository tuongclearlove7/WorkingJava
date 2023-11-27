package com.example.myproject1.service;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    List<ClubDto> searchClubs(String query);

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long id);

    void updateClub(ClubDto clubDto);

    void deleteClub(Long id);


}
