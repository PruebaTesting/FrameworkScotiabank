Feature: Conjunto de Test para validar el funcionamiento correcto de los flujos de negocios
  correspondientes a Cash Managment

  Background:
    Given El Usuario se Logea en la página de CCOP con los datos "pUsuario", "pContasenia" y "pToken"

  Scenario Outline: <Escenario>
    When El Usuario crea un Tipo de Beneficiario <TipoBeneficiario> con los datos <Datos>
    And El Usuario confirma sus datos de autenticación con los datos "pContrasenia" y "pToken"
    Then Se le muestra al Usuario la creación exitosa del Beneficiario "pResultadoEsperado"
    Examples:
      | Escenario                                | TipoBeneficiario             | Datos                                                                                                                                 |
      | SC_002_01_altaBeneficiarioPagoDeFactura  | Pago de Servicios y Facturas | "pAlias" y "pNumCliente"                                                                                                              |
      | SC_002_02_altaBeneficiarioPagoDeFactura2 | Pago de Servicios y Facturas | "pAlias" y "pNumCliente"                                                                                                              |
      | SC_002_03_altaBeneficiarioPersonaMoral   | Persona Moral                | "pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion" y "pLimiteAbono"                                                   |
      | SC_002_04_altaBeneficiarioPersonaMoral2  | Persona Moral                | "pNombrePerfil", "pTipoCuenta", "pNumCuenta", "pNumIdentificacion" y "pLimiteAbono"                                                   |
      | SC_002_05_altaBeneficiarioPersonaFisica  | Persona Física               | "pNombrePerfil", "pTipoBanco", "pNumCuenta", "pNumIdentificacion", "pNombre", "pAoellidoPaterno", "pApellidoMaterno" y "pLimiteAbono" |
