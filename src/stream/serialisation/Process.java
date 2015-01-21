package stream.serialisation;

import java.io.IOException;

import serialisation.Person;
import sqli.io.IReaderIO;
import sqli.io.IWriterIO;

public class Process {
	private IReaderIO<Person> readIO;
	private IWriterIO<Person> writeIO;

	public Process(IReaderIO<Person> readIO, IWriterIO<Person> writeIO) {
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

	public void create() throws IOException {
		writeIO.open();
		Person person = new Person("AMINE", "LAARAICH", "29/05/1990");
		writeIO.write(person);
		writeIO.close();
	}

}
