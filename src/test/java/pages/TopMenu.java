package pages;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

public class TopMenu {
    public static Target SHOP_MENU = Target.the("Shop Menu").located(By.linkText("Shop"));

    public static Target MY_ACCOUNT_MENU = Target.the("My Account Menu").located(By.linkText("My Account"));
}
