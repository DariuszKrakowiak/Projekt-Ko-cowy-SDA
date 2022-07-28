Feature: Przypadek testowy
  Scenario Outline: Sprawdzenie czy ilosc defektow w zadaniu <int1> zawsze rowna sie <int2>
    Given Uruchomiona aplikacja MrBuggy 3 jako uzytkownik niezalogowany
    And Przejscie do zadania nr <int1>
    When Wykonanie polecenia z zadania nr <int1>
    Then Zadanie nr <int1> zawiera dokladnie <int2> defekt

    Examples:
    |int1|int2|
    | 1  | 1  |
    | 2  | 1  |
    | 3  | 1  |
    | 5  | 1  |
    | 6  | 1  |
    | 7  | 1  |
    | 8  | 1  |
    | 9  | 1  |
    | 10 | 1  |
    | 11 | 1  |
    | 12 | 1  |
    | 13 | 1  |
    | 14 | 1  |
    | 15 | 1  |
    | 16 | 1  |
    | 17 | 1  |
    | 18 | 1  |
    | 19 | 1  |
    | 20 | 1  |
    | 21 | 1  |
    | 22 | 1  |
    | 23 | 1  |
    | 24 | 1  |
