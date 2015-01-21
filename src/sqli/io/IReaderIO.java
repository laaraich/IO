package sqli.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface IReaderIO <O extends Serializable>{
	void open() throws IOException;

	void close() throws IOException;

	O read() throws IOException;
}
