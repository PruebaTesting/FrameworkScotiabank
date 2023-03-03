Feature:

  Scenario: SC_004_35_OlvidoDeContraseña
    Given El Usuario se loguea en el Home Page
    When El Usuario realiza el cambio de Contrasenia
    Then El Sistema muestra en pantalla el mensaje : "El sistema confirma el  cambio"