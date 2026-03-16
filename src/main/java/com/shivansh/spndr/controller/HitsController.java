package com.shivansh.spndr.controller;

import com.shivansh.spndr.service.HitsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HitsController {

    private final HitsService hitsService;

    public HitsController(HitsService hitsService) {
        this.hitsService = hitsService;
    }

    @GetMapping("/hits")
    public int hits() {
        return hitsService.increment();
    }
}