package edu.icet.sms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String email;
    private String gender;
    private String course;

    public Student(String name, String email, String gender, String course) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }
}
