package com.codeclan.example.Whisky_Distillery.repositories;

import com.codeclan.example.Whisky_Distillery.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
    List<Distillery> getByRegionIgnoreCase(String region);
}
