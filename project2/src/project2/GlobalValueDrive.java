package project2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		//to read the values from data.properties file
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mahi\\git\\Project2\\project2\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		//to update the values to data.properties file
		FileOutputStream fos=new FileOutputStream("C:\\Users\\mahi\\git\\Project2\\project2\\data.properties");
		prop.store(fos, null);
		
	}

}
