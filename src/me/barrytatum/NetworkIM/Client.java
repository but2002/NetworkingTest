package me.barrytatum.NetworkIM;

import java.net.Socket;

public class Client {

	public Socket connection;

	Client(String host, int port ) {
		this.connection = new Socket();
	}
}
