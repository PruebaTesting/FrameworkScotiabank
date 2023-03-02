package aut.testcreation.steps;

import aut.testcreation.tasks.scotiabank.*;
import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;

public class SCR_004_Scotiatrade_Stepdefs extends CucumberBaseTestRunner implements En {
    public SCR_004_Scotiatrade_Stepdefs() {
        Given("El Usuario se logea en la Home Page de ScotiaTrade", () -> {
            Login.ingresarScotiatrade();
        });
        When("El Usuario intenta hacer el Cambio de Clave Personal", () -> {
            Menu.ClavePersonal();
        });
        When("El Usuario hace el Cambio de Clave Personal", () -> {
            Menu.ClavePersonal();
        });
        When("El Usuario hace el Cambio de Imagen valida", () -> {
            Menu.cambioImagenvalida();
        });
        When("El Usuario hace el Cambio de Imagen invalido", () -> {
            Menu.cambioImagenInvalido();
        });
        /*Then("El Sistema muestra en pantalla el mensaje: {string}", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });*/
        Then("El Usuario valida el cambio de imagen", () -> {
            Validar.cambioImagen();
        });

        When("El Usuario hace el Cambio de e-mail", () -> {
            Menu.cambioMail();
        });
        Then("El Usuario valida los cambios de e-mail", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });
        Then("El Usuario ingresa el número de Token", () -> {
            //Menu.ingresarToken();
        });
        When("El Usuario hace el Cambio de Pregunta Secreta", () -> {
            Menu.CambioPreguntaSecreta();
        });
        And("El Usuario ingresa los datos para registrar número de Token", () -> {
            Menu.RegistarToken();
        });

//------------------------------------------------------------------------------------------------

        Given("El Usuario ingresa al page de Registro de Usuario", () -> {
            Login.ingresarPageConsulta();
        });
        When("El Usuario hace la consulta de Cartas Confirmadas", () -> {
            Menu.cartasConfirmacion();
        });
        Then("El Sistema muestra en pantalla la carta confirmación", () -> {
            Validar.cartaConfirmacion();
        });
        When("El Usuario hace la consulta de Constancias Fiscales", () -> {
            Menu.constanciasFiscales();
        });
        Then("El Sistema muestra en pantalla las constancias fiscales disponibles", () -> {
            Validar.constanciasFiscalesDisponibles();
        });
        When("El Usuario hace la consulta de Navegación superior", () -> {
            Menu.navegacionSuperior();
        });
        Given("El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes", () -> {
            Login.flujoNavegacionSuperior();
        });
        When("El Usuario hace la Consulta requerida", () -> {
            Menu.consultaRequerida();
        });
        Then("El Sistema muestraen pantalla el comprobante", () -> {
            Validar.comprobante();
        });
        When("El Usuario ingresa los datos requeridos", (String pUsuario, String pClaveAcceso) -> {
            Datos.IngresarDatos(pUsuario, pClaveAcceso);
        });
        When("El Usuario intenta hacer cambio de contrasenia", () -> {
            Menu.cambioConstrasenia();
        });
        When("El Usuario operar en el flujo de Mercado de Capitales con una clave incorrecta", () -> {
            Menu.operarMercadosCapitales();
        });
        Then("El Usuario presiona el botón Regresar", () -> {
            Validar.pantallaFinal();
        });
        When("El Usuario intenta realizar una Orden de Compra", () -> {
            Menu.ordenDeCompra();
        });
        When("El Usuario intenta realizar una Orden de Venta", () -> {
            Menu.ordenDeVenta();
        });
        When("El Usuario hace un Deposito de Efectivo", () -> {
            Menu.depositoEfectivo();
        });
        When("El Usuario hace un Retiro de Efectivo", () -> {
            Menu.retiroDeEfectivo();
        });
        Then("El Usuario presiona el botón Aceptar", () -> {
            Validar.pantallaFinal();
        });
        When("El Usuario intenta hacer una Operación de Efectivo", () -> {
            Menu.operacionEfectivo();
        });
        Then("El Usuario intenta hacer una Operación de Efectivo fuera de horario", () -> {
            Validar.pantallaFinal();
        });
        When("El Usuario hace una operación de Fondos de Inversión", () -> {
            Menu.fondosDeInversion();
        });
        When("El Usuario intenta hacer una operación de Fondos de Inversión", () -> {
            Menu.fondoDeInversionNoDisponible();
        });
        Then("El Usuario hace Click en el botón Conoce Más", () -> {
            Validar.ClickConoceMas();
        });
        When("El Usuario ingresa los Datos requeridos para cambiar el Mail", () -> {
            Menu.cambioDeMail();
        });
        When("El Usuario ingresa los Datos requeridos para cambiar el Mail, dejando el  display del dispositivo e-Llave en blanco", () -> {
            Menu.cambioDeMailSinDisplay();
        });
        When("El Usuario ingresa los Datos: {string}, {string}, {string}, {string}, {string}", (String arg0, String arg1, String arg2, String arg3, String arg4) -> {
            Menu.ingresarDatos();
        });
        When("El Usuario consulta el Estado de Cuenta PDF", () -> {
            Consulta.estadoDeCuenta();
        });
        When("El Usuario consulta el Estado de Cuenta XML", () -> {
            Consulta.estadoDeCuentaXML();
        });
        Given("El Usuario se registra en ScotiaTrade", () -> {
            Login.registrarse();
        });
        When("El Usuario realiza el cambio de Clave, Imagen, Pregunta Secreta", () -> {
            Datos.cambiarDatos();
        });
        When("El Usuario acepta el PopUp de información emergente", () -> {
            Informacion.aceptarPopUp();
        });
        Given("El Usuario intenta registrarse en ScotiaTrade", () -> {
            Login.loginFail();
        });
        When("El Usuario realiza el cambio de Contrasenia", () -> {
            Datos.cambiarContrasenia();
        });
    }
}