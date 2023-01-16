Feature: Conjunto de Test para validar el funcionamiento correcto de los flujos de negocios
  correspondientes a Cash Managment

  Background:
    Given El Usuario se Logea en la página de CCOP con los datos "pUsuario", "pContasenia" y "pToken"

  Scenario Outline: <Escenario>
    When El Usuario crea un Tipo de Beneficiario <TipoBeneficiario> con los datos <Datos>
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra la creación exitosa del Beneficiario "pResultadoEsperado"
    Examples:
      | Escenario                                                     | TipoBeneficiario               | Datos                                                                                                                                  |
      | SC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente          | Pago de Servicios y Facturas   | "pAlias" y "pNumCliente"                                                                                                               |
      | SC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente          | Pago de Servicios y Facturas   | "pAlias" y "pNumCliente"                                                                                                               |
      | SC_002_03_altaBeneficiarioPersonaMoralOtroBanco               | Persona Moral                  | "pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion" y "pLimiteAbono"                                                    |
      | SC_002_04_altaBeneficiarioPersonaMoralScotiabank              | Persona Moral                  | "pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion" y "pLimiteAbono"                                                    |
      | SC_002_05_altaBeneficiarioPersonaFisicaOtroBanco              | Persona Física                 | "pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno" y "pLimiteAbono" |
      | SC_002_06_altaBeneficiarioPersonaFisicaScotiabank             | Persona Física                 | "pNombrePerfil", "pTipoCuenta", "pNumCuenta" y "pLimiteAbono"                                                                          |
      | SC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado | Contribuciones Gubernamentales | "pTipoImpuesto"                                                                                                                        |
      | SC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad | Contribuciones Gubernamentales | "pTipoImpuesto"                                                                                                                        |
      | SC_002_09_altaBeneficiarioContribucionesFederalesSAT          | Contribuciones Federales       | "pTipoImpuesto"                                                                                                                        |
      | SC_002_10_altaBeneficiarioContribucionesFederalesDerechos     | Contribuciones Federales       | "pTipoImpuesto"                                                                                                                        |

  Scenario: SC_002_11_pagoDeFactura
    When El Usuario paga una Factura
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra el pago exitoso de la Factura

  Scenario Outline: <Escenario>
    When El Usuario paga una Factura con los datos <Datos>
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra el pago exitoso de la Factura
    Examples:
      | Escenario                                   | Datos                         |
      | TC_002_12_pagoDeFacturaParcialConNumCliente | "pImporte" y "pEsPagoParcial" |
      | TC_002_13_pagoDeFacturaTotalConNumCliente   | "pImporte" y "pEsPagoParcial" |