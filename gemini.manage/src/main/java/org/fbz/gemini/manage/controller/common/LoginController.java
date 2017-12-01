package org.fbz.gemini.manage.controller.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.fbz.gemini.common.ResultData;
import org.fbz.gemini.domain.login.Login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController extends BaseController{
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @RequestMapping(value="/")
    public String login(HttpServletRequest req){
        return "views/login/login";
    }
    
    @RequestMapping(value="/login")
    @ResponseBody
    public ResponseEntity<ResultData> alogin(Login login){
        String username = login.getE();
        String password = login.getD();
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            Subject currentUser = SecurityUtils.getSubject();
            if (currentUser.isAuthenticated() == false) {
                UsernamePasswordToken token = new UsernamePasswordToken(username, password);
                try {
                    currentUser.login(token);
                    return renderSuccess();
                } catch (AuthenticationException e) {
                    e.printStackTrace();
                }
            }
        }
        return renderError();
    }
    
}
