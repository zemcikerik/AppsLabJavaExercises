package sk.zemco.appslabexercises;

import java.util.Arrays;

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

        int evenSum = Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .sum();

        int oddSum = Arrays.stream(numbers)
                .filter(num -> num % 2 == 1)
                .sum();

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

    public static void main(String[] args) {
        System.out.println("Hello Apps Lab!");
    }

    // don't allow instantiating of this class
    private ExerciseApp() { }

}
