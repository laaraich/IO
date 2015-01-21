package serialisation;

import java.io.IOException;

import sqli.io.IReaderIO;
import sqli.io.IWriterIO;

public class ProcessSerialisation {
	private IReaderIO<Person> readIO;
	private IWriterIO<Person> writeIO;

	public ProcessSerialisation(IReaderIO<Person> readIO,
			IWriterIO<Person> writeIO) {
		super();
		this.readIO = readIO;
		this.writeIO = writeIO;
	}

	public void copyPerson() throws IOException {
		readIO.open();
		writeIO.open();
		Person person = null;
		while ((person = readIO.read()) != null) {
			writeIO.write(person);
		}
		readIO.close();
		writeIO.close();
	}

}
