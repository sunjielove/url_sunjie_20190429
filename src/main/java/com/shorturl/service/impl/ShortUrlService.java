package com.shorturl.service.impl;

import com.shorturl.mapper.ShortUrlMapper;
import com.shorturl.pojo.ShortUrl;
import com.shorturl.service.IShortUrlService;
import com.shorturl.utils.ShortUrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName ShortUrlService
 * @Descripition
 * @Author SunJie
 * @Date 2019/4/29 2:41
 */
@Service
@Transactional
public class ShortUrlService implements IShortUrlService {
    @Autowired
    private ShortUrlMapper shortUrlMapper;
    @Override
    public Object getShortUrl(ShortUrl shortUrl) throws Exception {
        //查询此longUrl是否已经存在 存在返回短链 不存在生成短链
        ShortUrl longUrl = shortUrlMapper.findByLongUrl(shortUrl.getLongUrl());
        if (null!=longUrl&&!("".equals(longUrl.getShortUrlCode()))){
            return "http://"+shortUrl.getShortPrefix()+":8080/shortUrl/"+longUrl.getShortUrlCode();
        }
        //生成短链
        String[] shortUrls = ShortUrlUtil.shortUrl(shortUrl.getLongUrl());
        String shortUrl1 = "http://"+shortUrl.getShortPrefix()+":8080/shortUrl/"+shortUrls[0];
        shortUrl.setShortUrlCode(shortUrls[0]);
        shortUrlMapper.addShortUrl(shortUrl);
        return shortUrl1;
    }

    @Override
    public String findLongUrl(String shortUrl) {
        ShortUrl shortUrlByShortCode = shortUrlMapper.findShortUrlByShortCode(shortUrl);
        if (null==shortUrlByShortCode){
            return "error";
        }
        return shortUrlByShortCode.getLongUrl();
    }


}
