package co.com.qvision.certification.challenge.stepdefinitions;

import co.com.qvision.certification.challenge.exceptions.FailedPurchaseException;
import co.com.qvision.certification.challenge.questions.GetPurchase;
import co.com.qvision.certification.challenge.tasks.*;
import co.com.qvision.certification.challenge.userinterface.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.qvision.certification.challenge.utils.Constants.CHROME;
import static co.com.qvision.certification.challenge.utils.Constants.PURCHASE_NOT_COMPLETED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseMadeStepDefinitions {

    @Managed(driver = CHROME)
    WebDriver driver;

    @Given("he checked out the cart")
    public void heCheckedOutTheCart() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new HomePage()),
                Login.inTheSwaglabs(),
                AddProducts.toShoppingCart(),
                CheckOut.shoppingCart(),
                Continue.withThePurchase());
    }
    @When("he completes the purchase")
    public void heCompletesThePurchase() {
        theActorInTheSpotlight().attemptsTo(Finish.thePurchase());
    }
    @Then("^he will see on the screen the message (.*)$")
    public void heWillSeeOnTheScreenTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(GetPurchase.confirmationText(message)).
                orComplainWith(FailedPurchaseException.class, PURCHASE_NOT_COMPLETED));
    }
}