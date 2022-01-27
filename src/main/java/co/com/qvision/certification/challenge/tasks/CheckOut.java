package co.com.qvision.certification.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.qvision.certification.challenge.userinterface.CheckOutPage.CHECK_OUT_BUTTON;
import static co.com.qvision.certification.challenge.userinterface.CheckOutPage.PRICE_LIST;
import static co.com.qvision.certification.challenge.utils.Constants.TOTAL_PRICE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckOut implements Task {
    public static CheckOut shoppingCart() {
        return instrumented(CheckOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> priceList = Text.of(PRICE_LIST).viewedBy(actor).asList();
        float totalPrice = 0;
        for (String s : priceList) {
            totalPrice += Float.parseFloat(s.substring(1));
        }
        actor.remember(TOTAL_PRICE, totalPrice);
        actor.attemptsTo(Click.on(CHECK_OUT_BUTTON));
    }
}