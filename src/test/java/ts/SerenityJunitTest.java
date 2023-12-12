package ts;

import lombok.extern.log4j.Log4j2;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.TopMenu;
import tasks.Navigate;

@Log4j2
@ExtendWith(SerenityJUnit5Extension.class)
public class SerenityJunitTest {
    @CastMember(name = "ChungND")
    Actor chung;

    @Test
    void testFunction01(){
        chung.attemptsTo(
                Navigate.toTheHomePage(),
                Ensure.that(TopMenu.SHOP_MENU).isDisplayed(),
                Navigate.toShopPage(),
                Navigate.toHomeMenuOnTheShopPage()
        );
    }
}
