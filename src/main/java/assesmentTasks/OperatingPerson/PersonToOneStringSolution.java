package assesmentTasks.OperatingPerson;

import assesmentTasks.Person;
import java.util.List;
import java.util.stream.Collectors;

public class PersonToOneStringSolution {
  public static void main(String[] args) {
    List<Person> preparedPersons = Person.getPreparedPersons();
    String collect = preparedPersons.stream().map(Person::toString).collect(Collectors.joining(" || "));

    System.out.println(collect);
  }
}
