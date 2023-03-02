package aut.testcreation.testcases.web;

import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Menu;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.GetTestName.getMethodName;
import static framework.engine.selenium.GetTestName.getTestName;

public class SCR_AUT_004_Consulta  extends SeleniumTestBase {

    @Test
    void TC_004_19_ConsultaCartasConfirmación() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.cartasConfirmacion();
        Validar.cartaConfirmacion();
    }
    @Test
    void TC_004_20_ConsultaCartasConfirmaciónConToken() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.cartasConfirmacion();
        Validar.cartaConfirmacion();
    }
    @Test
    void TC_004_21_CambioDeClaveDeAccesoClaveNuevaIncorrecta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.constanciasFiscales();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_22_ConsultaEstadosDeCuenta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_23_ConsultaDeMovimientos35Dias() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_24_ConsultaDeMovimientos35Dias() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_25_ConsultaDelMóduloConsultaDeMovimientosConMásDe20Registros() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_26_Valorización() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
    @Test
    void TC_004_27_Valorización() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarPageConsulta();
        Menu.navegacionSuperior();
        Validar.constanciasFiscalesDisponibles();
    }
}
