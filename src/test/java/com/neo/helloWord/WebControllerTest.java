package com.neo.helloWord;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.portlet.MockActionResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.neo.helloWord.web.WebController;

/**
* @author rh
* @version 创建时间：2017年11月12日 下午8:48:48
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebControllerTest {

	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
	}
	
	@Test
	public void getUser() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.post("/getUser?")).andDo(MockMvcResultHandlers.print());
	}
	@Test
	public void getUsers() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.post("/getUsers")).andDo(MockMvcResultHandlers.print());
	}
	@Test
	public void getUserByName() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/getUserByName/neo")).andDo(MockMvcResultHandlers.print());
	}
	@Test
	public void saveUser() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
				.param("name", "")
				.param("age", "666")
				.param("pass", "test"))
				.andDo(MockMvcResultHandlers.print());
		
	}
}
