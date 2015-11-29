package com.test.replace;

import java.math.BigDecimal;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "2.3亿";
			String str1 ="2.3亿";
			 
			if (str.contains("万")) {
				str = str.replace("万", "0000");
			}else if (str.contains("亿")) {
				Double r = Double.parseDouble(str.substring(0, str.length()-1))*1000000000;
				str = (new BigDecimal(r)).toString();
			}
			
	}

}
