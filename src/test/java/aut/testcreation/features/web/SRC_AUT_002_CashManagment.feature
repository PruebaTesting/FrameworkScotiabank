@functional
Feature: Conjunto de Test para validar el funcionamiento correcto de los flujos de negocios
  correspondientes a Cash Managment

  Background:
    Given El Usuario se Logea en la página de CCOP con los datos "pUsuario", "pContasenia" y "pToken"

  @fast
  Scenario Outline: <Escenario>
    When El Usuario Crea un Tipo de Beneficiario "<TipoBeneficiario>" con los datos "<Datos>"
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra la creación exitosa del Beneficiario "pResultadoEsperado"
    Examples:
      | Escenario                                                     | TipoBeneficiario               | Datos                                                                                                                                     |
      | SC_002_01_altaBeneficiarioPagoDeFacturaConNumCliente          | Pago de Servicios y Facturas   | pAlias, pNumCliente                                                                                                                       |
      | SC_002_02_altaBeneficiarioPagoDeFacturaSinNumCliente          | Pago de Servicios y Facturas   | pAlias, pNumCliente                                                                                                                       |
      | SC_002_03_altaBeneficiarioPersonaMoralOtroBanco               | Persona Moral de otro banco    | pNombrePerfil, pNumeroCuenta, pNumeroIdentificacion, pNombreRazonSocial, pEmail, pNumeroTelefono, pLimiteAbono                            |
      | SC_002_04_altaBeneficiarioPersonaMoralScotiabank              | Persona Moral de Scotiabank    | pNombrePerfil, pAlias, pEmail, pNumTelefono, pLimiteAbono                                                                                 |
      | SC_002_05_altaBeneficiarioPersonaFisicaOtroBanco              | Persona Física de otro banco   | pNombrePerfil, pNumCuenta, pAlias, pNumIdentificacion, pNombre, pApellidoPaterno, pApellidoMaterno, pEmail, pNumeroTelefono, pLimiteAbono |
      | SC_002_06_altaBeneficiarioPersonaFisicaScotiabank             | Persona Física de Scotiabank   | pNombrePerfil, pNumCuenta, pAlias, pEmail, pNumeroTelefono, pLimiteAbono                                                                  |
      | SC_002_07_altaBeneficiarioContribucionesGubernamentalesEstado | Contribuciones Gubernamentales | pTipoImpuesto, pAlias                                                                                                                     |
      | SC_002_08_altaBeneficiarioContribucionesGubernamentalesCiudad | Contribuciones Gubernamentales | pTipoImpuesto, pAlias                                                                                                                     |
      | SC_002_09_altaBeneficiarioContribucionesFederalesSAT          | Contribuciones Federales       | pTipoImpuesto, pAlias                                                                                                                     |
      | SC_002_10_altaBeneficiarioContribucionesFederalesDerechos     | Contribuciones Federales       | pTipoImpuesto, pAlias                                                                                                                     |

  Scenario Outline: <Escenario>
    When El Usuario Paga "<TipoPago>" con los datos "<Datos>"
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra la operación exitosa comprobando la descarga del comprobante
    Examples:
      | Escenario                                         | TipoPago                                    | Datos                                                                                                                              |
      | SC_002_11_pagoDeFactura                           | Factura                                     |                                                                                                                                    |
      | SC_002_12_pagoDeFacturaParcialConNumCliente       | Factura con Número de Cliente               | pImporte, pEsPagoParcial                                                                                                           |
      | SC_002_13_pagoDeFacturaTotalConNumCliente         | Factura con Número de Cliente               | pImporte, pEsPagoParcial                                                                                                           |
      | SC_002_14_pagoCipare                              | CIPARE                                      | pRegistroPatronal, pPeriodo                                                                                                        |
      | SC_002_15_pagoContribucionesGubernamentalesEstado | Contribuciones Gubernamentales del Estado   | pLineaCaptura, pImporte, pFechaLimitePago                                                                                          |
      | SC_002_16_pagoContribucionesGubernamentalesCiudad | Contribuciones Gubernamentales de la Ciudad | pLineaCaptura, pImporte                                                                                                            |
      | SC_002_17_pagoContribucionesFederalesDerechos     | Contribuciones Federales de Derechos        | pRFC, pRazonSocial, pDependenciaYEntidades, pPeriodicidad, pEjercicio, pPeriodo, pClaveReferenciaDPA, pCadenaDependencia, pImporte |
      | SC_002_18_pagoContribucionesFederalesSAT          | Contribuciones Federales de SAT             | pImporte, pLineaCaptura                                                                                                            |
      | SC_002_19_pagoNominaOtroBanco                     | Nómina                                      | pImporte, pReferenciaNumerica, pReferenciaAlfanumerica, pReferenciaEmpresa, pConcepto                                              |
      | SC_002_20_pagoNominaScotiabank                    | Nómina                                      | pImporte, pReferenciaNumerica, pReferenciaAlfanumerica, pReferenciaEmpresa, pConcepto                                              |
      | SC_002_21_pagoProveedoresPersonaMoralOtroBanco    | Proveedores de otro banco                   | pTipoBeneficiario, pImporte, pReferenciaNumerica, pConcepto, pIVA                                                                  |
      | SC_002_22_pagoProveedoresPersonaMoralScotiabank   | Proveedores de Scotiabank                   | pTipoBeneficiario, pImporte, pReferenciaNumerica, pIVA, pReferenciaAlfanumerica, pReferenciaEmpresa                                |
      | SC_002_23_pagoProveedoresPersonaFisicaOtroBanco   | Proveedores de otro banco                   | pTipoBeneficiario, pImporte, pReferenciaNumerica, pConcepto, pIVA                                                                  |
      | SC_002_24_pagoProveedoresPersonaFisicaScotiabank  | Proveedores de Scotiabank                   | pTipoBeneficiario, pImporte, pReferenciaNumerica, pIVA, pReferenciaAlfanumerica, pReferenciaEmpresa                                |

  Scenario Outline: <Escenario>
    When El usuario Transfiere desde un Origen a un Destino con los Datos "<Datos>"
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then El Sistema muestra la operación exitosa comprobando la descarga del comprobante
    Examples:
        | Escenario                                            | Datos                                                                                                              |
        | TC_002_25_transferenciaChequesMXNCreditoHipotecario  | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |
        | TC_002_26_transferenciaChequesMXNPrestamosPersonales | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |
        | TC_002_27_transferenciaTDCChequesMXN                 | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |
        | TC_002_28_transferenciaChequesMXNTDC                 | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |
        | TC_002_29_ChequesUSDChequesUSD                       | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |
        | TC_002_30_ChequesMXNChequesMXN                       | pProductoOrigen, pProductoDestino, pImporte, pReferenciaEmpresa, pReferenciaNumerica, pReferenciaAlfanumerica, ... |

  Scenario Outline: <Escenario>
    When El Usuario Administrador realiza la acción de "<Accion>" con los datos "<Datos>"
    Then El Sistema muestra los detalles correctamente que concuerdan con el "pResultadoEsperado"
    Examples:
      | Escenario                                                     | Accion                                         | Datos                                                                                                                                                                                        |
      | TC_002_31_administradorIngresarNoMancomunada                  | Ingresar a una Empresa                         |                                                                                                                                                                                              |
      | TC_002_32_administradorIngresarMancomunada                    | Ingresar a una Empresa                         |                                                                                                                                                                                              |
      | TC_002_33_administradorRechazarAprobacion                     | Aceptar o Rechazar una Aprobación              | pAccion                                                                                                                                                                                      |
      | TC_002_34_administradorAutorizarAprobacion                    | Aceptar o Rechazar una Aprobación              | pAccion                                                                                                                                                                                      |
      | TC_002_35_administradorEditarUsuarioNoMancomunada             | Editar un Usuario                              | pCampo                                                                                                                                                                                       |
      | TC_002_36_administradorEditarUsuarioMancomunada               | Editar un Usuario                              | pCampo                                                                                                                                                                                       |
      | TC_002_37_administradorCrearUsuarioNoMancomunada              | Crear un Usuario de una Empresa No Mancomunada | pPrimerNombre, pSegundoNombre, pApellidoPaterno, pApellidoMaterno, pCargo, pArea, pNumeroCelular, pVerificarNumeroCelular, pCorreoElectronico, pVerificarCorreoElectronico, pEsAdministrador |
      | TC_002_38_administradorCrearUsuarioAdministradorNoMancomunada | Crear un Usuario de una Empresa No Mancomunada | pPrimerNombre, pSegundoNombre, pApellidoPaterno, pApellidoMaterno, pCargo, pArea, pNumeroCelular, pVerificarNumeroCelular, pCorreoElectronico, pVerificarCorreoElectronico, pEsAdministrador |
      | TC_002_39_administradorCrearUsuarioMancomunada                | Crear un Usuario de una Empresa Mancomunada    | pPrimerNombre, pSegundoNombre, pApellidoPaterno, pApellidoMaterno, pCargo, pArea, pNumeroCelular, pVerificarNumeroCelular, pCorreoElectronico, pVerificarCorreoElectronico, pEsAdministrador |
      | TC_002_40_administradorCrearUsuarioAdministradorMancomunada   | Crear un Usuario de una Empresa Mancomunada    | pPrimerNombre, pSegundoNombre, pApellidoPaterno, pApellidoMaterno, pCargo, pArea, pNumeroCelular, pVerificarNumeroCelular, pCorreoElectronico, pVerificarCorreoElectronico, pEsAdministrador |

  Scenario Outline: <Escenario>
    When El Usuario Administrador consulta el resumen de "<Consulta>" con los datos "<Datos>"
    Then El Sistema comprueba que la descarga se hizo en el formato correspondiente
    Examples:
      | Escenario                                                    | Consulta                     | Datos                          |
      | TC_002_41_administradorConsultaLineaOperativaXML             | Linea Operativa              | pContrasenia, pToken, pFormato |
      | TC_002_42_administradorConsultaLineaOperativaPDF             | Linea Operativa              | pContrasenia, pToken, pFormato |
      | TC_002_43_administradorConsultaPrestamosPersonales           | Prestamos Personales         | pContrasenia, pToken           |
      | TC_002_44_administradorConsultaFondosInversionXML            | Fondos de Inversión          | pContrasenia, pToken, pFormato |
      | TC_002_45_administradorConsultaFondosInversionPDF            | Fondos de Inversión          | pContrasenia, pToken, pFormato |
      | TC_002_46_administradorConsultaCreditosHipotecariosXML       | Creditos Hipotecarios        | pContrasenia, pToken, pFormato |
      | TC_002_47_administradorConsultaCreditosHipotecariosPDF       | Creditos Hipotecarios        | pContrasenia, pToken, pFormato |
      | TC_002_48_administradorConsultaCuentasInversionXML           | Cuentas de Inversion         | pContrasenia, pToken, pFormato |
      | TC_002_49_administradorConsultaCuentasInversionPDF           | Cuentas de Inversion         | pContrasenia, pToken, pFormato |
      | TC_002_50_administradorConsultaCuentasChequeUSDPDF           | Cuentas Cheques USD          | pContrasenia, pToken, pFormato |
      | TC_002_51_administradorConsultaCuentasChequeUSDXML           | Cuentas Cheques USD          | pContrasenia, pToken, pFormato |
      | TC_002_52_administradorConsultaCuentasChequeMXNXML           | Cuentas Cheques MXN          | pContrasenia, pToken, pFormato |
      | TC_002_53_administradorConsultaCuentasChequeMXNPDF           | Cuentas Cheques MXN          | pContrasenia, pToken, pFormato |
      | TC_002_54_administradorConsultaCuentasLineaOperativaCSV      | Cuentas Linea Operativa      | pContrasenia, pToken, pFormato |
      | TC_002_55_administradorConsultaCuentasPrestamosPersonalesTXT | Cuentas Prestamos Personales | pContrasemia, pToken, pFormato |
      | TC_002_56_administradorConsultaCuentasFondosInversionCSV     | Cuentas Fondos Inversion     | pContrasenia, pToken, pFormato |
      | TC_002_57_administradorConsultaCreditosHipotecariosTXT       | Creditos Hipotecarios        | PContrasenia, pToken, pFormato |
      | TC_002_58_administradorConsultaCuentasInversionCSV           | Cuentas de Inversion         | pContrasenia, pToken, pFormato |
      | TC_002_59_administradorConsultaCuentasTDCMXNTXT              | Cuentas TDC MXN              | pContrasenia, pToken, pFormato |
      | TC_002_60_administradorConsultaCuentasChequeUSDCSV           | Cuentas Cheques USD          | pContrasenia, pToken, pFormato |
      | TC_002_61_administradorConsultaCuentasChequeMXNTXT           | Cuentas Cheques MXN          | pContrasenia, pToken, pFormato |