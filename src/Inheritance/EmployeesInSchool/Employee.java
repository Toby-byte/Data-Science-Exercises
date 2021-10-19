package Inheritance.EmployeesInSchool;

public class Employee {
    String name;
    int age;
    enum_maleOrFemale gender;
    int yearsofExperience;

    public Employee(int age, enum_maleOrFemale gender, int yearsofExperience, String name) {
        this.age = age;
        this.gender = gender;
        this.yearsofExperience = yearsofExperience;
        this.name = name;
    }
}
