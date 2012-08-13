package me.barrytatum.NetworkIM;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class DataStream {

	public ServerSocket src;
	public Socket dest;

	public BufferedReader in;
	public PrintWriter out;

	DataStream(ServerSocket src, Socket connection) {
		this.src = src;
		this.dest = connection;

		try {
			this.in = new BufferedReader(new InputStreamReader(
					dest.getInputStream()));
			this.out = new PrintWriter(connection.getOutputStream(), true);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void send(String message) {
		this.out.println(message);
	}

	public void recieve() {
		String message;
		
		try {
			while ( ( message = in.readLine() ) != null ) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
