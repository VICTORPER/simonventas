Feature: Emision Tranquilidad Hijos
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login
    And  Doy click en el boton Consultar cotizacion
    And  Doy click en el boton Consultar cotizacion x rango de fechas
    And Lleno el formulario
      | compania   | seccion      |  producto   | numerodecotizacion   |  fechadesde  |   fechahasta     |
      | 2 - COMPANIA SEGUROS BOLIVAR S.A | 118 - ACCIDENTES PERSONALES INDIVID. | null | 1017100405201	| 01/06/2023 | 01/07/2023      |
    And Hago click en el boton Consultar
    And Doy click en el boton emitir

  Scenario: Emitir una poliza del producto Tranquilidad Hijos
    Given Me encuentro en la pantalla de emision
    When Doy clck en el check Autorizo datos
    And Doy click sobre el boton Agregar beneficiario
    And diligencio los campos siguientes
      | tipodocumento | numerodocumento | nombres | apellidos | sexo | parentesco | porcentaje |
      | CC - CEDULA DE CIUDADANIA | 1082914064 | victor | perez | MASCULINO | HIJO/A | 100 |
    And doy click en el boton Generar Poliza
    Then genera la poliza exitosamente