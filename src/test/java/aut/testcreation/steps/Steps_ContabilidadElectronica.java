package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.Consulta;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Steps_ContabilidadElectronica extends CucumberBaseTestRunner implements En {
    public Steps_ContabilidadElectronica() {
        Given("El Usuario se loguea en la pantalla Consulta XML´s TSYS", () -> {
            Login.ingresar();
        });
        When("El Usuario hace la consulta sin cuenta, con fechas", () -> {
            Consulta.sinCuenta();
        });
        Then("El Sistema muestra en pantalla la lista de los xml s", () -> {
            Validar.listaRegistros();
        });
        When("El Usuario hace la consulta con cuenta, con fechas", () -> {
            Consulta.sinCuenta();
        });


        When("El Usuario hace la consulta sin RFC receptor, con fechas", () -> {
        });
        When("El Usuario hace la consulta sin RFC receptor", () -> {
        });
        When("El Usuario hace la consulta RFC receptor, con fechas", () -> {
        });
        When("El Usuario selecciona las fechas", () -> {
        });
        Given("El Usuario se loguea en el Home Page", () -> {
            Login.ingresar();
        });
        /*When("El Usuario selecciona el Rol {string}", (String arg0) -> {
        });*/
        Then("El Sistema muestra en pantalla la pantalla de Administración de XML´s TSYS", () -> {
        });
        When("El Usuario consulta la información Tipo de Log", () -> {
        });
        Then("El Sistema muestra en pantalla la información requerida", () -> {

            Validar.pantallaFinal();

            Validar.pantalla();

        });
        When("El Usuario selecciona las opciones de información", () -> {
        });
        Then("El Sistema genera el XML correctamente", () -> {
        });
        When("El Usuario consulta el Listado de balanzas Empresas Reguladas", () -> {
        });
        Given("El Usuario esta logueado en el Sistema", () -> {
        });
        Then("Click al Botón Salir", () -> {
        });

    }
}
