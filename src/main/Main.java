package main;

import java.io.IOException;

import sqli.io.IReaderIO;
import sqli.io.IWriterIO;
import sqli.io.ProcessIO;
import sqli.io.ReadIO;
import sqli.io.WriteIO;

public class Main {
	public static void main(String[] args) {
		IReaderIO<String> readIO = new ReadIO("file.in");
		IWriterIO<String> writeIO = new WriteIO("file.out");
		ProcessIO process = new ProcessIO(readIO, writeIO);
		try {
			process.copyFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
