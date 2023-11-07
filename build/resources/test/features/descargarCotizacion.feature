Feature: consultarCotizacion
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login
    And  Doy click en el boton Consultar cotizacion
    And  Doy click en el boton Consultar cotizacion x rango de fechas
    And Lleno el formulario
      | compania   | seccion      |  producto   | numerodecotizacion   |  fechadesde  |   fechahasta     |
      | 2 - COMPANIA SEGUROS BOLIVAR S.A | 118 - ACCIDENTES PERSONALES INDIVID. | null | 1017100413901 | 01/09/2023 | 01/07/2023      |
    And Hago click en el boton Consultar

  Scenario: descargar cotizacion
    Given que el sistema trajo la consulta
    When Doy click en el icono de impresora
    Then se descargar el archivo de resumen de cotizacion