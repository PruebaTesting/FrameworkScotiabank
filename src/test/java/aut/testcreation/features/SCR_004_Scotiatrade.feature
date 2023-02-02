Feature:

  Scenario: SC_004_01_HP SDB LF Cambio de clave de acceso a Usuario no Logueado
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_02_HP SDB LF Cambio de clave de acceso
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Envia Mensaje tu cambio de clave fue exitoso"

  Scenario: SC_004_03_TTF SDB LF Cambio de clave de acceso clave actual incorrecta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_04_TTF SDB LF Cambio de clave de acceso clave nueva incorrecta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_05_TTF SDB LF Cambio de clave de acceso clave nueva no coincide con la confirmada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_06_TTF SDB LF Cambio de clave de acceso clave nueva ya utilizada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_07_TTF SDB LF Cambio de clave de acceso no capturó numero de usuario
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje: "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_08_HP SDB LF Cambio de imagen
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Imagen valida
    Then El Usuario valida el cambio de imagen

  Scenario: SC_004_09_TTF SDB LF Cambio de imagen falta información
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Imagen invalido
    Then El Sistema muestra en pantalla el mensaje: "algo salió mal y no debe realizar cambios"

  Scenario: SC_004_10_HP SDB LF Cambio de e-mail
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail
    Then El Usuario valida los cambios de e-mail

  Scenario: SC_004_11_HP SDB LF Cambio de e-mail_con token
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail
    Then El Usuario ingresa el número de Token

  Scenario: SC_004_12_HP SDB LF Cambio de e-mail_con token_virtual
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail
    Then El Usuario ingresa el número de Token

  Scenario: SC_004_13_HP SDB LF Cambio de Pregunta Secreta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje: "Cambio de Pregunta Secreta"

  Scenario: SC_004_14_HP SDB LF Cambio de Pregunta Secreta_con token
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Usuario ingresa los datos para registrar número de Token

  Scenario: SC_004_15_TTF SDB LF Cambio de Pregunta Secreta_captcha incorrecto
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    And El Usuario ingresa los datos para registrar número de Token
    Then El Sistema muestra en pantalla el mensaje: "El sistema devuelve mensaje de error en la pantalla con el look and feel establecido"

  Scenario: SC_004_16_TTF SDB LF Cambio de Pregunta Secreta_caracter no permitido
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje: "favor de utilizar solo letras y numeros en su Pregunta"

  Scenario: SC_004_17_TTF SDB LF Cambio de Pregunta Secreta_no coinciden respuestas
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje: "La confirmacion de la pregunta secreta no coinciden"

  Scenario: SC_004_18_TTF SDB LF Cambio de Pregunta Secreta_pregunta ya usada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje: "Favor de Proporcionar otra pregunta que no haya utilizado"