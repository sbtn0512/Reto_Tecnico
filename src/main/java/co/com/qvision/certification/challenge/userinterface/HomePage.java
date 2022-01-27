package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {

    public static final Target USERNAME = Target.the("Username login field").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Password login field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("login-button"));
}
