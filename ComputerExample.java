package oct11;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator4 cal = new Calculator4();
        System.out.println("원 면적: " +cal.areaCircle(r));
        Computer com = new Computer();
        System.out.println("컴퓨터 원 면적:" +com.areaCircle(r));
    }
}
