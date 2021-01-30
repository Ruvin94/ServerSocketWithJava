package ThirdScenario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FloatServer {

	public static void main(String[] args) {
    ServerSocket ss;
		
		try {
			ss = new ServerSocket(3335);
			Socket s=ss.accept();  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			 
			System.out.println("Client 01 connected......"); 
			
			Socket s2=ss.accept();  
			DataInputStream din2=new DataInputStream(s2.getInputStream());  
			DataOutputStream dout2=new DataOutputStream(s2.getOutputStream());  
			  
			System.out.println("Client 02 connected......"); 
			
			String str="";  
			float value= 0;
			double power= 0;
			while(! str.equals("*")){  
			value=din.readFloat();
			power = Math.pow(value, 1.5);
			
			System.out.println("Received from Client1 : "+value);
			System.out.println("Power of 1.5 of Received : "+ power);
			
			str=String.valueOf(power);
			
			if(s2 != null)
			{
				dout2.writeUTF(str);
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