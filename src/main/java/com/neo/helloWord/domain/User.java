package com.neo.helloWord.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
* @author rh
* @version 创建时间：2017年11月12日 下午8:44:48
*/
public class User {

	@NotEmpty(message = "姓名不能为空")
	private String name;
	
	@Max(value = 100, message="年龄不能大于100岁")
	@Min(value = 6, message = "必须年满是8岁")
	private int age;
	
	@NotEmpty(message = "密码不能为空")
	@Length(min = 6, message= "密码长度不能小于6位")
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", pass=" + pass + "]";
	}
	
	
}
