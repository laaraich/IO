package sqli.io;

import java.io.IOException;

public class ProcessIO {
	private IReaderIO<String> readIO;
	private IWriterIO<String> writeIO;

	public ProcessIO(IReaderIO<String> readIO, IWriterIO<String> writeIO) {
		this.readIO = readIO;
		this.writeIO = writeIO;
	}

	public void copyFile() throws IOException {
		readIO.open();
		writeIO.open();
		String line = "";
		while ((line = readIO.read()) != null) {
			writeIO.write(line);
		}
		readIO.close();
		writeIO.close();
	}

}
