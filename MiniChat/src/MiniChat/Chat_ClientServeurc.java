package MiniChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Chat_ClientServeurc implements Runnable{
	
	private Socket socket;
	private PrintWriter out = null;
	private BufferedReader in = null;
	private Scanner sc;
	private Thread t3,t4;
	
	public Chat_ClientServeurc(Socket s) {
		socket = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			sc = new Scanner(System.in);
			
			Thread t4 =  new Thread(new Emissionc(out));
			t4.start();
			Thread t3 = new Thread(new Receptionc(in));
			t3.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Le serveur distant s'est deconnecte !");
		}
		
	}

}
