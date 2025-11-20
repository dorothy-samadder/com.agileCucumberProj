package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties props;

	static {
		try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
			props = new Properties();
			props.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return props.getProperty(key);
	}
}


/*- FileInputStream opens the config.properties file from your test resources folder.
- props = new Properties(); creates a new Properties object.
- props.load(fis); loads key-value pairs from the file into the props object.
- catch (IOException e) handles any file-not-found or read errors by printing the stack trace.
*/