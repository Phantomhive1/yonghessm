package com.tedu.service;

import com.tedu.pojo.Order;

import java.util.List;

public interface OrderService {

    public List<Order> findAll();
    public void addOrder(Order order);
    public void deleteById(Integer id);
    public Order findById(Integer id);
    public void updateById(Order order);
}
