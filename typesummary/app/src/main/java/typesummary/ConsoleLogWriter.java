package typesummary;

public class ConsoleLogWriter implements ILogWriter {
	public void write(final String content, final int indent) {
		String indentTxt = "";
		for(int i = 0; i <= indent; i++) {
			indentTxt += " ";
		}
		System.out.println(indentTxt + content);
	}
	
	public void write(final String content) {
		write(content, 0);
	} 
}
