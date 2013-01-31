package lab1;

/**
 * Set the prereqs and credits for this object
 *
 * @author bspor
 * @version 1.00
 */
/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author bspor
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    private double credits = 3;
    private String prerequisites = "None";

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setPrerequisites(prerequisites);

    }

    public double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "MyCourse{" + "courseName=" + getCourseName() + ", courseNumber=" + getCourseNumber() + ", credits=" + credits + ", prerequisites=" + getPrerequisites() + '}';
    }
}
