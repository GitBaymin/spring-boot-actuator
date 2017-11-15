/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package com.baron.actuator.endpoint;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.Endpoint;

/**
 * @author xuebai
 * @data 2017年11月13日16:01
 * @modify 2017年11月13日
 * @since v
 */
public class MyEndPoint implements Endpoint {
    private List<MemStatus> status;

    public MyEndPoint(List<MemStatus> status) {
        this.status = status;
    }

    /**
     * 自定义URL
     * @return URL
     */
    @Override
    public String getId() {
        return "my";
    }

    /**
     * 自定义Endpoint是否可用
     * @return 是
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * 是否是有敏感数据
     * @return 否
     */
    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public Object invoke() {
        if (status == null || status.isEmpty()) {
            return "hello world";
        }
        Map<String, List<Map<String, Object>>> result = new HashMap<>();
        for (MemStatus memStatus : status) {
            for (Map.Entry<String, Object> entry : memStatus.getStatus().entrySet()) {
                List<Map<String, Object>> collectList = result.get(entry.getKey());
                if (collectList == null) {
                    collectList = new LinkedList<>();
                    result.put(entry.getKey(), collectList);
                }
                Map<String, Object> soloCollect = new HashMap<>();
                soloCollect.put("date", memStatus.getDate());
                soloCollect.put(entry.getKey(), entry.getValue());
                collectList.add(soloCollect);
            }
        }
        return result;
    }

}
