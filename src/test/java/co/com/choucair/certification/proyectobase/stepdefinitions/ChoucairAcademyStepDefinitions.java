package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

     @Before
     public void setStage() {
         OnStage.setTheStage(new OnlineCast());
     }

    @Given("^than brandon wants lo learn automation at the academy choucair$")
    public void thanBrandonWantsLoLearnAutomationAtTheAcademyChoucair() {
         OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage(),(Login.onThePage));
       throws Exception{
           OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(course));
        }

     }


    @When("^the search for the course (.*) on the choucair academy platform$")
    public void theSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
          OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }


    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }












}
