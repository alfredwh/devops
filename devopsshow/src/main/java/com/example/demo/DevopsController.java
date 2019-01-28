package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AlfredWang on 2019/1/28.
 */
@RestController
public class DevopsController {
    @RequestMapping("/")
    public String HelloWorl(){
        return "Hello DevOps";
    }
}
