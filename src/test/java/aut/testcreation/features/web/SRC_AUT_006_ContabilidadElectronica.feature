Feature:

  Scenario: SC_006_01_ConsultaXmlTsysSinCuentaConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta sin cuenta, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_02_ConsultaXmlTsysConCuentaConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta con cuenta, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_03_ConsultaXmlTsysSinRFCReceptorConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta sin RFC receptor, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_04_ConsultaUnoEspecificoDeXmlTsys
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta sin RFC receptor
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_05_ConsultaXmlTsysCon2RFCReceptorConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta RFC receptor, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_06_ConsultaXmlTsysCon3RFCReceptorConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta RFC receptor, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_07_ConsultaXmlTsysCon4RFCReceptorConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta RFC receptor, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_08_ConsultaXmlTsysCon5RFCReceptorConFechas
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario hace la consulta RFC receptor, con fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_09_ValidarComboFechasInicioYFinalConsultaXMLsTSYS
    Given El Usuario se loguea en la pantalla Consulta XML´s TSYS
    When El Usuario selecciona las fechas
    Then El Sistema muestra en pantalla la lista de los xml s

  Scenario: SC_006_10_IngresoACMEUsuarioConUnRolAclaradorEstadosdeCuenta
    Given El Usuario se loguea en el Home Page
    When El Usuario selecciona el Rol "pRol"
    Then El Sistema muestra en pantalla la pantalla de Administración de XML´s TSYS

  Scenario: SC_006_11_ValidarLogPrecargaDeInformación
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_12_ValidarLogDeCargaDeInformación
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_13_ValidarLogDeCargaDeBalanzas
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_14_ValidarLogDeCargaDeFolios
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_15_ValidarLogDeCargaDeJournal
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_16_ValidarLogDeCargaDeReconfileTSYS
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_17_ValidarLogDeCargaDeTryBalance
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_18_ValidarLogDeCargaDeXmlTSYS
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_19_ValidarLogDeCargaDeEDL
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_20_ValidarLogDelFrontCME
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta la información Tipo de Log
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_21_IngresarAlSitioConContraseñaUsuarioConTodosLosRoles
    Given El Usuario se loguea en el Home Page
    When El Usuario selecciona el Rol "pRol"
    Then El Sistema muestra en pantalla la pantalla de Administración de XML´s TSYS

  Scenario: SC_006_22_GeneraciónDeXmlAuxiliarDeFoliosConNúmeroDeOrdenTodosLosAplicativos
    Given El Usuario se loguea en el Home Page
    When El Usuario selecciona las opciones de información
    Then El Sistema genera el XML correctamente

  Scenario: SC_006_23_ListadoDeXmlConsultaGeneral
    Given El Usuario se loguea en el Home Page
    When El Usuario selecciona las opciones de información
    Then El Sistema genera el XML correctamente

  Scenario: SC_006_24_ListadoDeBalanzasConsultaGeneralDeBalanzas
    Given El Usuario se loguea en el Home Page
    When El Usuario consulta el Listado de balanzas Empresas Reguladas
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_006_25_SalirDelSitio
    Given El Usuario esta logueado en el Sistema
    Then Click al Botón Salir