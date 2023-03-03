package aut.testcreation.testcases.web;


import aut.testcreation.tasks.ConstanciasFiscalesSitioCliente.*;
import framework.engine.selenium.SeleniumTestBase;
import gherkin.lexer.Da;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.*;
import java.awt.*;
import java.io.IOException;
import static framework.engine.selenium.GetTestName.*;

import org.junit.Assert;

public class SCR_AUT_005_ConstanciasFiscalesSitioClientes extends SeleniumTestBase {

    @Test
    void TC_005_01_ConsultaYDescargaClienteBancoIngles() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosCliente("pNumCliente","pContrasenia");
        Validar.mensajeSistema("parametro");
       //assertTrue(Validar.mensajeSistema("validacion"));

    }
    @Test
    void TC_005_02_ConsultaYDescargaClienteBancoEspañol() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosCliente("pNumCliente","pContrasenia");

        Validar.mensajeSistema("parametro");
        //assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_03_ConsultaYDescargaClienteCasaDeBolsaIngles() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosContrato("pNumeroDeContrato","pContrasenia");
        Validar.mensajeSistema("parametro");
        //assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_04_ConsultaYDescargaClienteCasaDeBolsaEspañol() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosContrato("pNumeroDeContrato","pContrasenia");
        Validar.mensajeSistema("parametro");
        //assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_05_ConsultaYDescargaClienteMexderIngles() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosContrato("pNumeroDeContrato","pContrasenia");
        Validar.mensajeSistema("parametro");
        //assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_06_ConsultaYDescargaClienteMexderEspañol() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosContrato("pNumeroDeContrato","pContrasenia");
        Validar.mensajeSistema("parametro");
        //assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_07_ConsultaYDescargaClienteOTCIngles() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosCliente("pNumCliente","pContrasenia");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_08_ConsultaYDescargaOTCEspañol() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosCliente("pNumCliente","pContrasenia");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_09_ConsultaYDescargaProveedorInglesExtranjero() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosBancaria("pNumCuentaBancaria");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_10_ConsultaYDescargaProveedorEspañolExtranjero() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.IngresarDatosBancaria("pNumCuentaBancaria");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_11_ConsultaYDescargaPremiadoIngles() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.CompletarDatos("pClaveIdentificador","pCorreo","pRFC","pEjercicio");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }
    @Test
    void TC_005_12_ConsultaYDescargaPremiadoEspañol() throws IOException, InvalidFormatException, AWTException{
        getTestName(getMethodName());
        Login.FuncionUsuario("pIdioma");
        Rol.funcionRol("pRol");
        Datos.CompletarDatos("pClaveIdentificador","pCorreo","pRFC","pEjercicio");
        Validar.mensajeSistema("parametro");
       // assertTrue(Validar.mensajeSistema("validacion"));
    }

}
