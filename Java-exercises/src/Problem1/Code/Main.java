package Problem1;

class Main {
    public static void main(String[] args) {
        InPersonCourse inPersonCourse = new InPersonCourse("CSCI101", "Intro to Programming",
                "Dr. Smith", 16, "Room 203", 25.0);
        OnlineCourse onlineCourse = new OnlineCourse("MATH202", "Advanced Calculus",
                "Prof. Johnson", "Online Platform X", "https://math202-content.com",
                10, 150.0, 10.0);

        Student student = new Student("S12345", "Alice");
        student.enrollCourse(inPersonCourse);
        student.enrollCourse(onlineCourse);

        Lecturer lecturer = new Lecturer("L001", "Prof. Anderson");
        lecturer.addTeachingCourse(inPersonCourse);
        lecturer.addTeachingCourse(onlineCourse);

        System.out.println(student);
        System.out.println(lecturer);

        System.out.println("\nEnrolled courses for " + student.getName() + ":");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(course.toString());
        }

        System.out.println("\nCourses taught by " + lecturer.getName() + ":");
        for (Course course : lecturer.getTeachingCourses()) {
            System.out.println(course.toString());
        }

        double totalFees = student.calculateTotalFees();
        System.out.println("\nTotal fees for " + student.getName() + ": $" + totalFees);
    }
}
