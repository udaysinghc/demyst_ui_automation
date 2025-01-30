# Java Selenium Cucumber Maven Project Setup Guide

## Prerequisites

- Java JDK 8 or higher installed
- Maven installed
- IDE (Eclipse or IntelliJ IDEA)
  ##Configuration Steps
  Create a feature file in src/test/resources/features
  Generate step definitions using IDE's Cucumber plugin
  Implement step definitions in stepdefinitions package
  Create page objects in pages package
  Configure test runner in runners package
-

## Sample Feature File

Feature: Login Functionality

## Running Tests

## Via Maven Command Line for all test cases :

    mvn clean test 

## Via Maven Command Line for tag name by feature  test cases:
    mvn  clean install "-Dcucumber.filter.tags=@non-html"


## Reporting
   Reports will be generated in:

    target/cucumber-reports
    target/surefire-reports
## Running Tests on editor maven by tag name
    clean install -Dcucumber.filter.tags=@non-html


