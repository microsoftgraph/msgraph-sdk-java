package com.microsoft.graph.models.extensions;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
	public String getBoundary() {
		return boundary;
	}
	
	/**
	 * Set the multipart boundary for use in the request header
	 * @param boundary The multipart boundary
	 */
	public void setBoundary(String boundary) {
		this.boundary = boundary;
	}
	
	/**
	 * Get the contentType for use in the request header
	 * @return the multipart Content-Type
	 */
	public String getContentType() {
		return contentType;
	}
	
	/**
	 * Set the contentType for use in the request header
	 * @param contentType The multipart Content-Type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	/**
	 * Get the Content-Type header to send the multipart request
	 * @return the multipart header option
	 */
	public HeaderOption header() {
		return new HeaderOption("Content-Type", contentType + "; boundary=\"" + boundary + "\"");
	}
	
	/**
	 * Add a part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type (text/html, video/mp4, etc.)
	 * @param byteArray The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addFormData(String name, String contentType, byte[] byteArray) throws IOException {
		String partContent = addBoundary();
		partContent +=
				"Content-Disposition:form-data; name=\"" + name + "\"" + RETURN +
				"Content-Type:" + contentType + RETURN +
				RETURN;
		out.write(partContent.getBytes(MULTIPART_ENCODING));
		out.write(byteArray);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes(MULTIPART_ENCODING));
		System.out.println(partContent);
	}
	
	/**
	 * Add a part to the multipart body
	 * @param contentType The MIME type (text/html, video/mp4, etc.)
	 * @param byteArray The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addPart(String contentType, byte[] byteArray) throws IOException {
		String partContent = addBoundary();
		partContent +=
				"Content-Disposition:form-data;" + RETURN +
				"Content-Type:" + contentType + RETURN +
				RETURN;
		out.write(partContent.getBytes(MULTIPART_ENCODING));
		out.write(byteArray);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes(MULTIPART_ENCODING));
	}
	
	/**
	 * Add an HTML part to the multipart body
	 * @param name The name of the part
	 * @param content The HTML body for the part
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addHtmlPart(String name, String content) throws IOException {
		addFormData(name, "text/html", content.getBytes(MULTIPART_ENCODING));
	}
	
	/**
	 * Add a file part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type of the file (application/pdf, video/mp4, etc.)
	 * @param file The file
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addFilePart(String name, String contentType, java.io.File file) throws IOException {
		InputStream fileStream = new FileInputStream(file);
		byte[] fileBytes = getByteArray(fileStream);
		String partContent = addBoundary();
		partContent +=
				"Content-Disposition:form-data; name=\"" + name + "\"" + "; filename=\"" + file.getName() + "\"" + RETURN +
				"Content-Type:" + contentType + RETURN +
				RETURN;
		System.out.println(partContent);
		out.write(partContent.getBytes(MULTIPART_ENCODING));
		out.write(fileBytes);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes(MULTIPART_ENCODING));
	}
	
	/**
	 * Add a part to the multipart body
	 * @param headers Map containing Header's key and value pair
	 * @param content The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addPart(Map<String, String> headers, byte[] content) throws IOException{
		String partContent = addBoundary();
		List<String> listContentDisposition = Arrays.asList("filename","creation-date","modification-date","read-date",
				"size","name","voice","handling","preview-type");			
		List<String> mainHeaders = Arrays.asList("Content-Disposition","Content-Type","charset");
		
		if(headers.containsKey("Content-Disposition")) {			
			partContent += "Content-Disposition:"+headers.get("Content-Disposition")+";"; 
			for (Map.Entry<String,String> entry : headers.entrySet()) {
				if(listContentDisposition.contains(entry.getKey())) {
					partContent += " " + entry.getKey() + "=\"" + entry.getValue() + "\";";
				}
			}
			partContent = partContent.substring(0, partContent.length()-1);
			partContent += RETURN;
			
		}
		
		if(headers.containsKey("Content-Type")) {
			partContent += "Content-Type:"+headers.get("Content-Type")+";"; 
			if(headers.containsKey("charset")) {
				partContent += "charset=\"" + headers.get("charset") + "\";"; 
			}
			partContent = partContent.substring(0, partContent.length()-1);
			partContent += RETURN;
		}
		
		for(Map.Entry<String,String> entry : headers.entrySet()) {
			if(mainHeaders.contains(entry.getKey())==false && listContentDisposition.contains(entry.getKey())==false) {
				partContent += entry.getKey() +":"+entry.getValue() + RETURN;
			}
		}
		
		System.out.println(partContent);
		partContent += RETURN;
		out.write(partContent.getBytes(MULTIPART_ENCODING));
		out.write(content);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes(MULTIPART_ENCODING));
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
    private byte[] getByteArray(InputStream in) throws IOException {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
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
