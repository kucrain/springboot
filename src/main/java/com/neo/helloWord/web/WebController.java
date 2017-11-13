package com.neo.helloWord.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neo.helloWord.domain.User;

/**
* @author rh
* @version 创建时间：2017年11月12日 下午8:46:22
*/
@RestController
//@RequestMapping("/web")
public class WebController {

	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public User getUser(){
		User user = new User();
		user.setName("小明");
		user.setAge(15);
		user.setPass("123456");
		return user;
	}
	
	@RequestMapping("/getUsers")
	public List<User> getUsers(){
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setName("neo");
		user1.setAge(17);
		user1.setPass("123");
		list.add(user1);
		
		User user2 = new User();
		user2.setName("小明");
		user2.setAge(16);
		user2.setPass("123");
		list.add(user2);
		
		return list;
	}
	
	@RequestMapping(value = "getUserByName/{name}", method = RequestMethod.GET)
	public User getUserByName(@PathVariable String name){
		User user = new User();
		user.setName(name);
		return user;
	}
	@RequestMapping("/saveUser")
	public void saveUser(@Valid User user , BindingResult result){
		System.out.println("user:" + user);
		if(result.hasErrors()){
			List<ObjectError> list = result.getAllErrors();
			for(ObjectError error : list){
				System.out.println(error.getCode() + "-" + error.getDefaultMessage());
			}
		}
	}
}
