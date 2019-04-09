package Control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
	String Us="admin";
	String Pass="admin";
 String filename="Test .txt";
 String fn="AddA.txt";
 String fd="AddD.txt";
 String fR="Test2.txt";

 private static Scanner x;
	public boolean validation(String username, String password , String filename) {
		
		boolean found=false ;
		String tempusername ="";
		String temppassword="";
		
		try {	
			x= new Scanner (new FileReader(filename));
			x.useDelimiter("[,\n]");
			while(x.hasNext() && !found ) {
				tempusername=x.next();
				temppassword=x.next();
				 if(tempusername.trim().equals(username.trim()) && temppassword.trim().equals(password.trim())) {
					 found=true;
				 }
			}
			x.close(); 
			return found;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return found;	
	}
	public boolean validationAdmin(String username, String password) {
		return(this.Us.equals(username) && this.Pass.equals(password));	
	}
	public boolean validationNewAdmins(String username,String password,String fn) {

		boolean found=false ;
		String tempusername ="";
		String temppassword="";
		
		try {	
			x= new Scanner (new FileReader(fn));
			x.useDelimiter("[,\n]");
			while(x.hasNext() && !found ) {
				tempusername=x.next();
				temppassword=x.next();
				 if(tempusername.trim().equals(username.trim()) && temppassword.trim().equals(password.trim())) {
					 found=true;
				 }
			}
			x.close(); 
			return found;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return found;	
	}
	
	
	public boolean validationDriver(String username,String password,String fd) {

		boolean found=false ;
		String tempusername ="";
		String temppassword="";
		
		try {	
			x= new Scanner (new FileReader(fd));
			x.useDelimiter("[,\n]");
			while(x.hasNext() && !found ) {
				tempusername=x.next();
				temppassword=x.next();
				 if(tempusername.trim().equals(username.trim()) && temppassword.trim().equals(password.trim())) {
					 found=true;
				 }
			}
			x.close(); 
			return found;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return found;	
	}
	
	public boolean reader(String username) {
		Boolean result =false;
		try {
	x=new Scanner (new File("Test2.txt"));
	while(x.hasNext()) {
		if(x.next().contains(username+",")) 
		{
			result=true;	
		}
	}
	x.close();
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	return result;
}
	

}