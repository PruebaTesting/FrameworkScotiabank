Feature: Conjunto de Test para validar el acceso al sistema SSO mediante datos biométricos

  Scenario: SC_001_01_ingresoAlSistemaEnrolamientoClientesSSO
    Given El Usuario firma mediante SSO e ingresa a Aplicativo Biométricos
    Then El Sistema muestra la página de acceso al Sistema de Biométricos con su nombre "pNombre"

  # Precondición: Ejecutar el caso de prueba SC_001_01_ingresoAlSistemaEnrolamientoClientesSSO
  Scenario: SC_001_02_validaciónDeHuellasEmpleadoSucursalExitoso
    Given El Usuario captura su Huella
    Then El Sistema muestra una página de validación exitosa y WebScan con un menú con las opciones "pOpciones"

  Scenario: SC_001_03_consultaClienteNoEnrolado
    # está bien redactado?
    Given El Usuario realiza la Consulta de un Cliente para luego seleccionar un producto
    Then El Sistema muestra la Página de Enrolamiento

  # Precondición: Ejecutar el caso de prueba SC_001_03_consultaClienteNoEnrolado
  Scenario: SC_001_04_validaciónINESinHuellas
    Given El Usuario realiza una busqueda correcta de Cliente No Enrolado
    And El Usuario escanea el documento
    When El Usuario realiza la digitalizacion del consentimiento de tratamiento de datos INE
    Then El Sistema finaliza el Proceso de validación finaliza correctamente

  # Precondición: Ejecutar el caso de prueba SC_001_01_ingresoAlSistemaEnrolamientoClientesSSO
  Scenario: SC_001_06_validaciónHuellasClienteEnrolado
    Given El Usuario realiza una busqueda correcta de Cliente No Enrolado
    When El Usuario captura su Huella
    Then El Sistema muestra una pantalla de validación exitosa

