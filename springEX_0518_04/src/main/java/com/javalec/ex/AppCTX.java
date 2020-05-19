package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {

	@Value("${auth}")
	private String auth;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${url}")
	private String url;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	@Value("${name}")
	private String name;
	@Value("${type}")
	private String type;
	@Value("${maxActive}")
	private int maxActive;
	@Value("${maxWait}")
	private int maxWait;
	
	
	// java annotation을 이용하여 외부파일(환경설정파일)을 가져와 값 주입 하기 위해 파일 불러오기
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] location = new Resource[2];
		location[0] = new ClassPathResource("server1.properties");
		location[1] = new ClassPathResource("server2.properties");
		
		// 하나만 있을 경우
		// Resource location = new ClassPathResource("server1.properties");
		
		configurer.setLocations(location);
		
		return configurer;
	}
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		
		serverInfo.setAuth(auth);
		serverInfo.setDriverClassName(driverClassName);
		serverInfo.setUrl(url);
		serverInfo.setUsername(username);
		serverInfo.setPassword(password);
		serverInfo.setName(name);
		serverInfo.setType(type);
		serverInfo.setMaxActive(maxActive);
		serverInfo.setMaxWait(maxWait);

		return serverInfo;
	}
}
