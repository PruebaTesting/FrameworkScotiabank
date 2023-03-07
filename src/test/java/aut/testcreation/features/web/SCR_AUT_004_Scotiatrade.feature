Feature:

  Scenario: SC_004_01_CambioDeClaveDeAccesoAUsuarioNoLogueado
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_02_CambioDeClaveDeAcceso
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje : "Envia Mensaje tu cambio de clave fue exitoso"

  Scenario: SC_004_03_CambioDeClaveDeAccesoClaveActualIncorrecta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario intenta hacer el Cambio de Clave Personal
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_04_CambioDeClaveDeAccesoClaveNuevaIncorrecta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal, con Clave Nueva Incorrecta
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_05_CambioDeClaveDeAccesoClaveNuevaNoCoincideConLaConfirmada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal, con Clave Nueva Incorrecta
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_06_CambioDeClaveDeAccesoClaveNuevaYaUtilizada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal, con Clave Nueva Incorrecta
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_07_CambioDeClaveDeAccesoNoCapturóNumeroDeUsuario
    Given El Usuario ingresa al HomePage de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal, sin ingresar Número de Usuario
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_08_CambioDeImagen
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Imagen valida
    Then El Usuario valida el cambio de imagen

  Scenario: SC_004_09_CambioDeImagenFaltaInformación
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Imagen invalido
    Then El Sistema muestra en pantalla el mensaje : "algo salió mal y no debe realizar cambios"

  Scenario: SC_004_10_CambioDeEmail
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail
    Then El Sistema muestra en pantalla el mensaje : "algo salió mal y no debe realizar cambios"

  Scenario: SC_004_11_CambioDeEmailConToken
    Given El Usuario ingresa al HomePage de ScotiaTrade
    When El Usuario hace el Cambio de e-mail, con Token
    Then El Sistema muestra en pantalla el mensaje : "Cambio de Pregunta Secreta"

  Scenario: SC_004_12_CambioDeEmailConTokenVirtual
    Given El Usuario ingresa al HomePage de ScotiaTrade
    When El Usuario hace el Cambio de e-mail, con Token
    Then El Sistema muestra en pantalla el mensaje : "Cambio de Pregunta Secreta"

  Scenario: SC_004_13_CambioDePreguntaSecreta
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Clave Personal, con Clave Nueva Incorrecta
    Then El Sistema muestra en pantalla el mensaje : "Datos Incorrectos,volver a  intentar mas tarde"

  Scenario: SC_004_14_CambioDePreguntaSecretaConToken
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail, con Token
    Then El Sistema muestra en pantalla el mensaje : "confirmación con el look and feel establecido"

  Scenario: SC_004_15_CambioDePreguntaSecretaCaptchaIncorrecto
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de e-mail, con Token
    Then El Sistema muestra en pantalla el mensaje : "error en la pantalla con el look and feel establecido"

  Scenario: SC_004_16_CambioDePreguntaSecretaCaracterNoPermitido
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje : "favor de utilizar solo letras y numeros en su Pregunta"

  Scenario: SC_004_17_CambioDePreguntaSecretaNoCoincidenRespuestas
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje : "La confirmacion de la pregunta secreta no coinciden"

  Scenario: SC_004_18_CambioDePreguntaSecretaPreguntaYaUsada
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace el Cambio de Pregunta Secreta
    Then El Sistema muestra en pantalla el mensaje : "Favor de Proporcionar otra pregunta que no haya utilizado"