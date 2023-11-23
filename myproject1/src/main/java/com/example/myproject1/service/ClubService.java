package com.example.myproject1.service;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();
}
