package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car k3Car = new K3Car();//부모는 다 품을 수 있음
        driver.setCar(k3Car);
        driver.drive();//메서드 오버라이딩으로 model3car에서 찾음

        Car model3Car = new Model3Car();//부모는 다 품을 수 있음
        driver.setCar(model3Car);
        driver.drive();//메서드 오버라이딩으로 model3car에서 찾음
    }
}
