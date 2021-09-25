package vn.edu.template_method.networks;

import sun.security.jgss.LoginConfigImpl;

public abstract class Network {
	String userName;
    String password;

    Network() {}
    
    public boolean post(String message) {
		if (logIn(this.userName, this.password)) {
			boolean result = sendData(message.getBytes());
			logOut();
			return true;
		}
		return false;
	}
    
    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
