package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Transferencia extends SeleniumWrapper {
    public Transferencia(WebDriver driver) {
        super(driver);
    }

    public static void origenADestino(String pProductoOrigen, String pProductoDestino, String pImporte, String pReferenciaEmpresa, String pReferenciaNumerica, String pReferenciaAlfanumerica, String sigueS) {
        System.out.println("Transferencia.origenADestino");
    }

}
