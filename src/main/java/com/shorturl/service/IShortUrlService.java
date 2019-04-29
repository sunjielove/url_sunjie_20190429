package com.shorturl.service;

import com.shorturl.pojo.ShortUrl;

/**
 * @ClassName IShortUrlService
 * @Descripition 短链服务层接口
 * @Author SunJie
 * @Date 2019/4/29 2:38
 */
public interface IShortUrlService {
    /**
     * @Description 生成短链
     * @Param [shortUrl]
     * @return java.lang.Object
     **/
    Object getShortUrl(ShortUrl shortUrl) throws Exception;
    /**
     * @Description 获取长链
     * @Param [longUrl]
     * @return java.lang.String
     **/
    String findLongUrl(String shortUrl);

}
