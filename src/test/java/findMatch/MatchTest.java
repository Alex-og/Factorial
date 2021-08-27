package findMatch;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatchTest {

    @Test
    public void shouldFindTwoMatchString() {
        List<String> inputList = List.of("abc", "cgc", "bca", "ba", "bbb");
        List<String> expected = List.of("abc", "bca", "ba");
        List<String> actual =  new Match<String>().findMatch(inputList, 3, (x -> x.contains("b")));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNothingString() {
        List<String> inputList = List.of("acc", "cgc", "fca", "wea", "asq");
        List<String> expected = List.of();
        List<String> actual =  new Match<String>().findMatch(inputList, 3, (x -> x.contains("b")));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNothingBecauseEmptyString() {
        List<String> inputList = List.of();
        List<String> expected = List.of();
        List<String> actual =  new Match<String>().findMatch(inputList, 3, (x -> x.contains("b")));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTwoMatchInteger() {
        List<Integer> inputList = List.of(3, 56, 15, 32, 48, 4);
        List<Integer> expected = List.of(56, 32, 48);
        List<Integer> actual =  new Match<Integer>().findMatch(inputList, 3, (x -> x % 2 == 0));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTwoZerosInteger() {
        List<Integer> inputList = List.of(0, 0, 0, 0, 0);
        List<Integer> expected = List.of(0, 0);
        List<Integer> actual =  new Match<Integer>().findMatch(inputList, 2, (x -> x % 2 == 0));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNothingInteger() {
        List<Integer> inputList = List.of(3, 56, 15, 32, 48, 4);
        List<Integer> expected = List.of();
        List<Integer> actual =  new Match<Integer>().findMatch(inputList, 0, (x -> x % 2 == 0));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMatchInteger() {
        List<Integer> inputList = List.of(-56);
        List<Integer> expected = List.of(56);
        List<Integer> actual =  new Match<Integer>().findMatch(inputList, 1, (x -> x % 2 == 0));
        assertNotEquals(expected, actual);
    }

    @Test
    public void shouldFindNothingBecauseEmptyInteger() {
        List<Integer> inputList = List.of();
        List<Integer> expected = List.of();
        List<Integer> actual =  new Match<Integer>().findMatch(inputList, 3, (x -> x % 2 == 0));
        assertEquals(expected, actual);
    }
}