# 🎓 Student Management System - JavaFX MVC

A simple JavaFX-based **Student Management System** developed using **IntelliJ**, **Scene Builder**, and **FXML** following the **MVC (Model-View-Controller)** design pattern.

This application includes:
- A Login screen ( **username: admin / pswd: 123** )
- A Student Registration form
- A Summary screen displaying student data in a TableView
  

📌  Note

    - This project is a standalone desktop application and does not connect to a database.
    - License -> It is part of academic work and is open for demonstration & learning purposes.


## 📁 Folder Structure
<img width="350" height="415" alt="image" src="https://github.com/user-attachments/assets/df797fb2-d50c-4c5a-a2e9-575928f2a69e" />


## 🚀 Features

### 1. Login Screen 🔐
- Username and password input fields
- Simple hardcoded authentication (`admin` / `123`)
- Displays alerts for incorrect or empty inputs
    <p align="left">
      <img src="https://github.com/user-attachments/assets/2681334f-62ba-4ee0-a60a-2ee1dee05477" width="480">
    </p>


### 2. Student Registration Form 📝
- Inputs: Full Name, Email, Gender (M/F), Course
- Buttons: Submit, Reset, View Summary, Logout
- Stores student data temporarily as object in memory via a static (`ArrayList`) in the CollectionStu model.
- Uses JavaFX form controls and input validation
    <p align="left">
      <img src="https://github.com/user-attachments/assets/dacbda47-3c1d-4803-9b98-8a772d24997f" width="480">
    </p>

### 3. Summary Screen 📊
- TableView displaying student data
- Columns: Name, Email, Gender, Course
- Buttons: Back to Registration, Logout, Reload
- Reload functionality populates the table
    <p align="left">
      <img src="https://github.com/user-attachments/assets/047f7aa4-5ebb-451b-a690-790856c9b2a8" width="480">
    </p>


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

