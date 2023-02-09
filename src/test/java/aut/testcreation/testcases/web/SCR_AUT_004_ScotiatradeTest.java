package aut.testcreation.testcases.web;

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
    public static void TC_004_01_HpSdbLfCambiodeClaveDeAccesoaUsuarioNoLogueado(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_02_HpSdbLfCambioDeClavedeAcceso(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_03_TTFSDBLFCambiodeclavedeaccesoclaveactualincorrecta(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_04_TTFSDBLFCambiodeclavedeaccesoclavenuevaincorrecta(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_05_TTFSDBLFCambiodeclavedeaccesoclavenuevanocoincideconlaconfirmada(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_06_TTFSDBLFCambiodeclavedeaccesoclavenuevayautilizada(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_07_TTFSDBLFCambiodeclavedeaccesonocapturónumerodeusuario(String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.ClavePersonal();
        assertTrue(Validar.mensajeSistema(parametro));
    }
    @Test
    public static void TC_004_08_HPSdbLFCambiodeImagen(String pMenu, String pDatos) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.cambioImagenvalida(pMenu, pDatos);
        Validar.cambioImagen();
    }
    @Test
    public static void TC_004_09_TTFSDBLFCambiodeImagenfaltaInformación(String pMenu, String pDatos, String pPathImg) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.cambioImagenInvalido(pMenu, pDatos, pPathImg);
    }
    @Test
    public static void TC_004_10_HPSDBLFCambiodeEmail(String pMenu, String pMail, String pCiudad, String pTelefono, String pExtension, String pContrasenia, String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.cambioMail(pMenu, pMail, pCiudad, pTelefono, pExtension, pContrasenia);
        Validar.mensajeSistema(parametro);
    }
    @Test
    public static void TC_004_11_HPSDBLFCambiodeEmailconToken(String pMenu, String pMail, String pCiudad, String pTelefono, String pExtension, String pContrasenia, String pToken) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.cambioMail(pMenu, pMail, pCiudad, pTelefono, pExtension, pContrasenia);
        Menu.ingresarToken(pToken);
    }
    @Test
    public static void TC_004_12_HPSDBLFCambiodeEmailConTokenVirtual(String pMenu, String pMail, String pCiudad, String pTelefono, String pExtension, String pContrasenia, String pToken) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.cambioMail(pMenu, pMail, pCiudad, pTelefono, pExtension, pContrasenia);
        Menu.ingresarToken(pToken);
    }
    @Test
    public static void TC_004_13_HPSDBLFCambioDePreguntaSecreta(String pPreguntaSecreta, String pRespuesta, String pConfirRta, String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Validar.mensajeSistema(parametro);
    }
    @Test
    public static void TC_004_14_HPSDBLFCambioDePreguntaSecretaConToken(String pPreguntaSecreta, String pRespuesta, String pConfirRta, String pDatos, String pCaptcha) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Menu.RegistarToken(pDatos, pCaptcha);
    }
    @Test
    public static void TC_004_15_TTFSDBLFCambiodePreguntaSecretaCaptchaIncorrecto(String pPreguntaSecreta, String pRespuesta, String pConfirRta, String pDatos, String pCaptcha, String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Menu.RegistarToken(pDatos, pCaptcha);
        Validar.mensajeSistema(parametro);
    }
    @Test
    public static void TC_004_16_TTFSDBLFCambiodePreguntaSecretaCaracternoPermitido(String pPreguntaSecreta, String pRespuesta, String pConfirRta,String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Validar.mensajeSistema(parametro);
    }
    @Test
    public static void TC_004_17_TTFSDBLFCambiodePreguntaSecretaNoCoincidenRespuestas(String pPreguntaSecreta, String pRespuesta, String pConfirRta, String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Validar.mensajeSistema(parametro);
    }
    @Test
    public static void TC_004_18_TTFSDBLFCambiodePreguntaSecretaPreguntayaUsada(String pPreguntaSecreta, String pRespuesta, String pConfirRta, String parametro) throws IOException, InvalidFormatException, AWTException {
        Login.ingresarScotiatrade();
        Menu.CambioPreguntaSecreta(pPreguntaSecreta, pRespuesta, pConfirRta);
        Validar.mensajeSistema(parametro);
    }
}