package MiniChat;

import java.io.IOException;
import java.net.ServerSocket;

//optimisation
//rendre l'application client / client. Le serveur authentifie les deux clients et ces deux-là pourront discuter ensemble sans que d'autres puissent y entrer : grosso modo réaliser un « salon », comme on l'appelle ;
//utiliser les bases de données pour la sauvegarde des messages et pour authentifier les clients ;
//réaliser une interface graphique en swing ou en awt ;

//cd C:\Users\Meriem\Desktop\javas\MiniChat\bin
//java MiniChat.Serveur

public class Serveur {
	
	public static Thread t;
	public static ServerSocket ss = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			ss = new ServerSocket(2009);
			System.out.println("Le serveur est a l'ecoute du port "+ss.getLocalPort());
		
			t = new Thread(new Accepter_connexion(ss));
			t.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Le port "+ss.getLocalPort()+" est deja utilise !");
		}
		

	}

}
