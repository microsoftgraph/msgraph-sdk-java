package com.microsoft.graph.models.extensions;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

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
	public String boundary() {
		return boundary;
	}
	
	/**
	 * Get the Content-Type header to send the multipart request
	 * @return the multipart header option
	 */
	public HeaderOption header() {
		return new HeaderOption("Content-Type", "multipart/form-data; boundary=\"" + boundary + "\"");
	}
	
	/**
	 * Add a string part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type (text/html, text/plain, etc.)
	 * @param content The string content to include
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addPart(String name, String contentType, String content) throws IOException {
		addPart(name, contentType, content.getBytes());
	}
	
	/**
	 * Add a part to the multipart body
	 * @param name The name of the part
	 * @param contentType The MIME type (text/html, video/mp4, etc.)
	 * @param byteArray The byte[] contents of the resource
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addPart(String name, String contentType, byte[] byteArray) throws IOException {
		String partContent = addBoundary();
		partContent +=
				"Content-Disposition:form-data; name=\"" + name + "\"" + RETURN +
				"Content-Type:" + contentType + RETURN +
				RETURN;
		out.write(partContent.getBytes());
		out.write(byteArray);
		String returnContent = RETURN + RETURN;
		out.write(returnContent.getBytes());
	}
	
	/**
	 * Add an HTML part to the multipart body
	 * @param name The name of the part
	 * @param content The HTML body for the part
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addHtmlPart(String name, String content) throws IOException {
		addPart(name, "text/html", content);
	}
	
	/**
	 * Add an image/jpeg part to the multipart body
	 * @param name The name of the part
	 * @param imageFile The image file
	 * @throws IOException Throws an exception if the output stream cannot be written to
	 */
	public void addImagePart(String name, java.io.File imageFile) throws IOException {
		addFilePart(name, "image/jpeg", imageFile);
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
		addPart(name, contentType, fileBytes);
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
		finalStream.write(addEnding().getBytes());
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
