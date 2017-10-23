Feature: Slot Rating
@TestCase_001
  Scenario: TestCase_001
    Given Make initial setup   			
  Scenario Outline: TestCase_001  	
    Given Create New Line of Test Result with "Player Enrollment", "", "" and ""
    Given Launch HALo url in "Chrome" browser
    When Login as <User> user
    Then Check login sucessfull
    Then Enroll <No_Of_Players> <PlayerType> Player
    Then Property play PopUp
    Then Logout
    Then User close browser
    
    Examples: 
      | User   | No_Of_Players | PlayerType  |
      | "IP"   |             1 | "Marketing" |      
    
    

@TestCase_002
  Scenario: TestCase_002
    Given Make initial setup   			
  Scenario Outline: TestCase_002  	
    Given Create New Line of Test Result with "Player Enrollment", "", "" and ""
    Given Launch HALo url in "Chrome" browser
    When Login as <User> user
    Then Check login sucessfull
    Then Enroll <No_Of_Players> <PlayerType> Player
    Then Property play PopUp
    Then Logout
    Then User close browser
    
    Examples: 
      | User   | No_Of_Players | PlayerType  |
      | "IP"   |             1 | "Marketing" |      
    
       	

  @TestCase_003
  Scenario: TestCase_003
    Given Make initial setup   			
  Scenario Outline: TestCase_003  	
    Given Create New Line of Test Result with "Player Enrollment", "", "" and ""
    Given Launch HALo url in "Chrome" browser
    When Login as <User> user
    Then Check login sucessfull
    Then Enroll <No_Of_Players> <PlayerType> Player
    Then Property play PopUp
    Then Logout
    Then User close browser
    
    Examples: 
      | User   | No_Of_Players | PlayerType  |
      | "IP"   |             1 | "Marketing" |
      
    