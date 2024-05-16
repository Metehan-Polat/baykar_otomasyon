Feature: Acik Pozisyon
  Background:
  Scenario Outline: Pozisyon
    Given "<Browser>" ı  ac
    And Baykar sayfasına git
    When Acik Pozisyonlara tikla
    Then Tüm acik pozisyonlara tikla
    When Is ilani araya gel
    Then Aramayan Akıllı Web Sistemleri Yazılım Test Uzmanı yaz
    And Gelen Sonuca tikla
    And Arama ve gelen sonucu karsilastir
    And Kapat

    Examples:
      | Browser |
      | Chrome  |
