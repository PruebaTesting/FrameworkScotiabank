package aut.testcreation.testcases;

import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SRC_AUT_002_CashMagment extends SeleniumTestBase {

    @BeforeEach
    // Puede haber problemas con los numeros
    /*void before(){
        Login.correcto("pUsuario", "pContrasenia", "pToken");
    }*/

    @Test
    void TC_002_01_altaBeneficiarioPagoDeFactura() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.pagoDeServiciosYFacturas("pAlias", "pNumCliente");
    }

    @Test
    void TC_002_02_sinNombre() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.pagoDeServiciosYFacturas("pAlias");
    }

    @Test
    void TC_002_03_sinNombre() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaMoral("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pLimiteAbono");
    }

    @Test
    void TC_002_04_sinNombre() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaMoral("pTipoCuenta", "pNumCuenta", "pLimiteAbono");
    }

    @Test
    void TC_002_05_sinNombre() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaFisica("pNombrePerfil", "pTipoBanco", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno", "pLimiteAbono");
    }

    @BeforeEach
    void before(){
        Login.confirmarAutenticacion("pContrasenia", "pToken");
        assertTrue(Comprobar.creacionBeneficiarioExitosa("pResultadoEsperado"));
    }

}
