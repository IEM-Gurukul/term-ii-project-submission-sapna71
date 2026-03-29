[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Elevator Control System using State Design Pattern

## Problem Statement (max 150 words)

This project implements an Elevator Control System using the State Design Pattern to manage dynamic behavior efficiently. Traditional elevator systems rely heavily on conditional logic to handle states like moving up, moving down, idle, and door operations, making the system complex and difficult to maintain.

To address this, the system models each state as a separate class, allowing behavior to change dynamically at runtime. The elevator responds to floor requests by transitioning between states such as Idle, MovingUp, MovingDown, and DoorOpen. This modular approach improves readability, scalability, and maintainability while demonstrating real-world application of Object-Oriented Programming principles.

## Target User

- Building management systems
- Software developers learning design patterns
- Students studying Object-Oriented Programming

## Core Features

- Elevator movement simulation (up/down)
- State-based behavior control
- Door open and close functionality
- Efficient floor request handling
- Handling edge cases (same floor request)

## OOP Concepts Used

- Abstraction: State interface defines common behavior for all states
- Inheritance: Concrete state classes implement the State interface
- Polymorphism: Different states override behavior dynamically
- Exception Handling: Basic input validation can be added to handle invalid floor requests. Currently, the system assumes valid inputs but can be extended using try-catch blocks for robustness.
- Collections / Threads: Java Collection (Queue) is used to manage multiple elevator requests efficiently.
- Encapsulation: Elevator class maintains current state and floor data

## Proposed Architecture Description

This project uses the State Design Pattern.

The Elevator class acts as the context
The State interface defines behavior
IdleState, MovingUpState, MovingDownState, and DoorOpenState are concrete implementations

Each state controls the elevator's behavior, and transitions happen dynamically based on user requests.

## How to Run

Step 1: Navigate to source folder
```cd src```

Step 2: Compile the code
```javac *.java```

Step 3: Run the program
 ```java Main```


## Git Discipline Notes
This project adheres to a modular development workflow, ensuring each component of the State Design Pattern was independently implemented, tested, and verified before integration.

1. Commit Strategy
The repository reflects a "Feature-Driven Commit" discipline, where each commit represents a functional milestone in the elevator's lifecycle:

Atomic Commits: Each state (Idle, Moving, DoorOpen) was pushed as a separate unit to ensure isolation of logic.

Descriptive Tagging: Commit messages clearly indicate the specific behavioral implementation (e.g., "Implemented MovingUpState behavior" or "Added logic for IdleState").

Incremental Complexity: The workflow moved from defining the interface "contract" to implementing basic movement, and finally to complex queue management.
