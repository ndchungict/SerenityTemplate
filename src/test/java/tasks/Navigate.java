package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pages.HomePage;

public class Navigate {
    public static Performable toTheHomePage() {
        return Task.where("opens the home page",
                Open.browserOn().the(HomePage.class)
        );
    }
}