# 🎓 Student Grade Tracker

A secure Student Grade Tracker built with Spring Boot, Thymeleaf, and Spring Security.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3.5.14
- Spring Security
- Spring MVC
- Thymeleaf
- Maven

## ✨ Features
- Secure login system with authentication
- Add new students with name and grade
- View all students in a table
- Delete students
- Logout mechanism

## 🚀 How to Run
1. Clone the repo
   git clone https://github.com/mohsabbah7/students-app.git
2. Navigate to the project folder
   cd students-app
3. Run the application
   ./mvnw spring-boot:run
4. Open your browser and go to
   http://localhost:8080/students

## 👤 Default User
| Username | Password | Role |
|----------|----------|------|
| user | password | USER |
| admin | password | USER |

## 📁 Project Structure
- model - Student data class
- controller - StudentsController + LoginController
- service - Business logic for students and authentication
- config - Spring Security configuration
- templates - Thymeleaf HTML pages (login, students)
