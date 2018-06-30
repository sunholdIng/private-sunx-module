package com.sunx;

import com.sunx.aop.demo.service.ClientDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrxSunxDemoModuleApplicationTests {

	@Autowired
	private ClientDemo clientDemo;

	@Test
	public void contextLoads() {
	}




}
