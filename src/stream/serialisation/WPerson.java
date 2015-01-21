package stream.serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import serialisation.Person;
import sqli.io.IWriterIO;

public class WPerson implements IWriterIO<Person> {
	public WPerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	String fileName;
	private ObjectOutputStream objectOutputStream;

	@Override
	public void open() throws IOException {
		FileOutputStream fileInputStream = new FileOutputStream(fileName);
		objectOutputStream = new ObjectOutputStream(fileInputStream);
	}

	@Override
	public void write(Person person) throws IOException {
		objectOutputStream.writeObject(person);
	}

	@Override
	public void close() throws IOException {
		objectOutputStream.close();

	}

}
