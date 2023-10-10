package oct10.example03;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("기호를 입력하세요 + - / *");
        String sym = scanner.next();
        System.out.println("숫자 x를 입력하세요");
        int x = scanner.nextInt();
        System.out.println("숫자 y를 입력하세요");
        int y = scanner.nextInt();

        int result1;
        int result2;
        int result3;
        double result4;

        if(sym.equals("+")){
            result1 = myCalc.plus(x, y);
            System.out.println(result1);

        }else if (sym.equals("-")){
            result2 = myCalc.minus(x, y);
            System.out.println(result2);
        }else if (sym.equals("*")){
            result3 = myCalc.multiple(x, y);
            System.out.println(result3);
        }else{
            result4 = myCalc.divide(x, y);
            System.out.println(result4);
        }


    }
}
