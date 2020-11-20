package typesummary;

import java.lang.StringBuilder;
import com.google.common.base.Charsets;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;

public class TextFileLogWriter implements ILogWriter {
	private String filePath;
	private StringBuilder builder = new StringBuilder();
	public TextFileLogWriter(final String filePath) {
		this.filePath = filePath;
	}
	public void write(final String content) {
		write(content, 0);
	}
	public void write(final String content, final int indent) {
		String indentTxt = "";
		for(int i = 0; i <= indent; i++) {
			indentTxt += " ";
		}
		this.builder.append(indentTxt + content + "\r\n");
	}
	public void flush() throws IOException {
		File file = new File(this.filePath);
		Files.write(builder, file, Charsets.UTF_8);
	}
}
