package sqli.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
	String fileName;

	public IO(String fileName) {
		this.fileName = fileName;
	}

	public List<String> read() throws IOException {
		List<String> read = new ArrayList<String>();
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		read.add(br.readLine());
		read.add(br.readLine());
		br.close();
		fr.close();
		return read;
	}

	public void write(List<String> write) throws IOException {
		File file = new File(fileName);
		FileWriter fwr = new FileWriter(file);
		BufferedWriter bwr = new BufferedWriter(fwr);
		for (String currentRow : write) {
			bwr.write(currentRow);
			bwr.newLine();
		}
		bwr.close();
		fwr.close();
	}
}
