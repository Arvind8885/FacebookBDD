Feature: Register Facebook application

Scenario: Create New Users

Given user on facebook site
When user add "<firstName>" and "<lastName>" and "<mobileNumber>" and "<passwword>"


Examples: 

|firstName|lastName|mobileNumber|password|
|Arvind|Sangale|7774084444|Arvind@123|
|Anurag|Sangale|9881968888|Anurag@123|
|Snehal|Sangale|7028046961|Snehal@123|
|Shamrao|Sangale|9130614444|Shamrao@123|