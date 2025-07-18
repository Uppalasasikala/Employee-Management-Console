# Employee Management Console Application
This project implements a simple console-based Employee Management system in Java. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on employee records, manage employee salaries, and view employee details. This application serves as a foundational example for console-based Java applications interacting with data.

## Features

The application provides the following functionalities:

* **Add Employee:** Create and add new employee records.
* **View Employee:** Display details of a specific employee.
* **Delete Employee:** Remove an employee record.
* **View All Employees:** List all existing employee records.

## Technologies Used

* **Java 11**

## How to Run

1.  Ensure you have **Java Development Kit (JDK) 11 or higher** installed on your system.
2.  Clone this repository to your local machine.
3.  Compile the Java source files.
4.  Run the main application class from your console.

## OOP Concepts Covered

This project illustrates the following fundamental OOP principles:

* **Inheritance:** (Implied through interface implementation, though not direct class inheritance in the provided summary, `EmployeeImpl` implements `IEmployee`).
* **Polymorphism:** Demonstrated through the `IEmployee` interface and its overridden methods in the `EmployeeImpl` class, allowing different implementations of common operations.
* **Encapsulation:** Achieved in the `Employee` class by declaring attributes (id, name, age, department, salary) as private and providing public methods (constructors, `toString()`) for controlled access.

## Project Structure (Key Classes)

* **`IEmployee` Interface:** Defines the contract for CRUD operations.
* **`EmployeeImpl` Class:** Provides concrete implementations for employee management operations using a `HashSet` to store `Employee` objects.
* **`Employee` Class:** Represents an employee, encapsulating their details. Includes `id`, `name`, `age`, `department`, and `salary` attributes.
* **`Company` Class:** (Optional, if implemented) Holds company information and an enum for `Departament`.
* **`Address` Class:** (Optional, if implemented) Contains address details and demonstrates `hashCode()` and `equals()` methods.
