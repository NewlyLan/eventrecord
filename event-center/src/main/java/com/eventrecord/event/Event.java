package com.eventrecord.event;

import java.util.TreeMap;

/**
 * @author 兰龙斌
 * @date Created in 2020/9/11 21:17
 * @description
 * @version: v1.0
 * 事件的定义，根据目前的设定，事件用接口定义
 * 事件必须有哪些行为呢？
 */
public interface Event {

    // 1、获取事件内容（包含每个时间点的内容），暂时考虑要查看某个时间点的内容，并且时间点是有序的
    // 但是这里不考虑细节，这个方法方法返回所有的事件内容
//    public EventContext getEventContent();

    // 添加事件
    public void addEventPoint(String eventBeginAndEndTime,EventPoint eventPoint);

    // 获取一个事件的内容
    public EventContext getEventContext();

}
