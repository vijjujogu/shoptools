package com.shoptools.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public final static String PROJECT_BASE_PATH = System.getProperty("user.dir");
	String path =PROJECT_BASE_PATH + "/src/main/java/com/falcon/qa/config/config.properties";
	// This class is executed to read data from properties file
		public static String readProperty(String path,String PropertyName)
		{
			String returnProperty="";
			Properties property = new Properties();
			try {
				FileInputStream file =
						new FileInputStream(path);
				property.load(file);
				returnProperty=property.getProperty(PropertyName);
				if(returnProperty==null)
				{
					throw new Exception("Property with name : "+PropertyName+" not found in "+System.getProperty("user.dir")+"\\src//main//resources//TestRunDetails.properties Please check again");
				}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("File not found");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return returnProperty;
		}
		
		
		
		

}
