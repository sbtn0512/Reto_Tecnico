package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {

    public static final Target PRICE_LIST = Target.the("price list of added products").
            located(By.className("inventory_item_price"));
    public static final Target CHECK_OUT_BUTTON = Target.the("button to verify purchase").
            located(By.id("checkout"));

}
