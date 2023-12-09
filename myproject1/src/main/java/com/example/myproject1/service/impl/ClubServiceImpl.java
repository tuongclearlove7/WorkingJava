package com.example.myproject1.service.impl;

import com.example.myproject1.dto.ClubDto;
import com.example.myproject1.mapper.ClubMapper;
import com.example.myproject1.models.Club;
import com.example.myproject1.models.UserEntity;
import com.example.myproject1.repository.ClubRepository;
import com.example.myproject1.repository.UserRepository;
import com.example.myproject1.security.SecurityUtil;
import com.example.myproject1.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.myproject1.mapper.ClubMapper.mapToClub;
import static com.example.myproject1.mapper.ClubMapper.mapToClubDto;


@Service
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;
    UserRepository userRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository, UserRepository userRepository) {

        this.clubRepository = clubRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {

        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map(ClubMapper::mapToClubDto).collect(Collectors.toList());
    }

    @Override
    public Club saveClub(ClubDto clubDto) {

        String email = SecurityUtil.getSessionUser();
        UserEntity user = userRepository.findByEmail(email);
        Club club = mapToClub(clubDto);

        if (user != null) {

            club.setCreatedBy(user);

        } else {

            System.out.println("User is null");
        }

        System.out.println("Club: " + club);
        System.out.println("created by: " + clubDto.getCreatedBy());

        return clubRepository.save(club);
    }

    @Override
    public ClubDto findClubById(Long clubId) {

        Club club = clubRepository.findById(clubId).get();

        return mapToClubDto(club);
    }

    @Override
    public void updateClub(ClubDto clubDto) {

        String email = SecurityUtil.getSessionUser();
        System.out.println("User " + email + " update");
        UserEntity user = userRepository.findByEmail(email);
        Club club = mapToClub(clubDto);
        club.setCreatedBy(user);
        clubRepository.save(club);
    }

    @Override
    public void deleteClub(Long id) {

        clubRepository.deleteById(id);
    }

    @Override
    public List<ClubDto> searchClubs(String query) {

        List<Club> clubs = clubRepository.searchClubs(query);

        return clubs.stream().map(club -> mapToClubDto(club)).collect(Collectors.toList());
    }


}
