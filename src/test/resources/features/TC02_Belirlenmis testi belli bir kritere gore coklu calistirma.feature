@task2
Feature: Belirlenmis testi cok sayida sitede calistirma



        Scenario Outline:
        Given Kullanici Defensx browsera yuklenir
        Then Kullanici test edilmesini istedigi sayfalari"<1>" acar
         And Kullanici browseri kapatir

        Examples:
        |1|
        |1|
        |3|

                ## ayni yapiyi aranacak kelime ve benzeri sekilde de uygulayabilirim.















