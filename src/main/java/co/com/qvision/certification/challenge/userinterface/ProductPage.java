package co.com.qvision.certification.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final Target SAUCE_LABS_BACKPACK = Target.the("Sauce Labs Backpack").
            located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target SAUCE_LABS_BIKE_LIGHT = Target.the("Sauce Labs Bike Light").
            located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target SAUCE_LABS_BOLT_T_SHIRT = Target.the("Sauce Labs Bolt T-Shirt").
            located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target SAUCE_LABS_FLEECE_JACKET = Target.the("Sauce Labs Fleece Jacket").
            located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target SHOPPING_CART_BUTTON = Target.the("button to access the shopping cart").
            located(By.id("shopping_cart_container"));
}
