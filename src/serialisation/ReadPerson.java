package serialisation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import sqli.io.IReaderIO;

public class ReadPerson implements IReaderIO<Person> {
	String fileName;
	private BufferedReader br;

	public ReadPerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void open() throws FileNotFoundException {
		br = new BufferedReader(new FileReader(fileName));
	}

	@Override
	public void close() throws IOException {
		br.close();
	}

	@Override
	public Person read() throws IOException {
		String readLine = "";
		if ((readLine = br.readLine()) != null)

			return new Person(readLine.split(","));
		return null;
	}

}
