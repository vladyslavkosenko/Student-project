public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;

    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkWedding");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("checkWedding");
        return new AnswerWedding();
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

    }


}
