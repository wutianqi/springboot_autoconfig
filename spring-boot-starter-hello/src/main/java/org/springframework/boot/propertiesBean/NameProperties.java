package org.springframework.boot.propertiesBean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.boot")
public class NameProperties {
	
	private final String  NAME = "spring"; //默认值
	
	private String name = NAME;//对应于properties文件中的"spring.boot.name

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
