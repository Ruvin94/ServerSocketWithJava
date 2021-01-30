package ThirdScenario;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client1Float {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in); 
		    System.out.println("Client 01 started......");  
			Socket s=new Socket("127.0.0.1",3335);  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			    
			String str="";  
			while(!str.equals("stop")){  			  
			
			System.out.print("Input your float value : ");
			float value= sc.nextFloat();
			
			str=String.valueOf(value);
				
			dout.writeFloat(value);  
			dout.flush();  
			
			}  
			  
			 
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
}}  
