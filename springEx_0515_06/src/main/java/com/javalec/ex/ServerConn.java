package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class ServerConn implements EnvironmentAware, InitializingBean, DisposableBean {

	Environment env;
	String auth;
	String dirverClassName;
	String url;
	String username;
	String password;
	String name;
	String type;
	int maxActive;
	int maxWait;
	
	
	public void setEnvironment(Environment environment) {
		System.out.println("ServerConn env 값을 설정");
		setEnv(environment);
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("ServerConn 실행시 init 실행 메소드");
		setAuth(env.getProperty("auth"));
		setDirverClassName(env.getProperty("driverClassName"));
		setUrl(env.getProperty("url"));
		setUsername(env.getProperty("username"));
		setPassword(env.getProperty("password"));
		setName(env.getProperty("name"));
		setType(env.getProperty("type"));
		setMaxActive(Integer.parseInt(env.getProperty("maxActive")));
		setMaxWait(Integer.parseInt(env.getProperty("maxWait")));
	}
	
	public void destroy() throws Exception {
		System.out.println("ServerConn 종료시 destroy 실행");
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDirverClassName() {
		return dirverClassName;
	}

	public void setDirverClassName(String dirverClassName) {
		this.dirverClassName = dirverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}

	
	

}
