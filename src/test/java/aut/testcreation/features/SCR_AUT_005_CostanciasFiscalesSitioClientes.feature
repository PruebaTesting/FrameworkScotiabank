Feature:

  Scenario Outline: <Escenario>
    Given El Usuario se logea en el Home Page con el idioma "<Idioma>"
    When El Usuario selecciona el Rol "<Rol>"
    And El Usuario ingresa los datos requeridos para descargar la constancia "<Datos>"
    Then El Sistema muestra en pantalla el mensaje: "mensaje del sistema"
    Examples:
    |Escenario                                              |Idioma |Rol                    |Datos                                         |
    |SC_005_01_ConsultaYDescargaClienteBancoIngles          |Ingles |Bank Client            |pNumCliente & Contrasenia                     |
    |SC_005_02_ConsultaYDescargaClienteBancoEspañol         |Español|Cliente banco          |pNumCliente & Contrasenia                     |
    |SC_005_03_ConsultaYDescargaClienteCasaDeBolsaIngles    |Ingles |Cliente Casa de Bolsa  |pNumContrato & Contrasenia                    |
    |SC_005_04_ConsultaYDescargaClienteCasaDeBolsaEspañol   |Español|Cliente Casa de Bolsa  |pNumContrato & Contrasenia                    |
    |SC_005_05_ConsultaYDescargaClienteMexderIngles         |Ingles |Mexder                 |pNumContrato & Contrasenia                    |
    |SC_005_06_ConsultaYDescargaClienteMexderEspañol        |Español|Mexder                 |pNumContrato & Contrasenia                    |
    |SC_005_07_ConsultaYDescargaClieteOTCIngles             |Ingles |Mexder                 |pNumCliente & Contasenia                      |
    |SC_005_08_ConsultaYDescargaOTCEspañol                  |Español|Mexder                 |pNumCliente & Contasenia                      |
    |SC_005_09_ConsultaYDescargaProveedorInglesExtranjero   |Ingles |Proveedor              |pNumCuentaBancaria                            |
    |SC_005_10_ConsultaYDescargaProveedorEspañolExtranjero  |Español|Proveedor              |pNumCuentaBancaria                            |
    |SC_005_11_ConsultaYDescargaPremiadoIngles              |Ingles |Premiado               |pClaveIdentificador & pCorreo&pRFC&pEjercicio |
    |SC_005_12_ConsultaYDescargaPremiadoEspañol             |Español|Premiado               |pClaveIdentificador & pCorreo&pRFC&pEjercicio |

