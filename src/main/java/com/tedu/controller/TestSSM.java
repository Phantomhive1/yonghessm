package com.tedu.controller;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestSSM {

    @Autowired
    DoorMapper doorMapper;

    @RequestMapping("/testSSM")
    public String testSSM() {
        List<Door> doors = doorMapper.findAll();
        for (Door door:doors) {
            System.out.println(door);
        }
        return "test";
    }

}
