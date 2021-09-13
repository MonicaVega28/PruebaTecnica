package co.com.certification.proyectobase.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academyChoucair.feature",
        tags="@stories",
        glue = "co.com.certification.academy.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}