package cn.com.taylee.controller;

import cn.com.taylee.bean.StudyBean;
import cn.com.taylee.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by apple on 16-12-7.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/main/{name}", method = RequestMethod.GET)
    public String mainPage(@PathVariable("name") String name, Model model){
        model.addAttribute("study", studyService.showIndex(name));
        return "index";
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StudyBean getInfo(@PathVariable("id") String id){
        return studyService.showInfo(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> listStudy(){
        return studyService.showList();
    }

}
