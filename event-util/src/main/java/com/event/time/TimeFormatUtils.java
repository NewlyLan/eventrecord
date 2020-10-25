package com.event.time;

import com.event.javacheck.CodeCheck;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 17:07
 * @description
 * @version: v1.0
 */
public abstract class TimeFormatUtils {
    protected String generateyyyyMMdd(Date date) throws Exception {
        CodeCheck.NullPointCheck(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(date);
    }
}
