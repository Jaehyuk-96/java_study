package oct10.example02;

public class CalculatorExample2 {
    public static void main(String[] args) {
        Calculator2 myCalc = new Calculator2();


        int result1 = myCalc.plus(5,6);
        System.out.println("result1 = " + result1);

        int x =10;
        int y =4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);
    }
}
