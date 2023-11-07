Feature: Formulario Declaracion de asegurabilidad
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login
    And  Doy click en el boton Consultar cotizacion
    And  Doy click en el boton Consultar cotizacion x rango de fechas
    And Lleno el formulario
      | compania   | seccion      |  producto   | numerodecotizacion   |  fechadesde  |   fechahasta     |
      | 2 - COMPANIA SEGUROS BOLIVAR S.A | 47 - VIDA INDIVIDUAL | null |1017100409401 | 01/06/2023 | 01/07/2023      |
    And Hago click en el boton Consultar

  Scenario: Diligenciar formulario de declaracion de asegurabilidad
    Given que el sistema trajo la consulta
    When Doy click en el boton emitir
    When Respondo a las siguientes preguntas:
      | pregunta1   | pregunta2      |pregunta3   | pregunta4   |  pregunta5  |
      | Si | No |   No | No | No   |
    And doy click en el boton continuar
    Then redirecciona a popup de confirmacion de diligencia