package auto.utilities;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class PropertiesManager {
    private PropertiesManager() {
        throw new IllegalStateException("Helper class");
    }

    public static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getEnvironmentVariable(String propertyName) {

        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(propertyName);
    }

    public static String getProperty(String key) {
        return environmentVariables.getProperty(key);
    }
}