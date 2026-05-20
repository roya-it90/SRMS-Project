# SRMS – Student Record Management System (Part 1)

This repository contains Part 1 of the Student Record Management System (SRMS).  
It represents the contribution of one team member responsible for developing the core backend structure using Java and Object-Oriented Programming (OOP).  
This part will serve as the foundation for the next development stages handled by the rest of the team.

---

## Project Overview

The purpose of this part is to establish the essential backend classes required for managing student records.  
The implementation focuses on applying OOP principles and preparing a clean, extendable structure for future system components such as the graphical user interface (GUI), database integration, and multithreading.

---

## Objectives

- Implement the main backend classes for student record management.
- Apply key OOP concepts:
  - Inheritance
  - Encapsulation
  - Class design and structure
- Provide a modular and scalable codebase for the next development phases.

---

## Project Structure

This part includes the following classes:

### Person  
A base class representing a general person in the system.  
Contains shared attributes such as name and ID.

### Student  
Inherits from the `Person` class.  
Includes student-specific attributes such as university ID, GPA, and department.

### Department  
Represents an academic department with its name and code.

### RecordManager  
Responsible for managing student records.  
Supports the following operations:
- Add a student  
- Delete a student  
- Search for a student  
- List all students  

### Main  
Contains the `main` method used to test the functionality of all classes included in this part.

---

## Technologies Used

- Java  
- Object-Oriented Programming (OOP)  
- NetBeans IDE  

Note:  
This part does not include GUI components or multithreading.  
It focuses solely on backend logic and class structure.

---

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/roya-it90/SRMS-Project.git


