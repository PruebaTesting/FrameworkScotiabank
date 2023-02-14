package aut.testcreation.testcases.android;
import aut.testcreation.tasks.bineo.Login;
import framework.engine.selenium.AppiumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;

import static framework.engine.selenium.GetTestName.*;

public class SampleTest extends AppiumTestBase {

    @Test
    public void TC_999_01_IngresarAAplicacion() throws InterruptedException, IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarCorrectamente();
    }

    @Test
    public void TC_999_01_IngresarAAplicacio() throws InterruptedException, IOException, InvalidFormatException, AWTException {
        getTestName(getMethodName());
        Login.ingresarCorrectamente();
    }
}
