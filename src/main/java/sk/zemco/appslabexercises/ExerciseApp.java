package sk.zemco.appslabexercises;

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

    public static void main(String[] args) {
        System.out.println("Hello Apps Lab!");
    }

    // don't allow instantiating of this class
    private ExerciseApp() { }

}
