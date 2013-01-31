/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author bspor
 */
public interface ProgrammingCourse {

    public abstract String getCourseName();

    String getCourseNumber();

    double getCredits();

    String getPrerequisites();

    void setCourseName(String courseName);

    void setCourseNumber(String courseNumber);

    void setCredits(double credits);

    void setPrerequisites(String prerequisites);
}
