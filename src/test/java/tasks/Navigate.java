package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Link;
import pages.HomePage;
import pages.TopMenu;

public class Navigate {
    public static Performable toTheHomePage() {
        return Task.where("{0} opens the home page",
                Open.browserOn().the(HomePage.class)
        );
    }

    public static Performable toShopPage() {
        return Task.where("{0} navigate to the shop page",
                Click.on(TopMenu.SHOP_MENU)
        );
    }

    public static Performable toHomeMenuOnTheShopPage() {
        return Task.where("{0} click on Home Menu in the Shop Page",
                Click.on(Link.withText("Home"))
        );
    }
}