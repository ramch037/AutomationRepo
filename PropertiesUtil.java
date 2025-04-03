package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    private static final String CONFIG_FILE_PATH = "src\\test\\resources\\config\\application.properties";

    // Utility method to read properties file
    private static Properties loadProperties() {
        Properties properties = new Properties();
        try (FileReader reader = new FileReader(CONFIG_FILE_PATH)) {
            properties.load(reader);
        } catch (IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
        }
        return properties;
    }

    // Method to retrieve the browser
    public static String getBrowser() {
        Properties properties = loadProperties();
        return properties.getProperty("driver", "chrome"); // Default value if not set
    }

    // Method to retrieve the URL
    public static String getUrl() {
        Properties properties = loadProperties();
        return properties.getProperty("url", "https://www.automationexercise.com/"); // Default value if not set
    }
}

