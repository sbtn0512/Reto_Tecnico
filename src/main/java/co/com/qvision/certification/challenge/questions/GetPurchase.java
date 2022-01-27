package co.com.qvision.certification.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.qvision.certification.challenge.userinterface.PurchaseCompletedPage.PURCHASE_COMPLETED;

public class GetPurchase implements Question<Boolean> {

    private final String message;

    public GetPurchase(String message) {
        this.message = message;
    }

    public static GetPurchase confirmationText(String message) {
        return new GetPurchase(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return message.equals(Text.of(PURCHASE_COMPLETED).viewedBy(actor).asString());
    }
}