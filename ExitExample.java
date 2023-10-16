package oct16;

import java.sql.SQLOutput;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //i값 출력
            System.out.println(i);
            if(i==5){
                //JVM프로세스 종료
                System.out.println("프로그램 종료");
                System.exit(0);
            }
        }
    }
}
