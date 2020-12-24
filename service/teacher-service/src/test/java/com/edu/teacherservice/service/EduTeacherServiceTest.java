package com.edu.teacherservice.service;

import com.edu.teacherservice.TeacherServiceApplication;
import com.edu.teacherservice.mapper.EduTeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author pengwei
 * @date 2020/12/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeacherServiceApplication.class)
public class EduTeacherServiceTest {

    @Resource
    private EduTeacherService eduTeacherService;

    @Resource
    private EduTeacherMapper eduTeacherMapper;

    /**
     * 逻辑删除(测试)
     */
    @Test
    public void DeletById(){
//         eduTeacherMapper.deleteById(111L);
        boolean b = eduTeacherService.removeById(222L);
        System.out.println("result:"+b);
    }
}