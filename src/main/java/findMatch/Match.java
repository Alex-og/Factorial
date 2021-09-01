package findMatch;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Match<T> {

    public List<T> findMatch(List<T> list, int n, Predicate<T> predicate) {
        /*
        Here must be the handling of exceptions, for example: list or predicate == null.
         */
        return list.stream().filter(predicate).limit(n).collect(Collectors.toList());
    }

    public Optional<List<T>> findMatchWithOptional(List<T> list, int n, Predicate<T> predicate) {
        return Optional.of(list.stream().filter(predicate).limit(n).collect(Collectors.toList()));
    }
}
