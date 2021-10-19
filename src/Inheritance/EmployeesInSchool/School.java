package Inheritance.EmployeesInSchool;

public class School {
    public static void main(String[] args) {
        Headmaster headmaster = new Headmaster(50, enum_maleOrFemale.MALE,5,"Toby");
        It_admin it_admin = new It_admin(30, enum_maleOrFemale.FEMALE,8,"Susie");
        Teacher teacher = new Teacher(36, enum_maleOrFemale.FEMALE,8,"Tina");
        Janitor janitor = new Janitor(47, enum_maleOrFemale.MALE,10,"Bob");
        Student student = new Student("Jeff",17, enum_maleOrFemale.MALE);


    }
}
