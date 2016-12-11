package cn.com.taylee.service.impl;

import cn.com.taylee.service.StudyService;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 16-12-9.
 */
@Service
public class StudyServiceImp implements StudyService {

    public Integer addNumber(Integer a, Integer b) {
        return a + b;
    }
}
