package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StreamTipsAndTricksTest {

    StreamTipsAndTricks tipsAndTricks;

    @BeforeAll
    public void init() {
        tipsAndTricks = new StreamTipsAndTricks();
    }

    @Test
    void getMap() {
        String[] list = {"river", "stream", "lake", "harbor", "bay", "ocean"};
        Map<String, Integer> map = tipsAndTricks.getMap(list);
        System.out.println("map = " + map);
        Assertions.assertEquals(6, map.get("stream"));
    }

    @Test
    void getMapWhenValueIsDuplicate() {
        String[] list = {"river", "stream", "lake", "harbor", "bay", "ocean", "lake"};
        Map<String, List<String>> duplicateKeyMap = tipsAndTricks.getMapWithDuplicateKey(list);
        System.out.println("map = " + duplicateKeyMap);
        Assertions.assertEquals(2, duplicateKeyMap.get("lake").size());
    }

    @Test
    void sortByLengthOptimized() {
        String[] list = {"river", "stream", "lake", "harbor", "bay", "ocean"};
        List<String> sortByLength = tipsAndTricks.sortByLengthOptimized(list);
        Assertions.assertEquals("bay", sortByLength.get(0));
        Assertions.assertEquals("harbor", sortByLength.get(5));
    }

    @Test
    void groupBySimpleCondition() {
        Map<Department, List<Person>> departmentListMap = tipsAndTricks.groupBySimpleCondition();
        printMap(departmentListMap);
    }

    private void printMap(Map<Department, List<Person>> map) {
        map.forEach((department, people) -> {
            System.out.println(department + " -> " + people);
        });
    }

    @Test
    void groupBySimpleConditionForId() {
        Map<Department, List<Integer>> departmentListMap = tipsAndTricks.groupBySimpleConditionForId();
        System.out.println("departmentListMap = " + departmentListMap);
    }

    @Test
    void distinctDepartmentsSalaryPairs() {
        Map<Pair, List<Integer>> pairListMap = tipsAndTricks.distinctDepartmentsSalaryPairs();
        System.out.println("pairListMap = " + pairListMap);
    }

    @Test
    void allPersonInDepartment() {
        System.out.println(tipsAndTricks.allPersonInDepartment());
    }

    @Test
    void allPersonInDepartmentAvgSalary() {
        System.out.println(tipsAndTricks.allPersonInDepartmentAvgSalary());
    }

    @Test
    void allPersonInDepartmentMaxSalary() {
        System.out.println(tipsAndTricks.allPersonInDepartmentMaxSalary());
    }

    @Test
    void findDuplicateWordCountTest() {
        String sentence = "alex brian charles alex charles david eric david";
        Map<String, Integer> duplicateWordCount = tipsAndTricks.findDuplicateWordCount(sentence);
        System.out.println("duplicateWordCount = " + duplicateWordCount);
        Map<String, Integer> onlyDuplicate = duplicateWordCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("onlyDuplicate = " + onlyDuplicate);
    }

    @Test
    void removeDuplicatesFromListTest() {
        List<Person> persons = StaticData.persons;
        TreeSet<Person> removedDuplicatesBasedOnNames = tipsAndTricks.removeDuplicatesFromList(persons);
        removedDuplicatesBasedOnNames.forEach(person -> System.out.println(person.id() + " = " + person.name()));
    }
}