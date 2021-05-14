package com.phong.jdbc.controllers;

import com.phong.jdbc.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @RequestMapping("master")
    public void master() {
        this.testService.save();
    }

    @RequestMapping("insertMaster")
    public void insertMaster(){
        this.testService.insert();
    }
    @RequestMapping("slave")
    public void slave() {
        this.testService.query();
    }

}