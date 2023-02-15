package aut.testcreation.testcases;

import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import aut.testcreation.tasks.scotiabank.Rol;
import aut.testcreation.tasks.scotiabank.Validar;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.Assert.*;


public class SRC_AUT_003_ConstanciasFiscalesBanco extends SeleniumTestBase {

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
    void TC_003_02_ConsultaYDescargaClienteBancoEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_04_ConsultayDescargaClienteCasaDeBolsaEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_06_ConsultayDescargaClienteMexderEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_08_ConsultayDescargaOTCEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_10_ConsultaYDescargaProveedorEspañolExtranjero() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_12_ConsultaYDescargaPremiadoEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_14_ConsultaYDescargaClienteBancoEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_16_ConsultaYDescargaClienteCasaDeBolsaEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_18_ConsultaYDescargaClienteMexderEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_20_ConsultaYDescargaOTCEspañol() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_22_ConsultaYDescargaProveedorEspañolExtranjero() throws IOException, InvalidFormatException, AWTException {
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
    void TC_003_24_ConsultaYDescargaPremiadoEspañol() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.rolPremiadoProveedor();
        Datos.IngresarDatos("pDatos", "pDato2");
        Validar.mensajeSistema("parametro");
    }
}
