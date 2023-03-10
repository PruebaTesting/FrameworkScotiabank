package aut.testcreation.testcases.web;

import aut.testcreation.tasks.scotiabank.*;
import aut.testcreation.tasks.scotiabank.Menu;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.GetTestName.getMethodName;
import static framework.engine.selenium.GetTestName.getTestName;

public class SCR_AUT_004_Opera extends SeleniumTestBase {

    @Test
    void TC_004_36_CancelaciÃ³nDeOrdenesDeCapitales() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Menu.consultaRequerida();
        Validar.comprobante();
    }
    @Test
    void TC_004_37_CancelaciÃ³nDeOrdenesDeEfectivo() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Menu.consultaRequerida();
        Validar.comprobante();
    }
    @Test
    void TC_004_38_CancelaciÃ³nDeOrdenesDeFondos() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Menu.consultaRequerida();
        Validar.comprobante();
    }
    @Test
    void TC_004_39_ConsultaDeOrdenesDeCapitales() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Validar.comprobante();
    }
    @Test
    void TC_004_40_ConsultaDeOrdenesDeEfectivo() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Validar.comprobante();
    }
    @Test
    void TC_004_41_ConsultaDeOrdenesFondos() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.flujoNavegacionSuperior();
        Validar.comprobante();
    }
    @Test
    void TC_004_42_CambioDeClaveDeAccesoNoCapturÃ³NumeroDeUsuario(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.cambioConstrasenia();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_43_ConsultaYCancelaciÃ³nDeOrdenes(String pUsuario, String pClaveAcceso) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Datos.IngresarDatos(pUsuario, pClaveAcceso);
        Validar.comprobante();
    }
    @Test
    void TC_004_44_CapturaDeOrdenesDeMercadoDeCapitalesCompra(String pUsuario, String pClaveAcceso) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Datos.IngresarDatos(pUsuario, pClaveAcceso);
        Validar.comprobante();
    }
    @Test
    void TC_004_45_CapturaDeOrdenesDeMercadoDeCapitalesVenta(String pUsuario, String pClaveAcceso) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Datos.IngresarDatos(pUsuario, pClaveAcceso);
        Validar.comprobante();
    }
    @Test
    void TC_004_46_OperarMercadoDeCapitalesClaveIncorrecta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.operarMercadosCapitales();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_47_OperarMercadoDeCapitalesCompraImporteMayorAlDisponible(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.ordenDeCompra();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_48_OperarMercadoDeCapitalesVentaSinPosiciÃ³n(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.ordenDeVenta();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_49_OperarEfectivoDeposito(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.depositoEfectivo();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_50_OperarEfectivoRetiro() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.retiroDeEfectivo();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_51_OperarEfectivoClaveIncorrecta() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.operacionEfectivo();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_52_OperarEfectivoFueraDeHorario() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_53_OperarFondosDeInversiÃ³nCompra_FondosCash_Scotia1_ScotiaG() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.fondosDeInversion();
        Validar.comprobante();
    }
    @Test
    void TC_004_54_OperarFondosDeInversiÃ³nCompra_FondosNoCash_Scotia2_Scotilp() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.fondosDeInversion();
        Validar.comprobante();
    }
    @Test
    void TC_004_55_OperarFondosDeInversiÃ³nventa_FondosCash_Scotia1_ScotiaG() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.fondosDeInversion();
        Validar.comprobante();
    }
    @Test
    void TC_004_56_OperarFondosDeInversiÃ³nVenta_FondosNoCash_Scotia2_Scotilp() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.fondosDeInversion();
        Validar.comprobante();
    }
    @Test
    void TC_004_57_OperarFondosDeInversiÃ³n() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Menu.fondoDeInversionNoDisponible();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_58_ConsultaDelBannerUnosDosYConoceMÃ¡s() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresar();
        Validar.ClickConoceMas();
    }
    @Test
    void TC_004_59_OperarFondosDeInversiÃ³n() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.fondoDeInversionNoDisponible();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_60_OperarFondosDeInversiÃ³n() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.fondoDeInversionNoDisponible();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_61_OperarFondosDeInversiÃ³n() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.fondoDeInversionNoDisponible();
        Validar.pantallaFinal();
    }
    @Test
    void TC_004_62_CambioDeMail(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.cambioDeMail();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_63_CambioDeMail(String parametro) throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.cambioDeMailSinDisplay();
        Validar.mensajeSistema(parametro);
    }
    @Test
    void TC_004_64_ConsultaCartasConfirmaciÃ³n() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Menu.ingresarDatos();
        Validar.comprobante();
    }
    @Test
    void TC_004_65_ConsultaEstadoDeCuentaPDF() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Consulta.estadoDeCuenta();
        Validar.comprobante();
    }
    @Test
    void TC_004_66_ConsultaEstadoDeCuentaXML() throws IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarScotiatrade();
        Consulta.estadoDeCuentaXML();
        Validar.comprobante();
    }
}