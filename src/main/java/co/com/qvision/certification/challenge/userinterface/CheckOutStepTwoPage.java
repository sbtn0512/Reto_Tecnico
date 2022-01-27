package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutStepTwoPage extends PageObject {
    public static final Target TAX = Target.the("amount of tax to pay").
            located(By.className("summary_tax_label"));
    public static final Target FINISH_BUTTON = Target.the("finish button").
            located(By.id("finish"));
}
