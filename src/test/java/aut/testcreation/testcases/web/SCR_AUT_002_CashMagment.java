package aut.testcreation.testcases.web;

import aut.testcreation.tasks.cashManagment.*;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static framework.engine.selenium.GetTestName.*;

public class SCR_AUT_002_CashMagment extends SeleniumTestBase {

    @Nested
    @DisplayName("Creacion de beneficiarios")
    class CreacionBeneficiarios {
        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente",
                "TC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente"})
        void TC_002_01y02_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.pagoDeServiciosYFacturas("pAlias", "pNumCliente");
        }

        @Test
        @Tag("fast")
        void TC_002_03_altaBeneficiarioPersonaMoralOtroBanco() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.personaMoralOtroBanco("pNombrePerfil", "pNumeroCuenta", "pNumeroIdentificacion", "pNombreRazonSocial", "pEmail", "pNumeroTelefono", "pLimiteAbono");
        }

        @Test
        @Tag("fast")
        void TC_002_04_altaBeneficiarioPersonaMoralScotiabank() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.personaMoralScotiabank("pNombrePerfil", "pAlias", "pEmail", "pNumTelefono", "pLimiteAbono");
        }

        @Test
        @Tag("fast")
        void TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.personaFisicaOtroBanco("pNombrePerfil", "pNumCuenta", "pAlias", "pNumIdentificacion", "pNombre", "pApellidoPaterno", "pApellidoMaterno", "pEmail", "pNumeroTelefono", "pLimiteAbono");
        }

        @Test
        @Tag("fast")
        void TC_002_06_altaBeneficiarioPersonaFisicaScotiabank() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.personaFisicaScotiabank("pNombrePerfil", "pNumCuenta", "pAlias", "pEmail", "pNUmeroTelefono", "pLimiteAbono");
        }

        @ParameterizedTest
        @Tag("slow")
        @CsvSource({"TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado",
                "TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad"})
        void TC_002_07y08_test(String pMethodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(pMethodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.contribucionesGubernamentales("pTipoImpuesto", "pAlias");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_09_altaBeneficiarioContribucionesFederalesSAT",
                "TC_002_10_altaBeneficiarioContribucionesFederalesDerechos"})
        void TC_002_09y10_test(String pMethodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(pMethodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.contribucionesFederales("pTipoImpuesto", "pAlias");
        }

        @AfterEach
        void afterCreacionBeneficiario() throws IOException, InvalidFormatException, AWTException {
            Login.confirmarAutenticacion("pContrasenia", "pToken");
            assertTrue(Comprobar.creacionBeneficiarioExitosa("pResultadoEsperado"));
        }
    }

    @Nested
    @DisplayName("Pagos")
    class Pagos {
        @Test
        @Tag("fast")
        void TC_002_11_pagoDeFactura() throws IOException, InvalidFormatException, AWTException {
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

        @Test
        @Tag("slow")
        void TC_002_15_pagoContribucionesGubernamentalesEstado() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.contribucionesGubernamentalesEstado("pLineaCaptura", "pImporte", "pFechaLimitePago");
        }

        @Test
        @Tag("slow")
        void TC_002_16_pagoContribucionesGubernamentalesCiudad() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.contribucionesGubernamentalesCiudad("pLineaCaptura", "pImporte");
        }

        @Test
        @Tag("slow")
        void TC_002_17_pagoContribucionesFederalesDerechos() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.contribucionesFederalesDerechos("pRFC", "pRazonSocial", "pDependenciaYEntidades", "pPeriodicidad", "pEjercicio", "pPeriodo", "pClaveReferenciaDPA", "pCadenaDependencia", "pImporte");
        }

        @Test
        @Tag("slow")
        void TC_002_18_pagoContribucionesFederalesSAT() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.contribucionesFederalesSAT("pImporte", "pLineaCaptura");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_19_pagoNominaOtroBanco",
                "TC_002_20_pagoNominaScotiabank",})
        void TC_002_19y20_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.nomina("pImporte", "pReferenciaNumerica", "pReferenciaAlfanumerica", "pReferenciaEmpresa", "pConcepto");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_21_pagoProveedoresPersonaMoralOtroBanco",
                "TC_002_23_pagoProveedoresPersonaFisicaOtroBanco"})
        void TC_002_21y23_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.proveedoresOtroBanco("pTipoBeneficiario", "pImporte", "pReferenciaNumerica", "pConcepto", "pIVA");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_22_pagoProveedoresPersonaMoralScotiabank",
                "TC_002_24_pagoProveedoresPersonaFisicaScotiabank"})
        void TC_002_22y24_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Pago.proveedoresScotiabank("pTipoBeneficiario", "pImporte", "pReferenciaNumerica", "pIVA", "pReferenciaAlfanumerica", "pReferenciaEmpresa");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_25_transferenciaChequesMXNCreditoHipotecario",
                "TC_002_26_transferenciaChequesMXNPrestamosPersonales",
                "TC_002_27_transferenciaTDCChequesMXN",
                "TC_002_28_transferenciaChequesMXNTDC",
                "TC_002_29_ChequesUSDChequesUSD",
                "TC_002_30_ChequesMXNChequesMXN"})
        void TC_002_25a30_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Transferencia.origenADestino("pProductoOrigen", "pProductoDestino", "pImporte", "pReferenciaEmpresa", "pReferenciaNumerica", "pReferenciaAlfanumerica", "...");
        }

        @AfterEach
        void afterPagoFacturas() throws IOException, InvalidFormatException, AWTException {
            Login.confirmarAutenticacion("pContrasenia", "pToken");
            assertTrue(Comprobar.descargaComprobante());
        }
    }

    @Nested
    class VisualizacionDetalles {
        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_31_administradorIngresarNoMancomunada",
                "TC_002_32_administradorIngresarMancomunada"})
        void TC_002_31y32_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.verDetallesUsuario();
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_33_administradorRechazarAprobacion",
                "TC_002_34_administradorAutorizarAprobacion"})
        void TC_002_33y34_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.administrarAprobacion("pAccion"); //Pensar un mejor nombre en vez de ".administrar"
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_35_administradorEditarUsuarioNoMancomunada",
                "TC_002_36_administradorEditarUsuarioMancomunada"})
        void TC_002_35y36_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.editarUsuario("pCampo");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_37_administradorCrearUsuarioNoMancomunada",
                "TC_002_38_administradorCrearUsuarioAdministradorNoMancomunada"})
        void TC_002_37y38_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.crearUsuarioNoMancomunada("pPrimerNombre", "pSegundoNombre", "pApellidoPaterno", "pApellidoMaterno", "pCargo", "pArea", "pNumeroCelular", "pVerificarNumeroCelular", "pCorreoElectronico", "pVerificarCorreoElectronico", "pEsAdministrador");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_39_administradorCrearUsuarioMancomunada",
                "TC_002_40_administradorCrearUsuarioAdministradorMancomunada"})
        void TC_002_39y40_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.crearUsuarioMancomunada("pPrimerNombre", "pSegundoNombre", "pApellidoPaterno", "pApellidoMaterno", "pCargo", "pArea", "pNumeroCelular", "pVerificarNumeroCelular", "pCorreoElectronico", "pVerificarCorreoElectronico", "pEsAdministrador");
        }

        @AfterEach
        void afterVisualizacionDetalles() throws IOException, InvalidFormatException, AWTException {
            assertTrue(Comprobar.visualizacionDetalles("pResultadoEsperado"));
        }
    }

    @Nested
    @DisplayName("Consultas")
    class Consultas {

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_41_administradorConsultaLineaOperativaXML",
                "TC_002_42_administradorConsultaLineaOperativaPDF"})
        void TC_002_41y42_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarLineaOperativa("pContrasenia", "pToken", "pFormato");
        }

        @Test
        @Tag("fast")
        void TC_002_43_administradorConsultaPrestamosPersonales() throws IOException, InvalidFormatException, AWTException {
            getTestName(getMethodName());
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarPrestamosPersonales("pContrasenia", "pToken");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_44_administradorConsultaFondosInversionXML",
                "TC_002_45_administradorConsultaFondosInversionPDF"})
        void TC_002_44y45_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarFondosInversion("pContrasenia", "pToken", "pFormato");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_46_administradorConsultaCreditosHipotecariosXML",
                "TC_002_47_administradorConsultaCreditosHipotecariosPDF"})
        void TC_002_46y47_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCreditosHipotecarios("pContrasenia", "pToken", "pFormato");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_48_administradorConsultaCuentasInversionXML",
                "TC_002_49_administradorConsultaCuentasInversionPDF"})
        void TC_002_48y49_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasInversion("pContrasenia", "pToken", "pFormato");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_50_administradorConsultaCuentasChequeUSDPDF",
                "TC_002_51_administradorConsultaCuentasChequeUSDXML"})
        void TC_002_50y51_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesUSD("pContrasenia", "pToken", "pFormato");
        }

        @ParameterizedTest
        @Tag("fast")
        @CsvSource({"TC_002_52_administradorConsultaCuentasChequeMXNXML",
                "TC_002_53_administradorConsultaCuentasChequeMXNPDF"})
        void TC_002_52y53_test(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesMXN("pContrasenia", "pToken", "pFormato");
        }


        @Test
        @Tag("fast")
        void TC_002_54_administradorConsultaCuentasLineaOperativaCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasLineaOperativa("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_55_administradorConsultaCuentasPrestamosPersonalesTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasPrestamosPersonales("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_56_administradorConsultaCuentasFondosInversionCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasFondosInversion("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_57_administradorConsultaCreditosHipotecariosTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCreditosHipotecariosTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_58_administradorConsultaCuentasInversionCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasInversionCSV("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_59_administradorConsultaCuentasTDCMXNTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasTDCMXNTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_60_administradorConsultaCuentasChequeUSDCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesUSDCSV("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void TC_002_61_administradorConsultaCuentasChequeMXNTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesMXNTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_62_administradorConsultaCuentasCreditosLineaOperativaPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasCreditosLineaOperativa();
        }

        @Test
        @Tag("fast")
        void SC_002_63_administradorConsultaCuentasCreditosPrestamosPersonalesPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasCreditosPrestamosPersonales();
        }

        @Test
        @Tag("fast")
        void SC_002_64_administradorConsultaCuentasContratoFondosInversionPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasContratoFondosInversion();
        }

        @Test
        @Tag("fast")
        void SC_002_65_administradorConsultaCreditosHipotecariosPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCreditosHipotecarios();
        }

        @Test
        @Tag("fast")
        void SC_002_66_administradorConsultaCuentasContratoInversionPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasContratoInversion();
        }

        @Test
        @Tag("fast")
        void SC_002_67_administradorConsultaCuentasTDCMXNPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasTDCMXNPDF();
        }

        @Test
        @Tag("fast")
        void SC_002_68_administradorConsultaCuentasChequesUSDPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesUSD();
        }

        @Test
        @Tag("fast")
        void SC_002_69_administradorConsultaCuentasChequesMXNPDF(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesMXN();
        }

        @AfterEach
        void afterConsultas() {
            assertTrue(Comprobar.formatoDescarga());
        }
    }

    @Nested
    @DisplayName("Consolidado")
    class Consolidado {

        @Test
        @Tag("fast")
        void SC_002_70_administradorConsultaCuentasLineaOperativaConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasLineaOperativaConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_71_administradorConsultaCuentasPrestamosPersonalesConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasPrestamosPersonalesConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_72_administradorConsultaCuentasFondosInversionConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasFondosInversionConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_73_administradorConsultaCreditosHipotecariosConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCreditosHipotecariosConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_74_administradorConsultaCuentasInversionesConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasInversionesConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_75_administradorConsultaCuentasTDCMXNConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasTDCMXNConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_76_administradorConsultaCuentasChequesUSDConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesUSDConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_77_administradorConsultaCuentasChequesMXNConsolidado(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesMXNConsolidado();
        }

        @Test
        @Tag("fast")
        void SC_002_78_administradorConsultaCuentasLineaOperativaBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasLineaOperativaBD();
        }

        @Test
        @Tag("fast")
        void SC_002_79_administradorConsultaCuentasPrestamosPersonalesBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasPrestamosPersonalesBD();
        }

        @Test
        @Tag("fast")
        void SC_002_80_administradorConsultaCuentasFondosInversionBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasFondosInversionBD();
        }

        @Test
        @Tag("fast")
        void SC_002_81_administradorConsultaCreditosHipotecariosBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCreditosHipotecariosBD();
        }

        @Test
        @Tag("fast")
        void SC_002_82_administradorConsultaCuentasInversionBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasInversionBD();
        }

        @Test
        @Tag("fast")
        void SC_002_83_administradorConsultaCuentasTDCMXNBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasTDCMXNBD();
        }

        @Test
        @Tag("fast")
        void SC_002_84_administradorConsultaCuentasChequesUSDBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesUSDBD();
        }

        @Test
        @Tag("fast")
        void SC_002_85_administradorConsultaCuentasChequeMXNBD(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequeMXNBD();
        }

        @AfterEach
        void afterConsolidado() {
            assertTrue(Comprobar.resultadoEsperado());
        }
    }

    @Nested
    @DisplayName("Consultas2")
    class Consultas2 {
        @Test
        @Tag("fast")
        void SC_002_86_administradorConsultaCuentasLineaOperativaCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasLineaOperativa("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_87_administradorConsultaCuentasPrestamosPersonalesTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasPrestamosPersonales("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_88_administradorConsultaCuentasFondosInversionCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasFondosInversion("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_89_administradorConsultaCreditosHipotecariosTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCreditosHipotecariosTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_90_administradorConsultaCuentasInversionCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasInversionCSV("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_91_administradorConsultaCuentasTDCMXNTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasTDCMXNTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_92_administradorConsultaCuentasChequeUSDCSV(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesUSDCSV("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_93_administradorConsultaCuentasChequeMXNTXT(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Administrar.consultarCuentasChequesMXNTXT("pManual", "pFormato", "pTipoSeparador");
        }

        @Test
        @Tag("fast")
        void SC_002_94_administradorConsultaCuentasLineaOperativaFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasLineaOperativaFM();
        }
        @Test
        @Tag("fast")
        void SC_002_95_administradorConsultaCuentasPrestamosPersonalesFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasPrestamosPersonalesFM();
        }
        @Test
        @Tag("fast")
        void SC_002_96_administradorConsultaCuentasFondosInversonFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasFondosInversonFM();
        }
        @Test
        @Tag("fast")
        void SC_002_97_administradorConsultaCreditoHipotecarioFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCreditoHipotecarioFM();
        }
        @Test
        @Tag("fast")
        void SC_002_98_administradorConsultaCuentasInversionFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasInversionFM();
        }
        @Test
        @Tag("fast")
        void SC_002_99_administradorConsultaCuentasTDCMXNFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasTDCMXNFM();
        }
        @Test
        @Tag("fast")
        void SC_002_100_administradorConsultaCuentasChequesUSDFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesUSDFM();
        }
        @Test
        @Tag("fast")
        void SC_002_101_administradorConsultaCuentasChequesMXNFM(String methodName) throws IOException, InvalidFormatException, AWTException {
            getTestName(methodName);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            Validar.consultarCuentasChequesMXNFM();
        }

        @AfterEach
        void afterConsultas2() {
            assertTrue(Comprobar.formatoDescarga());
        }


    }

}
