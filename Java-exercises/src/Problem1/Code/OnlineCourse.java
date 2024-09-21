package Problem1;

import Problem1.Course;

public class OnlineCourse extends Course {
    private String platform;
    private String contentLink;
    private int numberOfLiveSessions;
    private double baseFee;
    private double feePerLiveSession;

    public OnlineCourse(String courseCode, String title, String instructorName, String platform, String contentLink,
                        int numberOfLiveSessions, double baseFee, double feePerLiveSession) {
        super(courseCode, title, instructorName);
        this.platform = platform;
        this.contentLink = contentLink;
        this.numberOfLiveSessions = numberOfLiveSessions;
        this.baseFee = baseFee;
        this.feePerLiveSession = feePerLiveSession;
    }

    @Override
    public double calculateFee() {
        return baseFee + (numberOfLiveSessions * feePerLiveSession);
    }

    @Override
    public String toString() {
        return super.toString() + " (Platform: " + platform + ", Content Link: " + contentLink +
                ", Base fee: $" + baseFee + ", Live sessions: " + numberOfLiveSessions +
                ", Fee per live session: $" + feePerLiveSession + ")";
    }
}
