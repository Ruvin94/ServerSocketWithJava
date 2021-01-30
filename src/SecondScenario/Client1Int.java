package SecondScenario;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client1Int {
	public static void main(String[] args) {
	try {
		Scanner sc= new Scanner(System.in); 
	    System.out.println("Client 01 started......");  
		Socket s=new Socket("127.0.0.1",3334);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="";  
		while(!str.equals("stop")){  
		  
	
		
		System.out.print("Input your integer : ");
		int integer= sc.nextInt();
		
		str=String.valueOf(integer);
			
		dout.writeInt(integer);  
		dout.flush();  
		
		}  
		  
		 
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		}}  
