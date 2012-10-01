package info.strojek.adam.io;

import java.io.IOException;
import java.io.InputStream;

public class zwNativeInputStream extends InputStream {

	protected zwNativeInputStream(zwNativeSocket socket) {
		
	}
	
	@Override
	public int read() throws IOException {
		return read0();
	}

	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	@Override
	public int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	@Override
	public synchronized void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	private native int read0() throws IOException;
	private native int read0(byte[] b, int off, int len);
}
