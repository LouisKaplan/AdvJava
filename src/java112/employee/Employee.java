package java112.employee;
import java.lang.*;

/**
 * This bean contains a series of variables.
 * The page will have instance variables for the following HTTP Request Parameters:
 * employeeId
 * firstName
 * lastName
 * socialSecurityNumber
 * department
 * roomNumber
 * phoneNumber
 * @author Louis Kaplan
 * @version 1.0
 */
public class Employee {

    /**
     * This is a constructor class
     */
    public Employee(){    }

    private String employeeId;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String department;
    private String roomNumber;
    private String phoneNumber;

    /**
     * getEmployeeId returns the value of the String employeeId.
     * @return employeeId is the value of the String employeeId.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * setEmployeeId sets the value of the String employeeId.
     * @param employeeId is the value of the String employeeId.
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * getFirstName returns the value of the String firstName.
     * @return firstName is the value of the String firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName sets the value of the String firstName.
     * @param firstName is the value of the String firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getLastName returns the value of the String lastName.
     * @return lastName is the value of the String lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName sets the value of the String lastName.
     * @param lastName is the value of the String lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getSocialSecurityNumber returns the value of the String socialSecurityNumber.
     * @return socialSecurityNumber is the value of the String socialSecurityNumber.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * setSocialSecurityNumber sets the value of the String socialSecurityNumber.
     * @param socialSecurityNumber is the value of the String socialSecurityNumber.
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * getDepartment returns the value of the String department.
     * @return department is the value of the String department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * setDepartment sets the value of the String department.
     * @param department is the value of the String department.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * getRoomNumber returns the value of the String roomNumber.
     * @return roomNumber is the value of the String roomNumber.
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * setRoomNumber sets the value of the String roomNumber.
     * @param roomNumber is the value of the String roomNumber.
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * getPhoneNumber returns the value of the String phoneNumber.
     * @return phoneNumber is the value of the String phoneNumber.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * setPhoneNumber sets the value of the String phoneNumber.
     * @param phoneNumber is the value of the String phoneNumber.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * toString returns the concatenated value of all the Employee variables.
     * @return returns the concatenated value of all the Employee variables.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", department='" + department + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}