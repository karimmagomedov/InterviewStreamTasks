package assesmentTasks.OperatingPerson;

import assesmentTasks.Person;
import java.util.List;

public class SortPersonByAgeSolution {
  public static void main(String[] args) {
    List<Person> preparedPersons = Person.getPreparedPersons();
    long count = preparedPersons.stream().filter(p -> p.getAge() > 50).count();
    System.out.println(count);
  }
}
