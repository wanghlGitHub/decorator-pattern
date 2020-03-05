package com.pattern.decorator;

import com.pattern.decorator.dto.Menu;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: decorator-pattern
 * @description: 登录后的菜单
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:50 下午
 * @Version: 1.0
 */
public class LoginMenuBar extends MenuBarDecorator {


	public LoginMenuBar(MenuBar menuBar) {
		super(menuBar);
	}

	@Override
	protected List<Menu> getMenus() {
		List<Menu> menus = super.getMenus();
		menus.add(new Menu(3,"作业",3));
		menus.add(new Menu(4,"题库",4));
		menus.add(new Menu(5,"成长墙",5));
		menus.sort(Comparator.comparingInt(Menu::getOrder));
		return menus;
	}
}
