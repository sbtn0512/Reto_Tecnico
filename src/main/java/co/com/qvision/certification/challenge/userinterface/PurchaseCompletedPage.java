package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseCompletedPage extends PageObject {

    public static final Target PURCHASE_COMPLETED = Target.the("purchase completed message").
            located(By.className("complete-header"));
}
