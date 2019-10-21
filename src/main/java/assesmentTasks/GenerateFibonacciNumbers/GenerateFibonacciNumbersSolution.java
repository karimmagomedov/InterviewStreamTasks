package assesmentTasks.GenerateFibonacciNumbers;

import java.util.stream.Stream;

public class GenerateFibonacciNumbersSolution {
  public static void main(String[] args) {
    final int number = 10;

    int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(number).map(i -> i[0])
        .mapToInt(v -> v).sum();

    System.out.println(sum);
  }
}
