package sqli.io;

import java.io.IOException;
import java.io.Serializable;

public interface IWriterIO<O extends Serializable> {
	void open() throws IOException;

	void write(O line) throws IOException;

	void close() throws IOException;
}
