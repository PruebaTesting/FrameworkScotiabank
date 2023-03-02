Feature:

  Scenario: SC_004_01_GuíaDiaria
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace la consulta de Guia Diaria
    Then El Sistema muestra en pantalla el mensaje : "NOTA: Para dispositivos moviles no lo abre ya que no secuenta con internet"

  Scenario: SC_004_02_InformaciónDeMercados
    Given El Usuario se logea en la Home Page de ScotiaTrade
    When El Usuario hace la consulta de Información de Mercado
    Then El Sistema muestra en pantalla la información requerida

    Scenario: SC_004_03_ManualDeOperación
      Given El Usuario se logea en la Home Page de ScotiaTrade
      When El Usuario hace la consulta de Manual de Operacion
      Then El Sistema muestra en pantalla la información requerida