package com.shorturl.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StatisticsUtil
 * @Descripition 统计请求次数工具类
 * @Author SunJie
 * @Date 2019/4/29 17:16
 */
public class StatisticsUtil {
    public static Map<String,Integer> numMap;
    static {
        numMap = new HashMap<>();
    }
    /**
     * @Description 判断此map是否有Key的值
     * @Param [key]
     * @return boolean
     **/
     public static boolean  isKey(String key){
        return numMap.containsKey(key)?true:false;
    }
    /**
     * @Description 打印统计次数
     * @Param []
     * @return void
     **/
    public static void print(){
        for (Map.Entry entry :numMap.entrySet()
             ) {
            System.out.println(entry.getKey() +" 短码请求了"+entry.getValue()+"次");
        }
    }

}
