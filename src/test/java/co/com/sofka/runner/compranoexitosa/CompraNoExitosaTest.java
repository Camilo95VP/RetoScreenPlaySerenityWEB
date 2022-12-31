package co.com.sofka.runner.compranoexitosa;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/unsuccessfulpurchase/unsuccessfulpurchase.feature"},
        glue={"co.com.sofka.stepdefinition.unsuccessfulpurchase"},
        tags="not @ignore"
)
public class CompraNoExitosaTest {
}
