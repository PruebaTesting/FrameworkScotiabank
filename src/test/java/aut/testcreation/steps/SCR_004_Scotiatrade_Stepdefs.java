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
        When("El Usuario hace el Cambio de Imagen valida", (String pMenu, String pDatos) -> {
            Menu.cambioImagenvalida(pMenu, pDatos);
        });
        When("El Usuario hace el Cambio de Imagen invalido", (String pMenu, String pDatos, String pPathImg) -> {
            Menu.cambioImagenInvalido(pMenu, pDatos, pPathImg);
        });
        /*Then("El Sistema muestra en pantalla el mensaje: {string}", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });*/
        Then("El Usuario valida el cambio de imagen", () -> {
            Validar.cambioImagen();
        });

        When("El Usuario hace el Cambio de e-mail", (String pMenu, String pMail, String pCiudad, String pTelefono, String pExtension, String pContrasenia) -> {
            Menu.cambioMail(pMenu, pMail, pCiudad, pTelefono, pExtension, pContrasenia);
        });
        Then("El Usuario valida los cambios de e-mail", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });
        Then("El Usuario ingresa el número de Token", (String pToken) -> {
            Menu.ingresarToken(pToken);
        });
        When("El Usuario hace el Cambio de Pregunta Secreta", (String pPreguntaSecreta, String pRespuesta, String pConfirRta) -> {
            Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        });
        And("El Usuario ingresa los datos para registrar número de Token", (String pDatos, String pCaptcha) -> {
            Menu.RegistarToken(pDatos, pCaptcha);
        });
    }
}