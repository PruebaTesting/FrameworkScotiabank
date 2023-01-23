Feature:

  Scenario Outline: <Escenario>
    Given El Usuario se logea en el Home Page con el idioma "<Idioma>"
    When El Usuario selecciona el Rol "<Rol>"
    And El Usuario ingresa los datos requeridos para descargar la constancia "<Datos>"
    Then El Sistema muestra en pantalla el mensaje: "mensaje del sistema"
    Examples:
    |Escenario                                            |Idioma |Rol                  |Datos                      |
    |SC_003_01_ConsultaYDescargaClienteBancoIngles        |Ingles |Bank Client          |"pNumCliente&pContrasenia" |
    |SC_003_02_ConsultaYDescargaClienteBancoEspañol       |Español|Cliente banco        |"pNumCliente&pContrasenia" |
    |SC_003_03_ConsultayDescargaClienteCasaDeBolsaIngles  |Ingles |Cliente Casa de Bolsa|"pNumContrato&pContrasenia"|
    |SC_003_04_ConsultayDescargaClienteCasaDeBolsaEspañol |Español|Cliente Casa de Bolsa|"pNumContrato&pContrasenia"|
    |SC_003_05_ConsultayDescargaClienteMexderIngles       |Ingles |MexDer               |"pNumContrato&pContrasenia"|
    |SC_003_06_ConsultayDescargaClienteMexderEspañol      |Español|MexDer               |"pNumContrato&pContrasenia"|
    |SC_003_07_ConsultaYDescargaClienteOTCIngles          |Ingles |MexDer               |"pNumCliente&pContrasenia" |
    |SC_003_08_ConsultayDescargaOTCEspañol                |Español|MexDer               |"pNumCliente&pContrasenia" |
    |SC_003_09_ConsultaYDescargaProveedorInglesExtranjero |Ingles |Proveedor            |"pNumCuentaBancaria"       |
    |SC_003_10_ConsultaYDescargaProveedorEspañolExtranjero|Español|Proveedor            |"pNumCuentaBancaria"       |
    |SC_003_11_                                           |       |                     |                           |
    |SC_003_13_                                           |       |                     |                           |
    |SC_003_14_                                           |       |                     |                           |
    |SC_003_15_                                           |       |                     |                           |
    |SC_003_12_                                           |       |                     |                           |
    |SC_003_16_                                           |       |                     |                           |
    |SC_003_17_                                           |       |                     |                           |
    |SC_003_18_                                           |       |                     |                           |
    |SC_003_19_                                           |       |                     |                           |
    |SC_003_20_                                           |       |                     |                           |
