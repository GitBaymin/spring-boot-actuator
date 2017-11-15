/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package com.baron.actuator.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuebai
 * @data 2017年11月13日16:33
 * @modify 2017年11月13日
 * @since v
 */
@Configuration
public class EndPointAutoConfig {
    private List<MemStatus> status = new ArrayList<>();

    @Bean
    public MyEndPoint myEndPoint() {
        return new MyEndPoint(status);
    }

    @Bean
    public MemCollector memCollector() {
        return new MemCollector(status);
    }
}
