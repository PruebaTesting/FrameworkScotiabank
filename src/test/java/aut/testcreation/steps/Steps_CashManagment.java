package aut.testcreation.steps;

import aut.testcreation.tasks.cashManagment.Comprobar;
import aut.testcreation.tasks.cashManagment.CrearBeneficiario;
import aut.testcreation.tasks.cashManagment.Login;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Steps_CashManagment extends CucumberBaseTestRunner implements En {
    public Steps_CashManagment() {
        When("El Usuario crea un Tipo de Beneficiario Pago de Servicios y Facturas con los datos {string} y {string}", (String pAlias, String pNumCliente) -> {
            System.out.println(pAlias + " " + pNumCliente);
            CrearBeneficiario.pagoDeServiciosYFacturas(pAlias, pNumCliente);
        });

        When("El Usuario crea un Tipo de Beneficiario Contribuciones Gubernamentales con los datos {string}", (String pTipoImpuesto) -> {
            System.out.println(pTipoImpuesto);
            CrearBeneficiario.contribucionesGubernamentales(pTipoImpuesto);
        }); // Hacer varios Steps o hacer un switch case?
        Given("El Usuario se Logea en la página de CCOP con los datos {string}, {string} y {string}", (String pUsuario, String pContrasenia, String pToken) -> {
            System.out.println(pUsuario + pContrasenia + pToken);
            Login.correcto(pUsuario, pContrasenia, pToken);
        });
        And("El Usuario confirma sus datos de autenticación con los datos {string} y {string}", (String pContrasenia, String pToken) -> {
            System.out.println("confirmacion > " + pContrasenia + pToken);
            Login.confirmarAutenticacion(pContrasenia, pToken);
        });
        Then("El Sistema muestra la creación exitosa del Beneficiario {string}", (String pResultadoEsperado) -> {
            System.out.println(pResultadoEsperado);
            Comprobar.creacionBeneficiarioExitosa(pResultadoEsperado);
        });
    }
}
