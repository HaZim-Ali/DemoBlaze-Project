# DemoBlaze-Project
This project is an automated testing framework for the DemoBlaze web application, implemented using Selenium WebDriver and Cucumber in a Page Object Model (POM) structure.
It automates critical workflows such as user sign-up, product addition, cart validation, amount calculations, and checkout processes.



# Table of Contents
1- Overview

2- Project Structure

3- Test Scenarios

4- Setup Instructions

5- Technologies Used

6- Execution

7- Reporting

8- Contributing

9- Author


# Overview
This automation project is designed to validate the functionality of the DemoBlaze website.
The framework leverages Cucumber for behavior-driven testing and Selenium for browser automation.
The code is structured following the Page Object Model (POM) for improved readability, maintainability, and reusability.


# Project Structure
The following is the directory structure of the project:

```

_**DemoBlaze_HaZim-Aly/
│
├── resources/
│   └── Features/
│       ├── TC_001_Sign_Up.feature
│       ├── TC_002_AddProducts.feature
│       ├── TC_003_Cart.feature
│       ├── TC_004_Amount Calculation.feature
│       └── TC_005_Checkout.feature
│
└── test/
└── java/
├── Locators/
│   ├── AddProducts_Locate.java
│   ├── AmountCalculation_Locate.java
│   ├── Cart_Locate.java
│   ├── Checkout_Locate.java
│   └── Sign_Up_Locate.java
│
│
├── StepDefinitions/
│   ├── AddProducts_Steps.java
│   ├── AmountCalculation_Steps.java
│   ├── Cart_Steps.java
│   ├── Checkout_Steps.java
│   ├── Hooks.java
│   └── Sign_Up_Steps.java
│
└── TestRunners/
└── runnerClass.java
│
├── Resources/
│   ├── extent.properties
│   ├── pdf-config.yaml
│   └── spark-config.xml

```

# Key Components
* Features: Contains Cucumber .feature files describing test scenarios in Gherkin syntax.
* Locators: Contains classes for element locators implementing the Page Object Model.
* StepDefinitions: Houses step definitions linked to feature files.
* Resources: Includes configuration files for reporting (ExtentReports, YAML, XML).
* TestRunners: Contains the runnerClass.java file to execute tests.


# Test Scenarios
The following scenarios are covered in this project:

* Sign-Up Functionality
  Verify that a user can successfully sign up on the DemoBlaze website.

* Add Products
  Validate that products can be added to the cart.

* Cart Functionality
  Ensure the cart displays the correct items and prices.

* Amount Calculation
  Check that the total amount is correctly calculated based on added products.

* Checkout Process
  Verify that users can successfully complete the checkout process.



# Setup Instructions
**Prerequisites**

Ensure you have the following tools installed on your machine:

* **Java Development Kit (JDK):** Version 8 or higher.
* **Maven:** For dependency management.
* **IDE:** IntelliJ IDEA (recommended) or Eclipse.
* **Browser Drivers:** ChromeDriver (configured in system PATH).




# Technologies Used
* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **Test Framework:** Cucumber
* **Build Tool:** Maven
* **Reporting:** ExtentReports (HTML & PDF)
* **IDE:** IntelliJ IDEA



# Execution

## **Run Tests Using Maven**

Execute the tests using the following Maven command:

`mvn test

**Run Tests from IDE**

1. Navigate to the runnerClass.java file in the TestRunners package.
2. Right-click and select Run.



# Reporting
Test execution reports are generated using **ExtentReports**.
The following report formats are supported:

1. **HTML Reports:** Detailed visual reports.
2. **PDF Reports:** Configurable via pdf-config.yaml.
   Reports will be saved in the target directory after test execution.



# Contributing
Contributions are welcome! If you would like to improve this project:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description of the changes.



# Author
Developed by : **Eng.HaZim Aly**.

For inquiries or collaboration, feel free to reach out:

**Email:** hazimaly5@gmail.com
**LinkedIn:** www.linkedin.com/in/hazim-aly-161476325
**GitHub:** https://github.com/HaZim-Ali






# Future Enhancements
* **Parallel Execution:** Implement parallel test execution using TestNG or Cucumber.
* **CI/CD Integration:** Integrate with Jenkins or GitHub Actions for automated test runs.
* **Data-Driven Testing:** Use external data sources (Excel, JSON).
* **Cross-Browser Testing:** Add support for Firefox and Edge browsers.







