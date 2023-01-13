package aut.testcreation.testcases;

import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class SRC_AUT_002_CashMagment extends SeleniumTestBase {

    @BeforeEach
    // Puede haber problemas con los numeros
    /*void before(){
        Login.correcto("pUsuario", "pContrasenia", "pToken");
    }*/

    @Test
    void TC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.pagoDeServiciosYFacturas("pAlias", "pNumCliente");
    }

    @Test
    void TC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.pagoDeServiciosYFacturas("pAlias");
    }

    @Test
    void TC_002_03_altaBeneficiarioPersonaMoralOtroBanco() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaMoral("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pLimiteAbono");
    }

    @Test
    void TC_002_04_altaBeneficiarioPersonaMoralScotiabank() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaMoral("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pLimiteAbono");
    }

    @Test
    void TC_002_05_altaBeneficiarioPersonaFisicaOtroBanco() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaFisica("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno", "pLimiteAbono");
    }

    @Test
    void TC_002_06_altaBeneficiarioPersonaFisicaScotiabank(){
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.personaFisica("pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pLimiteAbono");
    }

    /*@Test
    void TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado(){
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesGubernamentales("pTipoImpuesto");
    }*/

    /*@Test
    void TC_002_07a10_test() throws IOException {
        String[] arrMethodName = {
                "TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado",
                "TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad",
                "TC_002_09_altaBeneficiarioContribucionesFederalesSAT",
                "TC_002_10_altaBeneficiarioContribucionesFederalesDerechos"
        };
        for (int i = 0; i < 3; i++) {
            getTestName(arrMethodName[i]);
            Login.correcto("pUsuario", "pContrasenia", "pToken");
            CrearBeneficiario.contribucionesGubernamentalesYFederales("pTipoImpuesto");
        }
    }*/

    @ParameterizedTest
    @CsvSource({"TC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado",
                "TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad",
                "TC_002_09_altaBeneficiarioContribucionesFederalesSAT",
                "TC_002_10_altaBeneficiarioContribucionesFederalesDerechos"})

    void TC_002_07a10_test(String pMethodName) throws IOException {
        getTestName(pMethodName);
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesGubernamentalesYFederales("pTipoImpuesto");
    }

    @Test
    void TC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesGubernamentales("pTipoImpuesto");
    }

    @Test
    void TC_002_09_altaBeneficiarioContribucionesFederalesSAT() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesFederales("pTipoImpuesto");
    }

    @Test
    void TC_002_10_altaBeneficiarioContribucionesFederalesDerechos() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        CrearBeneficiario.contribucionesFederales("pTipoImpuesto");
    }

    @Test
    void TC_002_11_pagoDeFactura (){
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Realizar.pagoFactura();
    }

    @Test
    void TC_002_12_pagoDeFacturaConNumCliente() {
        getTestName(getMethodName());
        Login.correcto("pUsuario", "pContrasenia", "pToken");
        Realizar.pagoFacturaConNumCliente("pImporte");
    }

    @BeforeEach
    @Tag(value = "pagoFacturas")
    void beforePagoFacturas() {
        Login.confirmarAutenticacion("pContrasenia", "pToken");
        assertTrue(Comprobar.descargaComprobante());
    }

    @BeforeEach
    @Tag(value = "creacionBeneficiario")
    void beforeCreacionBeneficiario(){
        Login.confirmarAutenticacion("pContrasenia", "pToken");
        assertTrue(Comprobar.creacionBeneficiarioExitosa("pResultadoEsperado"));
    }

}
