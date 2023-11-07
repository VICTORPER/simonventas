Feature: consultarCotizacion
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login

  Scenario: Consultar cotizacion
    Given valido el ingreso exitoso
    When Doy click en el boton Consultar cotizacion
    And  Doy click en el boton Consultar cotizacion x rango de fechas
    And Lleno el formulario
      | compania   | seccion      |  producto   | numerodecotizacion   |  fechadesde  |   fechahasta     |
      | 2 - COMPANIA SEGUROS BOLIVAR S.A | 118 - ACCIDENTES PERSONALES INDIVID. | null | 1017100404501 | 01/06/2023 | 01/07/2023      |
    And Hago click en el boton Consultar
    And Doy click en el numero de cotizacion
    Then trae la informacion de la cotizacion

