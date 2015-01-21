package sqli.operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import sqli.io.IReaderIO;

public class IntegerReader implements IReaderIO<Integer> {
	private String fileName;
	Scanner scanner;

	public IntegerReader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void open() throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
	}

	@Override
	public void close() throws IOException {
		scanner.close();
	}

	@Override
	public Integer read() throws IOException {
		if (scanner.hasNext())
			return scanner.nextInt();
		return 0;
	}

}
