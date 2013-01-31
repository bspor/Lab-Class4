package lab1;

/**
 *
 * @author bspor
 */
public class TestMyCode {

    public static void main(String[] args) {
        // Lets test this

        //Objects will need to have CourseName, CourseNumber, Credits, and Prerequisites
        //I over-rode Credits and Prerequisites in all but Intro
        //While I hard coded the input values, there are validation methods that I kept
        //in the class. I used Liskov Substitution and it works because the input data is
        //the same. 

        MyCourse course1 = new IntroToProgrammingCourse("Intro to Programming",
                "111-31", 5, "None");
        MyCourse course2 = new IntroJavaCourse("Intro to Java",
                "111-32", 5, "None");
        MyCourse course3 = new AdvancedJavaCourse("Advanced Java",
                "111-33", 5, "None");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

    }
}
