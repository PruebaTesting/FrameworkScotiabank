package aut.testcreation.tasks.bineo;

import framework.engine.selenium.AppiumWrapper;
import framework.engine.selenium.SeleniumWrapper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Bineo.*;

public class Login extends AppiumWrapper {
    public Login(AndroidDriver driver) {
        super(driver);
    }

    public static void ingresarCorrectamente() throws InterruptedException {
        Thread.sleep(8000);
        clickear(btnSoyUsuario);
        Thread.sleep(4000);
        escribirEnInput(lblUsuario, "postman-bb-984@yahoo.com");
        presionarTecla(AndroidKey.ENTER);
        escribirEnInput(lblContrasenia, "Qwerty987$");
        presionarTecla(AndroidKey.BACK);
        Thread.sleep(4000);
        clickear(btnIniciarSesion);
        Thread.sleep(5000);
    }
}
