package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Pago extends SeleniumWrapper {
    public Pago(WebDriver driver) {
        super(driver);
    }

    public static void factura() {
        System.out.println("Pago.factura");
    }

    public static void facturaConNumCliente(String pImporte, String pEsPagoParcial) {
        System.out.println("Pago.facturaConNumCliente");
    }

    public static void CIPARE(String pRegistroPatronal, String pPeriodo) {
        System.out.println("Pago.CIPARE");
    }

    public static void contribucionesGubernamentales(String pLineaCaptura, String pImporte, String pFechaLimitePago) {
        System.out.println("Pago.contribucionesGubernamentales");
    }

    public static void contribucionesFederales(String pRFC, String pRazonSocial, String pDependenciaYEntidades, String pPeriodicidad, String pEjercicio, String pPeriodo, String pClaveReferenciaDPA, String pCadenaDependencia, String pImporte, String pLineaCaptura) {
        System.out.println("Pago.contribucionesFederales");
    }

    public static void nomina(String pImporte, String pReferenciaNumerica, String pConcepto) {
        System.out.println("Pago.nomina");
    }

}
