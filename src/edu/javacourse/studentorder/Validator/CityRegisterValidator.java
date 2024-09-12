package edu.javacourse.studentorder.Validator;

import edu.javacourse.studentorder.Answer.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    public String login;
    public String password;

    private FakeCityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
