package com.codeclan.example.Whisky_Distillery.repositories;

import com.codeclan.example.Whisky_Distillery.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
}
