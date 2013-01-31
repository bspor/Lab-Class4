package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      bspor
 * @version     1.00
 */
public class AdvancedJavaCourse  {
    private String prerequisites = "Intro to Java";
    private double credits = 4;

    public AdvancedJavaCourse() {
        this.setPrerequisites(prerequisites);
        this.setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}