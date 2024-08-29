package Validator;

import Answer.AnswerWedding;
import StudentOrder.StudentOrder;

public class WeddingValidator {
    public static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
