package me.barrytatum.NetworkIM;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket server;
	Socket client;
	int port;

	Server(int port) {
		this.port = port;
	}

	public void start() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
