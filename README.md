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

## Via Maven Command Line:

    mvn clean test

## Reporting
   Reports will be generated in:

    target/cucumber-reports
    target/surefire-reports