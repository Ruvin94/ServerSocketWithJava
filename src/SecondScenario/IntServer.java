package SecondScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IntServer {

	public static void main(String[] args) {
	ServerSocket ss;
		
		try {
			ss = new ServerSocket(3334);
			Socket s=ss.accept();  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			 
			System.out.println("Client 01 connected......"); 
			
			Socket s2=ss.accept();  
			DataInputStream din2=new DataInputStream(s2.getInputStream());  
			DataOutputStream dout2=new DataOutputStream(s2.getOutputStream());  
			  
			System.out.println("Client 02 connected......"); 
			
			String str="";  
			int value= 0;
			while(! str.equals("*")){  
			value=din.readInt();
			str=String.valueOf(value);
			
			if(s2 != null)
			{
				dout2.writeUTF(String.valueOf(--value));
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