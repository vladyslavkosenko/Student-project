public class CityRegisterValidator {
    String hostName;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkCityRegister is " + hostName + ", " + login + ", " +password) ;
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
