package vehicle;

import java.sql.SQLOutput;

public class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");//메소드 재정의
    }
}
