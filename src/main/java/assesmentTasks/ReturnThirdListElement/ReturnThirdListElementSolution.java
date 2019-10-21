package assesmentTasks.ReturnThirdListElement;

import java.util.Arrays;
import java.util.List;

public class ReturnThirdListElementSolution {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(543, 5, 4353, 2, 235);
    Integer integer = integers.stream().skip(2).findAny().orElse(0);
    System.out.println(integer);
  }
}
