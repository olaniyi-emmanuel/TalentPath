package com.olaniyi;

import com.olaniyi.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findall() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Emmanuel");
        speaker.setLastName("Olaniyi");
        speakers.add(speaker);

        return speakers;

    }
}
