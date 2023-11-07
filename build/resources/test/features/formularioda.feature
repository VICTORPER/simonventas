Feature: Formulario Declaracion de asegurabilidad
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login
    And  Doy click en el boton Consultar cotizacion
    And  Doy click en el boton Consultar cotizacion x rango de fechas
    And Lleno el formulario
      | compania   | seccion      |  producto   | numerodecotizacion   |  fechadesde  |   fechahasta     |
      | 2 - COMPANIA SEGUROS BOLIVAR S.A | 118 - ACCIDENTES PERSONALES INDIVID. | null | 1017100413701 | 01/06/2023 | 01/07/2023      |
    And Hago click en el boton Consultar

  Scenario: Diligenciar formulario de declaracion de asegurabilidad
    Given que el sistema trajo la consulta
    When Doy click en el boton emitir
    And  Diligencio  DECLARACION DE ASEGURABILIDAD
      | preguntauno | preguntados | preguntatres | preguntacuatro | preguntacinco |
      | Si | No | No | No | No |
    And  Diligencio  DECLARACION DE ASEGURABILIDAD Medica
      | preguntaseis | preguntasiete | preguntaocho | peso | altura | preguntanueve | preguntadiez |
      | No | No | No | 80 | 180 |  No  | No |
    And doy click en el boton continuar
    And doy click en el boton Si del pop up de confirmacion
    And Hago click en el boton aceptar del pop up de numero de declaracion de asegurabilidad
    Then redirecciona a la pantalla de confirmacion de cotizacion