package com.neo.helloWord;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.neo.helloWord.web.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWordApplicationTests {

	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void hello(){
		System.out.println("hello world");
	}
	
	@Before
	public void setUp () throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}
	
	@Test
	public void getHello() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=ruanhang")).andDo(MockMvcResultHandlers.print());
	}

}
