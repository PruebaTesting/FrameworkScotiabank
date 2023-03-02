Feature:

  Scenario: SC_004_31_LoginNuevoUsuario
    Given El Usuario se registra en ScotiaTrade
    When El Usuario realiza el cambio de Clave, Imagen, Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje : "cambio realizado con exito"

  Scenario: SC_004_32_Login
    Given El Usuario se registra en ScotiaTrade
    When El Usuario acepta el PopUp de información emergente
    Then El Sistema muestra en pantalla la información requerida

  Scenario: SC_004_33_LoginClaveIncorrecta
    Given El Usuario intenta registrarse en ScotiaTrade
    Then El Sistema muestra en pantalla el mensaje : "El usuario y o la clave es incorrecta"

  Scenario: SC_004_34_LoginUsuarioIncorrecto
    Given El Usuario intenta registrarse en ScotiaTrade
    Then El Sistema muestra en pantalla el mensaje : "el usuario debe tener 6 dígitos"