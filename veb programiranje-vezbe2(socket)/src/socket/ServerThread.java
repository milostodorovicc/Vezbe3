package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private Socket sock;

	public ServerThread(Socket sock) {
		
		this.sock = sock;
	}

	@Override
	public void run() {
		try {
		BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		String zahtev = reader.readLine();
		System.out.println("Stigao je zahtev:" + zahtev);
		Thread.sleep(10000);
		String odgovor = "Bikini ";
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()), true);
		writer.println(odgovor);
		
		sock.close();
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		super.run();
	}
	
	
	
	

}
