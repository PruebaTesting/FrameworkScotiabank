package aut.testcreation.steps;

import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import aut.testcreation.tasks.scotiabank.*;

public class Stepdefs_SRC_AUT_003_ConstanciasFiscalesBanco extends CucumberBaseTestRunner implements En{
    public Stepdefs_SRC_AUT_003_ConstanciasFiscalesBanco() {
        Given("El Usuario se logea en el Page Constancias Fiscales Banco con el idioma {string}", (String pIdioma) -> {
            Login.FuncionUsuario(pIdioma);
        });
        When("El Usuario selecciona el Rol {string}", (String pRol) -> {
            switch (pRol){
                case "Bank Client":
                    Rol.funcionRol("Rol");
                    break;
                case "Cliente banco":
                    Rol.funcionRol("Rol");
                    break;
                case "Cliente Casa de Bolsa":
                    Rol.funcionRol("Rol");
                    break;
                case "MexDer":
                    Rol.funcionRol("Rol");
                    break;
                case "Premiado":
                    Rol.rolPremiadoProveedor();
                    break;
                case "Proveedor":
                    Rol.rolPremiadoProveedor();
                    break;
            }
        });
        And("El Usuario ingresa los Datos requeridos para descargar la correspondiente {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split(" & ");

            switch (pDatos){
                case "pNumCliente & pContrasenia":
                    Datos.IngresarDatos("", "");
                    break;
                case "pNumContrato & pContrasenia":
                    Datos.IngresarDatos("", "");
                    break;
                case "pNumCuentaBancaria":
                    Datos.IngresarDatos("", "");
                    break;
                case "pClaveIdentificador & pCorreo & pRFC & pEjercicio":
                    Datos.IngresarDatos("", "");
                    break;
            }
        });
    }
}