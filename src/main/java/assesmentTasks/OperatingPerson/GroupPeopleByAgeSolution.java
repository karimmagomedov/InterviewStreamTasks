package assesmentTasks.OperatingPerson;

import assesmentTasks.Person;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupPeopleByAgeSolution {
  public static void main(String[] args) {
    List<Person> preparedPersons = Person.getRepeatablePersons();

    Map<Integer, List<Person>> collect =
        preparedPersons.stream().collect(Collectors.groupingBy(Person::getAge));
    collect.forEach((k,v) -> System.out.println(k + " --- " + v));
  }
}
