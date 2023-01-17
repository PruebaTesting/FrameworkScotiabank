package aut.testcreation.tasks.cashManagment;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

public class Login extends SeleniumWrapper {
    public Login(WebDriver driver) {
        super(driver);
    }

    public static void correcto(String pUsuario, String pContrasenia, String pToken) {
        System.out.println("Login.correcto");
    }

    public static void confirmarAutenticacion(String pContrasenia, String pToken) {
        System.out.println("Login.confirmarAutenticacion");
    }

}
