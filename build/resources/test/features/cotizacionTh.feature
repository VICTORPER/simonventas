Feature: Formulario Declaracion de asegurabilidad
  Background:
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login

  Scenario: Diligenciar formulario de declaracion de asegurabilidad
    Given valido el ingreso exitoso
    When Doy click en el boton Cotizadores vida
    And  Doy click en el boton Portafolio Tranquilidad en vida
    And  Doy click en el boton siguiente
    And  Ingrese la clave del asesor "77557"
    And  Ingreso el producto "SEGURO TRANQUILIDAD HIJOS"
    And  Ingreso el numero de documento del tomador "5000100100"
    And  Lleno los siguientes campos del asegurado:
      | tipodocumento | numerodocumentoase  | ciudad |
      | TI - TARJETA DE IDENTIDAD | 1054550471 | 14000 - BOGOTA D.C.-CUNDINAMARCA |
    And doy click en aceptar Autoriza uso de datos? del tomador
    And  Doy click en el aceptar de Autoriza uso de datos? del asegurado
    And  Ingresar en la seccion Negociacion el valor asegurado "20000000"
    And  Doy click en el boton liquidar
    And  Doy click en el boton crear cotizacion
    And  Doy click en el boton suscribir de la pantalla de suscripcion
    Then crea la cotizacion exitosamente