package com.example.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class SampleControlller {

    @GetMapping("/nice")
    public String asd() {
        return "nice";
    }
}
