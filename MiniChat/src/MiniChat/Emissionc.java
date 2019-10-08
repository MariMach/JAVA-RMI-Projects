package MiniChat;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Emissionc implements Runnable{
	
	private PrintWriter out;
	private String message = null;
	private Scanner sc = null;
	
	public Emissionc(PrintWriter out) {
		this.out = out;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Votre message :");
			message = sc.nextLine();
			out.println(message);
			out.flush();
		}
	}

}
