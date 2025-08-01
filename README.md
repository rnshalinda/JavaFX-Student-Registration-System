# 🎓 Student Management System - JavaFX MVC

A simple JavaFX-based **Student Management System** developed using **IntelliJ**, **Scene Builder**, and **FXML** following the **MVC (Model-View-Controller)** design pattern.

This application includes:
- 🔐 A Login screen ( **username: admin, pswd: 123** )
- 📝 A Student Registration form
- 📊 A Summary screen displaying student data in a TableView

📌  Notes

    - This project is a standalone desktop application and does not connect to a database.
    - Student data is temporarily stored as object in memory via a static ArrayList in the CollectionStu model.
    - For demonstration purposes only.

## 📽️ Application Preview




## 📁 Folder Structure
<img width="322" height="438" alt="image" src="https://github.com/user-attachments/assets/1442c9c2-7afd-4e45-8210-eaba9a8e1ca7" />




## 🚀 Features

### 1. Login Screen
- Username and password input fields
- Simple hardcoded authentication (`admin` / `123`)
- Displays alerts for incorrect or empty inputs

### 2. Student Registration Form
- Inputs: Full Name, Email, Gender (M/F), Course
- Buttons: Submit, Reset, View Summary, Logout
- Stores student data in memory (`ArrayList`)
- Uses JavaFX form controls and input validation

### 3. Summary Screen
- TableView displaying student data
- Columns: Name, Email, Gender, Course
- Buttons: Back to Registration, Logout, Reload
- Reload functionality populates the table



## 🧰 Technologies Used

- **Java 11**
- **JavaFX 19** (`javafx-controls`, `javafx-fxml`)
- **Lombok 1.18.38** for model class annotations
- **Maven** for dependency management
- **Scene Builder** for creating FXML UIs
- **IntelliJ IDEA** for development



## 📦 Dependencies (pom.xml)

```xml
<dependencies>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>19</version>
    </dependency>
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-fxml</artifactId>
        <version>19</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.38</version>
    </dependency>
</dependencies>
```

## 🛠️ How to Run

1. Clone the repository:
```
git clone https://github.com/yourusername/Student-Management-System-JavaFX.git
```
2. Open the project in IntelliJ IDEA.

3. Make sure JavaFX SDK is properly configured in your IDE.

3. Run Main.java.
---

## 📄 License

This project is part of academic coursework and is open for learning and demonstration purposes.
