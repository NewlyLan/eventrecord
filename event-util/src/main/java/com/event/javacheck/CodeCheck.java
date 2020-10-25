package com.event.javacheck;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 17:14
 * @description
 * @version: v1.0
 */
public class CodeCheck {
    public static void NullPointCheck(Object object) throws Exception {
        if(object == null){
            // 暂时先不考虑错误码的封装
            throw new Exception("空指针异常");
        }
    }
}
