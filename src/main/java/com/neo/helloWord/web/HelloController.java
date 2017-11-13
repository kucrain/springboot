package com.neo.helloWord.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author rh
* @version 创建时间：2017年11月12日 下午2:17:07
*/
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(String name){
		return "Hello World " + name;
	}
}
