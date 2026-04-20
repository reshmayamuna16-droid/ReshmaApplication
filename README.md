# 🎓 Student Performance Prediction System

## 📌 Project Overview
The **Student Performance Prediction System** is a Java-based console application developed using IntelliJ IDEA and connected to a MySQL database.  

This project allows administrators to manage student records, update academic marks, calculate performance metrics, and predict student outcomes based on their scores.

It demonstrates core concepts of:
- Java (OOP)
- JDBC (Database Connectivity)
- SQL Operations
- Basic Data Analysis (Grade & Performance Prediction)

---

## 🚀 Features

### 👨‍💼 Admin Functionalities
- ➕ Add new student records
- ✏️ Update student details
- ❌ Delete student records
- 📋 Display all students
- 📝 Add subject-wise marks
- 📊 Generate result report (Average, Grade, Prediction)
- 🏆 Identify class topper

### 🔐 Authentication
- Simple login system (Admin access)

---

## 🧠 System Workflow

User Input → Login System → Dashboard Menu
↓
Choose Operation (Add / Update / Delete / Marks)
↓
JDBC Layer → MySQL Database
↓
Process Data (Average, Grade, Prediction)
↓
Display Output in Console

---

## 🛠 Technologies Used

- ☕ Java (Core Java, OOP)
- 🔌 JDBC (Java Database Connectivity)
- 🛢 MySQL Database
- 🧰 IntelliJ IDEA (Development Environment)

---

## 🗄 Database Details

- **Database Name:** `student_ai`
- **Table Name:** `students`

### Sample Table Structure:

| Column | Type |
|-------|------|
| id | INT |
| name | VARCHAR |
| department | VARCHAR |
| english | INT |
| hindi | INT |
| physics | INT |
| math | INT |
| chemistry | INT |
| science | INT |

---

## 📂 Project Structure

project/
├── DBConnection.java
├── Student.java
├── AddStudent.java
├── UpdateStudent.java
├── DeleteStudent.java
├── DisplayStudents.java
├── AddMarks.java
├── GradeCalculator.java
├── PerformancePredictor.java
├── RankGenerator.java
├── ResultReport.java
├── LoginSystem.java
├── AdminDashboard.java
├── StudentDashboard.java
└── Main.java

---

## ⚙️ How to Run the Project

1. Open the project in IntelliJ IDEA  
2. Ensure MySQL is running  
3. Create database:
   ```sql
   CREATE DATABASE student_ai;
4. Create students table (as per structure above)

5. Update database credentials in:
DBConnection.java

6. Run:
Main.java

## 🔐 Login Credentials

Username: admin
Password: 1234

---

## 📊 Grade Calculation Logic

| Average Marks | Grade |
| ------------- | ----- |
| 90+           | A+    |
| 75–89         | A     |
| 60–74         | B     |
| 50–59         | C     |
| <50           | Fail  |

## 📈 Performance Prediction Logic

| Average | Prediction        |
| ------- | ----------------- |
| 85+     | Excellent         |
| 60–84   | Average           |
| <60     | Needs Improvement |

## 🏆 Key Functional Highlights
1. Automatic average calculation
2. Dynamic grade generation
3. Basic AI-like prediction system
4. Topper identification using SQL query
5. Clean separation of logic into multiple classes

## ⚠️ Limitations
Console-based UI (no frontend)
Plain text password (not secure)
No exception handling standardization
No layered architecture (Controller/Service separation)
🚀 Future Enhancements

## This project can be upgraded into a full-stack Spring Boot application with advanced features:

## 🌐 Backend (Spring Boot)
Convert project into REST APIs
Use layered architecture (Controller → Service → Repository)
Connect using Spring Data JPA

## 📮 API Testing
Integrate with Postman for testing endpoints

## 📄 PDF Generation
Generate student report cards using iText PDF

## 📊 Chart Visualization
Display student performance using JFreeChart
Export charts as images

## 🔐 Security Improvements
Implement login authentication using Spring Security
Encrypt passwords using BCrypt

## 💻 Frontend (Optional)
Build UI using HTML, CSS, JavaScript or React

## 👩‍💻 Author

Reshma Gunasekaran

## 🙌 Conclusion

## This project demonstrates a strong foundation in:

Java programming
Database connectivity
Data processing logic

It serves as a stepping stone toward building advanced enterprise applications using Spring Boot and modern web technologies.
   
