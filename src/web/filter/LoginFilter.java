package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 登录验证的过滤器
 */
@WebFilter("/*")
public class LoginFilter implements Filter {


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //强制转换HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) req;
        //1.获取资源请求路径
        String url = request.getRequestURI();

        //2.判断是否包含登录相关资源路径
        if(url.contains("/login.jsp") || url.contains("/LoginServlet") || url.contains("/css/")|| url.contains("/js/")|| url.contains("/fonts/")|| url.contains("/CheckCodeServlet") ){
            //包含，用户想登陆。放行
            chain.doFilter(req, resp);
        }else{
            //不包含，需要验证用户是否登录
            //3.从获取session中获取user
            Object user = request.getSession().getAttribute("user");
            if(user != null){
                chain.doFilter(req,resp);
            }else{
                //没有登录，跳转到登录页面
                request.setAttribute("login_msg","您尚未登录，请登录！");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }


}
