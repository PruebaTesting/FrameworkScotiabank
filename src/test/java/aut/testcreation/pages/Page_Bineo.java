package aut.testcreation.pages;

import org.openqa.selenium.By;

public class Page_Bineo {

    private static String appPackage = "com.bineo.qa:";
    public static By btnSoyUsuario = By.id(appPackage + "id/btnLogIn");
    public static By lblUsuario = By.id(appPackage + "id/authenticationJourney_usernameScreen_usernameField");
    public static By lblContrasenia = By.id(appPackage + "id/authenticationJourney_usernameScreen_passwordField");
    public static By btnIniciarSesion = By.id(appPackage + "id/authenticationJourney_usernameScreen_loginButton");
}
