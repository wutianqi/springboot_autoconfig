package org.springframework.boot.service;

/**
 * 
 * 
 * @author wuqi
 * @date 2017/12/05
 */

public class HelloService {
	//通过Poperties类获得
	private String name;
	
	public String sayHello() {
		return name + " say hello";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
