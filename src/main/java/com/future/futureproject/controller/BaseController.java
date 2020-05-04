package com.future.futureproject.controller;

import com.future.futureproject.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @Autowired
    private AdService adService;

    @GetMapping("/")
    public String baseMapping() {
        return "index";
    }
}
