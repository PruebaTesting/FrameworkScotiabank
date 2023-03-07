package aut.testcreation.steps;

import aut.testcreation.tasks.cashManagment.*;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class Steps_CashManagment extends CucumberBaseTestRunner implements En {
    public Steps_CashManagment() {

        Given("El Usuario se Logea en la página de CCOP con los datos {string}, {string} y {string}", (String pUsuario, String pContrasenia, String pToken) -> {
            //System.out.println("paso realizado");
            Login.correcto(pUsuario, pContrasenia, pToken);
        });

        And("El Usuario confirma sus datos de autenticación con los datos {string} y {string}", (String pContrasenia, String pToken) -> {
            System.out.println("confirmacion > " + pContrasenia + pToken);
            Login.confirmarAutenticacion(pContrasenia, pToken);
        });

        Then("El Sistema muestra la creación exitosa del Beneficiario {string}", (String pResultadoEsperado) -> {
            System.out.println(pResultadoEsperado);
            assertTrue(Comprobar.creacionBeneficiarioExitosa(pResultadoEsperado));
        });

        When("El Usuario Crea un Tipo de Beneficiario {string} con los datos {string}", (String pTipoBeneficiario, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");

            switch (pTipoBeneficiario){
                case "Pago de Servicios y Facturas": {
                    CrearBeneficiario.pagoDeServiciosYFacturas(lDatos[0], lDatos[1]);
                    break;
                }
                case "Persona Moral de otro banco": {
                    CrearBeneficiario.personaMoralOtroBanco(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6]);
                    break;
                }
                case "Persona Moral de Scotiabank": {
                    CrearBeneficiario.personaMoralScotiabank(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4]);
                    break;
                }
                case "Persona Física de otro banco": {
                    CrearBeneficiario.personaFisicaOtroBanco(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7], lDatos[8], lDatos[9]);
                    break;
                }
                case "Persona Física de Scotiabank": {
                    CrearBeneficiario.personaFisicaScotiabank(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5]);
                    break;
                }
                case "Contribuciones Gubernamentales": {
                    CrearBeneficiario.contribucionesGubernamentales(lDatos[0], lDatos[1]);
                    break;
                }
                case "Contribuciones Federales": {
                    CrearBeneficiario.contribucionesFederales(lDatos[0], lDatos[1]);
                    break;
                }
            }

        });

        When("El Usuario Paga {string} con los datos {string}", (String pTipoPago, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");

            switch (pTipoPago){
                case "Factura": {
                    Pago.factura();
                    break;
                }
                case "Factura con Número de Cliente": {
                    Pago.facturaConNumCliente(lDatos[0], lDatos[1]);
                    break;
                }
                case "CIPARE": {
                    Pago.CIPARE(lDatos[0], lDatos[1]);
                    break;
                }
                case "Contribuciones Gubernamentales del Estado": {
                    Pago.contribucionesGubernamentalesEstado(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Contribuciones Gubernamentales de la Ciudad": {
                    Pago.contribucionesGubernamentalesCiudad(lDatos[0], lDatos[1]);
                    break;
                }
                case "Contribuciones Federales de Derechos": {
                    Pago.contribucionesFederalesDerechos(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7], lDatos[8]);
                    break;
                }
                case "Contribuciones Federales de SAT": {
                    Pago.contribucionesFederalesSAT(lDatos[0], lDatos[1]);
                    break;
                }
                case "Nómina": {
                    Pago.nomina(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4]);
                    break;
                }
                case "Proveedores de otro banco": {
                    Pago.proveedoresOtroBanco(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4]);
                    break;
                }
                case "Proveedores de Scotiabank": {
                    Pago.proveedoresScotiabank(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5]);
                    break;
                }
            }

        });

        Then("El Sistema muestra la operación exitosa comprobando la descarga del comprobante", () -> {
            assertTrue(Comprobar.descargaComprobante());
        });

        When("El usuario Transfiere desde un Origen a un Destino con los Datos {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split(", ");
            Transferencia.origenADestino(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6]);
        });

        Then("El Sistema muestra los detalles correctamente que concuerdan con el {string}", (String pResultadoEsperado) -> {
            assertTrue(Comprobar.visualizacionDetalles(pResultadoEsperado));
        });

        When("El Usuario Administrador realiza la acción de {string} con los datos {string}", (String pAccion, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");
            switch (pAccion) {
                case "Ingresar a una Empresa": {
                    Administrar.verDetallesUsuario();
                    break;
                }
                case "Aceptar o Rechazar una Aprobación": {
                    Administrar.administrarAprobacion(lDatos[0]);
                    break;
                }
                case "Editar un Usuario": {
                    Administrar.editarUsuario(lDatos[0]);
                    break;
                }
                case "Crear un Usuario de una Empresa No Mancomunada": {
                    Administrar.crearUsuarioNoMancomunada(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7], lDatos[8], lDatos[9], lDatos[10]);
                    break;
                }
                case "Crear un Usuario de una Empresa Mancomunada": {
                    Administrar.crearUsuarioMancomunada(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7], lDatos[8], lDatos[9], lDatos[10]);
                    break;
                }
            }
        });

        Then("El Sistema comprueba que la descarga se hizo en el formato correspondiente", () -> {
            assertTrue(Comprobar.formatoDescarga());
        });
        When("El Usuario Administrador consulta el resumen de {string} con los datos {string}", (String pConsulta, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");
            switch (pConsulta) {
                case "Linea Operativa": {
                    Administrar.consultarLineaOperativa(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Prestamos Personales": {
                    Administrar.consultarPrestamosPersonales(lDatos[0], lDatos[1]);
                    break;
                }
                case "Fondos de Inversión": {
                    Administrar.consultarFondosInversion(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Creditos Hipotecarios": {
                    Administrar.consultarCreditosHipotecarios(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Cuentas de Inversion": {
                    Administrar.consultarCuentasInversion(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Cuentas Cheques USD": {
                    Administrar.consultarCuentasChequesUSD(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Cuentas Cheques MXN":{
                    Administrar.consultarCuentasChequesMXN(lDatos[0], lDatos[1], lDatos[2]);
                }


            }
        });
        When("El Usuario Administrador consulta la cuenta de {string} con los Datos de {string}", (String pConsulta, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");

            switch (pConsulta) {
                    case "Cuentas Linea Operativa":{
                        Administrar.consultarCuentasLineaOperativa(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                    case "Cuentas Prestamos Personales":{
                        Administrar.consultarCuentasPrestamosPersonales(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                    case "Cuentas Fondos Inversion":{
                        Administrar.consultarCuentasFondosInversion(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                    case "Creditos Hipotecarios":{
                        Administrar.consultarCreditosHipotecariosTXT(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                    case "Cuentas de Inversion": {
                        Administrar.consultarCuentasInversionCSV(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                    case "Cuentas TDC MXN":{
                        Administrar.consultarCuentasTDCMXNTXT(lDatos[0], lDatos[1], lDatos[2]);
                        break;
                    }
                case "Cuentas Cheques USD": {
                    Administrar.consultarCuentasChequesUSDCSV(lDatos[0], lDatos[1], lDatos[2]);
                    break;
                }
                case "Cuentas Cheques MXN":{
                    Administrar.consultarCuentasChequesMXN(lDatos[0], lDatos[1], lDatos[2]);
                }

                }
        });
        When("El Usuario Administrador consulta el contrato o credito de {string}", (String pConsulta) -> {

            switch (pConsulta){
                case "Credito Linea Operativa":{
                    Validar.consultarCuentasCreditosLineaOperativa();
                    break;
                }
                case "Credito Prestamos Personales":{
                    Validar.consultarCuentasCreditosPrestamosPersonales();
                    break;
                }
                case "Contrato Fondos Inversion":{
                    Validar.consultarCuentasContratoFondosInversion();
                    break;
                }
                case "Credito Hipotecarios":{
                    Validar.consultarCreditosHipotecarios();
                    break;
                }
                case "Contrato Inversion":{
                    Validar.consultarCuentasContratoInversion();
                    break;
                }
            }
        });
        When("El Usuario Administrador consulta la Tarjeta de Credito de {string}", (String pConsulta) -> {
            switch (pConsulta){
                case "Numero Tarjeta":{
                    Validar.consultarCuentasTDCMXNPDF();
                    break;
                }
            }
        });
        When("El Usuario Admiministrador consulta Cheques de {string}", (String pConsulta) -> {
            switch (pConsulta){
                case "Cheques USD":{
                    Validar.consultarCuentasChequesUSD();
                    break;
                }
                case "Cheques MXN":{
                    Validar.consultarCuentasChequesMXN();
                    break;
                }
            }
        });
        When("El Usuario Administrados consulta cuentas Consolidadas de {string}", (String pConsulta) -> {
            switch (pConsulta){
                case "Linea Operativa Consolidado":{
                    Validar.consultarCuentasLineaOperativaConsolidado();
                    break;
                }
                case "Prestamos Personales Consolidado":{
                    Validar.consultarCuentasPrestamosPersonalesConsolidado();
                    break;
                }
                case "Fondos Inversion Consolidado":{
                    Validar.consultarCuentasFondosInversionConsolidado();
                    break;
                }
                case "Creditos Hipotecarios Consolidado":{
                    Validar.consultarCreditosHipotecariosConsolidado();
                    break;
                }
                case "Contratos Inversion Consalidado":{
                    Validar.consultarCuentasInversionesConsolidado();
                    break;
                }
                case "Tarjeta Credito Consolidado":{
                    Validar.consultarCuentasTDCMXNConsolidado();
                    break;
                }
                case "Cheque USD Consolidado":{
                    Validar.consultarCuentasChequesUSDConsolidado();
                    break;
                }
                case "Cheque MXN Consolidado":{
                    Validar.consultarCuentasChequesMXNConsolidado();
                    break;
                }
            }
        });
        When("El Usuario Administrador consulte el resumen de {string}", (String pConsulta) -> {
            switch (pConsulta){
                case "Linea Operativa BD":{
                    Validar.consultarCuentasLineaOperativaBD();
                    break;
                }
                case "Prestamos Personales BD":{
                    Validar.consultarCuentasPrestamosPersonalesBD();
                }
                case "Fondos Inversion BD":{
                    Validar.consultarCuentasFondosInversionBD();
                    break;
                }
                case "Creditos Hipotecarios BD":{
                    Validar.consultarCreditosHipotecariosBD();
                    break;
                }
                case "Cuentas Inversion BD":{
                    Validar.consultarCuentasInversionBD();
                    break;
                }
                case "Cuentas TDC MXN BD":{
                    Validar.consultarCuentasTDCMXNBD();
                    break;
                }
                case "Cuentas Cheques USD BD":{
                    Validar.consultarCuentasChequesUSDBD();
                    break;
                }
                case "Cuentas Cheque MXN BD":{
                    Validar.consultarCuentasChequeMXNBD();
                    break;
                }
            }
        });
        When("El Usuario Administrador consulta cuentas consolidadas FM {string}", (String pConsultas) -> {
            switch (pConsultas){
                case "Linea Operativa FM":{
                    Validar.consultarCuentasLineaOperativaFM();
                    break;
                }
                case "Prestamos Personales FM":{
                    Validar.consultarCuentasPrestamosPersonalesFM();
                    break;
                }
                case "Fondos Inversion FM":{
                    Validar.consultarCuentasFondosInversonFM();
                    break;
                }
                case "Credito Hipotecario FM":{
                    Validar.consultarCreditoHipotecarioFM();
                    break;
                }
                case "Cuentas Inversion FM":{
                    Validar.consultarCuentasInversionFM();
                    break;
                }
                case "Cuentas TDC MXN FM":{
                    Validar.consultarCuentasTDCMXNFM();
                    break;
                }
                case "Cuentas Cheque USD FM":{
                    Validar.consultarCuentasChequesUSDFM();
                    break;
                }
                case "Cuentas Cheques MXN FM":{
                    Validar.consultarCuentasChequesMXNFM();
                    break;
                }
            }
        });
    }
}
