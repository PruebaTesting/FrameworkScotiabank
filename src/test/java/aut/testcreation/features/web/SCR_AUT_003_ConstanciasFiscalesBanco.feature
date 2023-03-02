Feature:

  Scenario Outline: "<Escenario>"
    Given El Usuario se logea en el Page Constancias Fiscales Banco con el idioma "<Idioma>"
    When El Usuario selecciona el Rol "<Rol>"
    And El Usuario ingresa los Datos requeridos para descargar la correspondiente "<pDatos>"
    Then El Sistema muestra en pantalla el mensaje: "mensaje del sistema"
    Examples:
    |Escenario                                            |Idioma |Rol                  |pDatos                                           |
    |SC_003_01_ConsultaYDescargaClienteBancoIngles        |Ingles |Bank Client          |pNumCliente & pContrasenia                       |
    |SC_003_02_ConsultaYDescargaClienteBancoEspañol       |Español|Cliente banco        |pNumCliente & pContrasenia                       |
    |SC_003_03_ConsultayDescargaClienteCasaDeBolsaIngles  |Ingles |Cliente Casa de Bolsa|pNumContrato & pContrasenia                      |
    |SC_003_04_ConsultayDescargaClienteCasaDeBolsaEspañol |Español|Cliente Casa de Bolsa|pNumContrato & pContrasenia                      |
    |SC_003_05_ConsultayDescargaClienteMexderIngles       |Ingles |MexDer               |pNumContrato & pContrasenia                      |
    |SC_003_06_ConsultayDescargaClienteMexderEspañol      |Español|MexDer               |pNumContrato & pContrasenia                      |
    |SC_003_07_ConsultaYDescargaClienteOTCIngles          |Ingles |MexDer               |pNumCliente & pContrasenia                       |
    |SC_003_08_ConsultayDescargaOTCEspañol                |Español|MexDer               |pNumCliente & pContrasenia                       |
    |SC_003_09_ConsultaYDescargaProveedorInglesExtranjero |Ingles |Proveedor            |pNumCuentaBancaria                               |
    |SC_003_10_ConsultaYDescargaProveedorEspañolExtranjero|Español|Proveedor            |pNumCuentaBancaria                               |
    |SC_003_11_ConsultaYDescargaPremiadoIngles            |Ingles |Premiado             |pClaveIdentificador & pCorreo & pRFC & pEjercicio|
    |SC_003_12_ConsultaYDescargaPremiadoEspañol           |Español|Premiado             |pClaveIdentificador & pCorreo & pRFC & pEjercicio|
    |SC_003_13_ConsultaYDescargaClienteBancoIngles        |Ingles |Bank Client          |pNumCliente & pContrasenia                       |
    |SC_003_14_ConsultaYDescargaClienteBancoEspañol       |Español|Cliente banco        |pNumCliente & pContrasenia                       |
    |SC_003_15_ConsultaYDescargaClienteCasaDeBolsaIngles  |Ingles |Cliente Casa de Bolsa|pNumContrato & pContrasenia                      |
    |SC_003_16_ConsultaYDescargaClienteCasaDeBolsaEspañol |Español|Cliente Casa de Bolsa|pNumContrato & pContrasenia                      |
    |SC_003_17_ConsultaYDescargaClienteMexderIngles       |Ingles |MexDer               |pNumContrato & pContrasenia                      |
    |SC_003_18_ConsultaYDescargaClienteMexderEspañol      |Español|MexDer               |pNumContrato & pContrasenia                      |
    |SC_003_19_ConsultaYDescargaClienteOTCIngles          |Ingles |MexDer               |pNumCliente & pContrasenia                       |
    |SC_003_20_ConsultaYDescargaOTCEspañol                |Español|MexDer               |pNumCliente & pContrasenia                       |
    |SC_003_21_ConsultaYDescargaProveedorInglesExtranjero |Ingles |Proveedor            |pNumCuentaBancaria                               |
    |SC_003_22_ConsultaYDescargaProveedorEspañolExtranjero|Español|Proveedor            |pNumCuentaBancaria                               |
    |SC_003_23_ConsultaYDescargaPremiadoIngles            |Ingles |Premiado             |pClaveIdentificador & pCorreo & pRFC & pEjercicio|
    |SC_003_24_ConsultaYDescargaPremiadoEspañol           |Español|Premiado             |pClaveIdentificador & pCorreo & pRFC & pEjercicio|