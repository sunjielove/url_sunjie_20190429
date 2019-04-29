package com.shorturl.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @ClassName MD5Util
 * @Descripition MD5工具类
 * @Author SunJie
 * @Date 2019/4/29 1:00
 */
public class MD5Util {
    /**
     * @Description MD5加密
     * @Param [text, key]
     * @return java.lang.String
     **/
    public static String md5(String text, String key) throws Exception {
        //加密后的字符串
        String encodeStr= DigestUtils.md5Hex(text + key);
        return encodeStr;
    }

    /**
     * @Description MD5验证方法
     * @Param [text, key, md5]
     * @return boolean
     **/
    public static boolean verify(String text, String key, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text, key);
        if(md5Text.equalsIgnoreCase(md5))
        {
            // System.out.println("MD5验证通过");
            return true;
        }

        return false;
    }

}
