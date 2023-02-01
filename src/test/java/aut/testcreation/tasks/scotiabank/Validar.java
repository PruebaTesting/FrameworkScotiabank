package aut.testcreation.tasks.scotiabank;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.WebDriver;

import static aut.testcreation.pages.Page_Scotiabank.*;

public class Validar extends SeleniumWrapper {
    public Validar(WebDriver driver) {
        super(driver);
    }

    public static boolean mensajeSistema(String parametro){
        verificarTexto(XXX, parametro);
        return false;
    }

    public static void cambioImagen(){
        estaDesplegado(XXX);
    }
}
