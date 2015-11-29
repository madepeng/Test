package com.test.dynamicproxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAOLogHandler implements InvocationHandler {
	public Object object;
	Calendar calendar;
	public  DAOLogHandler() {
		
	}
	public  DAOLogHandler(Object object) {
		this.object = object;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		beforeInvoke();
		method.invoke(object, args);
		afterInvoke();
		return null;
	}
	
	//记录方法调用时间  
    public void beforeInvoke(){  
        calendar = new GregorianCalendar();  
        int hour = calendar.get(Calendar.HOUR_OF_DAY);  
        int minute = calendar.get(Calendar.MINUTE);  
        int second = calendar.get(Calendar.SECOND);  
        String time = hour + ":" + minute + ":" + second;  
        System.out.println("调用时间：" + time);  
    }  
  
    public void afterInvoke(){  
        System.out.println("方法调用结束！" );  
    }  
}  


