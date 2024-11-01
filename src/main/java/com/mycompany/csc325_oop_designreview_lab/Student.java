package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student class, which represents a student with a name, age, GPA, and address.
 * Inherits from the Human class and implements abstract methods.
 */
public class Student extends Human {
    private double gpa;       // Student's GPA
    private String address;   // Address of the student

    /**
     * Constructor for the Student class.
     * @param name The name of the student.
     * @param age The age of the student.
     * @param gpa The GPA of the student.
     */
    public Student(String name, int age, double gpa) {
        super(name, (short) age);  // Explicitly cast age to short if needed
        this.gpa = gpa;
    }

    /**
     * Sets the GPA of the student.
     * @param gpa The GPA to set.
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Gets the GPA of the student.
     * @return The GPA of the student.
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the address of the student.
     * Implementation required by the Human superclass.
     * @param address The address to set.
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the address of the student.
     * Implementation required by the Human superclass.
     * @return The address of the student.
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Returns a string representation of the Student object.
     * @return A string with the student's name, age, GPA, and address.
     */
    @Override
    public String toString() {
        return "Student{" + "name=" + super.getName() + ", age=" + super.getAge() + ", gpa=" + gpa + ", address=" + address + '}';
    }
}
