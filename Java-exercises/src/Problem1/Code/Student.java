package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> enrolledCourses;

    public Student(String id, String name) {
        super(id, name);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public double calculateTotalFees() {
        double total = 0;
        for (Course course : enrolledCourses) {
            total += course.calculateFee();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Student ID: " + getId() + ", Name: " + getName();
    }
}
