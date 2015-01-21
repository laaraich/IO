import java.io.IOException;
import java.util.Arrays;

import sqli.io.IO;

public class Main {

	public static void main(String[] args) throws IOException {
		IO io = new IO("newFileIO.txt");
		System.out.println(io.read());

		io.write(Arrays.asList("First Row", "Second Row"));

		System.out.println(io.read());
	}

}
