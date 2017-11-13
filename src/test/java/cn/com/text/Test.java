package cn.com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.dao.DemoDao;
import cn.bdqn.demo.Demo1;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Demo2 d = context.getBean("demo2",Demo2.class);
//		System.out.println(d.getList());
//		System.out.println(d.getMap());
		
		DemoDao demoDao = context.getBean("demoDao",DemoDao.class);
		Demo1 demo = new Demo1();
		demoDao.saveDemo(demo);
	}
}
