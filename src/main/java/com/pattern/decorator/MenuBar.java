package com.pattern.decorator;

import com.pattern.decorator.dto.Menu;

import java.util.List;

/**
 * @program: decorator-pattern
 * @description: 菜单栏类
 * @Author: heliang.wang
 * @Date: 2020/3/5 12:35 下午
 * @Version: 1.0
 */
public abstract class MenuBar {

	protected abstract List<Menu> getMenus();
}
