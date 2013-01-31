package lab1;

/**
 * Set the prereqs and credits for this object
 *
 * @author bspor
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private String prerequisites = "Intro to Java";
    private double credits = 4;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
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

    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "MyCourse{" + "courseName=" + getCourseName() + ", courseNumber=" + getCourseNumber() + ", credits=" + getCredits() + ", prerequisites=" + getPrerequisites() + '}';
    }
}