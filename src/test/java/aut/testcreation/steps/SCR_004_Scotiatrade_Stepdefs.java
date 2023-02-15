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

        Then("El Usuario valida el cambio de imagen", () -> {
            Validar.cambioImagen();
        });

        When("El Usuario hace el Cambio de e-mail", () -> {
            Menu.cambioMail();
        });
        Then("El Usuario valida los cambios de e-mail", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });

        When("El Usuario hace el Cambio de Pregunta Secreta", () -> {
            Menu.CambioPreguntaSecreta();
        });
        And("El Usuario ingresa los datos para registrar número de Token", (String pDatos, String pCaptcha) -> {
            Menu.RegistarToken(pDatos, pCaptcha);
        });
        When("El Usuario hace el Cambio de Clave Personal, con Clave Nueva Incorrecta", () -> {
            Menu.ClavePersonalIncorrecta();
        });
        When("El Usuario hace el Cambio de Clave Personal, sin ingresar Número de Usuario", () -> {
            Menu.IntentarCambiarClave();
        });
        Given("El Usuario ingresa al HomePage de ScotiaTrade", () -> {
            Login.ingresar();
        });
        When("El Usuario hace el Cambio de e-mail, con Token", () -> {
            Menu.CambioMailConToken();
        });
    }
}