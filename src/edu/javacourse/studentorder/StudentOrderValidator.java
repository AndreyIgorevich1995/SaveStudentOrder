package edu.javacourse.studentorder;//алгоритм проверки

import edu.javacourse.studentorder.Answer.AnswerChildren;
import edu.javacourse.studentorder.Answer.AnswerCityRegister;
import edu.javacourse.studentorder.Answer.AnswerStudent;
import edu.javacourse.studentorder.Answer.AnswerWedding;
import edu.javacourse.studentorder.Validator.*;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.mail.MailSender;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

//    public StudentOrderValidator(CityRegisterValidator cityRegisterVal, WeddingValidator weddingVal, AnswerChildren childrenVal, StudentValidator studentVal, MailSender mailSender) {
//        this.cityRegisterVal = cityRegisterVal;
//        this.weddingVal = weddingVal;
//        this.childrenVal = childrenVal;
//        this.studentVal = studentVal;
//        this.mailSender = mailSender;
//    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }
    //нестандартные операции:

    //проверка в государственном реестре населения мужа, жены и всех детей

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();
        for (int i = 0; i < soArray.length; i++) {
            System.out.println();
            checkOneOrder(soArray[i]);
        }
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister citiAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }

//        StudentOrder so = new StudentOrder();
        return soArray;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
//        ChildrenValidator cv = new ChildrenValidator();
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    //оправвка сообщения
    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
