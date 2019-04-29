package com.shorturl.controll;

import com.shorturl.pojo.ShortUrl;
import com.shorturl.service.IShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;


/**
 * @ClassName ShortUrlControll
 * @Descripition 短链控制器
 * @Author SunJie
 * @Date 2019/4/29 1:16
 */
@Controller
public class ShortUrlControll {
    @Autowired
    private IShortUrlService shortUrlService;
    /**
     * @Description 获取短链的方法
     * @Param [shortUrl]
     * @return java.lang.Object
     **/
    @RequestMapping("getShortUrl")
    @ResponseBody
    public Object getShortUrl(ShortUrl shortUrl) throws Exception {
        return shortUrlService.getShortUrl(shortUrl);
    }
    /**
     * @Description 通过短链重定向到长链
     * @Param [shortUrl]
     * @return void
     **/
    @RequestMapping("redirectUrl")
    public ModelAndView redirectLongUrL(String shortUrl , ModelAndView modelAndView, HttpServletRequest request){
        //截取短链码
        String shortUrlCode = shortUrl.substring(shortUrl.lastIndexOf("/")+1);
        String longUrl = shortUrlService.findLongUrl(shortUrlCode);
        if ("error".equals(longUrl)){
            return modelAndView;
        }
        return new ModelAndView(new RedirectView(longUrl));
    }

}
