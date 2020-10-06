# Knights - Simple Game - Spring App

## Completion date 02.07.2020

## Project Requirements
- Java 1.8 version
- Spring 2.3.0.RELEASE

# Opis Aplikacji

Knights - Aplikacja webowa utworzona w języku Java z wykorzystaniem Spring Framework implementuje wzorzec MVC 
oraz wzorzec strategii do szybkiego przełączania bazy danych z pamieci na tryb produkcyjny.
Aplikacja wykorzystuje Spring Boota, który łączy w całość moduły Spingowe, oparta została na
prostej bazie danych H2, która jest niszczona z każdym zamknięciem aplikacji.
Projekt korzysta z biblioteki Hibernate, która implementuje interfejsy JPA,
dostarczanej ze Spring Bootem. Aplikacja, korzysta z biblioteki JUnit, dzięki której utworzono kilka testów.
Do wykonania cześci frontendowej aplikacji wykorzystano Bootstrapa oraz bibliotekę JQuery i Thymeleaf.
Projekt korzysta z Mavena do zarządzania zależnościami aplikacji oraz do wspomagania procesu jej budowy.
Logowanie do aplikacji zostało wykonane z użyciem Spring Security. Aplikacja posiada dwie role użytkowników,
1. User1 - (Login: user1 Password: user1 ) ma mniejsze uprawnienia i może dodawać jedynie nowych rycerzy oraz przypisywać im zadania.
                                           Nie może natomiast podejrzeć, ani usuwać rycerzy.
2. User2 - (Login: user2 Password: user2 ) ma pełne uprawnienia, takie jakie powinien posiadać administrator.
	
Aplikacja powstała w ramach kursu "Podstawy Frameworka Spring" w celu dokładnego zapoznania się z możliwościami tego frameworka.

Aplikacja została wdrożona na serwer produkcyjny pod adresem: http://134.209.246.138:8080/login


# Description of Application
   Used techonologies:
   
   Backend:
   -Spring
   -Spring Boot
   -Spring Security
   -Hibernate
   -H2 Database 
   -JUnit
   -Maven
   
   Frontend:
   -Bootstrap
   -JQuery
   -Thymeleaf
  
  Application has two roles of users:
  1. User1 - (Login: user1 Password: user1 ) who has lower eligibility than User2. User1 can add new knights and assign them new tasks. However User1 can't view and delete knights.
  2. User2 - (Login: user2 Password: user2 ) who has full eligibility such as administrator.
  
  The Application was created within course "Basics of Spring Framework" to familiar with potential of this framework in details.
  
  Demo of app: http://134.209.246.138:8080/login
