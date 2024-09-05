package edu.javacourse.studentorder.Validator;
//import C:\projects\SaveStudentOrder
//import C.projects.SaveStudentOrder.src.StudentOrder;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.Answer.AnswerChildren;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }
}
