package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Administrar extends SeleniumWrapper {

    public Administrar(WebDriver driver) {
        super(driver);
    }

    public static void verDetallesUsuario() {
        System.out.println("Administrar.verDetallesUsuario");
    }

    public static void administrarAprobacion() {
        System.out.println("Administrar.administrarAprobacion");
    }

    public static void editarUsuario(String pCampo) {
        System.out.println("Administrar.editarUsuario");
    }

    public static void crearUsuarioNoMancomunada(String pPrimerNombre, String pSegundoNombre, String pApellidoPaterno, String pApellidoMaterno, String pCargo, String pArea, String pNumeroCelular, String pVerificarNumeroCelular, String pCorreoElectronico, String pVerificarCorreoElectronico, String pEsAdministrador){
        System.out.println("Administrar.crearUsuarioNoMancomunada");
    }

    public static void crearUsuarioMancomunada(String pPrimerNombre, String pSegundoNombre, String pApellidoPaterno, String pApellidoMaterno, String pCargo, String pArea, String pNumeroCelular, String pVerificarNumeroCelular, String pCorreoElectronico, String pVerificarCorreoElectronico, String pEsAdministrador){
        System.out.println("Administrar.crearUsuarioMancomunada");
    }

    public static void consultarLineaOperativa (String pContrasenia, String pToken, String pFormato) {
        System.out.println("Administrar.consultarLineaOperativa");
    }

    public static void consultarPrestamosPersonales(String pContrasenia, String pToken) {
        System.out.println("Administrar.consultarPrestamosPersonales");
    }

    public static void consultarFondosInversion(String pContrasenia, String pToken, String pFormato) {
        System.out.println("Administar.consultarFondosInversion");
    }

    public static void consultarCreditosHipotecarios(String pContrasenia, String pToken, String pFormato) {
        System.out.println("Administrar.consultarCreditosHipotecarios");
    }

    public static void consultarCuentasInversion(String pContrasenia, String pToken, String pFormato) {
        System.out.println("Administrar.consultarCuentasInversion");
    }
}
