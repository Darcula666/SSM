package com.gfdz.test;

import com.gfdz.bean.Employee;
import com.gfdz.dao.DepartmentMapper;
import com.gfdz.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {
        EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i <1000 ; i++) {
            String uuid = UUID.randomUUID().toString().substring(0, 5);
            mapper.insertSelective(new Employee(i,uuid,"M",uuid+"@gfdz.com",1));
        }
    }
}
