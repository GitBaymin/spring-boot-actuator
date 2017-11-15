/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package com.baron.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author xuebai
 * @data 2017年11月13日14:35
 * @modify 2017年11月13日
 * @since v
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = 0;
        if(errorCode!=0){
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }
}
