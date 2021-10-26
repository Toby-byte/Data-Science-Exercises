package CompareInterface;

import java.util.ArrayList;
import java.util.Collections;
// ved ikke hvordan dette virker
public class Person implements Comparable<Person> {
    private String name;
    private int Height;
    private int age;

    public Person(String name, int height, int age) {
        this.name = name;
        Height = height;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
        public int compareTo(Person personToCompareWith) {
        if (this.age < personToCompareWith.getAge()) {
            return -1;
        } else if (this.age > personToCompareWith.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return this.name + " " + this.age + " " + this.Height;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("Tobias",100,23);
        Person person2 = new Person("Harry",180,20);
        Person person3 = new Person("Name",149,67);
        Person person4 = new Person("Jk",178,34);
        Person person5 = new Person("Jane",143,54);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);

    }
}
