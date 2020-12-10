package com.microsoft.graph.core;

/** Multi-purpose constants holder used accross the SDK */
public final class Constants {
	private Constants() {
	}
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
	 * The content type for TEXT responses
	 */
	public static final String TEXT_CONTENT_TYPE = "text/plain";
	/**
	 * The binary content type header's value
	 */
	public static final String BINARY_CONTENT_TYPE = "application/octet-stream";

	// Constants for functional tests
	// TO-DO: document how to register an application for functional
	// testing purposes
	/** The application ID to use for unit testing */
	public static final String APPID = "app-id";
	/** The user email to use for unit testing */
	public static final String USERNAME = "user@email.com";
	/** The user password to use for unit testing */
	public static final String PASSWORD = "password";
	/** The tenant ID to use for unit testing */
	public static final String TENANTID = "tenantid";
	/** The client secret to use for unit testing */
	public static final String CLIENTSECRET = "clientsecret";
	/** The SDK version */
	public static final String VERSION_NAME = "2.5.0";
}

