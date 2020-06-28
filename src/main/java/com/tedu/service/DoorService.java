package com.tedu.service;

import com.tedu.pojo.Door;

import java.util.List;

public interface DoorService {
    public List<Door> findAll();
    public void addDoor(Door door);
    public void deleteById(Integer id);
    public Door findById(Integer id);
    public void updateById(Door door);
}
