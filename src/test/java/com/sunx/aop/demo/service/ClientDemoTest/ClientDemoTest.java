package com.sunx.aop.demo.service.ClientDemoTest;

import com.sunx.aop.demo.service.ClientDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sunholdIng on 2018/6/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDemoTest {

    @Autowired
    private ClientDemo clientDemo;

    @Test
    public void testClientDemo(){
        clientDemo.clientBefore();
        clientDemo.clientBefore1();
    }
}
