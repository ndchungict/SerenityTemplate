package tasks;

import auto.utilities.PropertiesManager;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheHomePage() {
        return Task.where("opens the home page",
                Open.url("https://practice.automationtesting.in")
        );
    }
}