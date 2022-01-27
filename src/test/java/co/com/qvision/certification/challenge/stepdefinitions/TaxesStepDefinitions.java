package co.com.qvision.certification.challenge.stepdefinitions;

import co.com.qvision.certification.challenge.exceptions.TaxesException;
import co.com.qvision.certification.challenge.questions.TheTaxes;
import co.com.qvision.certification.challenge.tasks.AddProducts;
import co.com.qvision.certification.challenge.tasks.CheckOut;
import co.com.qvision.certification.challenge.tasks.Continue;
import co.com.qvision.certification.challenge.tasks.Login;
import co.com.qvision.certification.challenge.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.qvision.certification.challenge.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TaxesStepDefinitions {

    @Managed(driver = CHROME)
    WebDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(FIRST_NAME);
    }

    @Given("^he entered products in the shopping cart$")
    public void heEnteredProductsInTheShoppingCart() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new HomePage()),
                Login.inTheSwaglabs(),
                AddProducts.toShoppingCart());
    }

    @When("he checks the purchase")
    public void heChecksThePurchase() {
        theActorInTheSpotlight().attemptsTo(CheckOut.shoppingCart(),
                Continue.withThePurchase());
    }
    @Then("he will see on the screen the value of the taxes")
    public void heWillSeeOnTheScreenTheValueOfTheTaxes() {
        theActorInTheSpotlight().should(seeThat(TheTaxes.correctly()).orComplainWith(TaxesException.class, WRONG_TAX));
    }
}