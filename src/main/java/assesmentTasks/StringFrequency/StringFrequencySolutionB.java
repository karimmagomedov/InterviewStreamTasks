package assesmentTasks.StringFrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequencySolutionB {
  public static void main(String[] args) {
    String s = "bbbbb ggggggg aaaaa bbbbb ggggggg aaaaa asdasdasd abbbbb ggggggg aaaaa";

    String[] strings = s.split(" "); // получаем массив из строк

    Map<String, Long> collect =
        Arrays.stream(strings)
            .filter(p -> p.length() >= 5)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    collect.forEach((k, v) -> System.out.println(k + " -- " + v));
  }
}
