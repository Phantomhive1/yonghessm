package com.tedu.service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoorServiceImpl implements DoorService {
    @Autowired
    private DoorMapper doorMapper;

    @Override
    public List<Door> findAll() {
        List<Door> list = doorMapper.findAll();
        return list;
    }

    @Override
    public void addDoor(Door door) {
        doorMapper.add(door);
    }

    @Override
    public void deleteById(Integer id) {
        doorMapper.deleteById(id);
    }

    @Override
    public Door findById(Integer id) {
        Door door = doorMapper.findById(id);
        return door;
    }

    @Override
    public void updateById(Door door) {
        doorMapper.updateById(door);
    }
}
