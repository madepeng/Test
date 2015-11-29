package parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

import javax.net.ssl.SSLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;

public class Crawl {

	public static HttpGet httpget;
	public static HttpEntity entity;
	public static StringBuilder HtmltoString;
	public static MyRetryHandler RetryHandler;
	public static CloseableHttpResponse response;
	public static CloseableHttpClient httpclient;

	public static class MyRetryHandler implements HttpRequestRetryHandler {
		public boolean retryRequest(IOException exception, int executionCount,
				HttpContext context) {
			if (executionCount >= 5) {
				// Do not retry if over max retry count
				return false;
			}
			if (exception instanceof InterruptedIOException) {
				// Timeout
				return false;
			}
			if (exception instanceof UnknownHostException) {
				// Unknown host
				return false;
			}
			if (exception instanceof ConnectTimeoutException) {
				// Connection refused
				return false;
			}
			if (exception instanceof SSLException) {
				// SSL handshake exception
				return false;
			}
			HttpClientContext clientContext = HttpClientContext.adapt(context);
			HttpRequest request = clientContext.getRequest();
			boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
			if (idempotent) {
				// Retry if the request is considered idempotent
				return true;
			}
			return false;
		}
	}

	public static String GetString(final String URL, Charset charset)
			throws IOException {

		HtmltoString = new StringBuilder();
		RetryHandler = new MyRetryHandler();

//		HttpHost proxy = new HttpHost("186.238.51.149", 8080);
//		DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(
//				proxy);
//		httpclient = HttpClients.custom().setRetryHandler(RetryHandler)
//				.setRoutePlanner(routePlanner).build();

		httpclient = HttpClients.custom().setRetryHandler(RetryHandler).build();
		httpget = new HttpGet(URL);

		try {
			response = httpclient.execute(httpget);
			entity = response.getEntity();
			if (entity != null) {

				InputStream instream = entity.getContent();
				InputStreamReader ir = new InputStreamReader(instream, charset);
				BufferedReader reader = new BufferedReader(ir);
				char[] chars = new char[4096];
				int length = 0;
				while (0 < (length = reader.read(chars))) {
					HtmltoString.append(chars, 0, length);
				}

			}
		} catch (ClientProtocolException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			response.close();
		}
		return HtmltoString.toString();
	}
}
