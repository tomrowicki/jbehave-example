package org.jbehave.example;

import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;

import static org.junit.jupiter.api.Assertions.fail;

public class BookMyTrain extends Steps {

    @BeforeScenario
    public void myFirstJourney() {
        System.out.println("Hopping on the train for the first time!");
    }

    @Given("I am in Zielona Góra")
    public void myLocation() {
        System.out.println("Zielona Góra");
    }

    @Given("I want to book a train ticket")
    public void bookTicket() {
        System.out.println("train ticket");
    }

    @When("I choose my Source Location as $place")
    @Alias("$place is chosen as the Source Location")
    public void source(String place) {
        System.out.println("Src: " + place);
    }

    @Then("My destination location should not contain Zielona Góra as an option")
    public void destinationGeneral() {
        System.out.println("Other than Zielona Góra");
    }

    @Then("I choose my Destination location as $destination")
    public void destinationConcrete(String destination) {
        System.out.println(destination);
        fail();
    }

    @AfterScenario
    public void endJourney() {
        System.out.println("All good things must come to an end :(");
    }

    @AfterScenario(uponOutcome = AfterScenario.Outcome.FAILURE)
    public void oops() {
        System.out.println("Yikes! Something broke!");
    }
}
