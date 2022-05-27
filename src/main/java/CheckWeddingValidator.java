public class CheckWeddingValidator {
    String hostName;
    String login;
    String password;

    AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkCityRegister is " + hostName + ", " + login + ", " + password);
        AnswerWedding ans = new AnswerWedding();
        ans.success = false;
        return ans;
    }
}
