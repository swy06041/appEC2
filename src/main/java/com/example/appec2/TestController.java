package com.example.appec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/api2")
public class TestController {

    @GetMapping("/getArr")
    public String[] getArr() {
        return new String[]{"AAA", "BBB", "CCC"};
    }

//    @GetMapping("/nice")
//    public String asd() {
//        return "nice";
//    }
}
