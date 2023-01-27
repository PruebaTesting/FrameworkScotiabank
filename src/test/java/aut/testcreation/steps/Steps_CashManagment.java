package aut.testcreation.steps;

import aut.testcreation.tasks.cashManagment.Comprobar;
import aut.testcreation.tasks.cashManagment.CrearBeneficiario;
import aut.testcreation.tasks.cashManagment.Login;
import aut.testcreation.tasks.cashManagment.Pago;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Steps_CashManagment extends CucumberBaseTestRunner implements En {
    public Steps_CashManagment() {
        /*When("El Usuario crea un Tipo de Beneficiario Pago de Servicios y Facturas con los datos {string} y {string}", (String pAlias, String pNumCliente) -> {
            System.out.println(pAlias + " " + pNumCliente);
            CrearBeneficiario.pagoDeServiciosYFacturas(pAlias, pNumCliente);
        });

        When("El Usuario crea un Tipo de Beneficiario Contribuciones Gubernamentales con los datos {string}", (String pTipoImpuesto) -> {
            System.out.println(pTipoImpuesto);
            CrearBeneficiario.contribucionesGubernamentales(pTipoImpuesto);
        });*/

        Given("El Usuario se Logea en la página de CCOP con los datos {string}, {string} y {string}", (String pUsuario, String pContrasenia, String pToken) -> {
            System.out.println(pUsuario + pContrasenia + pToken);
            Login.correcto(pUsuario, pContrasenia, pToken);
        });
        And("El Usuario confirma sus datos de autenticación con los datos {string} y {string}", (String pContrasenia, String pToken) -> {
            System.out.println("confirmacion > " + pContrasenia + pToken);
            Login.confirmarAutenticacion(pContrasenia, pToken);
        });
        Then("El Sistema muestra la creación exitosa del Beneficiario {string}", (String pResultadoEsperado) -> {
            System.out.println(pResultadoEsperado);
            Comprobar.creacionBeneficiarioExitosa(pResultadoEsperado);
        });
        When("El Usuario crea un Tipo de Beneficiario {string} con los datos {string}", (String pTipoBeneficiario, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");

            switch (pTipoBeneficiario){
                case "Pago de Servicios y Facturas": {
                    CrearBeneficiario.pagoDeServiciosYFacturas(lDatos[0], lDatos[1]);
                    break;
                }
                case "Persona Moral": {
                    CrearBeneficiario.personaMoral(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4]);
                    break;
                }
                case "Persona Física": {
                    CrearBeneficiario.personaFisica(lDatos[0], lDatos[1], lDatos[2], lDatos[3], lDatos[4], lDatos[5], lDatos[6], lDatos[7]);
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
        When("El Usuario paga {string} con los datos {string}", (String pTipoPago, String pDatos) -> {
            String[] lDatos = pDatos.split(", ");

            switch (pTipoPago){
                case "Factura": {
                    Pago.factura();
                    break;
                }
                case "CIPARE": {
                    Pago.CIPARE();
                    break;
                }
                case "Contribuciones Gubernamentales": {
                    Pago.contribucionesGubernamentales();
                    break;
                }
                case "Contribuciones Federales": {
                    Pago.contribucionesFederales();
                    break;
                }
                case "Nómina": {
                    Pago.nomina();
                    break;
                }
            }

        });
        Then("El Sistema muestra el pago exitoso comprobando la descarga del comprobante", () -> {
            Comprobar.descargaComprobante();
        });
    }
}
