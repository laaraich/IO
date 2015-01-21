package main;

import java.io.IOException;

import serialisation.Person;
import sqli.io.IReaderIO;
import sqli.io.IWriterIO;
import stream.serialisation.Process;
import stream.serialisation.RPerson;
import stream.serialisation.WPerson;

public class Main {
	public static void main(String[] args) {
		// IReaderIO<Integer> readIO = new IntegerReader("sum.in");
		// IWriterIO<Integer> writeIO = new IntegerWriter("sum.out");
		// SumInputStreamInteger sum = new SumInputStreamInteger(readIO,
		// writeIO);
		// try {
		// sum.sum();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// IReaderIO<Person> readIO = new ReadPerson("person.in");
		// IWriterIO<Person> writeIO = new WritePerson("person.out");
		// ProcessSerialisation process = new ProcessSerialisation(readIO,
		// writeIO);
		// try {
		// process.copyPerson();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		IReaderIO<Person> readIO = new RPerson("persons.in");
		IWriterIO<Person> writeIO = new WPerson("persons.out");
		IWriterIO<Person> writeIOre = new WPerson("persons.in");
		Process process = new Process(readIO, writeIO);
		
		Process processre = new Process(readIO, writeIOre);
		try {
			processre.create();
			process.copyPerson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
