package Inheritance.EmployeesInSchool;

public class Student {
    String name;
    int age;
    enum_maleOrFemale gender;

    public Student(String name, int age, enum_maleOrFemale gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
