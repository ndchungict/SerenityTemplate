package ts;

import lombok.extern.log4j.Log4j2;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tasks.Navigate;

@Log4j2
@ExtendWith(SerenityJUnit5Extension.class)
public class SerenityJunitTest {
    @CastMember(name = "ChungND")
    Actor chung;

    @Test
    void testFunction01(){
        log.info("Zo");
        chung.attemptsTo(
                Navigate.toTheHomePage()
        );
        chung.attemptsTo(
                Ensure.that(1).isGreaterThan(0)
        );

    }
}
