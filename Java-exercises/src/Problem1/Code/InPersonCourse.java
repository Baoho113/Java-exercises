package Problem1;

public class InPersonCourse extends Course {
    private int numberOfSessions;
    private String classroom;
    private double feePerSession;

    public InPersonCourse(String courseCode, String title, String instructorName, int numberOfSessions, String classroom, double feePerSession) {
        super(courseCode, title, instructorName);
        this.numberOfSessions = numberOfSessions;
        this.classroom = classroom;
        this.feePerSession = feePerSession;
    }

    @Override
    public double calculateFee() {
        return numberOfSessions * feePerSession;
    }

    @Override
    public String toString() {
        return super.toString() + " (Sessions: " + numberOfSessions + ", Classroom: " + classroom +
                ", Fee per session: $" + feePerSession + ")";
    }
}
