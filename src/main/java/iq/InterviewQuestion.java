package iq;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class InterviewQuestion {

    private static Map<Character, List<Character>> getCharacterListMap(String str) {
        Map<Character, List<Character>> collect = Arrays.stream(str.chars()
                        .toArray())
                .mapToObj(i -> (char) i)
                .collect(groupingBy(character -> character));
        return collect;
    }

    public void findDuplicateCount(String str) {
        List<Character> characters = Arrays.stream(str.chars()
                        .toArray())
                .mapToObj(i -> (char) i)
                .collect(groupingBy(character -> character, counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("characters = " + characters);

        List<Character> uniqueChar = Arrays.stream(str.chars()
                        .toArray())
                .mapToObj(i -> (char) i)
                .collect(groupingBy(character -> character, counting()))
                .keySet().stream()
                .distinct()
                .toList();
    }

    public void findSecLargestInArray(int [] arr){
        Optional<Integer> sec = Arrays.stream(arr).boxed()
                .sorted(Integer::compareTo)
                .skip(1).findFirst();
        sec.ifPresent(integer -> System.out.println("sec = " + integer));
    }


    public static void main(String[] args) {
        InterviewQuestion interviewQuestion = new InterviewQuestion();
//        interviewQuestion.findDuplicateCount("Pankaj");
        interviewQuestion.findDuplicateCount("PankajKumarSinghIaminlovewithyou");

        int[] ints = {4, 2, 16, 2};
        interviewQuestion.findSecLargestInArray(ints);
    }

}
