package com.pattern.decorator.dto;

/**
 * @program: decorator-pattern
 * @description: 用户类
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:56 下午
 * @Version: 1.0
 */
public class User {

	private Long id;
	private String userName;
	private Boolean isLogin = false;

	public User(){}

	public User(Boolean isLogin) {
		this.isLogin = isLogin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getLogin() {
		return isLogin;
	}

	public void setLogin(Boolean login) {
		isLogin = login;
	}
}
