package aut.testcreation.testcases;

import aut.testcreation.tasks.scotiabank.Datos;
import aut.testcreation.tasks.scotiabank.Login;
import framework.engine.selenium.SeleniumTestBase;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;


public class SRC_AUT_003_ConstanciasFiscalesBanco extends SeleniumTestBase {

    @Test
    void TC_003_01_ConsultaYDescargaClienteBancoIngles(String pIdioma, String Rol, String pDatos) throws IOException, InvalidFormatException, AWTException {
        Login.FuncionUsuario(pIdioma);
        Rol.funcionRol(Rol);
        //Datos.IngresarDatos(pDatos);
    }
}
