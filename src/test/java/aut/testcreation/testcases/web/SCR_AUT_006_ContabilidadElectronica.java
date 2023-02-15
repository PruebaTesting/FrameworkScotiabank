package aut.testcreation.testcases.web;

import aut.testcreation.tasks.scotiabank.*;
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
    @Test
    void TC_006_11_ValidarLogPrecargaDeInformación() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_12_ValidarLogDeCargaDeInformación() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_13_ValidarLogDeCargaDeBalanzas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_14_ValidarLogDeCargaDeFolios() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_15_ValidarLogDeCargaDeJournal() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_16_ValidarLogDeCargaDeReconfileTSYS() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_17_ValidarLogDeCargaDeTryBalance() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_18_ValidarLogDeCargaDeXmlTSYS() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_19_ValidarLogDeCargaDeEDL() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_20_ValidarLogDelFrontCME() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.tipoLog();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_21_IngresarAlSitioConContraseñaUsuarioConTodosLosRoles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Rol.RolConsulta();
        Validar.pantallaFinal();
    }
    @Test
    void TC_006_22_GeneraciónDeXmlAuxiliarDeFoliosConNúmeroDeOrdenTodosLosAplicativos() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.generacionXML();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_23_ListadoDeXmlConsultaGeneral() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.listadoXML();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_24_ListadoDeBalanzasConsultaGeneralDeBalanzas() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Informacion.listadoXML();
        Validar.informacionRequerida();
    }
    @Test
    void TC_006_25_SalirDelSitio() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Login.InicioSesion();
    }
}