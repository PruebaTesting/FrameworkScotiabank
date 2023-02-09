package aut.testcreation.testcases;

import aut.testcreation.tasks.scotiabank.Consulta;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Validar;
import aut.testcreation.tasks.scotiabank.Menu;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

public class SCR_AUT_006_ContabilidadElectronica extends SeleniumTestBase {

    @Test
    void TC_006_01_ConsultaXmlTsysSinCuentaConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_02_ConsultaXmlTsysConCuentaConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_03_ConsultaXmlTsysSinRFCReceptorConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_04_ConsultaUnoEspecificoDeXmlTsys() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_05_ConsultaXmlTsysCon2RFCReceptorConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_06_ConsultaXmlTsysCon3RFCReceptorConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_07_ConsultaXmlTsysCon4RFCReceptorConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_08_ConsultaXmlTsysCon5RFCReceptorConFechas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.sinCuenta();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_09_ValidarComboFechasInicioYFinalConsultaXMLsTSYS() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Consulta.seleccionarFecha();
        Validar.listaRegistros();
    }
    @Test
    void TC_006_10_IngresoACMEUsuarioConUnRolAclaradorEstadosdeCuenta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.registrarse();
        Menu.seleccionarRol();
        Validar.listaRegistros();
    }
}