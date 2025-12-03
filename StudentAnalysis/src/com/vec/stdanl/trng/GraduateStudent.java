package com.vec.stdanl.trng;

public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(int studentId, String name, int age, String department, String thesisTitle) {
        super(studentId, name, age, department);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate" + super.toString() + ", Thesis=" + thesisTitle;
    }
}
