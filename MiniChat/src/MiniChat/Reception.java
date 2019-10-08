package MiniChat;

import java.io.BufferedReader;
import java.io.IOException;

public class Reception implements Runnable{
	
	private BufferedReader in;
	private String message = null, login = null;
	
	public Reception(BufferedReader in, String login) {
		this.in = in;
		this.login = login;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				message = in.readLine();
				System.out.println(login+" : "+message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
