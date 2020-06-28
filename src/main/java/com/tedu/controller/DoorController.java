package com.tedu.controller;

import com.tedu.pojo.Door;
import com.tedu.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //将当前对象的创建交给Spring管理；作为控制层代码的标识
public class DoorController {

    @Autowired
    private DoorService doorService;

    @RequestMapping("/doorList")
    public String doorList(Model model) {
        List<Door> list = doorService.findAll();
        model.addAttribute("list",list);
        return "door_list";
    }

    @RequestMapping("/doorAdd")
    public String doorAdd(Door door) {
        doorService.addDoor(door);
        return "redirect:/doorList";
    }

    @RequestMapping("/doorDelete")
    public String doorDelete(Integer id) {
        doorService.deleteById(id);
        return "redirect:/doorDelete";
    }

    @RequestMapping("/doorInfo")
    public String doorInfo(Integer id, Model model) {
        Door door = doorService.findById(id);
        model.addAttribute("door", door);
        return "door_update";
    }

    @RequestMapping("/doorUpdate")
    public String doorUpdate(Door door) {
        doorService.updateById(door);
        return "redirect:/doorList";
    }


}
