package com.pattern.decorator;

import com.pattern.decorator.dto.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: decorator-pattern
 * @description: 未登录状态下的菜单
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:40 下午
 * @Version: 1.0
 */
public class BaseMeneBar extends MenuBar {

	@Override
	protected List<Menu> getMenus() {
		List<Menu> menus = new ArrayList<>();
		menus.add(new Menu(1,"问答",1));
		menus.add(new Menu(2,"文章",2));
		menus.add(new Menu(6,"精品课",6));
		menus.add(new Menu(7,"冒泡",7));
		menus.add(new Menu(8,"商城",8));
		return menus;
	}
}
