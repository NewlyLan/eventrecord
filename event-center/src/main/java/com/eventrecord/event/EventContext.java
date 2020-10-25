package com.eventrecord.event;

import java.util.TreeMap;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 16:39
 * @description
 * @version: v1.0
 * 一个事件的所有内容
 */
public abstract class EventContext implements Event{

    // key：事件起止时间
    // value：时间点的内容
    protected TreeMap<String,EventPoint> eventContext;

    // 添加事件点
    public void addEventPoint(String eventBeginAndEndTime,EventPoint eventPoint){
        eventContext.putIfAbsent(eventBeginAndEndTime,eventPoint);
    }

    @Override
    public EventContext getEventContext() {
        return this;
    }
}
