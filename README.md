# 🎓 University Management System - A Java OOPS Deep Dive

![Java](https://img.shields.io/badge/Language-Java-orange.svg)
![Concepts](https://img.shields.io/badge/Concepts-OOPS-blue.svg)
![Type](https://img.shields.io/badge/Type-Educational-green.svg)

---

## 📝 Overview

This project is a hands-on demonstration of Object-Oriented Programming (OOPS) principles using Java. It models a simple university's personnel structure, starting with a basic foundation and evolving into a more complex, robust, and well-organized system.

The primary goal is to provide a clear, practical example of how fundamental and advanced OOPS concepts are implemented and how they work together to create a flexible and maintainable application. This repository is perfect for learners looking to solidify their understanding of Java OOPS.

## ✨ Core Concepts Covered

This project was built in phases to intentionally demonstrate a wide range of OOPS concepts.

### Fundamental Concepts (Version 1.0)
- **Class & Object:** Blueprints (`Person`, `Student`) and their instances.
- **Inheritance:** `Student` and `Professor` inheriting from `Person`.
- **Polymorphism:** A single `Person` reference holding different object types (`Student`, `Professor`).
- **Abstraction (Abstract Class):** The `Person` class, which cannot be instantiated directly.
- **Encapsulation:** Using `private` attributes to protect data.
- **Constructors:** For initializing objects.
- **Keywords:** `this`, `super`, and `final`.

### Advanced Concepts (Version 2.0 & 3.0)
- **Multilevel Inheritance:** Creating a chain of inheritance (`Person` -> `Student` -> `ResearchStudent`).
- **Method Overloading:** Multiple `enrollInCourse` methods with different parameters in the `Student` class.
- **Method Overriding (with `super`):** Enhancing parent methods instead of completely replacing them.
- **Dynamic Method Dispatch:** The JVM's runtime decision to call the correct overridden method.
- **Interfaces:** Defining a contract (`SalaryCalculable`) for specific capabilities.
- **Enhanced Encapsulation:** Adding validation logic within setter methods for data integrity.

---

## 🌱 The Project's Evolution

This project was built iteratively in three distinct versions, each adding a new layer of sophistication.

### Version 1.0: The Foundation
* **Goal:** To build the core structure using fundamental OOPS principles.
* **Implementation:**
  * Created an `abstract` **`Person`** class as the base.
  * Defined **`Student`** and **`Professor`** classes that `extend` **`Person`**.
  * Implemented basic **polymorphism** by storing all objects in a `List<Person>`.
  * Introduced the **`SalaryCalculable`** `interface` for the `Professor` class.
  * Used the **`final`** keyword to create immutable data and non-overridable methods.

### Version 2.0: The "Pro" Upgrade
* **Goal:** To deepen the implementation by introducing more complex OOPS features.
* **Implementation:**
  * **Multilevel Inheritance:** Added the **`ResearchStudent`** class which `extends Student`, creating a three-level hierarchy.
  * **Method Overloading:** Added two versions of the `enrollInCourse()` method to the `Student` class.
  * **Enhanced Overriding:** The `ResearchStudent`'s `getRoleDetails()` method was modified to call `super.getRoleDetails()`, building upon the parent's logic.
  * **Setter with Validation:** Introduced a `setMajor()` method in `Student` to demonstrate robust encapsulation.

### Version 3.0: The Professional Polish
* **Goal:** To refactor the entire codebase for readability, maintainability, and adherence to best practices.
* **Implementation:**
  * **Code Organization:** Each class and interface was structured as it would be in a real project (e.g., `Person.java`, `Student.java`).
  * **Comments & Javadoc:** Added comprehensive comments and Javadoc-style explanations to clarify the purpose of classes, methods, and the OOPS concepts they demonstrate.
  * **Best Practices:** Added the `@Override` annotation to all overridden/implemented methods to improve code clarity and prevent bugs.
  * **Logic Refinement:** Improved the logic within methods (e.g., `getRoleDetails` now returns more descriptive strings) and separated concerns (e.g., removed printing from a `get` method).

---

## 📂 File Structure

The final project is organized into the following files:

```

/src
├── Person.java             \# Abstract base class for all people
├── Student.java            \# Represents a regular student
├── ResearchStudent.java    \# Represents a research student (extends Student)
├── Professor.java          \# Represents a professor
├── SalaryCalculable.java   \# Interface for salary-related calculations
└── UniversityManager.java  \# Main class to run the simulation

````

---

## 🚀 How to Run the Project

1.  **Prerequisites:**
    * Make sure you have the Java Development Kit (JDK) installed on your machine.

2.  **Compile the Code:**
    * Open a terminal or command prompt.
    * Navigate to the `src` directory containing all the `.java` files.
    * Run the Java compiler:
        ```sh
        javac *.java
        ```

3.  **Execute the Program:**
    * After successful compilation, run the main class:
        ```sh
        java UniversityManager
        ```

---

## 📊 Expected Output

Running the `UniversityManager` class will produce the following output in the console, demonstrating all the implemented features.

```text
--- University Role Call (Demonstrating Polymorphism) ---
University ID: 10 | Name: Jitesh
Role: Student | Major: Computer Science
----------------------------------------
University ID: 14 | Name: Adarsh
Role: Student | Major: Electronics
----------------------------------------
University ID: 21 | Name: Ashish
Role: Professor | Department: Computer Science
Salary: $15000.75
----------------------------------------
University ID: 20 | Name: Ajay
Role: Student | Major: Computer Science | Thesis Topic: AI Model Optimization
----------------------------------------

--- Method Overloading Test ---
Jitesh enrolled in course: Data Structures
Jitesh enrolled in course: CS301: Advanced Algorithms
````

-----

## 🔮 Future Scope

While this project successfully demonstrates a wide range of OOPS concepts, it can be extended further to build a more comprehensive application. Here are some ideas for future development:

  - **Introduce a `Course` Class:** Create a `Course` class with attributes like `courseCode`, `courseName`, `credits`, and a list of enrolled students.
  - **Develop Class Relationships (Association):**
      - Modify the `Student` class to hold a list of `Course` objects they are enrolled in.
      - Modify the `Professor` class to hold a list of `Course` objects they teach.
  - **Create a `University` Singleton Class:** Implement a central `University` class to manage lists of all students, professors, and courses, ensuring only one instance of the university exists.
  - **Implement Exception Handling:** Add custom exceptions for scenarios like a student enrolling in a full course or assigning a non-existent department to a professor.
  - **Add a Text-Based UI:** Create a simple command-line interface (CLI) to allow a user to add new students, enroll them in courses, and view university records interactively.
  - **Data Persistence:** Implement functionality to save the state of the university (all students, professors, etc.) to a file and load it back.
