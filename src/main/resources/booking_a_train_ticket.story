Narrative: A way to book train tickets correctly

Scenario: As a user I should not be able to select the destination same as the Source Location
Given I am in Zielona Góra
Given I want to book a train ticket
When I choose my Source Location as Zielona Góra
Then My destination location should not contain Zielona Góra as an option

Scenario: As a user I should be able to select the destination other than the Source Location
Given I am in Zielona Góra
And I want to book a train ticket
When Zielona Góra is chosen as the Source Location
Then I choose my Destination location as <destination>

Scenario: As a user I should be able to select the destination other than the Source Location
Given I am in Zielona Góra
And I want to book a train ticket
When Poznań is chosen as the Source Location
Then I choose my Destination location as <destination>

Examples:
|destination|
Wrocław
Poznań