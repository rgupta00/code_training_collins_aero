import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerThread extends Thread{
	
	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	
	public void run(){
		try{

			InputStream is=socket.getInputStream();
			
			BufferedReader brClient=new BufferedReader(new InputStreamReader(is));
			
			String messageFromClient= brClient.readLine();
			
			while(!messageFromClient.equalsIgnoreCase("bye")){
				System.out.println(messageFromClient);
				messageFromClient=brClient.readLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
}
