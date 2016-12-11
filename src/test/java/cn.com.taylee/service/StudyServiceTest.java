package cn.com.taylee.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by apple on 16-12-9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudyServiceTest {

    @Autowired
    private StudyService studyService;

    @Test
    public void testAddNumber(){
        int result = studyService.addNumber(2,4);
        assertEquals(6, result);

    }

}