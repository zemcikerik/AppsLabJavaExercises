package sk.zemco.appslabexercises;

import sk.zemco.appslabexercises.warrior.BattleResult;
import sk.zemco.appslabexercises.warrior.Item;
import sk.zemco.appslabexercises.warrior.Warrior;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// TODO: update javadoc
public final class ExerciseApp {

    /**
     * Returns distance traveled by snail
     * trying to reach top of a tower via stairs.
     *
     * @param stepHeight height of one step
     * @param stepLength length of one step
     * @param towerHeight height of the tower
     *
     * @return distance traveled by snail
     */
    public static double snailDistance(double stepHeight, double stepLength, double towerHeight) {
        double stepCount = towerHeight / stepHeight;
        return stepCount * stepLength + towerHeight;
    }

    /**
     * Multiplies all elements of an array by it's length.
     *
     * @param array target array
     * @return the same {@code array} instance
     */
    public static int[] multiplyByLength(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] *= length;
        }

        return array;
    }

    /**
     * Checks how many of the three values are equal.
     *
     * @param a value to check
     * @param b value to check
     * @param c value to check
     *
     * @return number of equal values
     */
    public static int equalValues(int a, int b, int c) {
        if (a == b || a == c) {
            return b == c ? 3 : 2;
        }
        return b == c ? 2 : 0;
    }

    /**
     * Checks if input values would create a valid triangle.
     *
     * @param a length of a side of the triangle
     * @param b length of a side of the triangle
     * @param c length of a side of the triangle
     *
     * @return {@code true} if triangle could be created, otherwise {@code false}
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }

    /**
     * Determines whether or not it's possible to split a pie fairly between people.
     *
     * @param total number of slices
     * @param people number of people
     * @param each slices per person
     *
     * @return {@code true} if pie can be split fairly, otherwise {@code false}
     */
    public static boolean equalSlices(int total, int people, int each) {
        return people * each <= total;
    }

    /**
     * Checks if an input string is a palindrome.
     *
     * @param text string to check
     * @return {@code true} if {@code text} is palindrome, otherwise {@code false}
     */
    public static boolean checkPalindrome(String text) {
        int length = text.length();

        for (int i = 0; i < length / 2; i++) {
            char leftChar = text.charAt(i);
            char rightChar = text.charAt(length - i - 1);

            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public static int differenceMinMax(int[] numbers) {
        if (numbers.length < 2) {
            return 0;
        }

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return max - min;
    }

    public static int warOfNumbers(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int evenSum = Arrays.stream(numbers).filter(num -> num % 2 == 0).sum();
        int oddSum = Arrays.stream(numbers).filter(num -> num % 2 == 1).sum();

        return Math.abs(evenSum - oddSum);
    }

    public static boolean checkEnding(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean canCapture(String pos, String pos2) {
        return pos.charAt(0) == pos2.charAt(0)
                || pos.charAt(1) == pos2.charAt(1);
    }

    public static String getStudentInfo(Student student) {
        return String.format("%d, %s, %s", student.getStudentNumber(), student.getPhoneNumber(), student.getAddress());
    }

    public static int getPeopleBudget(Person[] people) {
        return Arrays.stream(people)
                .map(Person::getBudget)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static String getFormattedEmployeeInfo(Employee employee) {
        JobPosition jobPosition = employee.getJobPosition();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s %s, %s, salary: %s eur",
                employee.getName(),
                employee.getSurname(),
                jobPosition.getName(),
                decimalFormat.format(jobPosition.getSalary()));
    }

    public static BattleResult battleOfWarriors(Warrior warrior1, Warrior warrior2) {
        int force1 = getWarriorForce(warrior1);
        int force2 = getWarriorForce(warrior2);

        if (force1 == force2) {
            decrementHealth(warrior1);
            decrementHealth(warrior2);
            return BattleResult.DRAW;
        }

        if (force1 > force2) {
            transferItemsAndDecrementHealth(warrior1, warrior2);
            return BattleResult.FIRST_WINS;
        }

        transferItemsAndDecrementHealth(warrior2, warrior1);
        return BattleResult.SECOND_WINS;
    }

    private static int getWarriorForce(Warrior warrior) {
        return warrior.getLife() + warrior.getMuscle() + warrior.getSpeed();
    }

    private static void decrementHealth(Warrior warrior) {
        warrior.setLife(warrior.getLife() - 1);
    }

    private static void transferItemsAndDecrementHealth(Warrior winner, Warrior loser) {
        loser.setLife(loser.getLife() - 1);

        List<Item> winnerItems = winner.getItems();
        List<Item> loserItems = loser.getItems();

        if (loserItems.size() == 0) {
            return;
        }

        // get item with highest value
        Item item = loserItems.stream()
                .max(Comparator.comparing(Item::getValue))
                .get();

        loserItems.remove(item);
        winnerItems.add(item);
    }

    public static void main(String[] args) {
        System.out.println("Hello Apps Lab!");
    }

    // don't allow instantiating of this class
    private ExerciseApp() { }

}
