package aut.testcreation.testcases;

import aut.testcreation.tasks.cashManagment.*;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class SRC_AUT_002_CashMagment extends SeleniumTestBase {

    @BeforeEach
    // Puede haber problemas con los numeros
/*void before(){
        Login.correcto("pUsuario", "pContrasenia", "pToken");
    }*/


    @ParameterizedTest
    @CsvSource({"TC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente",
                "TC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente"})
    void TC_002_01y02_test(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.pagoDeServiciosYFacturas("pAlias", "pNumCliente");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_03_altaBeneficiarioPersonaMoralOtroBanco",
                "TC_002_04_altaBeneficiarioPersonaMoralScotiabank"})
    void TC_002_03y04_test(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaMoral("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pLimiteAbono");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco",
                "TC_002_06_altaBeneficiarioPersonaFisicaScotiabank"})
    void TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaFisica("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno", "pLimiteAbono");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado",
                "TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad"})

    void TC_002_07y08_test(String pMethodName) throws IOException {
        getTestName(pMethodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesGubernamentales("pTipoImpuesto");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_09_altaBeneficiarioContribucionesFederalesSAT",
                "TC_002_10_altaBeneficiarioContribucionesFederalesDerechos"})

    void TC_002_09y10_test(String pMethodName) throws IOException {
        getTestName(pMethodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesFederales();
    }

    @Test
    void TC_002_11_pagoDeFactura () throws IOException {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.factura();
    }

    @ParameterizedTest
    @CsvSource({"TC_002_12_pagoDeFacturaParcialConNumCliente",
                "TC_002_13_pagoDeFacturaTotalConNumCliente"})
    void TC_002_12y13_test(String pMethodName) throws IOException {
        getTestName(pMethodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.facturaConNumCliente("pImporte", "pEsPagoParcial");
    }

    @Test
    void TC_002_14_pagoCIPARE() throws IOException {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.CIPARE("pRegistroPatronal", "pPeriodo");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_15_pagoContribucionesGubernamentalesEstado",
                "TC_002_16_pagoContribucionesGubernamentalesCiudad"})
    void TC_002_15y16_test(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.contribucionesGubernamentales("pLineaCaptura", "pImporte", "pFechaLimitePago");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_17_pagoContribucionesFederalesDerechos",
                "TC_002_18_pagoContribucionesFederalesSAT"})
    void TC_002_17y18_test(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.contribucionesFederales("pRFC", "pRazonSocial", "pDependenciaYEntidades", "pPeriodicidad", "pEjercicio", "pPeriodo", "pClaveReferenciaDPA", "pCadenaDependencia", "pImporte", "pLineaCaptura");
    }

    @ParameterizedTest
    @CsvSource({"TC_002_19_pagoNominaOtroBanco",
                "TC_002_20_pagoNominaScotiabank"})
    void TC_002_19y20_test(String methodName) throws IOException {
        getTestName(methodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Pago.nomina("pImporte", "pReferenciaNumerica", "pConcepto");
    }

    @AfterEach
    @Tag(value = "pagoFacturas")
    void afterPagoFacturas() {
        Login.confirmarAutenticacion("pContrasenia", "pToken");
        assertTrue(Comprobar.descargaComprobante());
    }

    @AfterEach
    @Tag(value = "creacionBeneficiario")
    void afterCreacionBeneficiario(){
        Login.confirmarAutenticacion("pContrasenia", "pToken");
        assertTrue(Comprobar.creacionBeneficiarioExitosa("pResultadoEsperado"));
    }

}
