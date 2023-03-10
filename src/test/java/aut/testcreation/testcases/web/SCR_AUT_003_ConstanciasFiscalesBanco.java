package aut.testcreation.testcases.web;

import static framework.engine.selenium.GetTestName.*;
import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Rol;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;


public class SCR_AUT_003_ConstanciasFiscalesBanco extends SeleniumTestBase {

    @Test
    void TC_003_01_ConsultaYDescargaClienteBancoIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_02_ConsultaYDescargaClienteBancoEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_03_ConsultayDescargaClienteCasaDeBolsaIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_04_ConsultayDescargaClienteCasaDeBolsaEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_05_ConsultayDescargaClienteMexderIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_06_ConsultayDescargaClienteMexderEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_07_ConsultaYDescargaClienteOTCIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_08_ConsultayDescargaOTCEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_09_ConsultaYDescargaProveedorInglesExtranjero() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_10_ConsultaYDescargaProveedorEspaĆ±olExtranjero() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_11_ConsultayDescargaPremiadoIngles () throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_12_ConsultaYDescargaPremiadoEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_13_ConsultaYDescargaClienteBancoIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_14_ConsultaYDescargaClienteBancoEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_15_ConsultaYDescargaClienteCasaDeBolsaIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_16_ConsultaYDescargaClienteCasaDeBolsaEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_17_ConsultaYDescargaClienteMexderIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_18_ConsultaYDescargaClienteMexderEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_19_ConsultaYDescargaClienteOTCIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_20_ConsultaYDescargaOTCEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_21_ConsultaYDescargaProveedorInglesExtranjero() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_22_ConsultaYDescargaProveedorEspaĆ±olExtranjero() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        System.out.println("el test paso");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_23_ConsultaYDescargaPremiadoIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        Validar.mensajeSistema("parametro");
    }
    @Test
    void TC_003_24_ConsultaYDescargaPremiadoEspaĆ±ol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        Validar.mensajeSistema("parametro");
    }
}
