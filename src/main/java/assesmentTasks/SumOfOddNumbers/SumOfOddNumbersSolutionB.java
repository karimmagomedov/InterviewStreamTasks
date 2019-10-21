package assesmentTasks.SumOfOddNumbers;

import java.util.stream.Stream;

public class SumOfOddNumbersSolutionB {
  public static void main(String[] args) {
    Integer reduce =
        Stream.iterate(0, n -> n + 1).filter(p -> p % 2 != 0).limit(100).reduce(0, Integer::sum);

    System.out.println(reduce);
  }
}
