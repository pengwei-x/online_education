package com.edu.teacherservice.controller;


import com.edu.teacherservice.service.EduTeacherService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author pengwei
 * @since 2020-12-23
 */
@RestController
@RequestMapping("/teacher")
public class EduTeacherController {

    @Resource
    private EduTeacherService eduTeacherService;

    @DeleteMapping("{id}")
    public Boolean logicDelete(@PathVariable Long id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }

}

