package org.fbz.gemini.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value="/login")
    public String login(HttpServletRequest req){
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        if (StringUtils.isNotBlank(uname) && StringUtils.isNotBlank(pwd)) {
            UsernamePasswordToken token = new UsernamePasswordToken();
            SecurityUtils.getSubject().login(token);
        }
        return "views/login/login";
    }
    
    @RequestMapping(value="/alogin")
    @ResponseBody
    public Map<String, Object> alogin(HttpServletRequest req){
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        Map<String, Object> result = new HashMap<String, Object>();
        if (StringUtils.isNotBlank(uname) && StringUtils.isNotBlank(pwd)) {
            // 1、获取Subject实例对象
            Subject currentUser = SecurityUtils.getSubject();
    
            // 2、判断当前用户是否登录
            if (currentUser.isAuthenticated() == false) {
                // 3、将用户名和密码封装到UsernamePasswordToken
                UsernamePasswordToken token = new UsernamePasswordToken(uname, pwd);
                // 4、认证
                try {
                    currentUser.login(token);// 传到MyAuthorizingRealm类中的方法进行认证
                    Session session = currentUser.getSession();
                    session.setAttribute("uname", uname);
                    result.put("result", true);
                    return result;
                } catch (AuthenticationException e) {
                    
                }
            }
        }
        result.put("result", false);
        return result;
    }
    
}
