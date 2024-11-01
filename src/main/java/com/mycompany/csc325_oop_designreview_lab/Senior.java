package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class, inherits from Student.
 * Represents a senior student with a credit requirement.
 */
public class Senior extends Student {
    private int credits;

    public Senior(String name, int age, double gpa, int credits) {
        super(name, age, gpa);
        if (credits >= 85) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Senior{" + "name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + ", credits=" + credits + '}';
    }
}