package com.shorturl.mapper;

import com.shorturl.pojo.ShortUrl;

/**
 * @ClassName shortUrlMapper
 * @Descripition
 * @Author SunJie
 * @Date 2019/4/29 1:40
 */
public interface ShortUrlMapper {
    /**
     * @Description 像数据库里插入数据
     * @Param [shortUrl]
     * @return void
     **/
    void addShortUrl(ShortUrl shortUrl);
    /**
     * @Description 通过短链查询
     * @Param [shortCode]
     * @return com.shorturl.pojo.ShortUrl
     **/
    ShortUrl findShortUrlByShortCode(String shortCode);
    /**
     * @Description 通过长链查询
     * @Param [longUrl]
     * @return com.shorturl.pojo.ShortUrl
     **/
    ShortUrl findByLongUrl(String longUrl);
}

