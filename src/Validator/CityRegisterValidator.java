package Validator;

import Answer.AnswerCityRegister;
import StudentOrder.StudentOrder;

public class CityRegisterValidator {
    public String hostName;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();
        System.out.println("CityRegister is running " + hostName
                + ", " + login + "," + password);
        ans.success = false;
        return ans;
    }
//     AnswerCityRegister checkCityRegister(StudentOrder so) {
//        AnswerCityRegister ans = new AnswerCityRegister();
//        System.out.println("CityRegister is running");
//        ans.success = false;
//        return ans;
//    }
}
