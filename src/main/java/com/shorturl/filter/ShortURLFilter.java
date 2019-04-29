package com.shorturl.filter;

import com.shorturl.utils.StatisticsUtil;
import org.apache.tools.ant.taskdefs.condition.Http;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName ShortURLFilter
 * @Descripition 过滤短网址
 * @Author SunJie
 * @Date 2019/4/29 15:40
 */
public class ShortURLFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //先转换HttpServlet对象
        HttpServletResponse rep = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;

        //获取请求地址
        String url = req.getRequestURL().toString();
        //拦截短地址请求 转发到redirectUrl进行处理
        if (url.contains("goo.cn") || url.contains("sj.cn")){
            //进行短码请求的统计
            String substring = url.substring(url.lastIndexOf("/") + 1);
            if (StatisticsUtil.isKey(substring)){
                StatisticsUtil.numMap.put(substring,StatisticsUtil.numMap.get(substring)+1);
            }else {
                StatisticsUtil.numMap.put(substring,1);
            }
            req.getRequestDispatcher("/redirectUrl.action?shortUrl="+url).forward(req,rep);
            //打印统计次数
            StatisticsUtil.print();
            return;
        }
        //放行其他的请求
        chain.doFilter(req,rep);
    }

    @Override
    public void destroy() {

    }
}
