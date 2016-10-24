package java112.labs2;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Student{

    String firstName = "Louis";
    String lastName = "Kaplan";
    Integer age = 30;
    Integer studentID = 112357;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getStudentID() {
        return studentID;
    } 

    public void setLastName(String newName){
        this.lastName = newName;
    }

}