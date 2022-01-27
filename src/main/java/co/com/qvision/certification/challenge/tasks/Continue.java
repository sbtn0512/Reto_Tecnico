package co.com.qvision.certification.challenge.tasks;

import co.com.qvision.certification.challenge.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certification.challenge.userinterface.FormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Continue implements Task {
    public static Continue withThePurchase() {
        return instrumented(Continue.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Constants.FIRST_NAME).into(FIRST_NAME),
                Enter.theValue(Constants.LAST_NAME).into(LAST_NAME),
                Enter.theValue(Constants.POSTAL_CODE).into(POSTAL_CODE),
                Click.on(CONTINUE_BUTTON));
    }
}