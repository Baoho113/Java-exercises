package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {
    private List<Course> teachingCourses;

    public Lecturer(String id, String name) {
        super(id, name);
        this.teachingCourses = new ArrayList<>();
    }

    public void addTeachingCourse(Course course) {
        teachingCourses.add(course);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    @Override
    public String toString() {
        return "Lecturer ID: " + getId() + ", Name: " + getName();
    }
}
