package org.springframework.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.propertiesBean.NameProperties;
import org.springframework.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明为一个配置类
@EnableConfigurationProperties(NameProperties.class)//指定配置文件映射的类
@ConditionalOnProperty(prefix = "spring.boot", value = "enable", matchIfMissing = true)//和@EnableConfigurationProperties一起使用关联到properties中属性
@ConditionalOnClass(HelloService.class)//在HelloService类存在的情况下
@ConditionalOnWebApplication//在web环境下
public class HelloServiceAutoConfiguration {
	@Autowired
	private NameProperties nameProperties;
	
	@Bean
	@ConditionalOnMissingBean//容器中如果不存在HelloService那么创建这个类
	public HelloService helloService() {
		
		HelloService helloService = new HelloService();
		helloService.setName(nameProperties.getName());
		return helloService;
	}
	
}
