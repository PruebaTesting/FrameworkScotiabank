package aut.testcreation.steps;

import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import aut.testcreation.tasks.ConstanciasFiscalesSitioCliente.*;

public class Steps_005_ConstanciasFiscalesSitioClientes extends CucumberBaseTestRunner implements En {

    public Steps_005_ConstanciasFiscalesSitioClientes(){
        Given("El Usuario se logea en el Home Page con el idioma {string}",(String pIdioma) ->{
            Login.FuncionUsuario(pIdioma);
        });

        Then("El Sistema muestra en pantalla el mensaje: {string}", (String parametro) ->{
            Validar.mensajeSistema(parametro);
        });

        And("El Usuario ingresa los datos requeridos para descargar la constancia {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split("&");

            switch (pDatos){
                case "pNumCliente&pContrasenia" :
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "pNumContrato&pContrasenia":
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "pNumCuentaBancaria":
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "otros":
                    break;
            }
        });
/*
        When("El Usuario selecciona el Rol {string}", (String pRol) -> {
            switch (pRol){
                case "Bank Client":
                    //Rol.funcionRol(Rol);
                    break;
                case "Cliente banco":
                    //Rol.funcionRol(Rol);
                    break;
                case "Cliente Casa de Bolsa":
                    //Rol.funcionRol(Rol);
                    break;
                case "MexDer":
                    //Rol.funcionRol(Rol);
                    break;
                case "Premiado":
                    break;
                case "Proveedor":
                    //Rol.funcionRol(Rol);
                    break;
            }
        });
*/
    }
}
