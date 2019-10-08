package MiniChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Accepter_connexion implements Runnable{
	
	private ServerSocket serversocket = null;
	private Socket socket = null;
	
	public Thread t1;
	public Accepter_connexion(ServerSocket ss) {
		serversocket = ss;	
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			while(true) {
				socket = serversocket.accept();
				System.out.println("Une zero veut se connecter");
				t1 = new Thread(new Authentification(socket));
				t1.start();
			}
			
		}catch (IOException e) {
			System.out.println("Erreur service");
		}
		
	}

}
