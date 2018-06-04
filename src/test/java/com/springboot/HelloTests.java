package com.springboot;

import com.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTests {

    @Autowired
    private Person person;

    @Test
    public void contextLoads(){
        System.out.println(person);
    }

}
