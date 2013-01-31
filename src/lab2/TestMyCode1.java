package lab2;

/**
 *
 * @author bspor
 */
public class TestMyCode1 {

    public static void main(String[] args) {
        // Lets test this

        //Using an interface, each class has to have setters and getters, nothing
        //is inherited. I hard coded in the input values, however, if a user input the values
        //there are a few validation methods. Liskov Substitution cannot be used in this case.

        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Intro to Programming",
                "111-31", 3, "None");

        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java", "111-32", 4,
                "Intro to Programming");
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Advanced Java", "111-33",
                4, "Intro to Java");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
