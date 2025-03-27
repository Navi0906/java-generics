package src.com.bridgelabz.university;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}
