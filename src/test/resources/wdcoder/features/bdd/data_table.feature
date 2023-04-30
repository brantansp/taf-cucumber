Feature: Datatable test

  Scenario: Datatable scenario
    Given username as
      | john |
      | jess |
    Then password as
      | john | john123 |
      | jess | jess123 |

  #This needs change in the DatatableType implementation as List
  Scenario: Datatabletype scenario without header using list
    Given usernamedatatabletype as list
      | jeff  | feff123  |
      | besos | besos123 |

  Scenario: Datatabletype scenario header using map
    Given usernamedatatabletype as map
      | username | password |
      | jeff     | feff123  |
      | besos    | besos123 |

  Scenario: Single column directly as map
    Given single column as map
      | username | ben    |
      | password | ben123 |