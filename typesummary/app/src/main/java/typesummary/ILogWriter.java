package typesummary;

public interface ILogWriter {
	void write(final String content);
	void write(final String content, final int indent);
}
