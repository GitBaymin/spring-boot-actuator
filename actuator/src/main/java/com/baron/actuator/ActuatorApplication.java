/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package com.baron.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * 描述该类实现的功能
 *
 * @author xuebai
 * @date 20171110 17:06:26
 * @modify 20171110 xuebai
 * @since v
 */
@SpringBootApplication
@Configuration
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }
}
