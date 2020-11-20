package com.microsoft.graph.core;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.common.annotations.VisibleForTesting;
import com.microsoft.graph.options.HeaderOption;

/**
 * Helper for submitting multipart data
 * 
 * This follows the Network Working Group's RFC 
 * on multipart/form-data posting format:
 * https://www.ietf.org/rfc/rfc2388.txt
 */
public class Multipart {
	private String boundary;
	private static final String RETURN = "\r\n";
	private ByteArrayOutputStream out;
	/** Default encoding for multi-part requests */
	public static final String MULTIPART_ENCODING = "US-ASCII";
	private String contentType = "multipart/form-data";
	
	/**
	 * Create a new multipart object
	 */
	public Multipart() {
		out = new ByteArrayOutputStream();
		boundary = "part_" + new BigInteger(130, new SecureRandom()).toString();
	}
	
	/**
	 * Get the multipart boundary for use in the request header
	 * @return the multipart boundary
	 */
	@Nonnull
	public String getBoundary() {
		return boundary;
	}
	
	/**
	 * Set the multipart boundary for use in the request header
	 * @param boundary The multipart boundary
	 */
	public void setBoundary(@Nonnull final String boundary) {
		this.boundary = boundary;
	}
	
	/**
	 * Get the contentType for use in the request header
	 * @return the multipart Content-Type
	 */
	@Nonnull
	public String getContentType() {
		return contentType;
	}
	
	/**
	 * Set the contentType for use in the request header
	 * @param contentType The multipart Content-Type
	 */
	public void setContentType(@Nonnull final String contentType) {
		this.contentType = contentType;
	}
	
	/**
	 * Get the Content-Type header to send the multipart request
	 * @return the multipart header option
	 */
	@Nonnull
	public HeaderOption header() {
		return new HeaderOption("Content-Type", contentType + "; boundary=\"" + boundary + "\"");
	}
	
	private void writePartData(String partContent, byte[] byteArray) throws IOException{
		out.write(partContent.getBytes(MULTIPART_ENCODING));
		out.write(byteArray);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes(MULTIPART_ENCODING));
	}
	
	/**
	 * Create content headers value and parameter
	 * @param name The content header name
	 * @param contentType The content header Content-Type
	 * @param filename The content header filename 
	 * @return content header value and parameter string 
	 */
	@VisibleForTesting
	String createPartHeader(String name, String contentType, String filename) {
		StringBuilder partContent = new StringBuilder(addBoundary());
		partContent.append("Content-Disposition: form-data");
        if(filename != null) {
        	if(name != null) 
        		partContent.append("; name=\"").append(name).append("\"; filename=\"").append(filename).append("\"");
        	else 
        		partContent.append("; filename=\"").append(filename).append("\"");
        }
        else if(name != null) 
        	partContent.append("; name=\"").append(name).append("\"");
        if(contentType != null)
        	partContent.append(RETURN).append("Content-Type: ").append(contentType);
        partContent.append(RETURN).append(RETURN);
        return partContent.toString();
	}
	
	/**
	 * Create content headers value and parameter
	 * @param contentValue The content header value
	 * @param contentDispParameter Map containing content paramter's key and value pair 
	 * @return content header value and parameter string 
	 */
	@Nonnull
	public static String createContentHeaderValue(@Nonnull final String contentValue, @Nullable final Map<String, String> contentDispParameter) {
		String contentHeaderValue = contentValue;

		if(contentDispParameter != null) {
			for(Map.Entry<String,String> entry : contentDispParameter.entrySet())
				contentHeaderValue += ";" + entry.getKey() + "=\"" + entry.getValue() + "\"";
		}
		return contentHeaderValue;
	}
	
	/**
	 * Create content headers header-name, value and parameter string
	 * @param headers Map containing Header-name and header-value pair
	 */
	private String createPartHeader(Map<String, String> headers) {
        String partContent = addBoundary();
        String defaultPartContent = "Content-Disposition: form-data;" + RETURN + "Content-Type: " + contentType + RETURN + RETURN;
        
        if(headers != null) {         
              for(Map.Entry<String,String> entry : headers.entrySet())
                    partContent += entry.getKey() +": "+entry.getValue() + RETURN;
              partContent += RETURN;
        }
        else 
              partContent += defaultPartContent;  
        return partContent;
	}

	/**
	 * Add multipart content headers and byte content
	 * @param name The multipart content name
	 * @param contentType The multipart Content-Type
	 * @param filename The multipart content file name
	 * @param byteArray The multipart byte content
	 * @throws IOException
	 */
	private void addData(String name, String contentType, String filename, byte[] byteArray) throws IOException {
        String partContent = createPartHeader(name, contentType, filename);
        writePartData(partContent, byteArray);
	}

	/**
	 * Add a part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type (text/html, video/mp4, etc.)
	 * @param byteArray The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addFormData(@Nonnull final String name, @Nonnull final String contentType, @Nonnull final byte[] byteArray) throws IOException {
		addData(name, contentType, null, byteArray);
	}
	
	/**
	 * Add a part to the multipart body
	 * @param contentType The MIME type (text/html, video/mp4, etc.)
	 * @param byteArray The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addPart(@Nonnull final String contentType, @Nonnull final byte[] byteArray) throws IOException {
		addData(null, contentType, null, byteArray);
	}
	
	/**
     * Add a part to the multipart body
     * @param headers Map containing Header's header-name(eg: Content-Disposition, Content-Type, etc..) and header's value-parameter string
     * @param content The byte[] contents of the resource
     * @throws IOException Throws an exception if the output stream cannot be written to
     */
     public void addPart(@Nonnull final Map<String, String> headers, @Nonnull final byte[] content) throws IOException{
           final String partContent = createPartHeader(headers);
           writePartData(partContent, content);
     }
	
	/**
	 * Add an HTML part to the multipart body
	 * @param name The name of the part
	 * @param content The HTML body for the part
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addHtmlPart(@Nonnull final String name, @Nonnull final byte[] content) throws IOException {
		addFormData(name, "text/html", content);
	}
	
	/**
	 * Add a file part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type of the file (application/pdf, video/mp4, etc.)
	 * @param file The file
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addFilePart(@Nonnull final String name, @Nonnull final String contentType, @Nonnull final java.io.File file) throws IOException {
		final InputStream fileStream = new FileInputStream(file);
		final byte[] fileBytes = getByteArray(fileStream);
		addData(name, contentType, file.getName(), fileBytes);
	}
	
	/**
	 * Adds a boundary at the beginning of a new part
	 * @return The boundary
	 */
	private String addBoundary() {
		return "--" + boundary + RETURN;
	}
	
	/**
	 * Adds a boundary at the end of the multipart body
	 * @return The boundary
	 */
	private String addEnding() {
		return "--" + boundary + "--";
	}
	
	/**
	 * Returns a full multipart body byte array
	 * @return The byte[] representation of the multipart object
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	@Nullable
	public byte[] content() throws IOException {
		ByteArrayOutputStream finalStream = out;
		finalStream.write(addEnding().getBytes(MULTIPART_ENCODING));
		return finalStream.toByteArray();
	}
	
    /**
     * Helper method to convert an InputStream to a byte[]
     * @param in The input stream to convert
     * @return The byte[]
     * @throws IOException Throws an exception if the output stream cannot be written to
     */
    private byte[] getByteArray(final InputStream in) throws IOException {
		try (final ByteArrayOutputStream buffer = new ByteArrayOutputStream()){
			int nRead;
			byte[] data = new byte[16384];
			try {
				while ((nRead = in.read(data, 0, data.length)) != -1) {
					buffer.write(data, 0, nRead);
				}
			} finally {
				in.close();
			}
			buffer.flush();
			return buffer.toByteArray();
		}
    }
}
