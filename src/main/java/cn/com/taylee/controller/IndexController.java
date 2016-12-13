package cn.com.taylee.controller;

import cn.com.taylee.bean.StudyBean;
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

    @RequestMapping(value = "/main/{name}", method = RequestMethod.GET)
    public String mainPage(@PathVariable("name") String name, Model model){
        model.addAttribute("test", name);
        return "index";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public StudyBean getInfo(){
        StudyBean studyBean = new StudyBean();
        studyBean.setId("1");
        studyBean.setName("aa");
        studyBean.setTitle("bb");
        studyBean.setContent("cc");
        studyBean.setTime(new Date());
        return studyBean;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> listStudy(){
        List<StudyBean> listRes = new ArrayList<StudyBean>();
        for(int i = 0;i < 5;i ++){
            StudyBean studyBean = new StudyBean();
            studyBean.setId("id" + i);
            studyBean.setName("name" + i);
            studyBean.setTitle("title" + i);
            studyBean.setContent("content" + i);
            studyBean.setTime(new Date());
            listRes.add(studyBean);
        }
        Map<String,Object> mapModel = new HashMap<String,Object>();
        mapModel.put("status","true");
        mapModel.put("result",listRes);
        return mapModel;
    }

}
