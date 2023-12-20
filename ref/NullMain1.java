package ref;

public class NullMain1 {

    public static void main(String[] args) {


        Student student= null;
        System.out.println("data = " + student);
        student = new Student();
        System.out.println("data = " + student);
        student = null;
        System.out.println("data = " + student);
    }
}
