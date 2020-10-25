package com.eventrecord.event.impl;

import com.eventrecord.event.EventContext;
import com.eventrecord.event.EventPoint;

import java.util.TreeMap;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 17:26
 * @description
 * @version: v1.0
 */
public class DefaultEventContext extends EventContext {
    private static EventContext EVENT_CONTEXT = new DefaultEventContext();
    private DefaultEventContext(){
        // 容量大小就用默认的
        eventContext = new TreeMap<>();
    }

    public static EventContext getDefaultEventContextInstance(){
        return EVENT_CONTEXT;
    }

    public TreeMap<String,EventPoint> getEventContent() {
        return eventContext;
    }
}
