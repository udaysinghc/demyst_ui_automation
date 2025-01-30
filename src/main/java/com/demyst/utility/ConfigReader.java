package com.demyst.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

  private Properties properties;

  public Properties init_prop() {

    properties = new Properties();
    try {
      FileInputStream ip =
          new FileInputStream("./src/main/java/com/demyst/config/config.properties");
      properties.load(ip);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return properties;
  }
}
