package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.Menu;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class SCR_004_Scotiatrade_Stepdefs extends CucumberBaseTestRunner implements En {
    public SCR_004_Scotiatrade_Stepdefs() {
        Given("El Usuario se logea en la Home Page de ScotiaTrade", () -> {
            Login.ingresarScotiatrade();
        });
        When("El Usuario intenta hacer el Cambio de Clave Personal", () -> {
            Menu.ClavePersonal();
        });
        When("El Usuario hace el Cambio de Clave Personal", () -> {
            Menu.ClavePersonal();
        });
        When("El Usuario hace el Cambio de Imagen valida", () -> {
            Menu.cambioImagenvalida();
        });
        When("El Usuario hace el Cambio de Imagen invalido", () -> {
            Menu.cambioImagenInvalido();
        });
        /*Then("El Sistema muestra en pantalla el mensaje: {string}", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });*/
        Then("El Usuario valida el cambio de imagen", () -> {
            Validar.cambioImagen();
        });

        When("El Usuario hace el Cambio de e-mail", () -> {
            Menu.cambioMail();
        });
        Then("El Usuario valida los cambios de e-mail", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });
        Then("El Usuario ingresa el número de Token", () -> {
            //Menu.ingresarToken();
        });
        When("El Usuario hace el Cambio de Pregunta Secreta", () -> {
            Menu.CambioPreguntaSecreta();
        });
        And("El Usuario ingresa los datos para registrar número de Token", () -> {
            Menu.RegistarToken();
        });

//------------------------------------------------------------------------------------------------

        Given("El Usuario ingresa al page de Registro de Usuario", () -> {
            Login.ingresarPageConsulta();
        });
        When("El Usuario hace la consulta de Cartas Confirmadas", () -> {
            Menu.cartasConfirmacion();
        });
        Then("El Sistema muestra en pantalla la carta confirmación", () -> {
            Validar.cartaConfirmacion();
        });
        When("El Usuario hace la consulta de Constancias Fiscales", () -> {
            Menu.constanciasFiscales();
        });
        Then("El Sistema muestra en pantalla las constancias fiscales disponibles", () -> {
            Validar.constanciasFiscalesDisponibles();
        });
        When("El Usuario hace la consulta de Navegación superior", () -> {
            Menu.navegacionSuperior();
        });
        When("El Usuario hace la consulta de Guia Diaria", () -> {
            Menu.guiaDiaria();
        });
        When("El Usuario hace la consulta de Información de Mercado", () -> {
            Menu.informacionDeMercado();
        });
        When("El Usuario hace la consulta de Manual de Operacion", () -> {
            Menu.manualDeOperacion();
        });
    }
}