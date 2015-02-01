package com.test;

import java.util.Iterator;
import java.util.Vector;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.brilliant.action.OperateLogBean;
import com.brilliant.action.OperateLogDAO;


public class LogTest {
	private OperateLogDAO log;
	//private OperateLogBean bean;
	
	//初始化方法
	@Before
	public void init(){
		log= new OperateLogDAO();
	}
	
	
	//测试方法
	@Test
	public void TestgetOperateLog(){
		
		Vector<OperateLogBean> vec=new Vector<OperateLogBean>();
		//bean= new OperateLogBean();
		vec=log.getOperateLog("'admin'", 1,"2010-01-01 00:00:00", "2013-04-01 23:00:00");
		Iterator it = vec.iterator();
//		while(it.hasNext()){
//			OperateLogBean bean = (OperateLogBean)it.next();
//			System.out.println(bean.getUserid());
//		}
		if(it.hasNext()){
			OperateLogBean bean = (OperateLogBean)it.next();
//			Assert.assertEquals(bean.getUserid(), "admin");
			Assert.assertTrue(bean.getUserid().equals("admin"));
//			Assert.assertFalse(bean.getUserid().equals("admin"));
		}
		System.out.println(vec.size());
		System.out.println("成功！！！！！！");
	}
	
	//@After
	
}
