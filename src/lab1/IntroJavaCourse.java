package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      bspor
 * @version     1.00
 */
public class IntroJavaCourse {
    private String prerequisites = "Intro to Programming";

    public IntroJavaCourse() {
        this.setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
}
