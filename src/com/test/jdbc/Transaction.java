package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Transaction {

	private static final String DRIVERNAME="com.mysql.jdbc.Driver";  
    private static final String URL="jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8";  
    private static final String USERNAME="root";  
    private static final String PASSWORD="root"; 
    
    public static Connection getConnection(){  
        Connection conn=null;  
          
        try {  
            Class.forName(DRIVERNAME);  
            conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);  
              
            System.out.print(conn.toString());  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }         
        return conn;  
    }//Connection


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "fdsfdsf";
		System.out.println(s.length());
		System.out.println(s.substring(0, s.length()-1));
		Connection conn = getConnection();
		try {
			
			conn.setAutoCommit(false);
			java.sql.Statement stmt =  conn.createStatement();
			
			stmt.executeUpdate("update user Set username='hgtdfg' Where ID = 1");   
			   
			stmt.executeUpdate("update user Set username='fsdfdsf' Where ID = 2");   
			   
			//stmt.executeUpdate("insert into user ID = 12，Name = 'testTransaction2'");    
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	
		
	}
}
