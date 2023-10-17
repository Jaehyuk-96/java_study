package oct17.generic2;

public class ProdcutGenericExample {
    public static void main(String[] args) {

        //k는 tv로 대체, m은 string으로 대체
        Product1017<Tv1017, String> product1 = new Product1017<>();//클래스를 넣음
        //setter의 매개값은 반드시 tv와 string을 제공
        product1.setKind(new Tv1017());
        product1.setModel("smartTV");

        //getter 리턴값은 tv와 string이 됨
        Tv1017 tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println(product1.getModel());

        //k는 car로 대체, m은 string으로 대체
        Product1017<Car1017, String> product2 = new Product1017<>();//클래스를 넣음
        //setter 매개값은 반드시 car와 string을 제공
        product2.setKind(new Car1017());
        product2.setModel("suv");
        //getter 리넡값은 car와 string이 됨
        Car1017 car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(product2.getModel());


    }
}
