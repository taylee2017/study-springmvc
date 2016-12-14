package cn.com.taylee.service;

import cn.com.taylee.bean.StudyBean;

import java.util.Map;

/**
 * Created by apple on 16-12-11.
 */
public interface StudyService {

    Integer addNumber(Integer a, Integer b);

    StudyBean showIndex(String name);

    StudyBean showInfo(String id);

    Map<String, Object> showList();

}
