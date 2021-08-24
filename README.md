# guildEducation
Guild Education's take home project - **Dog shelter - Food Estimator Service**
This document includes details of **dog shelter - food estimator service** test suite, how to run the unit tests written for foodEstimatorService, prerequisites for the environment and how to view the report. 

**Test suite details: **

Function Test suite for foodEstimatorService is created using TestNG and it has total of 17 test cases in 3 different test suites. 

**Positive Test Cases** – To test that function is returning correct output for the valid input conditions and contains below 4 test cases 

ExampleCase with input parameters of 5 small dogs, 3 medium dogs, 7 large dogs and a leftover food supply of 17lbs 

last_month_remaining_as_decimal with input parameters of 5 small dogs, 3 medium dogs, 7 large dogs and a leftover food supply of 17.5 lbs 

total_number_of_dogs_equal_to_30 with input parameters of 15 small dogs, 13 medium dogs, 2 large dogs and a leftover food supply of 20 lbs 

last_month_remaining_is_zero with input parameters of 1 small dogs, 1 medium dogs, 1 large dogs and a leftover food supply of 0 lbs 

**Edge Cases** – To test edge case scenarios like number of dogs is zero or equal to 30 and contains 7 test cases 

**Error Cases** – To test input conditions that should result in error like number of dogs is < 0 or total number of all sized dogs is > 30 and contains 8 test cases (4 of them will fail) 

**Cases not Covered in the ACs** – To test the input condition where the leftover food supply from previous month is more than minimum needed. Currently the AC does not cover what should be the output of the function in this case.  

**Pre-requisites: **

Java version 1.8.0_291 must be downloaded and installed 

Eclipse (Version: 2021-06 (4.20.0)) must be downloaded and installed 

TestNG 7.4.0 plugin of eclipse must be downloaded and installed 

NOTE: Testng.xml file is currently created to run all the 4 test suites with 20 test cases. 

Instructions for running tests from Eclipse: 

Checkout the guildEducation repo from github location  

sjagannathan123/guildEducation: Guild Education's take home project (github.com) 

In Eclipse, Select File -> Open projects from FileSystem menu item 

Navigate to the checked-out folder of guildEducation repo and import the project into eclipse workspace 

Expand and right click on the testng.xml file located under the project folder 

Select Run As -> TestNG Suite option to run all the tests 

Once the test run is complete, HTML report will be generated by the name “emailable-report” under guildEducation\test-output folder 
