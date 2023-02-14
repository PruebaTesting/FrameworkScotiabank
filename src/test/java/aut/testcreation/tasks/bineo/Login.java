package aut.testcreation.tasks.bineo;

import framework.engine.selenium.AppiumWrapper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Bineo.*;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Login extends AppiumWrapper {
    public Login(AndroidDriver driver) {
        super(driver);
    }

    public static void ingresarCorrectamente() throws InterruptedException, IOException, InvalidFormatException, AWTException {
        Thread.sleep(9000);
        clickear(btnSoyUsuario);
        reporte.reportarEvento("", true, false);
        Thread.sleep(4000);
        escribirEnInput(lblUsuario, "postman-bb-984@yahoo.com");
        reporte.reportarEvento("", true, false);
        presionarTecla(AndroidKey.ENTER);
        escribirEnInput(lblContrasenia, "Qwerty987$");
        reporte.reportarEvento("", true, false);
        presionarTecla(AndroidKey.BACK);
        Thread.sleep(4000);
        clickear(btnIniciarSesion);
        reporte.reportarEvento("", true, false);
        Thread.sleep(5000);
    }
}
