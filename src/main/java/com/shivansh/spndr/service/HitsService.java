package com.shivansh.spndr.service;

import org.springframework.stereotype.Service;

@Service
public class HitsService {

    private int hits = 0;

    public int increment() {
        hits++;
        return hits;
    }

}