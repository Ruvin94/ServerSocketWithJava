import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class AlphabetServer {

	public static void main(String[] args) {
		
		ServerSocket ss;
		
		try {
			ss = new ServerSocket(3333);
			Socket s=ss.accept();  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			 
			System.out.println("Client 01 connected......"); 
			
			Socket s2=ss.accept();  
			DataInputStream din2=new DataInputStream(s2.getInputStream());  
			DataOutputStream dout2=new DataOutputStream(s2.getOutputStream());  
			  
			System.out.println("Client 02 connected......"); 
			
			String str="";  
			while(! str.equals("*")){  
			str=Character.toString(din.readChar());
			int charValue = str.charAt(0);
			String decrementedLetter = String.valueOf( (char) (charValue - 1));
			System.out.println("client says: "+decrementedLetter);  
			
			if(s2 != null)
			{
				dout2.writeUTF(decrementedLetter);
			}
			
			}  
			din.close();  
			//s.close();  
			//ss.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}}  