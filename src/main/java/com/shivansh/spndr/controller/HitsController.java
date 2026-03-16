package com.shivansh.spndr.controller;

import com.shivansh.spndr.service.HitsService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://spndr-tracker.netlify.app")
@RestController
@RequestMapping("/hits")
public class HitsController {

    private final HitsService hitsService;

    public HitsController(HitsService hitsService) {
        this.hitsService = hitsService;
    }

    @GetMapping
    public long getHits() {
        return hitsService.getHits();
    }

    @PostMapping
    public void incrementHits() {
        hitsService.incrementHits();
    }
}