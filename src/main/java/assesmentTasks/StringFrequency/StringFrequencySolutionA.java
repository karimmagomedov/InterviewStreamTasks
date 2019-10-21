package assesmentTasks.StringFrequency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequencySolutionA {
  public static void main(String[] args) {
    String s = "bbbbb ggggggg aaaaa bbbbb ggggggg aaaaa asdasdasd abbbbb ggggggg aaaaa";

    String[] strings = s.split(" "); // получаем массив из строки

    Map<String, List<String>>
        collect =               // получаем Map, где напротив каждой String лежит список с этой же String
        Arrays.stream(strings)  // получив длину списка, получаем и частоту
                .filter(str -> str.length() >= 5)
                .collect(
                    Collectors.groupingBy(
                        s1 -> s1, Collectors.mapping(s2 -> s2, Collectors.toList())));

    collect.forEach((k, v) -> System.out.println(k + " -- " + v.size()));
  }
}
