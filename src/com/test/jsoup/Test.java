package com.test.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Element ele = Jsoup.connect("http://www.dajie.com/publicprofile/zhuzhiqing-W3Jf4RCT6fE*").timeout(90000).get();
			//System.out.println(ele.getElementsByAttributeValue("class", "record-bd line-bg").text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Parsed HTML into a doc.</p></body></html>";
			//	Document doc = Jsoup.parse(html);
		
				//System.out.println(doc.select("body p"));
				
				try {
					Document  doc = Jsoup.connect("http://www.wandoujia.com/apps/com.tencent.mobileqq").timeout(80000).get();
					System.out.println(doc.select("div.download-wp"));
					String str = doc.select("div.download-wp").select("a").attr("href");
					System.out.println(str);
					System.out.println(Jsoup.connect("http://dl.wandoujia.com/files/third/WanDouJiaSetup_a9.exe"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		
	}

}
