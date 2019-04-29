package com.shorturl.pojo;

import java.io.Serializable;

/**
 * @ClassName ShortUrl
 * @Descripition 断链实体类
 * @Author SunJie
 * @Date 2019/4/29 1:28
 */
public class ShortUrl implements Serializable {
    private static final long serialVersionUID = 3319414135132614748L;
    /**
     * 主键
     **/
    private  int shortId;
    /**
     * 短链码
     **/
    private String shortUrlCode;
    /**
     * 长链
     **/
    private String longUrl;
    /**
     * 设备类型
     **/
    private String device;
    /**
     * 短码前缀
     **/
    private String shortPrefix;

    public ShortUrl() {
    }

    public ShortUrl(int shortId, String shortUrlCode, String longUrl, String device, String shortPrefix) {
        this.shortId = shortId;
        this.shortUrlCode = shortUrlCode;
        this.longUrl = longUrl;
        this.device = device;
        this.shortPrefix = shortPrefix;
    }

    public int getShortId() {
        return shortId;
    }

    public void setShortId(int shortId) {
        this.shortId = shortId;
    }

    public String getShortUrlCode() {
        return shortUrlCode;
    }

    public void setShortUrlCode(String shortUrlCode) {
        this.shortUrlCode = shortUrlCode;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getShortPrefix() {
        return shortPrefix;
    }

    public void setShortPrefix(String shortPrefix) {
        this.shortPrefix = shortPrefix;
    }

    @Override
    public String toString() {
        return "ShortUrl{" +
                "shortId=" + shortId +
                ", shortUrlCode='" + shortUrlCode + '\'' +
                ", longUrl='" + longUrl + '\'' +
                ", device='" + device + '\'' +
                ", shortPrefix='" + shortPrefix + '\'' +
                '}';
    }
}
