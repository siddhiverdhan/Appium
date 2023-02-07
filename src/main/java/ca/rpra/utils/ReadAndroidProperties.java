package ca.rpra.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadAndroidProperties {
	
	Properties props;
	public ReadAndroidProperties() {
		String resourceNameAndroid = "src/main/java/resources/androidConfig.properties";

		props = new Properties();
		try {

			InputStream resourceStreamAndroid = new FileInputStream(resourceNameAndroid);
			props.load(resourceStreamAndroid);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		    
		}
	}
	
	public String getValue(String key) {
		
		return props.getProperty(key);
	}

}
