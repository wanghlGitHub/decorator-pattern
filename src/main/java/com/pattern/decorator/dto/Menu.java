package com.pattern.decorator.dto;

/**
 * @program: decorator-pattern
 * @description: 菜单 pojo
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:36 下午
 * @Version: 1.0
 */
public class Menu {

	private int id;
	private String menuName;
	private int order;

	public Menu(int id, String menuName, int order) {
		this.id = id;
		this.menuName = menuName;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
