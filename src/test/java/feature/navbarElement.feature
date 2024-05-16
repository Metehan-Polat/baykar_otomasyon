Feature: Navbar
  Background:
    Scenario Outline: Navbar Elementlerde gezme
      Given "<Browser>" ı  ac
      And Baykar sayfasına git
      When Kariyer'e gel
      Then İstatistik'e tikla
      And Yerleskemiz'e tikla
      And Sundugumuz Faydalar'a tikla
      And Sosyal Alanlar'a tikla
      And Acik Pozisyonlara tikla
      When Staj'a gel
      Then Staj Donemlerine tikla
      And Staj SSS'ye tikla
      And SSS'ye tikla
      And EN'ye tikla
      And Baykar'a tıkla
      And Kapat

      Examples:
        | Browser |
        | Chrome  |
