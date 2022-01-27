package co.com.qvision.certification.challenge.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "co.com.qvision.certification.challenge.stepdefinitions"},
        features = "src/test/resources/features/purchase_made.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class PurchaseMade {
}
