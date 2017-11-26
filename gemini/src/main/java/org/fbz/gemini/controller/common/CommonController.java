package org.fbz.gemini.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    
    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("name", "gemini");
        return "views/index";
    }
}
