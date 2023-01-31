package ca.rpra.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	Properties props;
	public ReadProperties() {
		String resourceName = "src/main/java/resources/iOSConfig.properties";
		String resourceNameAndroid = "src/main/java/resources/androidConfig.properties";

		props = new Properties();
		try {
			InputStream resourceStream = new FileInputStream(resourceName);
			InputStream resourceStreamAndroid = new FileInputStream(resourceNameAndroid);
			props.load(resourceStream);
			//props.load(resourceStreamAndroid);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		    
		}
	}
	
	public String getValue(String key) {
		
		return props.getProperty(key);
	}

}
