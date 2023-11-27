package com.example.myproject1.repository;

import com.example.myproject1.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {

    Optional<Club> findByTitle(String url);

    @Query("SELECT c FROM Club c WHERE c.title LIKE CONCAT('%', :query, '%')")
    List<Club> searchClubs(String query);

}
