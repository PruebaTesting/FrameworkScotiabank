package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.*;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class Stepdefs_ContabilidadElectronica extends CucumberBaseTestRunner implements En {
    public Stepdefs_ContabilidadElectronica() {
        Given("El Usuario se loguea en la pantalla Consulta XML´s TSYS", () -> {
            Login.ingresar();
        });
        When("El Usuario hace la consulta sin cuenta, con fechas", () -> {
            Consulta.sinCuenta();
        });
        Then("El Sistema muestra en pantalla la lista de los xml s", () -> {
            Validar.listaRegistros();
        });
        When("El Usuario hace la consulta con cuenta, con fechas", () -> {
            Consulta.sinCuenta();
        });


        When("El Usuario hace la consulta sin RFC receptor, con fechas", () -> {
            Menu.seleccionarFechas();
        });
        When("El Usuario hace la consulta sin RFC receptor", () -> {
        });
        When("El Usuario hace la consulta RFC receptor, con fechas", () -> {
            Menu.seleccionarFechas();
        });
        When("El Usuario selecciona la fecha Final", () -> {
            Menu.seleccionarFechaFinal();
        });
        Given("El Usuario se loguea en el Home Page", () -> {
            Login.ingresar();
        });
        When("El Usuario selecciona el Rol de cuenta {string}", (String arg0) -> {
            Rol.RolConsulta();
        });
        Then("El Sistema muestra en pantalla la pantalla de Administración de XML´s TSYS", () -> {
            Validar.pantallaFinal();
        });
        When("El Usuario consulta la información Tipo de Log", () -> {
            Informacion.tipoLog();
        });
        Then("El Sistema muestra en pantalla la información requerida", () -> {
            Validar.informacionRequerida();
        });
        When("El Usuario selecciona las opciones de información", () -> {
            Informacion.generacionXML();
        });
        Then("El Sistema genera el XML correctamente", () -> {
            Validar.informacionRequerida();
        });
        When("El Usuario consulta el Listado de balanzas Empresas Reguladas", () -> {
            Informacion.listadoXML();
        });
        Given("El Usuario esta logueado en el Sistema", () -> {
            Login.ingresar();
        });
        Then("Click al Botón Salir", () -> {
            Login.InicioSesion();
        });
        When("El Usuario selecciona las opciones de Generación de XML", () -> {
            Informacion.listadoXML();
        });

    }
}
