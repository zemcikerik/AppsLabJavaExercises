package sk.zemco.appslabexercises.backend;

import sk.zemco.appslabexercises.ExerciseApp;
import sk.zemco.appslabexercises.Person;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionExercises {

    public static void createListAndPrintItsElements() {
        ArrayList<Integer> list = createIntegerArrayListWith(1, 1, 1, 2, 2, 3, 4, 5);

        if (list.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            list.forEach(System.out::println);
        }
    }

    // purposefully avoiding Arrays.asList(List<T>) in this exercise
    private static ArrayList<Integer> createIntegerArrayListWith(Integer... numbers) {
        ArrayList<Integer> list = new ArrayList<>(numbers.length);

        //noinspection UseBulkOperation
        Arrays.stream(numbers).forEach(list::add);
        return list;
    }

    public static <T> void addIfNotExists(List<T> list, T element) {
        if (!list.contains(element)) {
            list.add(element);
        }
    }

    public static void deleteAllEvenNumbers(List<Integer> list) {
        list.removeIf(num -> num % 2 == 0);
    }

    public static List<Integer> multiplyByLengthWithStreams(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * numbers.size())
                .collect(Collectors.toList());
    }

    public static int getPeopleBudgetWithStreams(Person[] people) {
        // this exercise was solved using streams
        return ExerciseApp.getPeopleBudget(people);
    }

    public static boolean checkIfPeopleNamesContainLetter(Person[] people) {
        return checkIfPeopleNamesContainLetter(people, 'a');
    }

    public static boolean checkIfPeopleNamesContainLetter(Person[] people, char letter) {
        return Arrays.stream(people)
                .map(Person::getName)
                .flatMapToInt(String::chars)
                .anyMatch(nameLetterCode -> nameLetterCode == letter);
    }

    public static void createSetAndPrintItsElements() {
        HashSet<Integer> set = new HashSet<>(List.of(1, 1, 1, 2, 2, 3, 4, 5));
        set.forEach(System.out::println);
    }

    public static void createMapAndPrintItsContent() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);

        map.entrySet().stream()
                .map(entry -> String.format("%s -> %d", entry.getKey(), entry.getValue()))
                .forEach(System.out::println);
    }

    public static <K, V> void addToMapIfAbsent(Map<K, V> map, K key, V value) {
        map.putIfAbsent(key, value);
    }

}
