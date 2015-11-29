package com.test.htmlunit;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HtmlUnitTool tool = new HtmlUnitTool();
			//http://www.wandoujia.com/tag/%E8%B7%91%E9%85%B7%E7%AB%9E%E9%80%9F
			
			String page = tool.getPageByUnit("http://www.wandoujia.com/apps/com.moling.buyu10002.wdj");
			//System.out.println(page);
			Document docs = Jsoup.parse(page, "http://www.wandoujia.com/");
			Elements eles1 = docs.select("ul.comments-list").select("li");
			for (Element element : eles1) {
				System.out.println(element.text());
			}
			
			//System.out.println(doc.select("a.title"));
			/*Elements eles = doc.select("a.title");
			for (Element element : eles) {
				System.out.println(element);
			}*/
			//System.out.println(Jsoup.parse(page).select("h2.title1").text());
			
		/*	try {
				                                                    
				Document doc = Jsoup.connect("http://apps.wandoujia.com/api/v1/apps?ads_count=0&tag=%E8%B7%91%E9%85%B7%E7%AB%9E%E9%80%9F&max=12&start=21&opt_fields=apps.likesCount,apps.reason,apps.ad,apps.title,apps.packageName,apps.apks.size,apps.icons.px68,apps.apks.superior,apps.installedCountStr,apps.snippet,apps.editorComment,apps.apks.versionCode&callback=jQuery1830606678964947174_1434460849860&_=1434460854497").timeout(90000).get();
				System.out.println(doc);
				//System.out.println(doc.select(".app-desc"));
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
	}
}
