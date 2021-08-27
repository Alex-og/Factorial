package findMatch;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Match<T> {
    public static void main(String[] args) {
        List<String> inputList = null;
        System.out.println(new Match<String>().findMatch(inputList, 2, (x -> x.contains("b"))));
    }

    public List<T> findMatch(List<T> list, int n, Predicate<T> predicate) {
        return list == null ? List.of() : list.stream().filter(predicate).limit(n).collect(Collectors.toList());
    }
}
