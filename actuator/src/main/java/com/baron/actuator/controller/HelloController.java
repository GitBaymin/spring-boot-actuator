/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package com.baron.actuator.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baron.actuator.endpoint.MemStatus;

/**
 * @author xuebai
 * @data 2017年11月13日15:13
 * @modify 2017年11月13日
 * @since v
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Object greet() {
        MemStatus memStatus = new MemStatus();
        memStatus.setDate(new Date());
        for (int i = 0; i < 1000000; i++){
            for (int j = 0; j < 100000; j++){

            }
        }
        return memStatus;
    }

}
