package com.neo.helloWord;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.helloWord.comm.NeoProperties;

/**
* @author rh
* @version 创建时间：2017年11月13日 下午1:41:16
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class NeoPropertiesTest {

	@Resource
	public NeoProperties properties;
	
	@Test
	public void testNeoProperties(){
		System.out.println(properties.getTitle());
		System.out.println(properties.getDescription());
	}
}
