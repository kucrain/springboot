package com.neo.helloWord.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
* @author rh
* @version 创建时间：2017年11月13日 下午1:38:54
*/
@Component
public class NeoProperties {

	@Value("${com.neo.helloWord.title}")
	private String title;
	@Value("${com.neo.helloWord.description}")
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desciption) {
		this.description = desciption;
	}
	
	
}
