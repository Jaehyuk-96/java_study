package oct13;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
        findClass();

    }//main() 메소드에서 throws 키워드를 사용해서 예외를 떠넘기는데 jvm이 최종적으로 예외처리를 하게됨.

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
