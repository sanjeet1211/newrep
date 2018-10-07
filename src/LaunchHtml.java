import java.awt.Desktop;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

/**
 * 
 */

/**
 * @author sanjeet
 *
 */
public class LaunchHtml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	
	HttpURLConnection connection = null; 
	String path = "https://www.ndtv.com/";
	try{ 
	URI uri = new URI(path); 
	URL url = new URL(uri.toURL().toString()); 
	connection = (HttpURLConnection) url.openConnection(); 
	
	
	
	
	connection.connect(); 
	
	
	java.awt.Desktop.getDesktop().browse(uri);
	System.out.println("Amazon opened in browser");
	
	
	
	
	
	
	
	
}catch(Exception e1)
	{
	  e1.printStackTrace();
	}
}}