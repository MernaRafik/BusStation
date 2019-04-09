import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public interface Trips {
	public void save(String name,String type,String source,String destination,String info);
	public String getDistance();
	public String getDate();
	public String getTime();
	public double getPrice();
}
class internal implements Trips{
	
	String distance="381Km";
	String date="8/2/2019";
	String time="4Pm";
	double price=400;
	public String getDistance() {
		return distance;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public void save(String name,String type, String source, String destination, String info) {
		File x=new File("Test2.txt");
		try {
			FileWriter y=new FileWriter(x,true);
	        Writer z=new BufferedWriter(y);
	        z.write(name+", ");
			z.write(type+" ");
			z.write(source+" ");
			z.write(destination+" ");
			z.write(info+" ");
			if(info.equals("Round"))
			{
				price=price-(price*0.3);
			}
			z.write(price+"LE ");
			z.write(distance+" ");
			z.write(date+" ");
			z.write(time+" ");
			z.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class external implements Trips{
	
	String distance="500Km";
	String date="13/8/2019";
	String time="9pm";
	double price=200;
	public String getDistance() {
		return distance;
	}
	public String getDate() {
		return date;
	}
	public String getTime() {
		return time;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public void save(String name,String type, String source, String destination, String info) {
		File x=new File("Test2.txt");
		try {
			FileWriter y=new FileWriter(x,true);
	        Writer z=new BufferedWriter(y);
	        z.write(name+", ");
			z.write(type+" ");
			z.write(source+" ");
			z.write(destination+" ");
			z.write(info+" ");
			if(info.equals("Round"))
			{
				price=price-(price*0.3);
			}
			z.write(price+"$ ");
			z.write(distance+" ");
			z.write(date+" ");
			z.write(time+" ");
			z.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}