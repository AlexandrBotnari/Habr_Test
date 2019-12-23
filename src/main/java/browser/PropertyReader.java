package browser;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertyReader {

    private static Configuration properties;


    public PropertyReader() {
        try {
            properties = new PropertiesConfiguration("application.properties");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getString(key);
    }
}
