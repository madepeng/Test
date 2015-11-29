package com.test.dynamicproxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractUserDAO userDAO =  new UserDAO();
		InvocationHandler handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO. class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
		proxy.findUserById("张无忌");
		
		AbstractDocumentDAO documentDAO = new DocumentDAO();
		handler = new DAOLogHandler(documentDAO);
		AbstractDocumentDAO proxynew = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
		proxynew.deleteDocumentById("D002");
		
	}

}
