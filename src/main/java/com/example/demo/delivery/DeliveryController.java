package com.example.demo.delivery;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/delivery")
public class DeliveryController {

    @GetMapping("/post")
    public String getPost() {
        return "Post Delivering";
    }

    @GetMapping("/dhd")
    public String getDYD() {
        return "DHL Delivering";
    }

}
