package co.com.qvision.certification.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certification.challenge.userinterface.CheckOutStepTwoPage.FINISH_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Finish implements Task {
    public static Finish thePurchase() {
        return instrumented(Finish.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FINISH_BUTTON));
    }
}
