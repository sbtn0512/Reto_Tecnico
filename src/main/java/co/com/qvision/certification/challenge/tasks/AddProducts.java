package co.com.qvision.certification.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.certification.challenge.userinterface.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {
    public static AddProducts toShoppingCart() {
        return instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SAUCE_LABS_BACKPACK),
                Click.on(SAUCE_LABS_BIKE_LIGHT),
                Click.on(SAUCE_LABS_BOLT_T_SHIRT),
                Click.on(SAUCE_LABS_FLEECE_JACKET),
                Click.on(SHOPPING_CART_BUTTON));
    }
}
