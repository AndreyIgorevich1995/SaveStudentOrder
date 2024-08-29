package StudentOrder;//алгоритм проверки

import Answer.AnswerChildren;
import Answer.AnswerCityRegister;
import Answer.AnswerStudent;
import Answer.AnswerWedding;
import Validator.ChildrenValidator;
import Validator.CityRegisterValidator;
import Validator.StudentValidator;
import Validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    //нестандартные операции:

    //проверка в государственном реестре населения мужа, жены и всех детей

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");

            if (so == null) {
                break;
            }
            System.out.println("Finish");
            AnswerCityRegister citiAnswer = checkCityRegister(so);
            if (!citiAnswer.success) {
                continue;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Finish 2");
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";

        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "Login2";
        crv2.password = "Password2";

        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);
        return ans1;
//        return Validator.CityRegisterValidator.checkCityRegister(so);
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        return WeddingValidator.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        return ChildrenValidator.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return StudentValidator.checkStudent(so);
    }

    //оправвка сообщения
    static void sendMail(StudentOrder so) {

    }
}
