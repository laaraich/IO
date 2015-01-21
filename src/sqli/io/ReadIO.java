package sqli.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadIO implements IReaderIO<String> {
	private String fileName;
	private BufferedReader br;

	public ReadIO(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void open() throws FileNotFoundException {
		br=new BufferedReader(new FileReader(fileName));
	}

	@Override
	public void close() throws IOException {
		br.close();
	}

	@Override
	public String read() throws IOException {
		return br.readLine();
	}

}
