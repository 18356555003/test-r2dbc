package com.example.testr2dbc.controller;

import com.example.testr2dbc.dao.TestAbcDao;
import com.example.testr2dbc.entity.TestAbc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    TestAbcDao testAbcDao;

    @GetMapping
    public Flux<TestAbc> getAll(){
        return testAbcDao.findAll();
    }
    @GetMapping("/test")
    public Flux<TestAbc> getAllList(){
        return testAbcDao.testList();
    }
}
