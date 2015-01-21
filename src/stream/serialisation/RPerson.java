package stream.serialisation;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialisation.Person;
import sqli.io.IReaderIO;

public class RPerson implements IReaderIO<Person> {
	String fileName;
	private ObjectInputStream objectInputStream;

	public RPerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void open() throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		objectInputStream = new ObjectInputStream(in);
	}

	@Override
	public void close() throws IOException {
		objectInputStream.close();

	}

	@Override
	public Person read() throws IOException {
		try {
			Person readObject = (Person) objectInputStream.readObject();
			return readObject;

		} catch (EOFException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
