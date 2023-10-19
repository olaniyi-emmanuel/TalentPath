package com.olaniyi.service;

import com.olaniyi.HibernateSpeakerRepositoryImpl;
import com.olaniyi.SpeakerRepository;
import com.olaniyi.model.Speaker;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    public List<Speaker> findall() {
        return repository.findall();
    }

}
