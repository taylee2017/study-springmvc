package cn.com.taylee.service.impl;

import cn.com.taylee.bean.StudyBean;
import cn.com.taylee.service.StudyService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by apple on 16-12-9.
 */
@Service
public class StudyServiceImp implements StudyService {

    public Integer addNumber(Integer a, Integer b) {
        return a + b;
    }

    public StudyBean showIndex(String name) {
        StudyBean studyBean = new StudyBean();
        studyBean.setId("1");
        studyBean.setName(name);
        studyBean.setTitle("bb");
        studyBean.setContent("cc");
        studyBean.setTime(new Date());
        return studyBean;
    }

    public StudyBean showInfo(String id) {
        StudyBean studyBean = new StudyBean();
        studyBean.setId(id);
        studyBean.setName("aa");
        studyBean.setTitle("bb");
        studyBean.setContent("cc");
        studyBean.setTime(new Date());
        return studyBean;
    }

    public Map<String, Object> showList() {
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
