package edu.javacourse.studentorder;//Студенческое заявление

import edu.javacourse.studentorder.Validator.A;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

//        saveStudentOrder();
//        buildStudentOrder();
    }

    //сщхранение студенческой заявки
    static void saveStudentOrder() {
        System.out.println("saveStudentOrder");
    }

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        return so;
    }
}
