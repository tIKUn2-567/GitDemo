Feature: Application login
 
 Scenario: Home page default login
 Given user is on landing page
 When User login into application with username and password "pass123"
 Then home page is populated
 And cards are displayed
 
 Scenario: Home page default login
 Given user is on landing page
 When User login into application with username "Abhi" and password "pass1234"
 Then home page is populated
 And cards are displayed     
      
      
      
      
      
      
      
      
      
