package sqli.operation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import sqli.io.IWriterIO;

public class IntegerWriter implements IWriterIO<Integer> {
	private String fileName;
	BufferedWriter bwr;

	public IntegerWriter(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void open() throws IOException {
		bwr = new BufferedWriter(new FileWriter(fileName));
	}

	@Override
	public void close() throws IOException {
		bwr.close();
	}

	@Override
	public void write(Integer line) throws IOException {
		bwr.write(line+"");
	}

}
