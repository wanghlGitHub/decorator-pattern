package com.pattern.decorator;

import com.pattern.decorator.dto.Menu;

import java.util.List;

/**
 * @program: decorator-pattern
 * @description: 菜单装饰类
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:47 下午
 * @Version: 1.0
 */
public class MenuBarDecorator extends MenuBar {

	private MenuBar menuBar;

	public MenuBarDecorator(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	@Override
	protected List<Menu> getMenus() {
		return this.menuBar.getMenus();
	}
}
