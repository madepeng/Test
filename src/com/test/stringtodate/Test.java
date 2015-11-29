package com.test.stringtodate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sss= new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
		try {
			Date date1 = sdf.parse("2008-08-08");
			Date date2 = sss.parse("2009-09-09");
			System.out.println(date1.after(date2));
			/*System.out.println(date1);
			System.out.println(sdf.format(date1));
			System.out.println(date2);
			System.out.println(date1.before(date2));*/
			
			//System.out.println(date1 > date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Date dt=new Date();
		 System.out.println(dt);
	     SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");
	    // System.out.println(matter1.format(dt));
	     
	     
	}

}
