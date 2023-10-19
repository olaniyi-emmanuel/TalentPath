package com.olaniyi;

import com.olaniyi.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findall();
}
