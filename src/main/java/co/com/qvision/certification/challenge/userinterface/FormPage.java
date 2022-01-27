package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage extends PageObject {

    public static final Target FIRST_NAME = Target.the("Field to enter first name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Field to enter last name").located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("Field to enter postal code").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Button to continue").located(By.id("continue"));

}
