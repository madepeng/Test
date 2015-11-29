package com.test.singleton;

public class Double {
	 private  static Double singleton;  
	    private Double (){}  
	    public static Double getDouble() {  
	    if (singleton == null) {  
	        synchronized (Double.class) {  
	        if (singleton == null) {  
	            singleton = new Double();  
	        }  
	        }  
	    }  
	    return singleton;  
	    }  
}
