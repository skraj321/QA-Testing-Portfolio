# MakeMyTrip Flight Search Automation Framework

## Overview

This project is a Selenium Automation Framework developed to automate the flight search functionality of the MakeMyTrip website. The framework is built using Java, Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM) design pattern to ensure clean, reusable, and maintainable test automation.

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Explicit Waits
- Git & GitHub

---

## Framework Features

- Page Object Model (POM)
- Reusable Base Class
- Explicit Wait Utility
- TestNG Test Execution
- Screenshot Capture on Test Failure
- TestNG Listener
- Assertions for Validation
- Organized Project Structure

---

## Automated Test Scenario

The framework automates the following user workflow:

- Launch MakeMyTrip Website
- Close Initial Pop-up
- Select Trip Type
- Enter Source City
- Enter Destination City
- Select Travel Date
- Search Flights
- Verify Search Results

---

## Project Structure

```
MMTFlightAutomation
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base
│   │       ├── pages
│   │       ├── listeners
│   │       └── utilities
│   │
│   └── test
│       └── java
│           └── tests
│
├── Screenshots
├── pom.xml
├── testng.xml
└── README.md
```

---

## Design Pattern

This framework follows the **Page Object Model (POM)** design pattern, separating page elements from test logic to improve maintainability, readability, and scalability.

---

## How to Run

1. Clone the repository.
2. Import the project into Eclipse or IntelliJ IDEA.
3. Install Maven dependencies.
4. Run `testng.xml` as a TestNG Suite.
5. View execution results in the TestNG reports.

---

## Project Highlights

- Flight Search Automation
- Page Object Model (POM)
- Explicit Wait Synchronization
- Reusable Utility Classes
- Screenshot Capture on Failure
- Clean and Modular Framework Design

---

## Future Enhancements

- Cross-Browser Testing
- Data-Driven Testing using Excel
- Jenkins CI/CD Integration
- Parallel Test Execution
- Extent Reports

---

## Author

**Saheb Kumar**

GitHub: https://github.com/skraj321
