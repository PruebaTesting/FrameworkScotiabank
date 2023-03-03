Feature:

  Scenario: SC_004_36_CancelaciónDeOrdenesDeCapitales
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    When El Usuario hace la Consulta requerida
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_37_CancelaciónDeOrdenesDeEfectivo
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    When El Usuario hace la Consulta requerida
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_38_CancelaciónDeOrdenesDeFondos
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    When El Usuario hace la Consulta requerida
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_39_ConsultaDeOrdenesDeCapitales
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_40_ConsultaDeOrdenesDeEfectivo
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_41_ConsultaDeOrdenesFondos
    Given El Usuario aplica el flujo menú, selecciona la opción de consulta y cancelación de ordenes
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_42_CambioDeClaveDeAccesoNoCapturóNumeroDeUsuario
    Given El Usuario se loguea en el Home Page
    When El Usuario intenta hacer cambio de contrasenia
    Then El Sistema muestra en pantalla el mensaje : "El sistema notifica el error conforme al look and feel establecido"

  Scenario: SC_004_43_ConsultaYCancelaciónDeOrdenes
    Given El Usuario se loguea en el Home Page
    When El Usuario ingresa los datos requeridos
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_44_CapturaDeOrdenesDeMercadoDeCapitalesCompra
    Given El Usuario se loguea en el Home Page
    When El Usuario ingresa los datos requeridos
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_45_CapturaDeOrdenesDeMercadoDeCapitalesVenta
    Given El Usuario se loguea en el Home Page
    When El Usuario ingresa los datos requeridos
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_46_OperarMercadoDeCapitalesClaveIncorrecta
    Given El Usuario se loguea en el Home Page
    When El Usuario operar en el flujo de Mercado de Capitales con una clave incorrecta
    Then El Usuario presiona el botón Regresar

  Scenario: SC_004_47_OperarMercadoDeCapitalesCompraImporteMayorAlDisponible
    Given El Usuario se loguea en el Home Page
    When El Usuario intenta realizar una Orden de Compra
    Then El Sistema muestra en pantalla el mensaje : "El saldo disponible no alcanza para operar"

  Scenario: SC_004_48_OperarMercadoDeCapitalesVentaSinPosición
    Given El Usuario se loguea en el Home Page
    When El Usuario intenta realizar una Orden de Venta
    Then El Sistema muestra en pantalla el mensaje : "El contrato no tiene posición disponible"

  Scenario: SC_004_49_OperarEfectivoDeposito
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace un Deposito de Efectivo
    Then El Sistema muestra en pantalla el mensaje : "El sistema confirma la realización de la operación"

  Scenario: SC_004_50_OperarEfectivoRetiro
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace un Retiro de Efectivo
    Then El Usuario presiona el botón Aceptar

  Scenario: SC_004_51_OperarEfectivoClaveIncorrecta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer una Operación de Efectivo
    Then El Usuario presiona el botón Regresar

  Scenario: SC_004_52_OperarEfectivoFueraDeHorario
    Given El Usuario se loguea en el Home Page
    Then El Usuario intenta hacer una Operación de Efectivo fuera de horario

  Scenario: SC_004_53_OperarFondosDeInversiónCompra_FondosCash_Scotia1_ScotiaG
    Given El Usuario se loguea en el Home Page
    When El Usuario hace una operación de Fondos de Inversión
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_54_OperarFondosDeInversiónCompra_FondosNoCash_Scotia2_Scotilp
    Given El Usuario se loguea en el Home Page
    When El Usuario hace una operación de Fondos de Inversión
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_55_OperarFondosDeInversiónventa_FondosCash_Scotia1_ScotiaG
    Given El Usuario se loguea en el Home Page
    When El Usuario hace una operación de Fondos de Inversión
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_56_OperarFondosDeInversiónVenta_FondosNoCash_Scotia2_Scotilp
    Given El Usuario se loguea en el Home Page
    When El Usuario hace una operación de Fondos de Inversión
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_57_OperarFondosDeInversión
    Given El Usuario se loguea en el Home Page
    When El Usuario intenta hacer una operación de Fondos de Inversión
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_004_58_ConsultaDelBannerUnosDosYConoceMás
    Given El Usuario se loguea en el Home Page
    Then El Usuario hace Click en el botón Conoce Más

  Scenario: SC_004_59_OperarFondosDeInversión
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer una operación de Fondos de Inversión
    Then El Usuario presiona el botón Regresar

  Scenario: SC_004_60_OperarFondosDeInversión
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer una operación de Fondos de Inversión
    Then El Usuario presiona el botón Regresar

  Scenario: SC_004_61_OperarFondosDeInversión
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer una operación de Fondos de Inversión
    Then El Usuario presiona el botón Regresar

  Scenario: SC_004_62_CambioDeMail
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario ingresa los Datos requeridos para cambiar el Mail
    Then El Sistema muestra en pantalla el mensaje : "Se muestra la confirmación del cambio"


  Scenario: SC_004_63_CambioDeMail
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario ingresa los Datos requeridos para cambiar el Mail, dejando el  display del dispositivo e-Llave en blanco
    Then El Sistema muestra en pantalla el mensaje : "El cambio de su pregunta secreta ha sido exitoso"

  Scenario: SC_004_64_ConsultaCartasConfirmación
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario ingresa los Datos: "pContrato", "pMercado", "pFechaInicio", "Fecha Fin", "Consultado"
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_65_ConsultaEstadoDeCuentaPDF
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario consulta el Estado de Cuenta PDF
    Then El Sistema muestraen pantalla el comprobante

  Scenario: SC_004_66_ConsultaEstadoDeCuentaXML
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario consulta el Estado de Cuenta XML
    Then El Sistema muestraen pantalla el comprobante