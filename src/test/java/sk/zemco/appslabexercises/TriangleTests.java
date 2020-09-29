package sk.zemco.appslabexercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    public void testFromExercise() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6, triangle.getArea());
        Assertions.assertEquals(12, triangle.getPerimeter());
    }

}
