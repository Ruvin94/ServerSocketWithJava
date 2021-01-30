package ThirdScenario;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client2Float {
	public static void main(String[] args) {
		try {
	    System.out.println("Client 02 started......");  
		Socket s=new Socket("127.0.0.1",3335);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="",str2="";  
		while(!str2.equals("stop")){  		  
		str2=din.readUTF();  
		System.out.println("Server says: "+str2);  
		}  
		  
		//dout.close();  
		//s.close(); 
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
}}  