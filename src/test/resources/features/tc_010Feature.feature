Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Generación de 'Slip de salida' y almacenamiento en historial de la solicitud
    Given el usuario está en la página de carga de documentos
    When completa la carga y procesamiento de documentos
    Then el sistema genera el 'Slip de salida'
    And los documentos originales se guardan en el historial de la solicitud
    And los datos extraídos se almacenan en el historial de la solicitud