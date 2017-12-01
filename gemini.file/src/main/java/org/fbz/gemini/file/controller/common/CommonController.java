package org.fbz.gemini.file.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {
    
    @RequestMapping(value="/file")
    @ResponseBody
    public String index(Model model){
        return "this is file server";
    }
}
