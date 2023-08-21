package com.example.appec2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/api")
public class SampleControlller {
    @GetMapping("/asd")
    public String asd() {
        return "nice";
    }
}
