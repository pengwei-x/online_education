package com.edu.teacherservice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.teacherservice.entity.EduTeacher;
import com.edu.teacherservice.service.EduTeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pengwei
 * @date 2020/12/24
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeacherServiceApplication.class)
public class TeacherServiceApplicationTest {

    @Resource
    private EduTeacherService eduTeacherService;

    @Test
    public void getTeachersAll(){
        QueryWrapper<EduTeacher> queryWrapper=new QueryWrapper<>();

        List<EduTeacher> list = eduTeacherService.list(null);
        list.forEach(eduTeacher -> System.out.println(eduTeacher.toString()));
    }

}