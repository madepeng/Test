package com.test.jsoup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGetUrl {
	// 编码
	public static String encoding = "utf-8";
	public static String baseUrl = "http://www.tripadvisor.com";
	public static int pageNum = 1;

	public static void main(String[] args) {
		String url = "http://www.tripadvisor.com/Hotels-g294212-Beijing-Hotels.html";
		String nextUrl = deal(url);
		while (null != nextUrl) {
			nextUrl = deal(nextUrl);
		}
	}

	/**
	 * 主业务流
	 * 
	 * @param url
	 * @return
	 */
	private static String deal(String url) {
		System.out.println("开始处理第 [" + pageNum + "] 页 ");
		System.out.println("列表页url [" + url + "]  ");
		String html = downloadHtml(url, encoding).toString();
	
		// 处理当前页的链接
		dealDeatilUrl(html);
		pageNum++;
		// 处理下一页
		return dealNextPage(html);
	}

	/**
	 * 抽取下一页链接
	 * 
	 * @param input
	 *            :当前页源码
	 */
	public static String dealNextPage(String input) {
		String nextUrl = null;
		String regex = "<a href=\"(.*?)\" class=\"guiArw sprite-pageNext \"";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			nextUrl = baseUrl + matcher.group(1).trim();
		}
		return nextUrl;
	}

	/**
	 * 抽取酒店详细链接
	 * 
	 * @param input
	 *            :当前页源码
	 */
	public static void dealDeatilUrl(String input) {
		String regex = "<a href=\"(.*?)\" class=\"photo_link \"";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			System.out.println(baseUrl + matcher.group(1).trim());
		}
	}

	/**
	 * 下载页面</br>
	 * 
	 * @param page
	 *            </br>
	 * @return 页面源码
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	public static StringBuffer downloadHtml(String url, String encoding) {
		URL urlModel;
		HttpURLConnection httpURLConnection;
		StringBuffer sb = new StringBuffer();
		BufferedReader in = null;
		int tryNum = 0;
		while (true) {
			try {
				urlModel = new URL(url);
				httpURLConnection = (HttpURLConnection) urlModel
						.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.setReadTimeout(3000);
				httpURLConnection
						.setRequestProperty("User-Agent",
								"Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0)");
				String redirectUrl = httpURLConnection.getURL().toString();
				if (!redirectUrl.equals(url)) {
					System.err.println(url + "重定向后为" + redirectUrl);
				}
				String charSetHeader = httpURLConnection
						.getHeaderField("Content-Type");
				String charSet = null;
				if (charSetHeader != null) {
					Pattern p = Pattern.compile("charset=[\"']?(.*?)['\"]");
					Matcher m = p.matcher(charSetHeader);
					if (m.find())
						charSet = m.group(1).trim();
					if (null == charSet) {
						charSet = encoding;
					}
				}

				charSet = (charSet == null ? encoding : charSet);
				in = new BufferedReader(new InputStreamReader(
						httpURLConnection.getInputStream(), charSet));
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					sb.append(inputLine + "\n");
					inputLine = null;
				}
				if (in != null)
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				if (httpURLConnection != null)
					httpURLConnection.disconnect();
				break;
			} catch (Exception e) {
				if (tryNum++ == 3) {
					System.err.println("download page error [ " + url + " ] ");
					return null;
				}
			} finally {
				// try {
				// Thread.sleep(TimeUnit.SECONDS.toMillis(3));
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
			}
		}

		return sb;

	}
}
