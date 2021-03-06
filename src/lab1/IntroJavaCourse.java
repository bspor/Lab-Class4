package lab1;

/**
 * Set the prereqs and credits for this object
 *
 * @author bspor
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String prerequisites = "Intro to Programming";
    private double credits = 4;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.prerequisites = prerequisites;
        this.credits = credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "MyCourse{" + "courseName=" + getCourseName() + ", courseNumber=" + getCourseNumber() + ", credits=" + getCredits() + ", prerequisites=" + getPrerequisites() + '}';
    }

    private double getCredits() {
        return credits;
    }
}
