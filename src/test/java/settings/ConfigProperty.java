package settings;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {

    public static Properties property;
    private static String configPath = "src/test/java/settings/config.properties";

    public static void initPropertyFile() {
        property = new Properties();
        try {
            InputStream inp = new FileInputStream(configPath);
            property.load(inp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
