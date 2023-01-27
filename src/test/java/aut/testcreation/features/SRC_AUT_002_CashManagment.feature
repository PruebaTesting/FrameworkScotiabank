@functional
Feature: Conjunto de Test para validar el funcionamiento correcto de los flujos de negocios
  correspondientes a Cash Managment

  Background:
    #Given El Usuario se Logea en la página de CCOP con los datos "pUsuario", "pContasenia" y "pToken"

  @fast
  Scenario Outline: <Escenario>
    When El Usuario crea un Tipo de Beneficiario "<TipoBeneficiario>" con los datos "<Datos>"
    #And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    #Then El Sistema muestra la creación exitosa del Beneficiario "pResultadoEsperado"
    Examples:
      | Escenario                                                     | TipoBeneficiario               | Datos                                                                                                                         |
      | SC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente          | Pago de Servicios y Facturas   | pAlias, pNumCliente                                                                                                           |
      | SC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente          | Pago de Servicios y Facturas   | pAlias, pNumCliente                                                                                                           |
      | SC_002_03_altaBeneficiarioPersonaMoralOtroBanco               | Persona Moral                  | pNombrePerfil, pTipoCuenta, pNumCuenta, pNumIdentificacion, pNombreRazonSocial, pEmail, pNumTelefono, pLimiteAbono            |
      | SC_002_04_altaBeneficiarioPersonaMoralScotiabank              | Persona Moral                  | pNombrePerfil, pTipoCuenta, pNumCuenta, pNumIdentificacion, pNombreRazonSocial, pEmail, pNumTelefono, pLimiteAbono            |
      | SC_002_05_altaBeneficiarioPersonaFisicaOtroBanco              | Persona Física                 | pNombrePerfil, pTipoCuenta, pNumCuenta, pAlias, pNumIdentificacion, pNombre, pApellidoPaterno, pApellidoMaterno, pLimiteAbono |
      | SC_002_06_altaBeneficiarioPersonaFisicaScotiabank             | Persona Física                 | pNombrePerfil, pTipoCuenta, pNumCuenta, pAlias, pNumIdentificacion, pNombre, pApellidoPaterno, pApellidoMaterno, pLimiteAbono |
      | SC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado | Contribuciones Gubernamentales | pTipoImpuesto, pAlias                                                                                                         |
      | SC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad | Contribuciones Gubernamentales | pTipoImpuesto, pAlias                                                                                                         |
      | SC_002_09_altaBeneficiarioContribucionesFederalesSAT          | Contribuciones Federales       | pTipoImpuesto, pAlias                                                                                                         |
      | SC_002_10_altaBeneficiarioContribucionesFederalesDerechos     | Contribuciones Federales       | pTipoImpuesto, pAlias                                                                                                         |

  Scenario Outline: <Escenario>
    When El Usuario paga "<TipoPago>" con los datos "<Datos>"
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra el pago exitoso comprobando la descarga del comprobante
    Examples:
      | Escenario                                         | TipoPago                       | Datos                                                                                                                                             |
      | SC_002_11_pagoDeFactura                           | Factura                        |                                                                                                                                                   |
      | SC_002_12_pagoDeFacturaParcialConNumCliente       | Factura                        | pImporte, pEsPagoParcial                                                                                                                          |
      | SC_002_13_pagoDeFacturaTotalConNumCliente         | Factura                        | pImporte, pEsPagoParcial                                                                                                                          |
      | SC_002_14_pagoCipare                              | CIPARE                         | pRegistroPatronal, pPeriodo                                                                                                                       |
      | SC_002_15_pagoContribucionesGubernamentalesEstado | Contribuciones Gubernamentales | pLineaCaptura, pImporte, pFechaLimitePago                                                                                                         |
      | SC_002_16_pagoContribucionesGubernamentalesCiudad | Contribuciones Gubernamentales | pLineaCaptura, pImporte, pFechaLimitePago                                                                                                         |
      | TC_002_17_pagoContribucionesFederalesDerechos     | Contribuciones Federales       | pRFC, pRazonSocial, pDependenciaYEntidades, pPeriodicidad, pEjercicio, pPeriodo, pClaveReferenciaDPA, pCadenaDependencia, pImporte, pLineaCaptura |
      | TC_002_18_pagoContribucionesFederalesSAT          | Contribuciones Federales       | pRFC, pRazonSocial, pDependenciaYEntidades, pPeriodicidad, pEjercicio, pPeriodo, pClaveReferenciaDPA, pCadenaDependencia, pImporte, pLineaCaptura |
      | TC_002_19_pagoNominaOtroBanco                     | Nómina                         | pImporte, pReferenciaNumerica, pConcepto                                                                                                          |
      | TC_002_20_pagoNominaScotiabank                    | Nómina                         | pImporte, pReferenciaNumerica, pConcepto                                                                                                          |

