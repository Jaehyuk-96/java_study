package oct13;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try{
            findClass();
        }catch(ClassNotFoundException e){
            System.out.println("예외처리:"+e.getMessage());

        }//호출한 곳에서 예외처리


        }
    public static void findClass() throws ClassNotFoundException{
    Class.forName("java.lang.String2");
    }
}
