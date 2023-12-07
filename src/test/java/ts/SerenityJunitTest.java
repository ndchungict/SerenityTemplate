package ts;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tasks.Navigate;

@ExtendWith(SerenityJUnit5Extension.class)
public class SerenityJunitTest {
    @CastMember(name = "ChungND")
    Actor chung;

    @Test
    void testFunction01(){
//        chung.attemptsTo(
//                Navigate.toTheHomePage()
//        );
        chung.attemptsTo(
                Ensure.that(1).isGreaterThan(0)
        );
    }
}
