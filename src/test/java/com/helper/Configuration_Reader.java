package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties prop ;
	public Configuration_Reader() throws IOException {
		File f= new File("C:\\Users\\ashin\\eclipse-workspace\\demoblaze\\src\\test\\java\\com\\helper\\demoblaze.properties");
		FileInputStream fis= new FileInputStream(f);
		 prop = new Properties();
		prop.load(fis);
		
	}
	public static String  getbrowsername() {
	  String browsername = prop.getProperty("browser");
	  return browsername;
	  	}
	public static String getvalidusername() {
		String property = prop.getProperty("validusername");
		return property;
	}
	public static String getvalidpassword() {
		String property = prop.getProperty("validpassword");
		return property;
	}
	public static String geturl() {
		String property = prop.getProperty("url");
		return property;
	}
}
