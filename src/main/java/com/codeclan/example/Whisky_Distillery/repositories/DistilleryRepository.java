package com.codeclan.example.Whisky_Distillery.repositories;

import com.codeclan.example.Whisky_Distillery.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
}
