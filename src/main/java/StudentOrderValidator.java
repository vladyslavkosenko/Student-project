public class StudentOrderValidator {
    public static void main(String[] args) {
        StudentOrder so = null;

        checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
                // System.out.println("file");
                //  continue;
                break;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            sendMail(so);

        }

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
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        CheckWeddingValidator cwv = new CheckWeddingValidator();
        cwv.hostName = "Host1";
        cwv.login = "Login1";
        cwv.password = "Password1";
        AnswerWedding ans = cwv.checkWedding(so);
        return ans;
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("checkChildren");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("checkCityRegister");
        return new AnswerStudent();
    }


    static void sendMail(StudentOrder so) {
        System.out.println("send mail");

    }


}
