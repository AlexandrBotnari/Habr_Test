package browser;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    private static Properties properties;

    public PropertyReader() {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(Driver.class.getClassLoader().getResourceAsStream("application.properties"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
