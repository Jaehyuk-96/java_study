package poly.pay1;

public interface Pay {//새로운 결제수단을 추가했을 때 Pay를 사용하는 클라이언트 코드인 PayService의 변경을 최소화하기
    boolean pay(int amount);
}
