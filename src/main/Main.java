package main;

import java.io.IOException;

import sqli.io.IReaderIO;
import sqli.io.IWriterIO;
import sqli.operation.IntegerReader;
import sqli.operation.IntegerWriter;
import sqli.operation.SumInputStreamInteger;

public class Main {
	public static void main(String[] args) {
		IReaderIO<Integer> readIO = new IntegerReader("sum.in");
		IWriterIO<Integer> writeIO = new IntegerWriter("sum.out");
		SumInputStreamInteger sum = new SumInputStreamInteger(readIO, writeIO);
		try {
			sum.sum();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
