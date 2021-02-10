package com.codeclan.example.Whisky_Distillery.controllers;

import com.codeclan.example.Whisky_Distillery.models.Whisky;
import com.codeclan.example.Whisky_Distillery.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping("/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhisky(
            @RequestParam(name="year", required = false) Integer year
    ){ if (year != null){
        return new ResponseEntity<>(whiskyRepository.findAllWhiskyByYear(year), HttpStatus.OK);
    }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/whiskies/{id}")
    public ResponseEntity<Optional<Whisky>> getWhiskyById(@PathVariable Long id){
        return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/whiskies")
    public ResponseEntity<Whisky> createWhisky(@RequestBody Whisky whisky){
        return new ResponseEntity<>(whiskyRepository.save(whisky), HttpStatus.CREATED);
    }
}
