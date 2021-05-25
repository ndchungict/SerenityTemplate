package steps;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class Hooks {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
