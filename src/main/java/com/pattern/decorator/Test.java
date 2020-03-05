package com.pattern.decorator;

import com.alibaba.fastjson.JSON;
import com.pattern.decorator.dto.Menu;
import com.pattern.decorator.dto.User;

import java.util.List;

/**
 * @program: decorator-pattern
 * @description:
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:58 下午
 * @Version: 1.0
 */
public class Test {

	public static void main(String[] args) {
		User user = new User();
		MenuBar menuBar = null;
		if (!user.getLogin()) {
			menuBar = new BaseMeneBar();
			List<Menu> menus = menuBar.getMenus();
			System.out.println(JSON.toJSON(menus));
		}
		user.setLogin(true);
		if (user.getLogin()) {
			menuBar = new LoginMenuBar(menuBar);
			List<Menu> menus = menuBar.getMenus();
			System.out.println(JSON.toJSON(menus));
		}
	}
}
