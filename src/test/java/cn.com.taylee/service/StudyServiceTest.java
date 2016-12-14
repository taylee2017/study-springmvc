package cn.com.taylee.service;

import cn.com.taylee.bean.StudyBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by apple on 16-12-9.
 */
public class StudyServiceTest extends ServiceBaseTest {

    @Autowired
    private StudyService studyService;

    @Test
    public void testAddNumber(){
        int result = studyService.addNumber(2,4);
        assertEquals(6, result);

    }

    @Test
    public void testShowIndex(){
        String name = "aa";
        StudyBean studyBean = studyService.showIndex(name);
        assertNotNull(studyBean);
        assertEquals("1", studyBean.getId());
    }

    @Test
    public void testShowList(){
        Map<String, Object> result = studyService.showList();
        assertNotNull(result);
        assertEquals("true",result.get("status"));
    }

}