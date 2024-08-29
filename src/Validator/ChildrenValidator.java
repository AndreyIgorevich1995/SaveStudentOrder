package Validator;
//import C:\projects\SaveStudentOrder
//import C.projects.SaveStudentOrder.src.StudentOrder;
import StudentOrder.StudentOrder;
import Answer.AnswerChildren;

public class ChildrenValidator {
    public static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }
}
