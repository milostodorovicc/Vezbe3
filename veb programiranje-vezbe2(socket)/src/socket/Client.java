package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		InetAddress addr = InetAddress.getByName("127.0.0.1");
		int port = 9001;
		
		Socket sock = null;
		try {
			
			sock = new Socket(addr,port);
			
			String poruka = "Klijent salje poruku serveru, Naucili smo nesto o gitu";
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()), true);
			writer.println(poruka);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String odgovor = reader.readLine();
			
			System.out.println("Server je odgovorio: " + odgovor);
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			sock.close();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
