package com.lovo.spring.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TBean {
    //加载上下文
	private ClassPathXmlApplicationContext app=null;
	
	@Before
	public void before(){
		app=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void tstudent(){
	StudentEntity stu=	(StudentEntity) app.getBean("stu");//在容器里面去找我们需要的对象
	
    System.out.println(stu.getStuName());
	}
	
}
