Feature: Loguearse en la pagina de SimonVentas

  Scenario: Login Simon Ventas
    Given que ingreso a la pagina http://10.1.20.15:2082/SimonQuotation/login
    When doy click en el boton login
    Then valido el ingreso exitoso