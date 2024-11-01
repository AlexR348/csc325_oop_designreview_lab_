package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class, inherits from Student.
 * Represents a freshman student with additional properties if needed.
 */
public class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        super(name, age, 0.0);  // Initial GPA can be set to 0.0 or default
    }

    @Override
    public String toString() {
        return "Freshman{" + "name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + '}';
    }
}
