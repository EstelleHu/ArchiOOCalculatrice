package calculatrice.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {
	private static Properties prop;
    private static ApplicationProperties applicationProperties = null; 

        
    public static ApplicationProperties getInstance(String fileName) 
    { 
        if (applicationProperties == null) 
                applicationProperties = new ApplicationProperties(fileName); 
  
        return applicationProperties; 
    } 

        
        private ApplicationProperties (String fileName) {
                prop = new Properties(); 
                InputStream input = null;

                try {
                    input = new FileInputStream(fileName);
                    prop.load(input);
                } catch (FileNotFoundException e) {
                	System.out.println(e.getMessage());
                } catch (IOException e) {
                     System.out.println(e.getMessage());
                }
        }
         
        public static String readProperty(String property, String defaultMessage) {
        	for(String key : prop.stringPropertyNames()) {
        		  if(key == property) {
						return prop.get(property).toString();
					}
				}
                if (null != property)
                        return prop.get(property).toString();
                else 
                        return defaultMessage;
        }
}
