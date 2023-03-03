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

    public static void administrarAprobacion(String pAccion) {
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
    public static void consultarCuentasChequesUSD(String pContrasenia, String pToken, String pFormato){
        System.out.println("Administrar.consultarCuentasChequesUSD");
    }
    public static void consultarCuentasChequesMXN(String pContrasenia, String pToken, String pFormato){
        System.out.println("Administrar.consultarCuentasChequesMXN");
    }
    public static void consultarCuentasLineaOperativa(String pManual, String pFormato, String pTipoSeparador){
        System.out.println("Administrar.consultarCuentasLineaOperativa");
    }
    public static void consultarCuentasPrestamosPersonales(String pManual, String pFormato, String pTipoSeparador) {
        System.out.println("Administrar.consultarCuentasPrestamosPersonales");
    }
    public static void consultarCuentasFondosInversion(String pManual, String pFormato, String pTipoSeparador) {
        System.out.println("Administrar.consultarCuentasFondosInversion");
    }
    public static void consultarCreditosHipotecariosTXT(String pManual, String pFormato, String pTipoSeparador) {
        System.out.println("Administrar.consultarCreditosHipotecariosTXT");
    }
    public static void consultarCuentasInversionCSV(String pManual, String pFormato, String pTipoSeparador) {
        System.out.println("Administrar.consultarCuentasInversionCSV");
    }
    public static void consultarCuentasTDCMXNTXT(String pManual, String pFormato, String pTipoSeparador) {
        System.out.println("Administrar.consultarCuentasTDCMXNTXT");
    }
    public static void consultarCuentasChequesUSDCSV(String pManual, String pFormato, String pTipoSeparador){
        System.out.println("Administrar.consultarCuentasChequesUSDCSV");
    }
    public static void consultarCuentasChequesMXNTXT(String pManual, String pFormato, String pTipoSeparador){
        System.out.println("Administrar.consultarCuentasChequesMXNTXT");
    }

}
