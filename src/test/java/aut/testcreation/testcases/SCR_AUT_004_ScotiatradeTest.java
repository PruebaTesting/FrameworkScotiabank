package aut.testcreation.testcases;

import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Menu;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SCR_AUT_004_ScotiatradeTest extends SeleniumTestBase {
    @Test
    void TC_004_01_CambioDeClaveDeAccesoAUsuarioNoLogueado() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_02_CambioDeClaveDeAcceso() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_03_CambioDeClaveDeAccesoClaveActualIncorrecta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_04_CambioDeClaveDeAccesoClaveNuevaIncorrecta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonalIncorrecta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_05_CambioDeClaveDeAccesoClaveNuevaNoCoincideConLaConfirmada() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonalIncorrecta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_06_CambioDeClaveDeAccesoClaveNuevaYaUtilizada() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonalIncorrecta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_07_CambioDeClaveDeAccesoNoCapturóNumeroDeUsuario() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.IntentarCambiarClave();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_08_CambioDeImagen() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.cambioImagenvalida();
        Validar.cambioImagen();
    }
    @Test
    void TC_004_09_CambioDeImagenFaltaInformación() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.cambioImagenInvalido();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_10_CambioDeEmail() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.cambioMail();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_11_CambioDeEmailConToken() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.CambioMailConToken();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_12_CambioDeEmailConTokenVirtual() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.CambioMailConToken();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_13_CambioDePreguntaSecreta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ClavePersonalIncorrecta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_14_CambioDePreguntaSecretaConToken() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.CambioMailConToken();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_15_CambioDePreguntaSecretaCaptchaIncorrecto() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.CambioMailConToken();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_16_CambioDePreguntaSecretaCaracterNoPermitido() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_17_CambioDePreguntaSecretaNoCoincidenRespuestas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta();
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_004_18_CambioDePreguntaSecretaPreguntaYaUsada() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta();
        Validar.mensajeSistema("parametro");
    }
}