package cn.bdqn.dao.impl;

import cn.bdqn.dao.DemoDao;
import cn.bdqn.demo.Demo1;

public class DemoDaoImpl implements DemoDao{

	public void saveDemo(Demo1 demo) {
		System.out.println("这是一个方法");
		//System.out.println(5/0);
	}

}
