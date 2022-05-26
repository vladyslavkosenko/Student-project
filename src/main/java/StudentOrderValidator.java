public class StudentOrderValidator {
    public static void main(String[] args) {
        StudentOrder so = null;

        checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start");
            if(so == null){
                break;
            }
            System.out.println("Finish");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success){
                System.out.println("file");
                continue;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            sendMail(so);
            so = readStudentOrder();
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;

    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("checkCityRegister");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
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
        System.out.println("send mail");

    }


}
