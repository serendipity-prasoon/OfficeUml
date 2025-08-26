# OfficeUml: Java Office Management System — UML-Driven Design
[![Download Release](https://img.shields.io/badge/Release-Download-blue?logo=github)](https://github.com/serendipity-prasoon/OfficeUml/releases)

![OfficeUml banner](https://raw.githubusercontent.com/serendipity-prasoon/OfficeUml/main/assets/banner.png)

A compact, classroom-ready Java application for employee and client management. OfficeUml demonstrates core OOP concepts—inheritance, encapsulation, abstraction—and applies clean UML-driven design. Use this project to explore design patterns, class relationships, and a small desktop app architecture.

Badges
- Build: ![Java](https://img.shields.io/badge/Java-17-orange)
- License: ![MIT](https://img.shields.io/badge/License-MIT-green)
- Topics: ![topics](https://img.shields.io/badge/topics-oop%20%7C%20uml%20%7C%20design%20patterns-lightgrey)

Table of contents
- Features
- Design and UML
- Architecture and patterns
- Getting started
  - Download and run (release)
  - Build from source
- Core modules
- Usage examples
- Tests and validation
- Contributing
- License
- Topics

Features
- Employee management: create, update, query employee records.
- Client management: track clients, contacts, contracts.
- Role-based models: base Person class, Employee and Client subclasses.
- Encapsulation: private fields with controlled accessors.
- Abstraction: abstract services and interfaces for persistence and UI.
- Simple desktop UI: Swing-based interfaces for forms and lists.
- Modular code: clear packages for model, service, ui, persistence, util.
- Small set of design patterns: Factory, DAO, Singleton for configuration.

Design and UML 📐
- UML-first approach. The code follows a UML model that maps classes and relationships 1:1.
- Core UML elements:
  - Person (abstract)
    - fields: id, name, contactInfo
    - methods: getId(), getName(), getContactInfo()
  - Employee extends Person
    - fields: employeeId, role, department, salary
    - methods: clockIn(), clockOut(), assignTask()
  - Client extends Person
    - fields: clientId, company, contracts
    - methods: requestService(), addContract()
  - Service interfaces: EmployeeService, ClientService
  - Persistence: Dao<T> interface with concrete implementations (InMemoryDao, FileDao)
- Example UML diagram (rendered):  
  ![UML class diagram](https://raw.githubusercontent.com/serendipity-prasoon/OfficeUml/main/docs/uml-class-diagram.png)

Architecture and design patterns
- Layered architecture:
  - model — domain objects and DTOs
  - service — business logic, validation
  - persistence — data access objects (DAO)
  - ui — Swing forms and controllers
- Patterns used:
  - DAO: abstracts data access; swap InMemoryDao with FileDao.
  - Factory: create service instances without exposing concrete classes.
  - Singleton: central configuration and app state holder.
  - Observer (light): UI list views update when data changes.
- Focus: clarity over complexity. Each class owns one responsibility.

Getting started

Download and run (release)
- This repo publishes release artifacts. Download the runnable JAR from the Releases page and run it. Example file: OfficeUml-1.0.0.jar
- Releases: https://github.com/serendipity-prasoon/OfficeUml/releases
- Steps
  1. Visit the Releases page above.
  2. Download OfficeUml-1.0.0.jar (or the latest OfficeUml release).
  3. Run:
     - On macOS / Linux / Windows with Java installed:
       java -jar OfficeUml-1.0.0.jar
  4. The app opens a small desktop window. Use the menus to manage employees and clients.

Build from source
- Prerequisites
  - JDK 17 or later
  - Maven 3.6+ (or use the bundled Gradle wrapper if provided)
- Steps
  1. Clone the repo:
     git clone https://github.com/serendipity-prasoon/OfficeUml.git
  2. Build:
     mvn clean package
  3. Run the JAR from target:
     java -jar target/OfficeUml-1.0.0.jar
- If you prefer to run from your IDE:
  - Import as a Maven project.
  - Run the main class: com.officeuml.app.MainApp

Core modules (package map)
- com.officeuml.model
  - Person (abstract), Employee, Client, ContactInfo
- com.officeuml.service
  - EmployeeService, ClientService, ServiceFactory
- com.officeuml.persistence
  - Dao<T>, InMemoryDao<T>, FileDao<T>
- com.officeuml.ui
  - MainWindow, EmployeeForm, ClientForm, ListPanels
- com.officeuml.util
  - IdGenerator, JsonMapper (for simple file persistence)
- tests
  - unit tests for DAO and services

Usage examples
- Add an employee
  - Open Employees > New
  - Fill name, role, department, salary
  - Save
- Query employees
  - Employees > Search by department
  - List shows name, role, employeeId
- Add a client
  - Clients > New
  - Fill company, contact info
  - Add contract with start/end dates
- Small CLI helper
  - The project contains a minimal CLI under util/cli
  - Use it for quick import/export of JSON records

Code highlights
- Encapsulation example
  - Employee fields are private. Services expose controlled setters that validate input.
- Inheritance and abstraction
  - Person declares contact behavior. Employee and Client implement specifics.
- Service interface
  - EmployeeService defines create, update, list, delete. Implementations isolate storage logic.
- Simple persistence
  - FileDao uses JSON files under data/ with one file per entity type.
  - InMemoryDao uses ConcurrentHashMap for thread safety.

Testing and validation
- Unit tests focus on:
  - DAO correctness (CRUD)
  - Service validation rules (salary non-negative, required fields)
  - Id generation
- Run tests:
  mvn test
- Test data
  - sample-data/ includes JSON fixtures you can load via the Import menu.

Contributing
- Follow a simple rule: make small, reviewable changes.
- Workflow
  1. Fork the repo.
  2. Create a feature branch: feature/my-change
  3. Write tests for new behavior.
  4. Open a pull request with a clear title and description.
- Coding style
  - Keep classes focused.
  - Use JavaDoc on public APIs.
  - Keep methods short; prefer descriptive names.
- Issues
  - Open an issue for bugs or feature ideas.
  - Label issues with component (model, service, ui, persistence).

Project roadmap
- v1.1
  - Add SQLite persistence option.
  - Improve search across clients and employees.
- v1.2
  - Add role-based UI flows.
  - Add CSV import/export.
- Community contributions shape priorities.

Assets and screenshots
- UML class diagram: docs/uml-class-diagram.png
- App screenshot: assets/screenshot-main.png
- Icon set: assets/icons.png

Common commands
- Build:
  mvn clean package
- Run tests:
  mvn test
- Run from JAR:
  java -jar target/OfficeUml-1.0.0.jar
- Run the release JAR after download:
  java -jar OfficeUml-1.0.0.jar

Troubleshooting
- If the app does not start:
  - Check Java version: java -version
  - Confirm you downloaded the JAR from the Releases page: https://github.com/serendipity-prasoon/OfficeUml/releases
  - If persistence fails, inspect data/ for write permissions.

License
- This project uses the MIT license. See LICENSE file for details.

Acknowledgements and resources
- UML reference: "UML Distilled" by Martin Fowler
- Java Swing documentation
- JSON mapping: Jackson (if you use FileDao)

Repository topics
- abstraction, client-management, design-patterns, desktop-application, employee-management, encapsulation, inheritance, java, java-application, learning-project, object-oriented-programming, oop, shayanaminaei, software-design, uml

Release download link (again)
- Get the runnable JAR from the Releases page and execute OfficeUml-1.0.0.jar:
  https://github.com/serendipity-prasoon/OfficeUml/releases

Contact
- Raise issues or PRs on this GitHub repository to discuss changes, suggest features, or report bugs.