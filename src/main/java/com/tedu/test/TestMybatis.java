package com.tedu.test;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        DoorMapper mapper = session.getMapper(DoorMapper.class);
        List<Door> list = mapper.findAll();
        for (Door door:list) {
            System.out.println(door);
        }
    }

}
