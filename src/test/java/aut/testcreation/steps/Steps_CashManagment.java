package aut.testcreation.steps;

import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Steps_CashManagment extends CucumberBaseTestRunner implements En {
    public Steps_CashManagment() {
        When("El Usuario crea un Tipo de Beneficiario Pago de Servicios y Facturas con los datos {string} y {string}", (String pAlias, String pNumCliente) -> {
            System.out.println(pAlias + " " + pNumCliente);
        });

        When("El Usuario crea un Tipo de Beneficiario Contribuciones Federales con los datos {string}", (String pTipoImpuesto) -> {
            System.out.println(pTipoImpuesto);
        }); // Hacer varios Steps o hacer un switch case?
    }
}
