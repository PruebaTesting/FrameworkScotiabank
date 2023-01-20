package aut.testcreation.testcases;

import aut.testcreation.tasks.cashManagment.*;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class SRC_AUT_002_CashMagment extends SeleniumTestBase {

   // @BeforeEach
    // Puede haber problemas con los numeros
/*void before(){
        Login.correcto("pUsuario", "pContrasenia", "pToken");
    }*/

      //  "TC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente"

    @Nested
    @DisplayName("Creacion de beneficiarios")
     class CrearBeneficiario {
        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente",
                "TC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente"})
        void TC_002_01y02_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            aut.testcreation.tasks.cashManagment.CrearBeneficiario.pagoDeServiciosYFacturas("pAlias", "pNumCliente");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_03_altaBeneficiarioPersonaMoralOtroBanco",
                "TC_002_04_altaBeneficiarioPersonaMoralScotiabank"})
        void TC_002_03y04_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            aut.testcreation.tasks.cashManagment.CrearBeneficiario.personaMoral("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pLimiteAbono");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco",
                "TC_002_06_altaBeneficiarioPersonaFisicaScotiabank"})
        void TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            aut.testcreation.tasks.cashManagment.CrearBeneficiario.personaFisica("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno", "pLimiteAbono");
        }

        @ParameterizedTest
        @Tag("slow")
        @CsvSource({"TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado",
                    "TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad"})

        void TC_002_07y08_test(String pMethodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(pMethodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            aut.testcreation.tasks.cashManagment.CrearBeneficiario.contribucionesGubernamentales("pTipoImpuesto");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_09_altaBeneficiarioContribucionesFederalesSAT",
                "TC_002_10_altaBeneficiarioContribucionesFederalesDerechos"})

        void TC_002_09y10_test(String pMethodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(pMethodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            aut.testcreation.tasks.cashManagment.CrearBeneficiario.contribucionesFederales();
        }

        @AfterEach
        void afterCreacionBeneficiario() throws IOException, InvalidFormatException, AWTException {
            Login.confirmarAutenticacion("pContrasenia", "pToken");
            assertTrue(Comprobar.creacionBeneficiarioExitosa("pResultadoEsperado"));
        }
    }

   @Nested
   class Pagos {
       @Test
       @Tag("fast")
       void TC_002_11_pagoDeFactura () throws IOException, InvalidFormatException, AWTException {
           getTestName(getMethodName());
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.factura();
       }

       @ParameterizedTest
       @Tag("fast")
       @CsvSource({"TC_002_12_pagoDeFacturaParcialConNumCliente",
               "TC_002_13_pagoDeFacturaTotalConNumCliente"})
       void TC_002_12y13_test(String pMethodName) throws IOException, InvalidFormatException, AWTException {
           getTestName(pMethodName);
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.facturaConNumCliente("pImporte", "pEsPagoParcial");
       }

       @Test
       @Tag("slow")
       void TC_002_14_pagoCIPARE() throws IOException, InvalidFormatException, AWTException {
           getTestName(getMethodName());
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.CIPARE("pRegistroPatronal", "pPeriodo");
       }

       @ParameterizedTest
       @Tag("fast")
       @CsvSource({"TC_002_15_pagoContribucionesGubernamentalesEstado",
               "TC_002_16_pagoContribucionesGubernamentalesCiudad"})
       void TC_002_15y16_test(String methodName) throws IOException, InvalidFormatException, AWTException {
           getTestName(methodName);
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.contribucionesGubernamentales("pLineaCaptura", "pImporte", "pFechaLimitePago");
       }

       @ParameterizedTest
       @Tag("fast")
       @CsvSource({"TC_002_17_pagoContribucionesFederalesDerechos",
               "TC_002_18_pagoContribucionesFederalesSAT"})
       void TC_002_17y18_test(String methodName) throws IOException, InvalidFormatException, AWTException {
           getTestName(methodName);
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.contribucionesFederales("pRFC", "pRazonSocial", "pDependenciaYEntidades", "pPeriodicidad", "pEjercicio", "pPeriodo", "pClaveReferenciaDPA", "pCadenaDependencia", "pImporte", "pLineaCaptura");
       }

       @ParameterizedTest
       @Tag("fast")
       @CsvSource({"TC_002_19_pagoNominaOtroBanco",
               "TC_002_20_pagoNominaScotiabank"})
       void TC_002_19y20_test(String methodName) throws IOException, InvalidFormatException, AWTException {
           getTestName(methodName);
           Login.correcto("pUsuario", "pContrasenia", "pToken");
           Pago.nomina("pImporte", "pReferenciaNumerica", "pConcepto");
       }

       @AfterEach
        void afterPagoFacturas() throws IOException, InvalidFormatException, AWTException {
            Login.confirmarAutenticacion("pContrasenia", "pToken");
            assertTrue(Comprobar.descargaComprobante());
        }
   }


}
