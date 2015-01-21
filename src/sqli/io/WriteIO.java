package sqli.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIO implements IWriterIO<String> {
	String fileName;
	private BufferedWriter bwr;

	public WriteIO(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void open() throws IOException {
		bwr = new BufferedWriter(new FileWriter(fileName));
	}

	@Override
	public void write(String line) throws IOException {
		bwr.write(line);
		bwr.newLine();
	}

	@Override
	public void close() throws IOException {
		bwr.close();
	}

}
