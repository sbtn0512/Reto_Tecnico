package co.com.qvision.certification.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.text.DecimalFormat;

import static co.com.qvision.certification.challenge.userinterface.CheckOutStepTwoPage.TAX;
import static co.com.qvision.certification.challenge.utils.Constants.TOTAL_PRICE;

public class TheTaxes implements Question<Boolean> {

    public static TheTaxes correctly() {
        return new TheTaxes();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        float totalPrice = actor.recall(TOTAL_PRICE);
        double tax = 0.0800302000755002;
        DecimalFormat df = new DecimalFormat("#.00");
        double taxes = Double.parseDouble(df.format(totalPrice*(tax)).replace(",","."));
        return taxes == Double.parseDouble(Text.of(TAX).viewedBy(actor).asString().substring(6));
    }
}