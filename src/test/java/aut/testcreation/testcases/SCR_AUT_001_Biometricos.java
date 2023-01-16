package aut.testcreation.testcases;

import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class SCR_AUT_001_Biometricos extends SeleniumTestBase {

    @Test
    void TC_001_01_ingresoAlSistemaEnrolamientoClientesSSO() throws IOException {
        getTestName(getMethodName());
        Ingresar.aAplicativosBiometricos("pDatos");
        assertTrue(Comprobar.accesoPaginaAplicativoBiometricos("pNombre"));
    }

    @Test
    void TC_001_02_validaciónDeHuellasEmpleadoSucursalExitoso() {
        getTestName(getMethodName());
        Ingresar.conHuella();
        assertTrue(Comprobar.accesoAplicativoBiometricos("pOpciones"));
    }

    @Test
    void SC_001_03_consultaClienteNoEnrolado() {
        getTestName(getMethodName());
        Realizar.consultaClienteYSeleccionarProducto();
        assertTrue(Comprobar.enrolamiento());
    }

    @Test
    void SC_001_04_validaciónINESinHuellas() {
        getTestName(getMethodName());
        Realizar.busquedaCorrectaClienteNoEnrolado();
        Realizar.escaneoYValidacionCorrecto();
        Realizar.digitalizacionDatosINE();
        assertTrue(Comprobar.finalizacionProceso());
    }

    @Test
    void SC_001_06_validaciónHuellasClienteEnrolado() {
        getTestName(getMethodName());
        Realizar.busquedaClienteNoEnrolado();
        Ingresar.conHuella();
        assertTrue(Comprobar.validacionExitosa());
    }
}
