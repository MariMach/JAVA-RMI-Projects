package MiniChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//cd C:\Users\Meriem\Desktop\javas\MiniChat\bin
//java MiniChat.Client

public class Client {
	
	public static Socket socket = null;
	public static Thread t1;
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Demande de connexion");
			socket = new Socket("127.0.0.1", 2009);
			System.out.println("Connexion etablie avec le serveur, authentification :");
			//le message s'affiche je suis connecte
			
			t1 = new Thread(new Connexion(socket));
			t1.start();
			
		} catch (UnknownHostException e) {
			  System.err.println("Impossible de se connecter à l'adresse "+socket.getLocalAddress());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Aucun serveur a l'ecoute du port " + socket.getLocalPort());	
		}
		
		
	
	
	
	}

}
