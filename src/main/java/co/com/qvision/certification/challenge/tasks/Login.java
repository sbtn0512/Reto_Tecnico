package co.com.qvision.certification.challenge.tasks;

import co.com.qvision.certification.challenge.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.certification.challenge.userinterface.HomePage.*;
import static co.com.qvision.certification.challenge.utils.Constants.USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    public static Login inTheSwaglabs() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(USERNAME),
                Enter.theValue(Constants.PASSWORD).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }
}