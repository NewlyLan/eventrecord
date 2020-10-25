package com.event.time;

import java.util.Date;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 17:19
 * @description
 * @version: v1.0
 */
public class EventTimeFormatUtils extends TimeFormatUtils {
    public String formatEventKeyTime(Date eventBeginTime, Date eventEndTime) throws Exception {
        return generateyyyyMMdd(eventBeginTime) + generateyyyyMMdd(eventEndTime);
    }
}
