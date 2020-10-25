package com.eventrecord.event;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 16:44
 * @description
 * @version: v1.0
 * 事件点，也就是说一个事件是由多个事件点组成
 */
public abstract class EventPoint {

    // 1、事件点的起止时间，可以是一天，最小单位是一天
    protected String eventPointTime;

    // 2、事件点的内容，因为有文字、视频、图片，组合或者单个,图片和视频暂时考虑用连接代替
    // 或许这个事件点又有多个阶段的内容，比如1号产生了什么事情，2号又产生了什么事情
    // 或者是1号上午产生了什么事情，下午产生了是什么事情。用链表记录一个事件点的经过
    protected List<String> eventContent;

}
