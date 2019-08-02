package nl.loxia.fizzbuzz;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public List<Integer> generateNumbers(int number) {
        return IntStream.rangeClosed(1,15).mapToObj(Integer::valueOf).collect(Collectors.toList());
    }

    public List<Integer> duplicate(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(Integer::valueOf)
                .flatMap(value -> {return asList(value,value).stream();})
                .collect(Collectors.toList());
    }
}
