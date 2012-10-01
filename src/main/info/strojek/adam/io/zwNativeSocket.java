package info.strojek.adam.io;

public class zwNativeSocket {
	
	private int socketFd;

	private native void connect0(String hostname, int port);
	private native void bind0(String hostname, int port);
	private native int accept0();
	private native int getsockopt0(int level, int optname, byte[] optval, int optlen);
	private native int setsockopt0(int level, int optname, byte[] optval, int optlen);
}
