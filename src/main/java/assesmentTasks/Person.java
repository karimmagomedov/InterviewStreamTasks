package assesmentTasks;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private String lastname;
  private int age;

  public Person(String name, String lastname, int age) {
    this.name = name;
    this.lastname = lastname;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", lastname='" + lastname + '\'' +
        ", age=" + age +
        '}';
  }

  public static List<Person> getPreparedPersons() {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Adam", "Smith", 60));
    persons.add(new Person("Nick", "Pick", 100));
    persons.add(new Person("Ben", "Ten", 16));
    persons.add(new Person("Lemon", "Citrus", 1));

    return persons;
  }

  public static List<Person> getRepeatablePersons() {
    List<Person> persons = getPreparedPersons();
    persons.add(new Person("Adam", "Smith", 60));
    persons.add(new Person("Nick", "Pick", 100));
    persons.add(new Person("Ben", "Ten", 16));
    persons.add(new Person("Lemon", "Citrus", 1));

    persons.add(new Person("Nick", "Pick", 100));
    persons.add(new Person("Ben", "Ten", 16));
    persons.add(new Person("Nick", "Pick", 100));
    persons.add(new Person("Ben", "Ten", 16));

    return persons;
  }
}
