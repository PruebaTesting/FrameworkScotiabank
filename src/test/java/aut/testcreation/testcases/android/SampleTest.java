package aut.testcreation.testcases.android;
import aut.testcreation.tasks.bineo.Login;
import framework.engine.selenium.AppiumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;

public class SampleTest extends AppiumTestBase {

    @Test
    public void sampleTest() throws InterruptedException, IOException, InvalidFormatException, AWTException {
        Login.ingresarCorrectamente();
    }
}
