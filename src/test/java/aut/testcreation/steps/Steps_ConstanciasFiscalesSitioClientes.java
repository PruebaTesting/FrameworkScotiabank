package aut.testcreation.steps;

import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import aut.testcreation.tasks.ConstanciasFiscalesSitioCliente.*;

public class Steps_ConstanciasFiscalesSitioClientes extends CucumberBaseTestRunner implements En {

    public Steps_ConstanciasFiscalesSitioClientes(){
        Given("El Usuario se logea en el Page Constancias Fiscales Sitio Cliente con el idioma  {string}",(String pIdioma) ->{
            Login.FuncionUsuario(pIdioma);
        });
        Then("El Sistema muestra en pantalla el mensaje : {string}", (String parametro) ->{
            Validar.mensajeSistema(parametro);
        });
        And("El Usuario ingresa los datos requeridos para descargar la constancia  {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split(" & ");

            switch (pDatos){
                case "pNumCliente & pContrasenia" :
                    Datos.IngresarDatosCliente(lDatos[0], lDatos[1]);
                    break;
                case "pNumContrato & pContrasenia":
                    Datos.IngresarDatosContrato(lDatos[0], lDatos[1]);
                    break;
                case "pNumCuentaBancaria":
                    Datos.IngresarDatosBancaria(pDatos);
                    break;
                case "pClaveIdentificador & pCorreo & pRFC & pEjercicio":
                    Datos.CompletarDatos(lDatos[0], lDatos[1],lDatos[2],lDatos[3]);
                    break;
            }

        });
        When("El Usuario selecciona el Rol  {string}", (String pRol) -> {
            switch (pRol){
                case "Bank Client":
                    Rol.funcionRol(pRol);
                    break;
                case "Cliente banco":
                    Rol.funcionRol(pRol);
                    break;
                case "Cliente Casa de Bolsa":
                    Rol.funcionRol(pRol);
                    break;
                case "MexDer":
                    Rol.funcionRol(pRol);
                    break;
                case "Premiado":
                    Rol.funcionRol(pRol);
                    break;
                case "Proveedor":
                    Rol.funcionRol(pRol);
                    break;
            }
        });

    }



}
