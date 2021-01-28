package com.microsoft.graph.core;

public final class Constants {
	private Constants() {
	}
	
	public static final String APPROOT = "approot";
	/**
	 * The content type header
	 */
	public static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
	/**
	 * The encoding type for getBytes
	 */
	public static final String JSON_ENCODING = "UTF-8";
	/**
	 * The content type for JSON responses
	 */
	public static final String JSON_CONTENT_TYPE = "application/json";
	/**
	 * The binary content type header's value 
	 */
	public static final String BINARY_CONTENT_TYPE = "application/octet-stream";
		
	// Constants for functional tests
	// TO-DO: document how to register an application for functional 
	// testing purposes
	public static final String APPID = "app-id";
	public static final String USERNAME = "user@email.com";
	public static final String PASSWORD = "password";
	public static final String TENANTID = "tenantid";
	public static final String CLIENTSECRET = "clientsecret";
	public static final String VERSION_NAME = "2.6.0";
}


