package serialisation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import sqli.io.IWriterIO;

public class WritePerson implements IWriterIO<Person> {
	String fileName;
	private BufferedWriter bwr;

	public WritePerson(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void open() throws IOException {
		bwr = new BufferedWriter(new FileWriter(fileName));
	}

	@Override
	public void write(Person person) throws IOException {
		bwr.write("First Name : " + person.getFirstName());
		bwr.newLine();
		bwr.write("Last Name : " + person.getLastName());
		bwr.newLine();
		bwr.write("Birthday : " + person.getBirthDay());
		bwr.newLine();
	}

	@Override
	public void close() throws IOException {
		bwr.close();
	}

}
