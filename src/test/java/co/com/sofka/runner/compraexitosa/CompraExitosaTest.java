package co.com.sofka.runner.compraexitosa;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/compraexitosa/compraexitosa.feature"},
        glue={"co.com.sofka.stepdefinition.compraexitosa"},
        tags="not @ignore"
)
public class CompraExitosaTest {
}
