package com.experiment.url;

import java.io.IOException;
import java.net.URL;

public class UrlInfo {

	public static void main(String[] args) {

		URL url = null;

		try {

			// Create a URL object by providing URL in the form of String.
			url = new URL("http://www.hubberspot.com/search/label/EJB?Java=ejb");

			// getHost() : Returns the host name of this URL.
			String host = url.getHost();

			// getPath() : Gets the path of this URL.
			String path = url.getPath();

			// getQuery() : Gets the searched query in the URL.
			String query = url.getQuery();

			// getProtocol() : Gets the protocol used to refer this URL.
			String protocol = url.getProtocol();

			// getAuthority() : Gets the authority of the URL.
			String authority = url.getAuthority();

			// getRef() : Gets the anchor of this URL.
			String reference = url.getRef();
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("URL: " + url.toString());
			System.out.println("-----------------------------------------------------------");
			System.out.println("Host of the Url : " + host);
			System.out.println("Path of the Url : " + path);
			System.out.println("Query of the Url : " + query);
			System.out.println("Protocol of the Url : " + protocol);
			System.out.println("Authority of the Url : " + authority);
			System.out.println("Reference of the Url : " + reference);

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
