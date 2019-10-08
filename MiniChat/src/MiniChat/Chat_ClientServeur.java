package MiniChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Chat_ClientServeur implements Runnable{
	
	private Socket socket = null;
	private BufferedReader in = null;
	private PrintWriter out = null;
	private String login = "zero";
	private Thread t3, t4;
	
	
	public Chat_ClientServeur(Socket s, String log) {
		socket = s;
		login = log;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			Thread t3 = new Thread(new Reception(in, login));
			t3.start();
			
			Thread t4 = new Thread(new Emission(out));
			t4.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(login + " s'est deconnecte");
		}
		
	}
	
	
	
}
