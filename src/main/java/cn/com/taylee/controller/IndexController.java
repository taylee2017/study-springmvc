package cn.com.taylee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by apple on 16-12-7.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/main/{name}", method = RequestMethod.GET)
    public String mainPage(@PathVariable("name") String name, Model model){
        model.addAttribute("test", name);
        return "index";
    }

}
