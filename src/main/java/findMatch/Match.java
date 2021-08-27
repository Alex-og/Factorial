package findMatch;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Match<T> {

    public List<T> findMatch(List<T> list, int n, Predicate<T> predicate) {
        return list.stream().filter(predicate).limit(n).collect(Collectors.toList());
    }
}
