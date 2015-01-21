package sqli.operation;

import java.io.IOException;

import sqli.io.IReaderIO;
import sqli.io.IWriterIO;

public class SumInputStreamInteger {
	private IReaderIO<Integer> readIO;
	private IWriterIO<Integer> writeIO;

	public SumInputStreamInteger(IReaderIO<Integer> readIO,
			IWriterIO<Integer> writeIO) {
		super();
		this.readIO = readIO;
		this.writeIO = writeIO;
	}

	public void sum() throws IOException {
		readIO.open();
		writeIO.open();
		int line = 0;
		int sum = 0;
		while ((line = readIO.read()) != 0) {
			sum += line;
			
		}
		System.out.println(sum);
		writeIO.write(sum);
		readIO.close();
		writeIO.close();

	}
}
