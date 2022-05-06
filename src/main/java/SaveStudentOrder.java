public class SaveStudentOrder {
    public static void main(String[] args) {
        
        StudentOrder so = new StudentOrder();
        so.hFirstName = "FK";
        so.hLastName = "GT";
        so.wFirstName = "UF   ";
        so.wLastName = "GT";
        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);
        return answer;
    }

}