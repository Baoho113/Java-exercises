package models;

public abstract class Course {
    private String courseCode;
    private String title;
    private String instructorName;

    public Course(String courseCode, String title, String instructorName) {
        this.courseCode = courseCode;
        this.title = title;
        this.instructorName = instructorName;
    }

    public abstract double calculateFee();

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Title: " + title + ", Instructor: " + instructorName;
    }
}
