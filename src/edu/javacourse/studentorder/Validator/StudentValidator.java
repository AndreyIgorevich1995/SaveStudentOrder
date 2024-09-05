package edu.javacourse.studentorder.Validator;
import edu.javacourse.studentorder.Answer.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is running");
        return new AnswerStudent();
    }
}
