import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public interface Vechiles {
	
	void save(String data);
	boolean checkavailability(String a);
}
class Bus implements Vechiles{
	
	int [] places = new int [28];
	int count;
	File x=new File("Test2.txt");
	@Override
	public void save(String data) {
		
		FileWriter y;
		try {
			y=new FileWriter(x,true);
			Writer z=new BufferedWriter(y);
			z.write(data);
			((BufferedWriter)z).newLine();
			z.close();
		}  
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public boolean checkavailability(String a) {
		boolean result=false;
		String word="";
		try {
			Scanner s=new Scanner(new FileReader(x));
			while(s.hasNext() && !result)
			{
				word=s.next();
				if(word.trim().equals(a.trim()))
				{
					count++;
				}
			}
			if(count<places.length)
			{
				result=true;
			}
			s.close();
			return result;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
class Bus2 implements Vechiles{
	
	int [] places = new int [28];
	int count;
	File x=new File("Test2.txt");
	@Override
	public void save(String data) {
		
		FileWriter y;
		try {
			y=new FileWriter(x,true);
			Writer z=new BufferedWriter(y);
			z.write(data);
			((BufferedWriter)z).newLine();
			z.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public boolean checkavailability(String a) {
		
		boolean result=false;
		String word="";
		try {
			Scanner s=new Scanner(new FileReader(x));
			while(s.hasNext() && !result)
			{
				word=s.next();
				if(word.trim().equals(a.trim()))
				{
					count++;
				}
			}
			if(count<places.length)
			{
				result=true;
			}
			s.close();
			return result;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
class MiniBus implements Vechiles{
	int count;
	int [] places = new int [12];
	File x=new File("Test2.txt");
	@Override
	public void save(String data) {

		
		FileWriter y;
		try {
			y=new FileWriter(x,true);
			Writer z=new BufferedWriter(y);
			z.write(data);
			((BufferedWriter)z).newLine();
			z.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean checkavailability(String a) {

		boolean result=false;
		String word="";
		try {
			Scanner s=new Scanner(new FileReader(x));
			while(s.hasNext() && !result)
			{
				word=s.next();
				if(word.trim().equals(a.trim()))
				{
					count++;
				}
			}
			if(count<places.length)
			{
				result=true;
			}
			s.close();
			return result;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
class Limousine implements Vechiles{

		int count;
		int [] places = new int [1];
		File x=new File("Test2.txt");
		
	@Override
	public void save(String data) {
		
		
		FileWriter y;
		try {
			y=new FileWriter(x,true);
			Writer z=new BufferedWriter(y);
			z.write(data);
			((BufferedWriter)z).newLine();
			z.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkavailability(String a) {
		
		boolean result=false;
		String word="";
		try {
			Scanner s=new Scanner(new FileReader(x));
			while(s.hasNext() && !result)
			{
				word=s.next();
				if(word.trim().equals(a.trim()))
				{
					count++;
				}
			}
			if(count<places.length)
			{
				result=true;
			}
			s.close();
			return result;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}

