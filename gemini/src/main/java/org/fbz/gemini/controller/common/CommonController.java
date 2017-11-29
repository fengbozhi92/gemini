package org.fbz.gemini.controller.common;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    
    @RequestMapping(value="/")
    public String index(Model model, HttpSession session){
        return "views/index";
    }
    
    @RequestMapping(value="/test")
    public String test(Model model){
        model.addAttribute("name", "gemini");
        return "views/test";
    }
}
