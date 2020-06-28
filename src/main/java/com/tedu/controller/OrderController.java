package com.tedu.controller;

import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.DoorService;
import com.tedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private DoorService doorService;

    @RequestMapping("/orderList")
    public String orderList(Model model) {
        List<Order> list = orderService.findAll();
        model.addAttribute("list", list);

        List<Door> doorList = doorService.findAll();
        model.addAttribute("doorList", doorList);
        return "order_list";
    }

    @RequestMapping("/findAllDoorToOrderAll")
    public String toDoorAdd(Model model) {
        List<Door> doorList = doorService.findAll();
        model.addAttribute("doorList",doorList);
        return "order_add";
    }

    @RequestMapping("/orderAdd")
    public String orderAdd(Order order) {
        orderService.addOrder(order);
        return "redirect:/orderList";
    }

    @RequestMapping("/orderDelete")
    public String orderDelete(Integer id) {
        orderService.deleteById(id);
        return "redirect:/orderList";
    }

    @RequestMapping("/orderInfo")
    public String orderInfo(Integer id, Model model) {
        List<Door> doorList = doorService.findAll();
        model.addAttribute("doorList", doorList);

        Order order = orderService.findById(id);
        model.addAttribute("order", order);
        return "order_update";
    }

    @RequestMapping("/orderUpdate")
    public String orderUpdate(Order order) {
        orderService.updateById(order);
        return "redirect:/orderList";
    }
}
