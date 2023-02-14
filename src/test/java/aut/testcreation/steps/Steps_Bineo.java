package aut.testcreation.steps;

import aut.testcreation.tasks.bineo.Login;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Steps_Bineo extends CucumberBaseTestRunner implements En {
    public Steps_Bineo() {
        Given("El Usuario ingresa como un usuario existente", () -> {
            Login.ingresarCorrectamente();
        });
    }
}
