import java.io.*;
import java.net.Socket;
import java.util.*;



public class Client1Alphabet {

	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner(System.in); 
	    System.out.println("Client 01 started......");  
		Socket s=new Socket("127.0.0.1",3333);  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		String str="";  
		while(!str.equals("stop")){  
		  
	
		
		System.out.print("Character");
		char character= sc.next().charAt(0);
		
		str=Character.toString(character);
			
		dout.writeChar(character);  
		dout.flush();  
		
		}  
		  
		//dout.close();  
		//s.close(); 
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		}}  
