package aut.testcreation.steps;

import aut.testcreation.tasks.biometricos.*;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps_Biometricos extends CucumberBaseTestRunner implements En {
    public Steps_Biometricos() {
        Given("El Usuario firma mediante SSO e ingresa a Aplicativo Biométricos con los datos {string}", (String pDatos) -> {
            Ingresar.aAplicativosBiometricos(pDatos);
        });

        Then("El Sistema muestra la página de acceso al Sistema de Biométricos con su nombre {string}", (String pNombre) -> {
            assertTrue(Comprobar.accesoPaginaAplicativoBiometricos(pNombre));
        });

        Given("El Usuario ingresa con su Huella", () -> {
            Ingresar.conHuella();
        });

        Then("El Sistema muestra una página de validación exitosa y WebScan con un menú con las opciones {string}", (String pOpciones) -> {
            assertTrue(Comprobar.accesoAplicativoBiometricos(pOpciones));
        });
        Given("El Usuario realiza la Consulta de un Cliente para luego seleccionar un producto", () -> {
            Realizar.consultaClienteYSeleccionarProducto();
        });

        Then("El Sistema muestra la Página de Enrolamiento", () -> {
            assertTrue(Comprobar.enrolamiento());
        });

        Given("El Usuario realiza una busqueda correcta de Cliente No Enrolado", () -> {
            Realizar.busquedaCorrectaClienteNoEnrolado();
        });

        And("El Usuario escanea el documento", () -> {
            Realizar.escaneoYValidacionCorrecto();
        });
        When("El Usuario realiza la digitalizacion del consentimiento de tratamiento de datos INE", () -> {
            Realizar.digitalizacionDatosINE();
        });
        Then("El Sistema finaliza el Proceso de validación finaliza correctamente", () -> {
            assertTrue(Comprobar.finalizacionProceso());
        });
        Then("El Sistema muestra una pantalla de validación exitosa", () -> {
            assertTrue(Comprobar.validacionExitosa());
        });
    }
}
