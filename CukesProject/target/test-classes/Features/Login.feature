Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login into application with username "hurma" and password "1234"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given User is on landing page
When User login into application with username "mekan" and password "2345"
Then Home page is populated
And Cards are displayed "false"