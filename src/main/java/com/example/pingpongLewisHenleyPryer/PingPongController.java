package com.example.pingpongLewisHenleyPryer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @RequestMapping("/ping")
    public String pingPong() {
        String pong = "pong";
        return pong;
    }

}
