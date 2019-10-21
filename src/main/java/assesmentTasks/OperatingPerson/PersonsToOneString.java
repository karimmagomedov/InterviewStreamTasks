package assesmentTasks.OperatingPerson;

/*
* Дано: Список с Person
* Получить: Одну строку со всеми Person, разделённую ||
*
*
* */


import assesmentTasks.Person;
import java.util.List;

public class PersonsToOneString {
  public static void main(String[] args) {
    List<Person> preparedPersons = Person.getPreparedPersons();
  }
}
