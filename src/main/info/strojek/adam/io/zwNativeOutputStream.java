package info.strojek.adam.io;

import java.io.IOException;
import java.io.OutputStream;

public class zwNativeOutputStream extends OutputStream {

	protected zwNativeOutputStream(zwNativeSocket socket) {
		
	}
	
	@Override
	public void write(int b) throws IOException {
		write0(b);
	}
	
	@Override
	public void write(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(b, off, len);
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		super.flush();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	private native void write0(int b) throws IOException;
	private native void write0(byte[] b, int off, int len) throws IOException;

}
