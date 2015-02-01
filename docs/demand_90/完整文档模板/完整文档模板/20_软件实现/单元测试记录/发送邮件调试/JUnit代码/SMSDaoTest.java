package com.brilliant.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.brilliant.sms.action.SMSDao;


public class SMSDaoTest {

	private SMSDao smsend = new SMSDao();
    
    @Before
    public void init() {        
       
    }
    
    @After
    public void destory() {
        System.gc();
    }
    
    public final void fail(String string) {
        System.out.println(string);
    }
    
    public final void failRed(String string) {
        System.err.println(string);
    }
    
   @Test
   public void testsendMail() {
	    String actionName = "Thank you!";
	    String taskID = "3";
	    String emails = "liuzew@qq.com;949018980@qq.com";
	    smsend.sendMail(actionName, taskID, emails);
   }
   

}
